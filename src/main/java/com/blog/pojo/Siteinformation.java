package com.blog.pojo;

/**
 * Description: 站点运营信息表
 * 
 * @author Todcsw
 * @date  
 */
public class Siteinformation {

  private int id;
  private int articleCount;
  private int visitCount;
  private String runnTime;
  private String uname;
  private int wordCount;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getArticleCount() {
    return articleCount;
  }

  public void setArticleCount(int articleCount) {
    this.articleCount = articleCount;
  }

  public int getVisitCount() {
    return visitCount;
  }

  public void setVisitCount(int visitCount) {
    this.visitCount = visitCount;
  }

  public String getRunnTime() {
    return runnTime;
  }

  public void setRunnTime(String runnTime) {
    this.runnTime = runnTime;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public int getWordCount() {
    return wordCount;
  }

  public void setWordCount(int wordCount) {
    this.wordCount = wordCount;
  }
}
