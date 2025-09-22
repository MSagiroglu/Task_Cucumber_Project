# Java17_Playwright_TestNG_UI_Automation_Feedback4e

> Tüm kaynak dosyalar `test/` altında ve her dosyada Türkçe açıklama ve yorumlar var.

## Özellikler
- Java 17 uyumlu
- Playwright ile thread-safe ve storage state login
- Çoklu environment: stage-ui, stage, product
- TestNG + Cucumber ile paralel ve senaryo bazlı test
- Allure ile raporlama ve otomatik mail gönderimi
- Log4j ile gelişmiş loglama
- AWS CI/CD ve zamanlayıcı desteği

## Ortam Seçimi
- `test/resources/utilities.properties` içindeki `env` anahtarı ile ortam değiştirilir.
- Her ortam için ayrı storage state dosyası kullanılır.

## Kurulum & Çalıştırma

1. Maven bağımlılıklarını yükle:
   ```
   mvn clean install
   ```
2. Test çalıştır:
   ```
   mvn test
   ```
3. Paralel test için:
   ```
   mvn test -Dsurefire.suiteXmlFiles=testng-parallel.xml
   ```
4. Allure raporu oluşturmak için:
   ```
   allure serve target/allure-results
   ```
5. AWS'de her gece saat 04:00'te otomatik çalıştırmak için EventBridge ile cron tetikleyici kurun.

## Otomatik Rapor Maili
- Testler sonunda Allure raporu otomatik olarak utilities'deki adreslere gönderilir.

## Klasör Yapısı

```
test/
├── java/
│   ├── utilities/
│   ├── driver/
│   ├── hooks/
│   ├── pages/
│   ├── runners/
│   ├── steps/
│   └── features/
├── resources/
│   ├── utilities.properties
│   ├── log4j2.xml
│   ├── state.stage-ui.json
│   ├── state.stage.json
│   └── state.product.json
├── pom.xml
├── testng-parallel.xml
├── buildspec.yml
└── README.md
```

---

Bu dosyalar ile projenizi AWS ve lokal ortamda eksiksiz bir şekilde çalıştırabilirsiniz.  
Her türlü ek test, pipeline veya özel dosya isteğiniz için yardımcı olabilirim!#   F 4 e T e s t _ J a v a P l a y w r i g h t U I A u t o m a t i o n 
 
 
