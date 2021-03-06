package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import javax.persistence.CascadeType;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

import com.cg.spc.entities.Address;
import com.cg.spc.entities.ClassDiary;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Subject;

public class CreateStudentRequest {
	@Max(100)
	//private long userId;
		private LocalDate dateOfBirth;
		private ClassId currentClass;
		private List<Subject> subjects;
		@NotBlank @Size(min = 2, max = 20)
		private String name;
		private Address address;
		private ClassDiary classDiary;
		private String emailId;
		private String mobileNumber;
		/*{
		
		"dateOfBirth":"2022-04-23",
		"currentClass":{},
		"subjects":[{}],
		"name":"Nikhil",
		"address":{},
		"classDiary":{},
		"emailId":"abc@gmail.com",
		"mobileNumber":"9876567456"

		}*/
		
		@Override
		public String toString() {
			return "CreateStudentRequest [dateOfBirth=" + dateOfBirth + ", currentClass=" + currentClass + ", subjects="
					+ subjects + ", name=" + name + ", address=" + address + ", classDiary=" + classDiary + ", emailId="
					+ emailId + ", mobileNumber=" + mobileNumber + "]";
		}
		
		public CreateStudentRequest(@Max(100) LocalDate dateOfBirth, ClassId currentClass, List<Subject> subjects,
				@NotBlank @Size(min = 2, max = 20) String name, Address address, ClassDiary classDiary, String emailId,
				String mobileNumber) {
			super();
			this.dateOfBirth = dateOfBirth;
			this.currentClass = currentClass;
			this.subjects = subjects;
			this.name = name;
			this.address = address;
			this.classDiary = classDiary;
			this.emailId = emailId;
			this.mobileNumber = mobileNumber;
		}

		public CreateStudentRequest() {
			super();
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public ClassId getCurrentClass() {
			return currentClass;
		}
		public void setCurrentClass(ClassId currentClass) {
			this.currentClass = currentClass;
		}
		public List<Subject> getSubjects() {
			return subjects;
		}
		public void setSubjects(List<Subject> subjects) {
			this.subjects = subjects;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public ClassDiary getClassDiary() {
			return classDiary;
		}
		public void setClassDiary(ClassDiary classDiary) {
			this.classDiary = classDiary;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		
		
		
	

}