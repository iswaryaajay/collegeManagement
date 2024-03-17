/*
 * Student data
 * Name
 * Phone Number
 */

package college;
import java.util.Scanner;
public class CollegeManagement {

    public static void main(String[] args){
        final StudentData studentdata = new StudentData();
        studentdata.datas();
    }
}
class StudentData{
    StudentdataPojo studentdatapojo = new StudentdataPojo();
    Scanner scanner = new Scanner(System.in);
        public String data () {
            System.out.print("Enter your name: ");
            studentdatapojo.setName(new Scanner(System.in).nextLine());
            String name = studentdatapojo.getName();
            return name;
        }
        public String data1 () {
            System.out.print("Enter your date of birth: ");
            return new Scanner(System.in).nextLine();
            String DOB = studentdatapojo.getDOB();
            return DOB;
        }
        public long data2 () {
            System.out.print("Enter your phone number: ");
            studentdatapojo.setPhNO(new Scanner(System.in).nextLong());
            long PhNo = studentdatapojo.getPhNO();
            return PhNo;
        }
    public void datas() {
        System.out.print("Enter your name: ");
        studentdatapojo.setName(new Scanner(System.in).nextLine());
        System.out.print("Enter your date of birth: ");
        studentdatapojo.setDOB(new Scanner(System.in).nextLine());
        System.out.print("Enter your phone number: ");
        studentdatapojo.setPhNO(new Scanner(System.in).nextLong());
        System.out.println(data());
        System.out.println(data1());
        System.out.println(data2());
    }
}
class StudentdataPojo{
    Scanner scanner = new Scanner(System.in);
    private String name =  scanner.nextLine();
    private String DOB =  scanner.nextLine();;
    private long PhNO = scanner.nextLong();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public long getPhNO() {
        return PhNO;
    }

    public void setPhNO(long phNO) {
        PhNO = phNO;
    }
}



