package com.zzt.demo.entity;

import java.util.Date;

public class BrandMatchCategory {
    private Long id;

    private Long categoryId;

    private Byte categoryGrade;

    private Long customCategoryId;

    private String keyword;

    private String categoryPath;

    private String gender;

    private String productName;

    private String productDescription;

    private String brand;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Byte categoryType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getCategoryGrade() {
        return categoryGrade;
    }

    public void setCategoryGrade(Byte categoryGrade) {
        this.categoryGrade = categoryGrade;
    }

    public Long getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(Long customCategoryId) {
        this.customCategoryId = customCategoryId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath == null ? null : categoryPath.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Byte categoryType) {
        this.categoryType = categoryType;
    }
}