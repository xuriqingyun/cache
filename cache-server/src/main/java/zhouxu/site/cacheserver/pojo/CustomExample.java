package zhouxu.site.cacheserver.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomExample() {
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

        public Criteria andCustomIdIsNull() {
            addCriterion("CUSTOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("CUSTOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(Integer value) {
            addCriterion("CUSTOM_ID =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(Integer value) {
            addCriterion("CUSTOM_ID <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(Integer value) {
            addCriterion("CUSTOM_ID >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOM_ID >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(Integer value) {
            addCriterion("CUSTOM_ID <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOM_ID <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<Integer> values) {
            addCriterion("CUSTOM_ID in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<Integer> values) {
            addCriterion("CUSTOM_ID not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOM_ID between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOM_ID not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNull() {
            addCriterion("CUSTOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("CUSTOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("CUSTOM_NAME =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("CUSTOM_NAME <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("CUSTOM_NAME >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_NAME >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("CUSTOM_NAME <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_NAME <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("CUSTOM_NAME like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("CUSTOM_NAME not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("CUSTOM_NAME in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("CUSTOM_NAME not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("CUSTOM_NAME between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_NAME not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomSexIsNull() {
            addCriterion("CUSTOM_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCustomSexIsNotNull() {
            addCriterion("CUSTOM_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCustomSexEqualTo(String value) {
            addCriterion("CUSTOM_SEX =", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexNotEqualTo(String value) {
            addCriterion("CUSTOM_SEX <>", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexGreaterThan(String value) {
            addCriterion("CUSTOM_SEX >", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_SEX >=", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexLessThan(String value) {
            addCriterion("CUSTOM_SEX <", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_SEX <=", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexLike(String value) {
            addCriterion("CUSTOM_SEX like", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexNotLike(String value) {
            addCriterion("CUSTOM_SEX not like", value, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexIn(List<String> values) {
            addCriterion("CUSTOM_SEX in", values, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexNotIn(List<String> values) {
            addCriterion("CUSTOM_SEX not in", values, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexBetween(String value1, String value2) {
            addCriterion("CUSTOM_SEX between", value1, value2, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomSexNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_SEX not between", value1, value2, "customSex");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneIsNull() {
            addCriterion("CUSTOM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneIsNotNull() {
            addCriterion("CUSTOM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneEqualTo(String value) {
            addCriterion("CUSTOM_PHONE =", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotEqualTo(String value) {
            addCriterion("CUSTOM_PHONE <>", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneGreaterThan(String value) {
            addCriterion("CUSTOM_PHONE >", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_PHONE >=", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneLessThan(String value) {
            addCriterion("CUSTOM_PHONE <", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_PHONE <=", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneLike(String value) {
            addCriterion("CUSTOM_PHONE like", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotLike(String value) {
            addCriterion("CUSTOM_PHONE not like", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneIn(List<String> values) {
            addCriterion("CUSTOM_PHONE in", values, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotIn(List<String> values) {
            addCriterion("CUSTOM_PHONE not in", values, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneBetween(String value1, String value2) {
            addCriterion("CUSTOM_PHONE between", value1, value2, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_PHONE not between", value1, value2, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomAddressIsNull() {
            addCriterion("CUSTOM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustomAddressIsNotNull() {
            addCriterion("CUSTOM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomAddressEqualTo(String value) {
            addCriterion("CUSTOM_ADDRESS =", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressNotEqualTo(String value) {
            addCriterion("CUSTOM_ADDRESS <>", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressGreaterThan(String value) {
            addCriterion("CUSTOM_ADDRESS >", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ADDRESS >=", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressLessThan(String value) {
            addCriterion("CUSTOM_ADDRESS <", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ADDRESS <=", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressLike(String value) {
            addCriterion("CUSTOM_ADDRESS like", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressNotLike(String value) {
            addCriterion("CUSTOM_ADDRESS not like", value, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressIn(List<String> values) {
            addCriterion("CUSTOM_ADDRESS in", values, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressNotIn(List<String> values) {
            addCriterion("CUSTOM_ADDRESS not in", values, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressBetween(String value1, String value2) {
            addCriterion("CUSTOM_ADDRESS between", value1, value2, "customAddress");
            return (Criteria) this;
        }

        public Criteria andCustomAddressNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_ADDRESS not between", value1, value2, "customAddress");
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