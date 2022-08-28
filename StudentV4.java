public class StudentV4 {
    int rno;
    String name;
    public void insertStudent(int r, String n){
        rno=r;
        name=n;
    }
    public void displayStudent(){
        System.out.println("Student RNo="+rno+"\nStudent Name="+name);
    }
}
