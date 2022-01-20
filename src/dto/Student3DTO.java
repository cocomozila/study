package dto;

public class Student3DTO {
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String major;
	
	private Student3DTO(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.email = builder.email;
		this.phone = builder.phone;
		this.major = builder.major;
	}
	
	public static Builder builder() {
		return new Builder();
	}	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getMajor() {
		return major;
	}

	public static class Builder {
	
		private int id;
		private String name;
		private String email;
		private String phone;
		private String major;
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Builder major(String major) {
			this.major = major;
			return this;
		}
		
		public Student3DTO build() {
			return new Student3DTO(this);
		}
				
	}	
}
