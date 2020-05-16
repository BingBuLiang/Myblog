package com.blog.pojo;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/16 11:16 星期六
 * @Description: com.blog.pojo 关于5个页面的展示图像
 * @version: 1.0
 */
public class Photo {
    private int id;
    private String linkPhoto;
    private String aboutPhoto;
    private String tagPhoto;
    private String indexPhoto;
    private String catalogPhoto;
    private String uname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }

    public String getAboutPhoto() {
        return aboutPhoto;
    }

    public void setAboutPhoto(String aboutPhoto) {
        this.aboutPhoto = aboutPhoto;
    }

    public String getTagPhoto() {
        return tagPhoto;
    }

    public void setTagPhoto(String tagPhoto) {
        this.tagPhoto = tagPhoto;
    }

    public String getIndexPhoto() {
        return indexPhoto;
    }

    public void setIndexPhoto(String indexPhoto) {
        this.indexPhoto = indexPhoto;
    }

    public String getCatalogPhoto() {
        return catalogPhoto;
    }

    public void setCatalogPhoto(String catalogPhoto) {
        this.catalogPhoto = catalogPhoto;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
