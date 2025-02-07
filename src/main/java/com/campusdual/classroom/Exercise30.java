package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException{

        if(divisor == 0){
            throw new DivisionByZeroException("No se puede dividir un numero entre 0");
        } else{
            return dividend / divisor;
        }

    }

    public static void main(String[] args) {

        try{
            divisionWithCustomException(3, 0);
        } catch (DivisionByZeroException e){
            e.printStackTrace();
        }
        System.out.println("Programa terminado");



    }
}
