Feature Test Durumu 1: Kullanıcıyı Kaydeder
@test1
 Scenario:Test Durumu 1: Kullanıcıyı Kaydetme

  When kullanici tarayiciyi başlatir
Then kullanici "url" URL'sine gider
 And kullanici Ana sayfanın başarıyla göründüğünü doğrular
 And kullanici Kaydol Giriş Yap düğmesine tıklar
 And Yeni Kullanici Kaydini doğrulayin görünür oldugunu dogrular
 And Adi ve e-posta adresini girin
 And Kaydol dugmesini tiklar
 And HESAP BILGILERINI GIRIN ifadesinin gorundugunu dogrular
 And kullanici Unvan, Ad, E-posta, Parola, Doğum tarihi bilgilerini doldurur
 And Bultenimize kaydolun onay kutusunu secer.
 And Ortaklarimizdan ozel teklifler alin onay kutusunu secer.
 And kullanici Ad, Soyad, Sirket, Adres, Adres2, Ulke, Eyalet, Sehir, Posta Kodu, Cep Numarasi bilgilerini doldurur
 And Hesap Olustur dugmesine tiklar
 And HESAP OLUSTURULDU gorunur
 And Devam Et dügmesine tıklar
 And kullanici adi olarak oturum acildi ifadesinin gorunur oldugunu dogrular
 And kullanici Hesabi Sil dugmesine tiklar
 And kulanici hesap silindi gorunur ve Devam Et dugmesine tiklayin