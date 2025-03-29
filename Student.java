//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {

    private String name;
    private int grade;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        if (grade>=0 && grade<=100){
            this.grade=grade;
        }else{
            this.grade=0;
        }

    }
}