package oops.Interfaces;

interface Serializable {
    String serialize();
}
interface Validatable{
    boolean isValid();
}
abstract class FormField{
    String fieldName;
    String value;

    FormField(String fieldName, String value){
        this.fieldName=fieldName;
        this.value=value;
    }
     abstract String getFieldType();
    void display(){
        System.out.println("Field Name: "+fieldName +"\n"+ getFieldType() + ": " + value);
    }
}
class EmailField extends FormField implements Serializable,Validatable{
    EmailField(String fieldName, String value){
        super(fieldName,value);
    }
    String getFieldType(){
        return "Email";
    }
    public boolean isValid(){
        return value.contains("@");
    }
    public String serialize(){
        return "Email: "+value;
    }
}
class AgeField extends FormField implements Serializable,Validatable{
    AgeField(String fieldName, String value){
        super(fieldName, value);
    }
    String getFieldType(){
        return "Age";
    }
    public boolean isValid(){
        int age = Integer.parseInt(value);
        return age >=1 && age <= 120;
    }
    public String serialize(){
        return "Age: "+value;
    }
}
public class Question9 {
    public static void main(String[] args) {
        AgeField a = new AgeField("Scientist","20");
        a.display();
        EmailField e = new EmailField("Heckler","heckler@gmail.com");
        e.display();
        System.out.println(a.serialize());
        System.out.println(e.serialize());
        System.out.println(a.isValid());
        System.out.println(e.isValid());
        a.value = "1110";
        System.out.println(a.isValid());
        e.value = "hahagmail.com";
        System.out.println(e.isValid());
    }
}