package com.ecodation.bankaprojesi;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class AdmiinnDtoo extends Commoonn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3929600695494256937L;
	private int adminId;
	private String adminName;
	private String adminSurname;
	private String adminPassword;
	private String adminEmail;

	public AdmiinnDtoo() {
		// TODO Auto-generated constructor stub
	}

	public AdmiinnDtoo(int adminId, String adminName, String adminSurname, String adminPassword, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminSurname = adminSurname;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
	}

	@Override
	public String toString() {
		return "AdmiinnDtoo [adminId=" + adminId + ", adminName=" + adminName + ", adminSurname=" + adminSurname
				+ ", adminPassword=" + adminPassword + ", adminEmail=" + adminEmail + "]";
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminSurname() {
		return adminSurname;
	}

	public void setAdminSurname(String adminSurname) {
		this.adminSurname = adminSurname;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
