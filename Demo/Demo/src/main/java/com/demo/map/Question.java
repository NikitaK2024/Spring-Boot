package com.demo.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Question{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ques_id;
	
	private String ques;
	
	//@OneToOne
    //Answer answer;
	
	@OneToMany(mappedBy = "ans_id",    cascade=CascadeType.ALL)
	List<Answer> answer;
	
	
	

	
	public Question(int ques_id, String ques, ArrayList<Answer> answer) {
		super();
		this.ques_id = ques_id;
		this.ques = ques;
		this.answer = answer;
	}

	
	
	
	public List<Answer> getAnswer() {
		return answer;
	}




	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}




	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQues_id() {
		return ques_id;
	}

	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Question [ques_id=" + ques_id + ", ques=" + ques + ", answer=" + answer + "]";
	}
	
	

	/*public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [ques_id=" + ques_id + ", ques=" + ques + ", answer=" + answer + "]";
	}
	*/
	
	

}
