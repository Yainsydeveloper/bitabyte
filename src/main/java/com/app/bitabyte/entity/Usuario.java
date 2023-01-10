package com.app.bitabyte.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;




@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{


	private static final long serialVersionUID = 2L;
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Basic(optional = false)
   
   @Column(name = "correo")
   private String correo;
   
   @Lob
   @Column(name = "password")
   private String password;
   
  
  
   @Column(name = "rol_idrol")
   public Integer rolIdrol;



public String getCorreo() {
	return correo;
}



public void setCorreo(String correo) {
	this.correo = correo;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public Integer getRolIdrol() {
	return rolIdrol;
}



public void setRolIdrol(Integer rolIdrol) {
	this.rolIdrol = rolIdrol;
}




   
   
   
   



   

   
   
   




   
   
   
   
}