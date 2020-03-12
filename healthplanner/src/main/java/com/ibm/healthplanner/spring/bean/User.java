package com.ibm.healthplanner.spring.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;


@SuppressWarnings("serial")
@Document(collection = "user")
public class User  extends BaseEntity{

	@JsonProperty("patientName")
	private PatientName name;
	
	@JsonProperty("postalAddress")
	private PostalAddress address;
	
	private String dateOfBirth;
	
	private String mailId;
	private String phone;
	
	/*public enum MaritalStatusEnum {
	    SINGLE("Single"),
	    
	    MARRIED("Married");

	    private String value;

	    MaritalStatusEnum(String value) {
	      this.value = value;
	    }
	    
	    @Override
	    @JsonValue
	    public String toString() {
	      return String.valueOf(value);
	    }

	    @JsonCreator
	    public static MaritalStatusEnum fromValue(String text) {
	      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
	        if (String.valueOf(b.value).equals(text)) {
	          return b;
	        }
	      }
	      return null;
	    }
	  }
	
*/	@JsonInclude(value=Include.NON_NULL)
	@JsonProperty("maritalStatus")
	private String maritalStatus = null;
	
	private List<String> medHistory;;
	
	
	public User(){
		
	}
	public User(PatientName name, PostalAddress address, String dateOfBirth, String mailId,
			String phone, String maritalStatus, List<String> medHistory ){
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.mailId = mailId;
		this.phone = phone;
		this.maritalStatus = maritalStatus;
		this.medHistory = medHistory;
	}
	public PatientName getName() {
		return name;
	}
	public void setName(PatientName name) {
		this.name = name;
		System.out.println("PatientName : "+name.toString() +"FirstName: "+name.getFirstName());
	}
	public PostalAddress getAddress() {
		return address;
	}
	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public List<String> getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(List<String> medHistory) {
		this.medHistory = medHistory;
	}
	
}
