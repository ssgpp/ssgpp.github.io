# ssg++ API kullanımı örneği
# author: Onur Derin <oderin at users.sourceforge.net>

import ssgpp.sozluk.SozlukApi;
import java.util.List;
import ch.alari.sacre.Token;

public class Main
{
    public static void main(String[] args)
    {
	// ssg++ API'yi başlat
	SozlukApi.apiInit();

	// ekşi sözlük'e giriş yap
	SozlukApi.login("e-mail adresi ya da kullanıcı adı", "şifre");

	// iş hatlarını çalıştır
	List<Token> sukelaList = SozlukApi.runPipeline("cımbızknk [tip=şükela, adet=2] ! apisink");
	for(Token sukela: sukelaList)
	{
	    System.out.println(sukela);
	}

	// ssg++ API'yi kapat
	SozlukApi.apiDeinit();
    }
}
