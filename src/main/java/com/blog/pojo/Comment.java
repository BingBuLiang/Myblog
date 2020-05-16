package com.blog.pojo;



/**
 * Description: 是否开启评论表
 * 
 * @author Todcsw
 * @date  
 */
public class Comment {

  private int id;
  private boolean flag;
  private String appId;
  private String appKey;
  private String placeholder;
  private String placePhoto;
  private String uname;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public String getPlacePhoto() {
    return placePhoto;
  }

  public void setPlacePhoto(String placePhoto) {
    this.placePhoto = placePhoto;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }
}
