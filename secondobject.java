public class secondobject {
   public static void main(String[] args) {
       secondobject obj = new secondobject();

       char Salam;
       char first  = Salam;
       char Sarkar;
       char second = Sarkar;

       String get_result = obj.add("first" + "second");
       System.out.println(get_result);



   }

 public String add(char first , char second) {
       String result = "first" + "second";
       return result;
 }
}
