package emlakburada.model.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Long id;
	private String kullaniciTipi; // bireysel & kurumsal & yeniTip
	private String isim;
	private String email;
	private String fotograf;
	private String biyografi;
	private Set<Advert> favoriIlanlar = new HashSet<>();
	private List<Advert> yayinladigiIlanlar = new ArrayList<>();
	private List<Message> mesajKutusu;

	public User(String kullaniciTipi, String isim, String email) {
		super();
		this.kullaniciTipi = kullaniciTipi;
		this.isim = isim;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
