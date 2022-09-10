import java.security.SecureRandom;

public class Password {
	private int longitud;
	private String[] contraseña;
	
	/**
	 * Constructor por defecto
	 */
	public Password() {
		longitud=8;
		contraseña=new String[8];
	}
	
	/**
	 * Pasamos por parametro la longitud
	 * @param lon
	 */
	public Password(int lon) {
		longitud=lon;
		contraseña=new String[longitud];
		//Generamos contraseña automatica
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //Posibles caracteres que puede tener la contraseña
		SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        //Passamos String a array char
        String a=sb.toString();
        contraseña=a.split("");
	}

}
