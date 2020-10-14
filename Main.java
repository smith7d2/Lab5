class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    
    student1.name = "Arnold Speilberg";
    student1.gpa = 4.0;
    student1.major = "Electrical Engineering";

    student2.name = "Dani Smith";
    student2.gpa = 4.3;
    student2.major = "Accounting and Information Systems";


    System.out.println (" student1's name is " +  student1.name +  " and their GPA is "  + student1.gpa  +  " and their major is " +  student1.major);

    ArrayList<Double>gpa = new ArrayList<Double>();
    
    print(gpa.get(4.0));
    print(gpa.get(4.3));

    int sum = 0;

    System.out.println(student1.gpa + student2.gpa + sum % 2 + " The average GPA is ");

  }
}

//when did you add a for loop
//how do you add the method print() and then make a call to anothter class for it, that was not in this past week's videos and I googled it so many times I did not know how to do it. 