public class Encaps {
    private int rollno;
    private String name;

    private int Marks1,Marks2;

    public int getRollno(){
        return rollno;
    }

    public void setRollno(int rollno){
        this.rollno = rollno;
    }

    public String getName(){
        return name;
    }

    public void setNmae(String name){
        this.name = name;
    }

    public int getMarks1(){
        return Marks1;
    }

    public void setMarks1(int Marks1){
        this.Marks1 = Marks1;
    }

    public int getMarks2(){
        return Marks2;
    }

    public void setMarks2(int Marks2){
        this.Marks2 = Marks2;
    }
    public int getTotal(){
        return Marks1 + Marks2;
    }
    

 

}
