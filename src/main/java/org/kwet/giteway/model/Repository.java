package org.kwet.giteway.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Repository implements Serializable {

	private String name;

	private String username;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Repository [name=" + name + ", username=" + username + "]";
	}

}
