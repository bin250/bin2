package com.offcn.bean;
import java.util.List;

public class DataBean {
    //封装统计页面所需要的数据
    //电影总数
    private Long movienum;
    //演员总数
    private Long performernum;
    //用户总数
    private Long usernum;
    //分类总数
    private Long categroynum;
    //统计页面所需的集合数据
    //分类占比集合
    private List<CategroyTop> tops;

    public Long getMovienum() {
        return movienum;
    }

    public void setMovienum(Long movienum) {
        this.movienum = movienum;
    }

    public Long getperformernum() {
        return performernum;
    }

    public void setperformernum(Long performernum) {
        this.performernum = performernum;
    }

    public Long getUsernum() {
        return usernum;
    }

    public void setUsernum(Long usernum) {
        this.usernum = usernum;
    }

    public Long getCategroynum() {
        return categroynum;
    }

    public void setCategroynum(Long categroynum) {
        this.categroynum = categroynum;
    }

    public List<CategroyTop> getTops() {
        return tops;
    }

    public void setTops(List<CategroyTop> tops) {
        this.tops = tops;
    }


    @Override
    public String toString() {
        return "DataBean{" +
                "movienum=" + movienum +
                ", perfomernum=" + performernum +
                ", usernum=" + usernum +
                ", categroynum=" + categroynum +
                ", tops=" + tops +
                '}';
    }


}