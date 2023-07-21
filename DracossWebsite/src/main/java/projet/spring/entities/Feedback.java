package projet.spring.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Feedback implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id_feedback;
	private String description;
	private Date createdDate;
	public long getId_feedback() {
		return id_feedback;
	}
	public void setId_feedback(long id_feedback) {
		this.id_feedback = id_feedback;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Feedback [id_feedback=" + id_feedback + ", description=" + description + ", createdDate=" + createdDate
				+ "]";
	}
	public Feedback(String description, Date createdDate) {
		super();
		this.description = description;
		this.createdDate = createdDate;
	}
	
	public Feedback() {
		
	}
	

}
