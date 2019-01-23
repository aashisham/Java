import GCES.Student;

class PackageDemo{
    public static void main(String[] args){
        Student studentObjectOne = new Student("Ashish",7);
        Student studentObjectTwo = new Student("Diwash",12);

        studentObjectOne.display();
        studentObjectTwo.display();
    }
}
