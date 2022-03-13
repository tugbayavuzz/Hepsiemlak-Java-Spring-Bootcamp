# Hepsiemlak-Java-Spring-Bootcamp-HW5

1. Monolith ve microservice mimarisini karşılaştıran makale yazın.( 20 Puan)

# Monolitik Mimari 
Monolitik mimari aslına gündelik yaptığımız projelerimizde çok fazla kullanıyoruz ama farkında değiliz. Monolitik mimari, bir yazılım programının tasarımı için unified modeldir. Monolitik uygulamalar, birden çok ilgili taskı yerine getirmek için tasarlanmıştır. Bunlar, genellikle birbirine sıkı sıkıya bağlı birkaç işlevi kapsayan karmaşık uygulamalardır.


<img src="https://user-images.githubusercontent.com/45331297/156444055-db2bc697-163d-45bc-8f65-3c53e472cc6d.png"/>


İstekleri sunucuya atan bir client var. Bu sunucu bir veritabanına bağlıdır. Sunucu üzerinde çalışan projemiz gelen istekleri, bu veriyi verebilmesi için veritabanına gidiyor. Gelendayatla birlikte bizlere ekranda attığımız istek ne ise onu getiriyor. Örneğin bir video izlemek istediğimizde, bir arama yaptımızda vs. İşte bu kullandığımız aslında monolitik mimaridir.

Monolitik mimaride sunucuda 3 katman vardır.
- Data Access 
- Business
- Presentation katmanı

Presentation Layer: Son kullanıcının gördüğü katmandır. User interface aslında. Client’ın gördüğü katmandır.<br>

Business Layer: Mantıksal işlemlerin yapıldığı katmandır. Routingleri yaptığımız yerdir. Örnegin maaş hesaplamaları, veri analizi modellemesi veya siparişin farklı aşamalardan geçirilmesi gibi iş akışı olabilir. Kodları yazdığımız bölüm diyebiliriz.<br>

Data Access Layer: Aslında business katmanında bir id parametresi aşan bir metodumuz olsun. Bu id ye ait ürünü getirmesi için data Access katmanında bu veritabanına bu istek atılıyor ve veri getiriliyor. Getirilen veri presentation layer da kullanıcıya gösteriliyor.<br>

# Monolitik Mimari Avantajları<br>
Geliştirmesi basit<br>
Test edilmesi kolay<br>
Kolay deployment<br>



# Monolitik Mimari Dezavantajları <br>
Proje büyüdükçe bakımı zorlaşır<br>
Uygulamanın boyutu başlama süresini yavaşlatır<br>
Değişiklik yapmak zordur<br>
Ölçeklenebilirliği(Scaleable) düşüktür. Tüm proje genelinde yapılır.<br>

# Mikroservisler Mimarisi
Mikro servisler, yazılımın iyi tanımlanmış API'ler üzerinden iletişim kuran küçük bağımsız servislerden oluştuğu yazılım geliştirmeye yönelik mimari bir yaklaşımdır. Bu servisler küçük, bağımsız ekiplere aittir.
Aslında her bir servis kendine ait bir dünyada çalışır. <br>
Her bir servis kendine ait sunucuda çalışır. <br>
Kendine ait veritabanı vardır. <br>
Sadece bir küçük işi çok iyi yapmalıdır felsefesine göre ve tek bir sunucu üzerinde tek bir modül olarak.<br>
Stateless yapılardır.



#  Mikroservisler Mimarisi Avantajları<br>
Çok dilli mimari<br>
Kolay ölçeklenebilirler<br>
Yenilik yapması daha kolay<br>

#  Mikroservisler Mimarisi Dezavantajları <br>
Implemantasyon kolay değildir<br>
Debug kolay değildir<br>
Değişiklik yapmak zordur<br>
Hata yönetimi kolay değildir<br>


![image](https://user-images.githubusercontent.com/45331297/156445583-8e97e805-1447-457c-a6a4-46efb3eae820.png)

Peki her biri farklı sunucu olursa diğer modüllerle nasıl iletişime geçilecek sorusu akıllara gelir. Api Gateway üzerinden dış ve iç dünya ile iletişime geçerler. <br>
Api Gateway nedir?<br>
Gateway bir geçit, kapı anlamına gelir. API gateway, bir istemci ile backend servisleri koleksiyonu arasında yer alan bir API yönetim aracıdır. Bir API gateway, tüm uygulama programlama arabirimi (API) çağrılarını kabul etmek, bunları yerine getirmek için gereken çeşitli servisleri toplamak ve uygun sonucu döndürmek için bir ters proxy görevi görür.

3. Aşağıdaki kavramları araştırıp neler yapılabildiğini anlatan bir makale yazın. (40 Puan)
JUnit 4 ve JUnit5 ile Unit Test
TDD (Test Driven Development)
Obje mock’lama (Mockito)
Spring Profile
3. Gateway ürünün yaptığı iş olan routing(yönlendirme) işlemini bir gateway kullanmadan
sizler de gerçekleştirin bir uygulama yazın. (İpucu: kendi gateway’inizin içinde bütün
sistemde bulunan yani yönlendirmek istediğiniz servislerin controller’ıda olmalıdır ) (40
Puan)
Uygulama feign client’lar sayesinde diğer servislere yönlenmelidir.
