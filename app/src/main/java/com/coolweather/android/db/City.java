package com.coolweather.android.db;

/**
 * Created by Administrator on 2019/12/24.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provincedId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvincedId(){
        return provincedId;
    }
    public void setProvincedId(int provincedId){
        this.provincedId=provincedId;
    }
}
