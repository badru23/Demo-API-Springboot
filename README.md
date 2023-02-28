<h1 align="center">Demo API dengan Spring Boot</h1>

# Spring Boot
<p> Spring Boot adalah salah satu framework dari spring yang memberikan ke mudahan untuk memilih library java yang akan kita gunakan baik dari spring atau libray lainya. Membantu java developer membuat aplikasi segera berjalan dengan menyederhanakan proses pembuatan dan mengaktifkan konvensi atas konfigurasi <p>

# Rest API
<p> <b> Application Programming Interface (API) </b> menetapkan koneksi antara komputer atau antara program komputer (aplikasi) dengan menyediakan kode dan saluran informasi yang tersedia. Ini adalah jenis antarmuka perangkat lunak yang bertindak sebagai mediator di antara perangkat lunak lain untuk merampingkan interaksi satu sama lain. <p>

# Membangun Spring Boot REST API
## Initializing a Spring Boot Project
> Menginialisasi project dengan Spring Initializr dan menambahkan beberapa dependensi untuk digunakan dalam proyek ini. contoh :
- <b>Spring Data JPA</b> : adalah sebuah library / dependency yang  berguna untuk membuat fungsi CRUD dasar yang memudahkan kita membangun aplikasi. dengan menggunakan library ini kita dapat membuat sebuah query atau costum query dengan sangat mudah.
- <b>Spring Starter Validation</b> : adalah sebuah library / dependency yang  berguna untuk menangkap data data yang tidak valid bahkan missing. dan memberikan informasi kepada pengguna.
- <b>Spring Starter Web</b> : adalah sebuah library / dependency yang  berguna untuk membangun website, RESTful, dan Aplikasi menggunakan Spring MVC. Spring Boot Starter Web menggunakan Tomcat sebagai container embedded
- <b>Spring Devtols</b> : adalah sebuah library / dependency yang  berguna untuk mempermudah programmer untuk mendevelop aplikasi.
- <b>MySQL Driver</b> : adalah sebuah library / dependency yang  berguna untuk Connecting Spring Boot dengan Database.
- <b>Swagger Springfox</b> : adalah sebuah library / dependency yang berguna untuk mendokumentasikan spesifikasi untuk API .dengan menyediakan pustaka untuk mengintegrasikan UI Swagger untuk berinteraksi dengan API. untuk membuat tampilan swagger kita perlu mengkonfigurasi nya terlebih dahulu.

## Connecting Spring Boot to the Database
> Menambahkan beberapa sintaks untuk mengconfigurasi koneksi dengan data base. pada file application.properties

## Membuat Class Entities
> Class Entity Merupakan bagian dari sistem yang berisi kumpulan kelas berupa entitas-entitas yang membentuk gambaran awal sistem dan menjadi landasan untuk menyusun basis data.

## Membuat Class Repositories
> Class Repository adalah class yang digunakan untuk melakukan operasi CRUD atau membuat fungsi lain dengan custom query.

## Membuat Class Services
> Class Services digunakan untuk menyimpan logic program pada aplikasi.

## Membuat Class Controllers
> Class Controllers digunakan untuk memproses permintaan REST API yang masuk, menyiapkan model, dan mengembalikan tampilan untuk dirender sebagai respons.
