package com.zzt.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandMatchCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandMatchCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("`id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("`id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("`id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("`id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("`id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("`id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("`id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("`id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("`id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("`id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("`category_id` is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("`category_id` is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("`category_id` =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("`category_id` <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("`category_id` >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`category_id` >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("`category_id` <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("`category_id` <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("`category_id` in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("`category_id` not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("`category_id` between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("`category_id` not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeIsNull() {
            addCriterion("`category_grade` is null");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeIsNotNull() {
            addCriterion("`category_grade` is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeEqualTo(Byte value) {
            addCriterion("`category_grade` =", value, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeNotEqualTo(Byte value) {
            addCriterion("`category_grade` <>", value, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeGreaterThan(Byte value) {
            addCriterion("`category_grade` >", value, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`category_grade` >=", value, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeLessThan(Byte value) {
            addCriterion("`category_grade` <", value, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeLessThanOrEqualTo(Byte value) {
            addCriterion("`category_grade` <=", value, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeIn(List<Byte> values) {
            addCriterion("`category_grade` in", values, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeNotIn(List<Byte> values) {
            addCriterion("`category_grade` not in", values, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeBetween(Byte value1, Byte value2) {
            addCriterion("`category_grade` between", value1, value2, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCategoryGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("`category_grade` not between", value1, value2, "categoryGrade");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdIsNull() {
            addCriterion("`custom_category_id` is null");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdIsNotNull() {
            addCriterion("`custom_category_id` is not null");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdEqualTo(Long value) {
            addCriterion("`custom_category_id` =", value, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdNotEqualTo(Long value) {
            addCriterion("`custom_category_id` <>", value, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdGreaterThan(Long value) {
            addCriterion("`custom_category_id` >", value, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("`custom_category_id` >=", value, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdLessThan(Long value) {
            addCriterion("`custom_category_id` <", value, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("`custom_category_id` <=", value, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdIn(List<Long> values) {
            addCriterion("`custom_category_id` in", values, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdNotIn(List<Long> values) {
            addCriterion("`custom_category_id` not in", values, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdBetween(Long value1, Long value2) {
            addCriterion("`custom_category_id` between", value1, value2, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("`custom_category_id` not between", value1, value2, "customCategoryId");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("`keyword` is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("`keyword` is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("`keyword` =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("`keyword` <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("`keyword` >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("`keyword` >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("`keyword` <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("`keyword` <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("`keyword` like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("`keyword` not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("`keyword` in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("`keyword` not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("`keyword` between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("`keyword` not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andCategoryPathIsNull() {
            addCriterion("`category_path` is null");
            return (Criteria) this;
        }

        public Criteria andCategoryPathIsNotNull() {
            addCriterion("`category_path` is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryPathEqualTo(String value) {
            addCriterion("`category_path` =", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNotEqualTo(String value) {
            addCriterion("`category_path` <>", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathGreaterThan(String value) {
            addCriterion("`category_path` >", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathGreaterThanOrEqualTo(String value) {
            addCriterion("`category_path` >=", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathLessThan(String value) {
            addCriterion("`category_path` <", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathLessThanOrEqualTo(String value) {
            addCriterion("`category_path` <=", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathLike(String value) {
            addCriterion("`category_path` like", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNotLike(String value) {
            addCriterion("`category_path` not like", value, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathIn(List<String> values) {
            addCriterion("`category_path` in", values, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNotIn(List<String> values) {
            addCriterion("`category_path` not in", values, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathBetween(String value1, String value2) {
            addCriterion("`category_path` between", value1, value2, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andCategoryPathNotBetween(String value1, String value2) {
            addCriterion("`category_path` not between", value1, value2, "categoryPath");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("`gender` is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("`gender` is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("`gender` =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("`gender` <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("`gender` >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("`gender` >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("`gender` <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("`gender` <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("`gender` like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("`gender` not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("`gender` in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("`gender` not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("`gender` between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("`gender` not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("`product_name` is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("`product_name` is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("`product_name` =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("`product_name` <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("`product_name` >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("`product_name` >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("`product_name` <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("`product_name` <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("`product_name` like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("`product_name` not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("`product_name` in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("`product_name` not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("`product_name` between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("`product_name` not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("`product_description` is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("`product_description` is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("`product_description` =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("`product_description` <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("`product_description` >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("`product_description` >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("`product_description` <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("`product_description` <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("`product_description` like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("`product_description` not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("`product_description` in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("`product_description` not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("`product_description` between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("`product_description` not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("`brand` is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("`brand` is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("`brand` =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("`brand` <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("`brand` >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("`brand` >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("`brand` <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("`brand` <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("`brand` like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("`brand` not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("`brand` in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("`brand` not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("`brand` between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("`brand` not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("`update_time` is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("`update_time` is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("`update_time` =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("`update_time` <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("`update_time` >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`update_time` >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("`update_time` <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`update_time` <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("`update_time` in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("`update_time` not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("`update_time` between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`update_time` not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNull() {
            addCriterion("`category_type` is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNotNull() {
            addCriterion("`category_type` is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(Byte value) {
            addCriterion("`category_type` =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotEqualTo(Byte value) {
            addCriterion("`category_type` <>", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThan(Byte value) {
            addCriterion("`category_type` >", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`category_type` >=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThan(Byte value) {
            addCriterion("`category_type` <", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`category_type` <=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIn(List<Byte> values) {
            addCriterion("`category_type` in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotIn(List<Byte> values) {
            addCriterion("`category_type` not in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeBetween(Byte value1, Byte value2) {
            addCriterion("`category_type` between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`category_type` not between", value1, value2, "categoryType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}