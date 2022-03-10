package modelo.entidad;

public class Usuario {
	
	private String username;
	private String password;
	
	
	public Usuario() {
		super();
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username_) {
		this.username = username_;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
