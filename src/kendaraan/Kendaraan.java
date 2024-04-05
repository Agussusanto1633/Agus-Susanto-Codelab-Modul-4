package kendaraan;

public abstract class Kendaraan {
    // Deklarasi properti kendaraan
    String name;
    String model;
    String warna; // Warna dalam Bahasa Indonesia
    int tahun; // Tahun dalam Bahasa Indonesia

    // Deklarasi method-method abstract yang harus
    // diimplementasikan oleh subclass
    public abstract void Start();
    public abstract void Stop();
    public abstract void Brake();

    // Method ini akan mencetak informasi kendaraan
    public void getInfo(){
        System.out.println("Kendaraan: " + name);
        System.out.println("Model : " + model);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }

    // Method getter dan setter untuk properti
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public int getTahun(){
        return tahun;
    }

    public void setTahun(int tahun){
        this.tahun = tahun;
    }

}