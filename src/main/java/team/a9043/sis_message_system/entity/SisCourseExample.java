package team.a9043.sis_message_system.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SisCourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public SisCourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(String value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(String value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(String value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(String value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(String value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(String value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLike(String value) {
            addCriterion("sc_id like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotLike(String value) {
            addCriterion("sc_id not like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<String> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<String> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(String value1, String value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(String value1, String value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScActSizeIsNull() {
            addCriterion("sc_act_size is null");
            return (Criteria) this;
        }

        public Criteria andScActSizeIsNotNull() {
            addCriterion("sc_act_size is not null");
            return (Criteria) this;
        }

        public Criteria andScActSizeEqualTo(Integer value) {
            addCriterion("sc_act_size =", value, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeNotEqualTo(Integer value) {
            addCriterion("sc_act_size <>", value, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeGreaterThan(Integer value) {
            addCriterion("sc_act_size >", value, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_act_size >=", value, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeLessThan(Integer value) {
            addCriterion("sc_act_size <", value, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeLessThanOrEqualTo(Integer value) {
            addCriterion("sc_act_size <=", value, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeIn(List<Integer> values) {
            addCriterion("sc_act_size in", values, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeNotIn(List<Integer> values) {
            addCriterion("sc_act_size not in", values, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeBetween(Integer value1, Integer value2) {
            addCriterion("sc_act_size between", value1, value2, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScActSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_act_size not between", value1, value2, "scActSize");
            return (Criteria) this;
        }

        public Criteria andScAttRateIsNull() {
            addCriterion("sc_att_rate is null");
            return (Criteria) this;
        }

        public Criteria andScAttRateIsNotNull() {
            addCriterion("sc_att_rate is not null");
            return (Criteria) this;
        }

        public Criteria andScAttRateEqualTo(BigDecimal value) {
            addCriterion("sc_att_rate =", value, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateNotEqualTo(BigDecimal value) {
            addCriterion("sc_att_rate <>", value, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateGreaterThan(BigDecimal value) {
            addCriterion("sc_att_rate >", value, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sc_att_rate >=", value, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateLessThan(BigDecimal value) {
            addCriterion("sc_att_rate <", value, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sc_att_rate <=", value, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateIn(List<BigDecimal> values) {
            addCriterion("sc_att_rate in", values, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateNotIn(List<BigDecimal> values) {
            addCriterion("sc_att_rate not in", values, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sc_att_rate between", value1, value2, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScAttRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sc_att_rate not between", value1, value2, "scAttRate");
            return (Criteria) this;
        }

        public Criteria andScGradeIsNull() {
            addCriterion("sc_grade is null");
            return (Criteria) this;
        }

        public Criteria andScGradeIsNotNull() {
            addCriterion("sc_grade is not null");
            return (Criteria) this;
        }

        public Criteria andScGradeEqualTo(Integer value) {
            addCriterion("sc_grade =", value, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeNotEqualTo(Integer value) {
            addCriterion("sc_grade <>", value, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeGreaterThan(Integer value) {
            addCriterion("sc_grade >", value, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_grade >=", value, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeLessThan(Integer value) {
            addCriterion("sc_grade <", value, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeLessThanOrEqualTo(Integer value) {
            addCriterion("sc_grade <=", value, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeIn(List<Integer> values) {
            addCriterion("sc_grade in", values, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeNotIn(List<Integer> values) {
            addCriterion("sc_grade not in", values, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeBetween(Integer value1, Integer value2) {
            addCriterion("sc_grade between", value1, value2, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_grade not between", value1, value2, "scGrade");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeIsNull() {
            addCriterion("sc_max_size is null");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeIsNotNull() {
            addCriterion("sc_max_size is not null");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeEqualTo(Integer value) {
            addCriterion("sc_max_size =", value, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeNotEqualTo(Integer value) {
            addCriterion("sc_max_size <>", value, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeGreaterThan(Integer value) {
            addCriterion("sc_max_size >", value, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_max_size >=", value, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeLessThan(Integer value) {
            addCriterion("sc_max_size <", value, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeLessThanOrEqualTo(Integer value) {
            addCriterion("sc_max_size <=", value, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeIn(List<Integer> values) {
            addCriterion("sc_max_size in", values, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeNotIn(List<Integer> values) {
            addCriterion("sc_max_size not in", values, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeBetween(Integer value1, Integer value2) {
            addCriterion("sc_max_size between", value1, value2, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScMaxSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_max_size not between", value1, value2, "scMaxSize");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorIsNull() {
            addCriterion("sc_need_monitor is null");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorIsNotNull() {
            addCriterion("sc_need_monitor is not null");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorEqualTo(Boolean value) {
            addCriterion("sc_need_monitor =", value, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorNotEqualTo(Boolean value) {
            addCriterion("sc_need_monitor <>", value, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorGreaterThan(Boolean value) {
            addCriterion("sc_need_monitor >", value, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sc_need_monitor >=", value, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorLessThan(Boolean value) {
            addCriterion("sc_need_monitor <", value, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorLessThanOrEqualTo(Boolean value) {
            addCriterion("sc_need_monitor <=", value, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorIn(List<Boolean> values) {
            addCriterion("sc_need_monitor in", values, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorNotIn(List<Boolean> values) {
            addCriterion("sc_need_monitor not in", values, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorBetween(Boolean value1, Boolean value2) {
            addCriterion("sc_need_monitor between", value1, value2, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andScNeedMonitorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sc_need_monitor not between", value1, value2, "scNeedMonitor");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNull() {
            addCriterion("su_id is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("su_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(String value) {
            addCriterion("su_id =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(String value) {
            addCriterion("su_id <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(String value) {
            addCriterion("su_id >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(String value) {
            addCriterion("su_id >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(String value) {
            addCriterion("su_id <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(String value) {
            addCriterion("su_id <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLike(String value) {
            addCriterion("su_id like", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotLike(String value) {
            addCriterion("su_id not like", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<String> values) {
            addCriterion("su_id in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<String> values) {
            addCriterion("su_id not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(String value1, String value2) {
            addCriterion("su_id between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(String value1, String value2) {
            addCriterion("su_id not between", value1, value2, "suId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sis_course
     *
     * @mbg.generated do_not_delete_during_merge Sun Oct 14 18:19:50 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sis_course
     *
     * @mbg.generated Sun Oct 14 18:19:50 CST 2018
     */
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