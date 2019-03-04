package com.gl.employee;
/**
 * 
 * @author swati.khobragade
 *
 */
public class EmploymentDetails {
	private String organizationName;
	private String technology;
	private Double duration;
	private String project;

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmploymentDetails [organizationName=");
		builder.append(organizationName);
		builder.append(", technology=");
		builder.append(technology);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", project=");
		builder.append(project);
		builder.append("]");
		return builder.toString();
	}
}
