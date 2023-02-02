Feature Test Durumu 1: Kullanıcıyı Kaydeder
@test1
 Scenario:Test Durumu 1: Kullanıcıyı Kaydetme

  When kullanici tarayiciyi başlatir
Then kullanici "url" URL'sine gider
 And kullanici Ana sayfanın başarıyla göründüğünü doğrular
 And kullanici Kaydol Giriş Yap düğmesine tıklar
 And kullanici Yeni Kullanici Kaydini doğrulayin görünür oldugunu dogrular
 And kullanici Adi ve e-posta adresini girin
 And kullanici Kaydol dugmesini tiklar
 And kullanici HESAP BILGILERINI GIRIN ifadesinin gorundugunu dogrular
 And kullanici Unvan, Ad, E-posta, Parola, Doğum tarihi bilgilerini doldurur
 And kullanici Bultenimize kaydolun onay kutusunu secer.
 And kullanici Ortaklarimizdan ozel teklifler alin onay kutusunu secer.
 And kullanici Ad, Soyad, Sirket, Adres, Adres2, Ulke, Eyalet, Sehir, Posta Kodu, Cep Numarasi bilgilerini doldurur
 And kullanici Hesap Olustur dugmesine tiklar
 And kullanici HESAP OLUSTURULDU gorunur
 And kullanici Devam Et dügmesine tıklar
 And kullanici adi olarak oturum acildi ifadesinin gorunur oldugunu dogrular
 And kullanici Hesabi Sil dugmesine tiklar
 And kulanici hesap silindi gorunur ve Devam Et dugmesine tiklayin