package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class automation {
    @When("kullanici tarayiciyi başlatir")
    public void kullaniciTarayiciyiBaşlatir() {
        Driver.getDriver().get("www.google.com");
    }

    @Then("kullanici {string} URL'sine gider")
    public void kullaniciURLSineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("kullanici Ana sayfanın başarıyla göründüğünü doğrular")
    public void kullaniciAnaSayfanınBaşarıylaGöründüğünüDoğrular() {
    }

    @And("kullanici Kaydol Giriş Yap düğmesine tıklar")
    public void kullaniciKaydolGirişYapDüğmesineTıklar() {
    }

    @And("kullanici Yeni Kullanici Kaydini doğrulayin görünür oldugunu dogrular")
    public void kullaniciYeniKullaniciKaydiniDoğrulayinGörünürOldugunuDogrular() {
    }

    @And("kullanici Adi ve e-posta adresini girin")
    public void kullaniciAdiVeEPostaAdresiniGirin() {
    }

    @And("kullanici Kaydol dugmesini tiklar")
    public void kullaniciKaydolDugmesiniTiklar() {
    }

    @And("kullanici HESAP BILGILERINI GIRIN ifadesinin gorundugunu dogrular")
    public void kullaniciHESAPBILGILERINIGIRINIfadesininGorundugunuDogrular() {
    }

    @And("kullanici Unvan, Ad, E-posta, Parola, Doğum tarihi bilgilerini doldurur")
    public void kullaniciUnvanAdEPostaParolaDoğumTarihiBilgileriniDoldurur() {
    }

    @And("kullanici Bultenimize kaydolun onay kutusunu secer.")
    public void kullaniciBultenimizeKaydolunOnayKutusunuSecer() {
    }

    @And("kullanici Ortaklarimizdan ozel teklifler alin onay kutusunu secer.")
    public void kullaniciOrtaklarimizdanOzelTekliflerAlinOnayKutusunuSecer() {
    }

    @And("kullanici Ad, Soyad, Sirket, Adres, Adres{int}, Ulke, Eyalet, Sehir, Posta Kodu, Cep Numarasi bilgilerini doldurur")
    public void kullaniciAdSoyadSirketAdresAdresUlkeEyaletSehirPostaKoduCepNumarasiBilgileriniDoldurur(int arg0) {
    }

    @And("kullanici Hesap Olustur dugmesine tiklar")
    public void kullaniciHesapOlusturDugmesineTiklar() {
    }

    @And("kullanici HESAP OLUSTURULDU gorunur")
    public void kullaniciHESAPOLUSTURULDUGorunur() {
    }

    @And("kullanici Devam Et dügmesine tıklar")
    public void kullaniciDevamEtDügmesineTıklar() {
    }

    @And("kullanici adi olarak oturum acildi ifadesinin gorunur oldugunu dogrular")
    public void kullaniciAdiOlarakOturumAcildiIfadesininGorunurOldugunuDogrular() {
    }

    @And("kullanici Hesabi Sil dugmesine tiklar")
    public void kullaniciHesabiSilDugmesineTiklar() {
    }

    @And("kulanici hesap silindi gorunur ve Devam Et dugmesine tiklayin")
    public void kulaniciHesapSilindiGorunurVeDevamEtDugmesineTiklayin() {
    }
}
