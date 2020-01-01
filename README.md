# Thread-Synchronization
Thread Senkronizasyonu: Aynı veri ile ilgilenen birden fazla thread'in veriye erişiminin düzenlenmesi.

# Uygulama 

Main içinde 1 adet thread oluşturulacak.

Start sonrası Main:
"thread 1 oluşturuldu" diyecek.

Thread 5-15sn arası random sleep yapacak.Ardından
"bana müsade (thread 1) " şeklinde mesaj vererek sonlanacak.

Main metodu, çalışması sonlanan thread'i 1 sn içinde farkederek
onu uğurlayacak: "thread 1! yolun açık olsun"
