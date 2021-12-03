package com.offcn.bean;

public class Hottable {
    private Integer id;

    private String category;

    private Integer bigindex;

    private Integer smallindex;

    private String movieid;

    private String title;

    private String headerimage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getBigindex() {
        return bigindex;
    }

    public void setBigindex(Integer bigindex) {
        this.bigindex = bigindex;
    }

    public Integer getSmallindex() {
        return smallindex;
    }

    public void setSmallindex(Integer smallindex) {
        this.smallindex = smallindex;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid == null ? null : movieid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getHeaderimage() {
        return headerimage;
    }

    public void setHeaderimage(String headerimage) {
        this.headerimage = headerimage == null ? null : headerimage.trim();
    }
}