import java.security.Key;

public class User {


	public class UserAccount {
		
		// Attribut
		public String name;         // contient Alphabet seulement 

		public String surname;      // contient Alphabet seulement 

		protected String function; // titre du salarié dans l'entreprise

		public String login;      // format email john@gmail.com

		private String password;  // mot de passe sous forme de hash

		
		// Méthode
		UserAccount(String name, String surname, String function, String login, String password){
			this.name = name;
			this.surname = surname;
			this.function = function;
			this.login = login;
			this.password = password;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String pwd) {
			this.password = pwd;
		}
		
		String signeFichier(String nomDuFichier){
			String signatureNumerique ="";
			
			return signatureNumerique;
		}
		
		Boolean VerifieSignature() {
			Boolean r = true;
			
			return r;
		}

	}

	public class AdminAccount extends UserAccount{
		
		private AdminAccount(String name, String surname, String function, String login, String password) {
			super(name, surname, function, login, password);
		}

		@SuppressWarnings("unused")
		private Key masterKey;    // clé blowfish de l'admin
		
		@SuppressWarnings("unused")
		private UserAccount creerUserAccount(String name, String surname, String function, String login, String password) {
			
			UserAccount compteUtilisateur = new UserAccount(name, surname, function, login, password);
			
			
			return compteUtilisateur;
		}

	}

}
