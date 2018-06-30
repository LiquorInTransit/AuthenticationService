package com.gazorpazorp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "USER")
public class User {
	@Id
	@GenericGenerator(name = "incrementGenerator", strategy = "org.hibernate.id.IncrementGenerator")
	@GeneratedValue(generator="incrementGenerator")
	@Column(name = "id", length = 30)
	private Long id;
	@NaturalId
	@Column(name = "email")
	private String email;
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String phone;
	@Column(name = "password", length = 60)
	private String password;
	@Column(name = "roles", length = 50)
	private String roles;

	@Column(name = "enabled")
	private boolean enabled;
	@Column(name = "non_expired")
	private boolean accountNonExpired;
	@Column(name = "non_locked")
	private boolean accountNonLocked;
}
