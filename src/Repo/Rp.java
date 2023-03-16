package Repo;
public class Rp
{
    int id;
    String Name;
    String Phone;
    String Address;
    public Rp(int id,String Name,String Phone,String Address){
        this.id=id;
        this.Name=Name;
        this.Phone=Phone;
        this.Address= Address;
}

    public static void main(String[] args) {
        Rp rp=new Rp(101,"Aniket","98525542","Kanpur");
        Rp rp1=new Rp(102,"Ram","889988554","KAnpur");
        System.out.println(rp);
        System.out.println(rp1);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'';
    }
}
