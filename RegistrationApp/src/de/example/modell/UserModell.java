package de.example.modell;

public class UserModell 
{
	private String name;
	private String firstName;
	private String country;
	private String city;
	private String email;
	private String phoneNumber;
	private String gender;
	private String age;
		
		public UserModell(String name, String firstName, String gender, String country, String email, String age, String city, String phoneNumber)
		{
			this.name = name;
			this.firstName = firstName;
			this.gender = gender;
			this.country = country;
			this.city = city;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.age = age;
			
		}
		

		public String getName()
		{
			return name;
		}
		public String getFirstName()
		{
			return firstName;
		}
		public String getGender()
		{
			return gender;
		}
		public String getCountry() 
		{
			return country;
		}
		
		public void setCountry(String country)
		{
			this.country = country;
		}
		
		public String getCity()
		{
			return city;
		}
		
		public void setCity(String city) 
		{
			this.city = city;
		}
		
		public String getEmail() 
		{
			return email;
		}
		
		public void setEmail(String email) 
		{
			this.email = email;
		}
		
		public String getPhoneNumber() 
		{
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber)
		{
			this.phoneNumber = phoneNumber;
		}
		
		public String getAge() 
		{
			return age;
		}
		
		public void setAge(String age) 
		{
			this.age = age;
		}
		
		public void setName(String name) 
		{
			this.name = name;
		}
		
		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		public void setGender(String gender)
		{
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "UserModell [name=" + name + ", firstName=" + firstName + ", country=" + country + ", city=" + city
					+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", age=" + age + "]";
		}
				
		
}
