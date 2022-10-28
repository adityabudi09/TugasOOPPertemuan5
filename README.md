# TugasPBOPertemuan5
Nama      : Dwi Aditya Budi Listiawan\
NIM       : 312110003\
Matkul    : Pemrograman Berorientasi Objek
# LANGKAH 1
Persiapkan software yang akan digunakan. Software yang saya gunakan adalah Apache NetBeans IDE 15 dan Java JDK, saya melakukan new projek pada software tersebut dan tercipta Main.java.
# LANGKAH 2
Saya membuat file java baru/class baru bernama Person, kemudian Person akan di isi dengan 3 atribut yaitu,\
   ●  Nama\
   ●  Jenis Kelamin\
   ●  Umur
   
![image](https://user-images.githubusercontent.com/115923969/198681504-015745c1-f644-421b-9b96-1dc0a2ddcd27.png)\
Kita membuat ketiga atribute tersebut menjadi private, dan ketika kita mengubahnya menjadi privatemaka atribute itu tidak bisa di akses di luar Class Person. Sehingga kita membuat seperti jembatan penghubungnya yaitu, Setter dan Getter.

  ●   Setter: Penghubung yang berfungsi untuk mengisi sebuah nilai terhadap atribute private tersebut.\
  ●   Getter: Setelah nilai di isi, maka nilai tersebut akan kita panggil dengan Getter. Getter akan mengembalikan nilai yang telah di set di Setter.\
  Contoh Setter:

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void setJenisKelamin(char jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
  Contoh Getter:

    public int getUmur(){
        return this.umur;
    }

    public char getJenisKelamin(){
        return this.jenisKelamin;
    }
# LANGKAH 3
Setelah Class Person di buat maka kita bisa menaruh/menetapkan nilai dari atribut Person di Main.java. Kita tidak memanggil atribut tersebut secara langsung akan tetapi kita akan memanggil fungsi Setter untuk memberikan nilai dan fungsi Getter untuk mengembalikan nilai. Maka Full Code Main.java akan menjadi seperti berikut.

    
    public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        // ANTON
        person.setName("Anton");
        person.setJenisKelamin('L');
        person.setUmur(20);
        System.out.println("Nama: " + person.getName());
        System.out.println("Jenis Kelamin: " + person.getJenisKelamin());
        System.out.println("Umur: " + person.getUmur());

        System.out.println();

        // RIKO
        person2.setName("Riko");
        person2.setJenisKelamin('L');
        person2.setUmur(25);
        System.out.println("Nama: " + person2.getName());
        System.out.println("Jenis Kelamin: " + person2.getJenisKelamin());
        System.out.println("Umur: " + person2.getUmur());
    }

# LANGKAH 4
Kita melakukan set dari setiap atribute dan memanggilnya untuk mengembalikan nilai yang telah kita set dengan memanggil get. Maka Output dari program di atas akan menjadi seperti berikut,

![image](https://user-images.githubusercontent.com/115923969/198684697-ff364c5a-03b9-4d8b-92a4-edfac555f0ef.png)

![image](https://user-images.githubusercontent.com/115923969/198684828-1ecca44e-b393-4782-a677-07d079c75b61.png)

![image](https://user-images.githubusercontent.com/115923969/198684877-793cf2ea-d578-4831-8457-2eb77e029ba0.png)

