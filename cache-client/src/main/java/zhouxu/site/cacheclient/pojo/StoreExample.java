package zhouxu.site.cacheclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPrudctCountIsNull() {
            addCriterion("PRUDCT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPrudctCountIsNotNull() {
            addCriterion("PRUDCT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPrudctCountEqualTo(Integer value) {
            addCriterion("PRUDCT_COUNT =", value, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountNotEqualTo(Integer value) {
            addCriterion("PRUDCT_COUNT <>", value, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountGreaterThan(Integer value) {
            addCriterion("PRUDCT_COUNT >", value, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRUDCT_COUNT >=", value, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountLessThan(Integer value) {
            addCriterion("PRUDCT_COUNT <", value, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountLessThanOrEqualTo(Integer value) {
            addCriterion("PRUDCT_COUNT <=", value, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountIn(List<Integer> values) {
            addCriterion("PRUDCT_COUNT in", values, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountNotIn(List<Integer> values) {
            addCriterion("PRUDCT_COUNT not in", values, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountBetween(Integer value1, Integer value2) {
            addCriterion("PRUDCT_COUNT between", value1, value2, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andPrudctCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PRUDCT_COUNT not between", value1, value2, "prudctCount");
            return (Criteria) this;
        }

        public Criteria andProductAddressIsNull() {
            addCriterion("PRODUCT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andProductAddressIsNotNull() {
            addCriterion("PRODUCT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProductAddressEqualTo(String value) {
            addCriterion("PRODUCT_ADDRESS =", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressNotEqualTo(String value) {
            addCriterion("PRODUCT_ADDRESS <>", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressGreaterThan(String value) {
            addCriterion("PRODUCT_ADDRESS >", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ADDRESS >=", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressLessThan(String value) {
            addCriterion("PRODUCT_ADDRESS <", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ADDRESS <=", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressLike(String value) {
            addCriterion("PRODUCT_ADDRESS like", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressNotLike(String value) {
            addCriterion("PRODUCT_ADDRESS not like", value, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressIn(List<String> values) {
            addCriterion("PRODUCT_ADDRESS in", values, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressNotIn(List<String> values) {
            addCriterion("PRODUCT_ADDRESS not in", values, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressBetween(String value1, String value2) {
            addCriterion("PRODUCT_ADDRESS between", value1, value2, "productAddress");
            return (Criteria) this;
        }

        public Criteria andProductAddressNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ADDRESS not between", value1, value2, "productAddress");
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