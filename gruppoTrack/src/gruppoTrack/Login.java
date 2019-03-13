package gruppoTrack;

import java.sql.ResultSet;
import java.sql.SQLException;



public class Login {
	private String username;
	private String password;
	ResultSet rs;

	private Connessione connessione = new Connessione();

	public Login (String username, String password) {
		this.username = username;
		this.password = password;
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

	public boolean Query() {

		String sql = "SELECT username_utenti,password_utenti FROM utenti WHERE username_utenti= '" + this.username
				+ "' and password_utenti= '" + this.password + "'";
		rs = connessione.getResult(sql);
		try {
			if (rs.next()) {
				return true;
				// username = rs.getString("username_utenti");
				// password = rs.getString("password_utenti");
			}

		} catch (SQLException e) {
			System.out.println("resultSet error!");
			e.printStackTrace();
		}
			return false;
	}

}


