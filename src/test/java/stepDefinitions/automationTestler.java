package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;

public class automationTestler {
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

    @And("Yeni Kullanici Kaydini doğrulayin görünür oldugunu dogrular")
    public void yeniKullaniciKaydiniDoğrulayinGörünürOldugunuDogrular() {
    }

    @And("Adi ve e-posta adresini girin")
    public void adiVeEPostaAdresiniGirin() {
    }

    @And("Kaydol dugmesini tiklar")
    public void kaydolDugmesiniTiklar() {
    }

    @And("HESAP BILGILERINI GIRIN ifadesinin gorundugunu dogrular")
    public void hesapBILGILERINIGIRINIfadesininGorundugunuDogrular() {
    }

    @And("kullanici Unvan, Ad, E-posta, Parola, Doğum tarihi bilgilerini doldurur")
    public void kullaniciUnvanAdEPostaParolaDoğumTarihiBilgileriniDoldurur() {
    }

    @And("Bultenimize kaydolun onay kutusunu secer.")
    public void bultenimizeKaydolunOnayKutusunuSecer() {
    }

    @And("Ortaklarimizdan ozel teklifler alin onay kutusunu secer.")
    public void ortaklarimizdanOzelTekliflerAlinOnayKutusunuSecer() {
    }

    @And("kullanici Ad, Soyad, Sirket, Adres, Adres{int}, Ulke, Eyalet, Sehir, Posta Kodu, Cep Numarasi bilgilerini doldurur")
    public void kullaniciAdSoyadSirketAdresAdresUlkeEyaletSehirPostaKoduCepNumarasiBilgileriniDoldurur(int arg0) {
    }

    @And("Hesap Olustur dugmesine tiklar")
    public void hesapOlusturDugmesineTiklar() {
    }

    @And("HESAP OLUSTURULDU gorunur")
    public void hesapOLUSTURULDUGorunur() {
    }

    @And("Devam Et dügmesine tıklar")
    public void devamEtDügmesineTıklar() {
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
