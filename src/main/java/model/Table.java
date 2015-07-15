package model;

import java.io.Serializable;
import java.security.PublicKey;

/**
 * Created by ооо on 14.07.2015.
 */

public class Table implements Serializable {
    private int id;
    private String data;
    private String title;
    private String text;
    private int idc;
    private int num;
    private String comm;

    public Table(){

    }

/*    public int getId{
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getData{
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getTitle{
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText{
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdc{
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getNum{
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComm{
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }*/
}
