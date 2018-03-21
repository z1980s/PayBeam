package info.paybeam.www.paybeam.ConnectionModule;

import java.io.*;

public class Message implements Serializable{
    private static final long serialVersionUID = 1L;
    private String header;
    private String data;
    private byte[] dataBytes;

    //constructors
    public Message() {
        clearData();
    }

    public Message(String header) {
        setHeader(header);
    }

    //getter and setter
    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setDataBytes(byte[] dataBytes) {
        this.dataBytes = dataBytes;
    }

    public byte[] getDataBytes() {
        return dataBytes;
    }

    public void clearData() {
        header = "";
        data = "";
        dataBytes = "".getBytes();
    }
}
