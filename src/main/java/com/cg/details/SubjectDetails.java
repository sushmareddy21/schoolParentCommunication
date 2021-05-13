package com.cg.details;

import com.cg.spc.entities.Subject;

public class SubjectDetails
{
	private int subjectId;
	private String title;
	public SubjectDetails() {
	}
	
	public SubjectDetails(int subjectId, String title) {
		super();
		this.subjectId = subjectId;
		this.title = title;
	}

	public SubjectDetails(Subject subject) {
		this.subjectId = subject.getSubjectId();
		this.title = subject.getTitle();
		
		
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
