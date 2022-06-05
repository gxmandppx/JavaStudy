import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        //创建学生对象，用于存储学生数据
        ArrayList<Student> array=new ArrayList<Student>();
        // 用循环完成再次回到主界面
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            //用输入语句实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //用switch语句完成操作的选择
            switch (line) {
                case "1" -> addStudent(array);
                case "2" -> deleteStudent(array);
                case "3" -> updateStudent(array);
                case "4" -> findStudent(array);
                case "5" -> {
                    System.out.println("谢谢使用！");
                    System.exit(0);
                }
            }
        }
    }
    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student>array){
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc=new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用了，请重新输入！");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address=sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将学生变量添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("添加成功！");
    }
    //定义一个方法，用于查看学生信息
    public static void findStudent(ArrayList<Student>array){
        //判断集合中是否有数据
        if(array.size()==0)
        {
            System.out.println("无信息，请添加信息后查询");
        }
        else {
            //显示表头信息
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
            //将集合中数据按照对应格式显示学生信息，年龄显示补充“岁”
            for (Student s : array) {
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
            }
        }
    }
    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student>array){
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号：");
        String sid=sc.nextLine();
        int index=-1;
        //遍历集合将对应学生对象从集合中删除
        for(int i=0;i<array.size();i++)
        {
            Student s=array.get(i);
            if(s.getSid().equals(sid))
            {
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("该学生信息不存在，请重新输入！");
        }
        else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功！");
        }
    }
    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student>array){
        //键盘录入要修改的学生学号，显示提示信息
        int index=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        String sid=sc.nextLine();
        //判断所要修改的学生信息是否存在
        for(int i=0;i<array.size();i++)
        {
            Student s=array.get(i);
            if(s.getSid().equals(sid))
            {
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("该学生信息不存在，请重新输入！");
        }
        else {
            //键盘录入要修改的学生信息
            System.out.println("请输入新姓名：");
            String name = sc.nextLine();
            System.out.println("请输入新年龄：");
            String age = sc.nextLine();
            System.out.println("请输入新居住地：");
            String address = sc.nextLine();
            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            //遍历集合修改对应的学生信息
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getSid().equals(sid)) {
                    array.set(i, s);
                    break;
                }
            }
            //给出修改成功提示
            System.out.println("修改成功！");
        }
    }
    //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array,String sid){
        //如果与集合中的某个学生学号相同，返回true；如果不相同返回false
        boolean flag=false;
        for (Student s : array) {
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
