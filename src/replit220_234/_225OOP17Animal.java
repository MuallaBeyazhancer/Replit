package replit220_234;

public abstract class _225OOP17Animal {
	 private String name;
     private  int age;
      
       /*
       Provide getters and setters for these variables. Add an abstract method getAgeInHumanYears() that returns int.
       Define 2 args constructor that initializes instance variables.
    */
      public abstract int getAgeInHumanYears();
      
       public _225OOP17Animal(String name, int age){
         this.name = name;
         this. age = age;
       }
     public String getName(){
        return name;
      }
     public void setName(String name){
        this.name = name;
      }
      public int getAge(){
        return age;
      }
     public void setAge(int age){
        this.age = age;
      }
    }

