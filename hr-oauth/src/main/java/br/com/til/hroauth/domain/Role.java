package br.com.til.hroauth.domain;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String roleName;
	/**
	 * 
	 */
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param roleName
	 */
	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(roleName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(roleName, other.roleName);
	}
	
}
