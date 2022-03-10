package modelo.entidad;

public class Usuario {
	
	private String username;
	private String password;
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(String string, String string2) {
		username = string;
		password = string2;
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
