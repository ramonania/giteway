package org.kwet.giteway.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String login;

	private String avatarUrl;

	long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + "]";
	}

}
