public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int month = 1;
        for (; total <= 2_459_000; month++) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        int numberOneTen = 0;
        while (numberOneTen <= 10) {
            System.out.print(numberOneTen);
            numberOneTen++;

        }
        System.out.println();
        int numberTenOne = 10;
        for (; numberTenOne > 0; numberTenOne -= 1) {
            System.out.print(numberTenOne);
        }
        System.out.println();
        int countryZ = 12_000_000;
        int ortality = 8;
        int birth = 17;
        int remainder = birth - ortality;
        for (int year = 1; year <= 10; year++) {
            countryZ += countryZ * remainder / 1000;
            System.out.println(" Год " + year + ", численость населения составляет " + countryZ);
        }
        int salaryBank = 60000;
        int totalBank = 0;
        for (int monthX = 0; totalBank <= 12_000_000; monthX++) {
            totalBank = totalBank + totalBank / 150;
            totalBank = totalBank + salaryBank;
            System.out.println("Месяц " + monthX + ", сумма накоплений равна " + totalBank + " рублей");
        }
        int salaryBankTwo = 60000;
        int totalBankTwo = 0;
        for (int monthXTwo = 0; totalBankTwo <= 12_000_000; monthXTwo++) {
            totalBankTwo = totalBankTwo + totalBankTwo / 150;
            totalBankTwo = totalBankTwo + salaryBankTwo;
            if (monthXTwo % 6 == 0) {
                System.out.println("Месяц " + monthXTwo + ", сумма накоплений равна " + totalBankTwo + " рублей");
            }
        }
        int salaryVasily = 15000;
        int totalBankVasily = 0;
        for (int monthXVasily = 0; monthXVasily <= 108; monthXVasily++) {
            totalBankVasily = totalBankVasily + totalBankVasily * 7 / 100;
            totalBankVasily = totalBankVasily + salaryVasily;
            if (monthXVasily % 6 == 0) ;
            System.out.println("Месяц " + monthXVasily + ", сумма накоплений равна " + totalBankVasily + " рублей");
        }
        int mothNumber = 5;
        switch (mothNumber) {
            case 5:
            case 12:
            case 19:
            case 27:
                System.out.println("Сегодня пятница," + mothNumber + "-е число. Нобходимо подготовить отчет.");
                break;
        }
        }



    }





    }
