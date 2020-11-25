package com.goldsign.esmcs;

import com.goldsign.csfrm.util.CharUtil;
import com.goldsign.esmcs.thread.PKMakeCardThread;
import com.goldsign.esmcs.vo.*;
import com.goldsign.rwcommu.util.CRC;
import com.goldsign.rwcommu.util.Converter;
import org.apache.log4j.Logger;

import java.nio.ByteBuffer;

import static com.goldsign.rwcommu.connection.RWSerialConnection.MES_PARAM_BEE;

/**
 * @author:
 * @params:
 * @Date:{20:53} {2020/4/3}
 **/
public class testEvaluate {
    private static final byte MES_REQ_HEAD_LEN = 16;//请求头长度
    private static final byte MES_REQ_BEGIN = (byte) 0xAA;//请求协议头
    private static final byte MES_RES_BEGIN = (byte) 0xBB;//应答协议头
    private static final byte MES_NODE_NO = (byte) 0x00;//节点编号
    private static final byte MES_CMD_01 = (byte)0x01;//01指类类型
    private static final byte MES_PARAM_0 = (byte)0x00;//参数p0
    private static final byte MES_PARAM_1 = (byte)0x00;//参数p1
    private static final byte MES_CRE_LEN = 2;//CRC长度

    private static final Logger logger = Logger.getLogger(testEvaluate.class.getName());
    public  static void main(String args[]){
        //evaluate();
        logger.error("asdfasdfa");
    }
    public static void evaluate(){
        ByteBuffer bytes = ByteBuffer.allocate(56+16*6);

       // String orderNo = order.getOrderNo();
        String orderNo = "01202004030005";
        bytes.put(CharUtil.strToLenByteArr(orderNo, 14));
      //  String reqNo = order.getApplicationNO();
        String reqNo ="1234567890";
        bytes.put(CharUtil.strToLenByteArr(reqNo, 10));
      //  byte[] ticketType = CharUtil.hexStrToLenByteArr(order.getTicketType(), 2);
        byte[] ticketType=new byte[]{0x03,0x2b};
        bytes.put(ticketType);
       // byte[] logicNo = CharUtil.hexStrToLenByteArr(order.getLogicalID(), 8);
        byte[] logicNo =  new byte[]{0x01, 0x23, 0x45, 0x67, 0x11, 0x01, 0x23, 0x45};
        bytes.put(logicNo);
       // byte deposite = CharUtil.strToByte(order.getDepositeYuan());
        byte deposite=0x18;
        bytes.put(deposite);
       // int balance = CharUtil.strToInt(order.getValue());
        byte[] value = new byte[]{0x20, 0x20,  0x30, 0x40};
       // bytes.put(CharUtil.to4Byte(balance));
        bytes.put(value);
       // byte[] topValue = CharUtil.to2Byte(CharUtil.strToInt(order.getRechargeTopValueYuan()));
        byte[] topValue = new byte[]{0x12, 0x13};
        bytes.put(topValue);
        //---
        //byte active = CharUtil.strToByte(order.getSaleActiveFlag());
        byte active=0x00;

        bytes.put(active);
        byte[] logicDate = CharUtil.bcdStrToLenByteArr("2020031",7);
        bytes.put(logicDate);
        byte[] logicDays = CharUtil.to2Byte(CharUtil.strToInt("30"));
        bytes.put(logicDays);
        //---
      //  byte exitEntryMode = CharUtil.strToByte(order.getExitEntryMode());
        byte exitEntryMode=0x01;
        bytes.put(exitEntryMode);
      //  byte[] entryLineStation = CharUtil.bcdStrToLenByteArr(order.getEntryLineStation(),2);;
        byte[] entryLineStation = new byte[]{0x01, 0x02};
        bytes.put(entryLineStation);
      //  byte[] exitLineStation =  CharUtil.bcdStrToLenByteArr(order.getExitLineStation(),2);
        byte[] exitLineStation = new byte[]{0x02, 0x01};
        bytes.put(exitLineStation);

      //  byte[] by=bytes.array();

        bytes.put(CharUtil.hexStrToLenByteArr("0000000000000000",16));
        bytes.put(CharUtil.hexStrToLenByteArr("0000000000000000",16));
        bytes.put(CharUtil.hexStrToLenByteArr("0000000000000000",16));
        bytes.put(CharUtil.hexStrToLenByteArr("0000000000000000",16));
        bytes.put(CharUtil.hexStrToLenByteArr("0000000000000000",16));
        bytes.put(CharUtil.hexStrToLenByteArr("0000000000000000",16));
        byte[] by=bytes.array();

        System.out.println("票卡预赋值：");
        System.out.println("输入：\n"+ Converter.bytesToHexString(by));

        byte command = (byte)0x35;

        byte  param2 = MES_PARAM_BEE;//蜂鸣次数

        param2 = MES_PARAM_BEE;//蜂鸣次数
        int bytesLen = (by != null) ? by.length : 0;
        ByteBuffer data = ByteBuffer.allocate(bytesLen + MES_REQ_HEAD_LEN);
        data.put(MES_REQ_BEGIN)//协议头
                .put(MES_NODE_NO)//节点编号
                .put(Converter.getNumber())//序列号 自动加1
                .put(MES_CMD_01)//指令分类码
                .put(command)//命令码
                .put(MES_PARAM_0)//参数P0
                .put(param2)//参数P1
                .put(Converter.hexStringToBytes(Converter.curDateToStrYYYYMMDDHHMMSS()))//时间
                .put(Converter.to2Byte(bytesLen));//长度
        if (by != null) {
            data.put(by);//数据域
        }
        ByteBuffer dataCrc = ByteBuffer.allocate(data.array().length + MES_CRE_LEN);//最终完整数据
        dataCrc.put(data.array());
        dataCrc.put(CRC.crc16Bytes(data.array()));//效验位
        System.out.println("输入1：\n"+Converter.bytesToHexString(dataCrc.array()));
        MES_PARAM_BEE = 0x00;

    }
}
