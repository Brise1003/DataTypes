public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;                                  // 4 bytes
        long nL = 12345678901l; // colocar l al final           8 bytes

        double nD = 123.456;
        float nF = 123.456f;   // colocar f al final

        // Texto
        // Caracteres
        char caracter = 'd';

        // Lógicos 2 bytes
        boolean t = true;
        boolean f = false;

        var salary = 1000; // int
        // pension: 3%
        var pension = salary*.03; // double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary);

        byte h =1;
        byte p=1;
    }
}
