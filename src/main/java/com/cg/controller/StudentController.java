package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.details.StudentDetails;
import com.cg.service.StudentService;
//import com.cg.service.StudentService;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.Subject;
import com.cg.util.StudentUtil;


@RestController
@RequestMapping("/student")

public class StudentController 
{

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentUtil studentUtil;
	
	
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add")
	public StudentDetails addStudent(@RequestBody @Valid CreateStudentRequest requestData) 
	{
		System.out.println("req data: " + requestData);
		//Student student = new Student(requestData.getDateOfBirth(),requestData.getName(),requestData.getEmailId(),requestData.getMobileNumber());
		Student student = new Student(requestData.getDateOfBirth(), requestData.getCurrentClass(), requestData.getSubjects(), requestData.getName(),requestData.getAddress(), requestData.getClassDiary(), requestData.getEmailId(), requestData.getMobileNumber());
		List<Subject> subjectSet = requestData.getSubjects();
		if(subjectSet!=null) 
		{
			for (Subject subject : subjectSet)
			{
				student.addSubject(subject);
			}
	    }
		System.out.println("stud came: " + student);
		Student stud = studentService.addStudent(student);
		StudentDetails details = studentUtil.toDetails(student);
		return details;
				
    }
	
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student")
	public Student updateStudent(@RequestBody @Valid Student student) 
	{
		
		return studentService.updateStudent(student);
				
    }
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/accountants/{Id}")
	public Student deleteStudent(@RequestBody @Valid Student student) 
	{
		return studentService.deleteStudent(student);
				
    }
}
