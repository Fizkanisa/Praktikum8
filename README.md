## Latihan 1
### **Polimorfisme dengan Inheritance**
Program ini mendemonstrasikan inheritance dan method overriding menggunakan class `Animal`, `Dog`, dan `Bird`.

### **Konsep Utama**
- `Dog` dan `Bird` meng-override method `speak()`.
- List menyimpan objek `Animal`, tetapi objek sebenarnya adalah subclass.
- `instanceof` digunakan untuk memanggil method khusus `fetch()` pada `Dog`.

### **Alur Program**
- Objek `Dog`, `Bird`, dan `Dog` dimasukkan ke List.
- Setiap objek memanggil `speak()` sesuai versi override.
- Jika objek adalah `Dog`, method `fetch()` dipanggil.

### **Contoh Output**
<img width="393" height="159" alt="image" src="https://github.com/user-attachments/assets/19f90fe2-c300-47a7-9671-b68902595d6b" />

## Latihan 2
### **Abstract Class dan Perhitungan Area**
Program ini menggunakan abstract class `Shape` yang memiliki method abstrak `area()`. Class `Circle` dan `Rectangle` mengimplementasikan perhitungan luas.

### **Konsep Utama**
- Abstract class tidak bisa diinstansiasi.
- Perhitungan area dilakukan polymorphic melalui referensi `Shape`.

### **Alur Program**
- List terdiri dari `Circle` dan `Rectangle`.
- Semua objek memanggil `area()` sesuai implementasinya.
- Luas dijumlahkan dan ditampilkan.

### **Contoh Output**
<img width="413" height="80" alt="image" src="https://github.com/user-attachments/assets/635da80c-71ab-443f-8bd6-7730c4ed4591" />

## Latihan 3
### **Interface dan Implementasinya**
Interface `Payable` digunakan oleh dua class: `Employee` dan `Contractor`.

### **Konsep Utama**
- `Employee` mengembalikan gaji tetap.
- `Contractor` menghitung upah berdasarkan `rate × hours`.
- Polimorfisme terjadi karena semua objek diperlakukan sebagai `Payable`.

### **Alur Program**
- List berisi objek `Employee` dan `Contractor`.
- Setiap objek memanggil `pay()`.
- Total pembayaran dijumlahkan.

### **Contoh Output**
<img width="402" height="84" alt="image" src="https://github.com/user-attachments/assets/cc99c36b-86f9-41ef-9cc2-7f573db0a9fd" />

## Latihan 4
### **Overloading vs Overriding pada Referensi Superclass**
Program ini menjelaskan perbedaan overloading dan overriding saat sebuah objek subclass disimpan dalam referensi superclass.

### **Konsep Utama**
- Class `Base` memiliki `f(Number n)`.
- Class `Sub` menambah method baru `f(Integer i)` → **overloading**, bukan overriding.
- Pemanggilan method dipilih berdasarkan **tipe referensi**, bukan tipe objek.

### **Kasus Penting**
```java
Base b = new Sub();
b.f(10);

