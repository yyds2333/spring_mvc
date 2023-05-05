package com.powernode.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Standard {
    private Integer id;
    private String stdNum;
    private String zhname;
    private String version;
    private String keys;
    private Date releaseDate;
    private Date implDate;
    private String packagePath;

    public Standard() {
    }

    public Standard(Integer id, String stdNum, String zhname, String version, String keys, Date releaseDate, Date implDate, String packagePath) {
        this.id = id;
        this.stdNum = stdNum;
        this.zhname = zhname;
        this.version = version;
        this.keys = keys;
        this.releaseDate = releaseDate;
        this.implDate = implDate;
        this.packagePath = packagePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStdNum() {
        return stdNum;
    }

    public void setStdNum(String stdNum) {
        this.stdNum = stdNum;
    }

    public String getZhname() {
        return zhname;
    }

    public void setZhname(String zhname) {
        this.zhname = zhname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getImplDate() {
        return implDate;
    }

    public void setImplDate(Date implDate) {
        this.implDate = implDate;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "id=" + id +
                ", stdNum='" + stdNum + '\'' +
                ", zhname='" + zhname + '\'' +
                ", version='" + version + '\'' +
                ", keys='" + keys + '\'' +
                ", releaseDate=" + releaseDate +
                ", implDate=" + implDate +
                ", packagePath='" + packagePath + '\'' +
                '}';
    }
}
