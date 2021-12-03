package com.offcn.bean;

import java.util.ArrayList;
import java.util.List;

public class HottableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HottableExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andBigindexIsNull() {
            addCriterion("bigindex is null");
            return (Criteria) this;
        }

        public Criteria andBigindexIsNotNull() {
            addCriterion("bigindex is not null");
            return (Criteria) this;
        }

        public Criteria andBigindexEqualTo(Integer value) {
            addCriterion("bigindex =", value, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexNotEqualTo(Integer value) {
            addCriterion("bigindex <>", value, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexGreaterThan(Integer value) {
            addCriterion("bigindex >", value, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigindex >=", value, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexLessThan(Integer value) {
            addCriterion("bigindex <", value, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexLessThanOrEqualTo(Integer value) {
            addCriterion("bigindex <=", value, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexIn(List<Integer> values) {
            addCriterion("bigindex in", values, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexNotIn(List<Integer> values) {
            addCriterion("bigindex not in", values, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexBetween(Integer value1, Integer value2) {
            addCriterion("bigindex between", value1, value2, "bigindex");
            return (Criteria) this;
        }

        public Criteria andBigindexNotBetween(Integer value1, Integer value2) {
            addCriterion("bigindex not between", value1, value2, "bigindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexIsNull() {
            addCriterion("smallindex is null");
            return (Criteria) this;
        }

        public Criteria andSmallindexIsNotNull() {
            addCriterion("smallindex is not null");
            return (Criteria) this;
        }

        public Criteria andSmallindexEqualTo(Integer value) {
            addCriterion("smallindex =", value, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexNotEqualTo(Integer value) {
            addCriterion("smallindex <>", value, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexGreaterThan(Integer value) {
            addCriterion("smallindex >", value, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("smallindex >=", value, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexLessThan(Integer value) {
            addCriterion("smallindex <", value, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexLessThanOrEqualTo(Integer value) {
            addCriterion("smallindex <=", value, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexIn(List<Integer> values) {
            addCriterion("smallindex in", values, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexNotIn(List<Integer> values) {
            addCriterion("smallindex not in", values, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexBetween(Integer value1, Integer value2) {
            addCriterion("smallindex between", value1, value2, "smallindex");
            return (Criteria) this;
        }

        public Criteria andSmallindexNotBetween(Integer value1, Integer value2) {
            addCriterion("smallindex not between", value1, value2, "smallindex");
            return (Criteria) this;
        }

        public Criteria andMovieidIsNull() {
            addCriterion("movieid is null");
            return (Criteria) this;
        }

        public Criteria andMovieidIsNotNull() {
            addCriterion("movieid is not null");
            return (Criteria) this;
        }

        public Criteria andMovieidEqualTo(String value) {
            addCriterion("movieid =", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotEqualTo(String value) {
            addCriterion("movieid <>", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThan(String value) {
            addCriterion("movieid >", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThanOrEqualTo(String value) {
            addCriterion("movieid >=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThan(String value) {
            addCriterion("movieid <", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThanOrEqualTo(String value) {
            addCriterion("movieid <=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLike(String value) {
            addCriterion("movieid like", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotLike(String value) {
            addCriterion("movieid not like", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidIn(List<String> values) {
            addCriterion("movieid in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotIn(List<String> values) {
            addCriterion("movieid not in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidBetween(String value1, String value2) {
            addCriterion("movieid between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotBetween(String value1, String value2) {
            addCriterion("movieid not between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andHeaderimageIsNull() {
            addCriterion("headerimage is null");
            return (Criteria) this;
        }

        public Criteria andHeaderimageIsNotNull() {
            addCriterion("headerimage is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderimageEqualTo(String value) {
            addCriterion("headerimage =", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageNotEqualTo(String value) {
            addCriterion("headerimage <>", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageGreaterThan(String value) {
            addCriterion("headerimage >", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageGreaterThanOrEqualTo(String value) {
            addCriterion("headerimage >=", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageLessThan(String value) {
            addCriterion("headerimage <", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageLessThanOrEqualTo(String value) {
            addCriterion("headerimage <=", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageLike(String value) {
            addCriterion("headerimage like", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageNotLike(String value) {
            addCriterion("headerimage not like", value, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageIn(List<String> values) {
            addCriterion("headerimage in", values, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageNotIn(List<String> values) {
            addCriterion("headerimage not in", values, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageBetween(String value1, String value2) {
            addCriterion("headerimage between", value1, value2, "headerimage");
            return (Criteria) this;
        }

        public Criteria andHeaderimageNotBetween(String value1, String value2) {
            addCriterion("headerimage not between", value1, value2, "headerimage");
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