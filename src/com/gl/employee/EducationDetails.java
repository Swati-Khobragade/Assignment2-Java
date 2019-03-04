package com.gl.employee;

import java.util.Date;
/**
 * 
 * @author swati.khobragade
 *
 */
public class EducationDetails {
	private String degree;
	private String university;
	private String grade;
	private Double percent;
	private Date date;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EducationDetails [degree=");
		builder.append(degree);
		builder.append(", university=");
		builder.append(university);
		builder.append(", grade=");
		builder.append(grade);
		builder.append(", percent=");
		builder.append(percent);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}

}
