package com.xxl.job.admin.core.model;

/**
 * 任务关系
 * 
 * @author hopezhangbo
 *
 */
public class XxlJobParent {
	private int jobId; // 任务id
	private String jobDesc;// 任务描述
	private int parentId; // 父任务id
	private String parentJobDesc; // 父任务描述
	private int triggerType;// 触发类型0:等待,1:触发父任务,2:跳过父任务

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(int triggerType) {
		this.triggerType = triggerType;
	}

	/**
	 * @return the jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}

	/**
	 * @param jobDesc the jobDesc to set
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	/**
	 * @return the parentJobDesc
	 */
	public String getParentJobDesc() {
		return parentJobDesc;
	}

	/**
	 * @param parentJobDesc the parentJobDesc to set
	 */
	public void setParentJobDesc(String parentJobDesc) {
		this.parentJobDesc = parentJobDesc;
	}

}
