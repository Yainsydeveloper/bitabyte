package com.app.bitabyte.entity;





import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    
    private String password;

    @Column
    private String correo;

    

    @Column
    private String name;

    @Column
    private String rol_Idrol;

    
    
    

    
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getRol_Idrol() {
		return rol_Idrol;
	}

	public void setRol_Idrol(String rol_Idrol) {
		this.rol_Idrol = rol_Idrol;
	}

	

    
    
}