package com.demo.map;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ans_id;
	
	private String ans;
	
	
	
	@ManyToOne
    @JoinColumn(name = "ques_id")
    private Question question;
	

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	public Answer(int ans_id, String ans, Question question) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
		this.question = question;
	}


	public Answer(int ans_id, String ans) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
	}



	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", ans=" + ans + ", question=" + question + "]";
	}
	
	

}
