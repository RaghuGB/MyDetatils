package mydetails.model;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
public class UserDetails {
	 public UserDetails() {
	}
	 @NotEmpty
     private String user;

     @NotEmpty
     @Email
     private String email;        

     @NotEmpty(message = "Phone should not be blank.")
     @Size(min = 10,max = 10)
     private String phone;

     @NotEmpty(message = "Enter your blog URL")
     @URL
     private String blog;
}
