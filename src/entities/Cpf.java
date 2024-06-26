package entities;

public class Cpf {
    private String cpf;
    private int[] cpfInt;


    //converts string cpf into int array
    public Cpf(String cpf) {
        this.cpf = cpf;
        this.cpfInt = new int[this.cpf.length()];
        for (int i = 0; i < cpfInt.length; i++) {
            cpfInt[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }
    }
    //verifies if digit is valid
    private static boolean isDigit(int[] cpfInt, int position) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (position == 9) sum += cpfInt[i] * (i + 1);
            else sum += cpfInt[i] * i;
        }
        int remain = sum % 11;
        if ((remain == cpfInt[position]) || (remain == 10 && cpfInt[position] == 0)) return true;
        else return false;
    }

    //verifies cpf is valid
    public String toString(){
        if (isDigit(cpfInt, 9) && isDigit(cpfInt, 10)) {
            return "CPF válido";
        } else {
            return "CPF inválido";
        }

    }
}
