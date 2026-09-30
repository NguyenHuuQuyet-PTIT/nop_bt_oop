class Student {
    private String mssv;
    private String name;
    private double diemcc;
    private double diemgk;
    private double diemck;
    public Student(String mssv, String name, double diemcc, double diemgk, double diemck) {
        this.mssv = mssv;
        this.name = name;
        setdiemcc(diemcc);
        setdiemgk(diemgk);
        setdiemck(diemck);
    }
    public String getmssv() {
        return mssv;
    }
    public String getname() {
        return name;
    }
    public double getdiemcc() {
        return diemcc;
    }
    public double getdiemgk() {
        return diemgk;
    }
    public double getdiemck() {
        return diemck;
    }
    public void setdiemcc(double diemcc) {
        if (diemhople(diemcc)) {
            this.diemcc = diemcc;
        }
    }
    public void setdiemgk(double diemgk) {
        if (diemhople(diemgk)) {
            this.diemgk = diemgk;
        }
    }
    public void setdiemck(double diemck) {
        if (diemhople(diemck)) {
            this.diemck = diemck;
        }
    }
    public double diemtrungbinh() {
        return diemcc * 0.1 + diemgk * 0.3 + diemck * 0.6;
    }
    private boolean diemhople(double diem) {
        return diem >= 0 && diem <= 10;
    }
}
class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("B21DCCN001", "Minh", 8, 7.5, 9);
        Student sv2 = new Student("B21DCCN002", "Diện", 6, 6, 6.5);
        Student sv3 = new Student("B21DCCN003", "Việt", 4, 5, 4);
        insinhvien(sv1);
        insinhvien(sv2);
        insinhvien(sv3);
    }
    private static void insinhvien(Student student) {
        System.out.printf("%s - %s: %.2f%n", student.getmssv(), student.getname(), student.diemtrungbinh());
    }
}
