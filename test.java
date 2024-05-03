import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğdunuz? ");
        int month = scanner.nextInt();
        System.out.print("Ayın kaçında doğdunuz? ");
        int day = scanner.nextInt();
        if (month == 1) {
            if (1 <= day && day <= 21) {
                System.out.println("Burcunuz: OĞLAK");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Burcunuz: KOVA");
            }
        } else if (month == 2) {
            if (1 <= day && day <= 19) {
                System.out.println("Burcunuz: KOVA");
            } else if (day >= 20 && day <= 29) {
                System.out.println("Burcunuz: BALIK");
            }
        } else if (month == 3) {
            if (1 <= day && day <= 20) {
                System.out.println("Burcunuz: BALIK");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Burcunuz: KOÇ");
            }
        } else if (month == 4) {
            if (1 <= day && day <= 20) {
                System.out.println("Burcunuz: KOÇ");
            } else if (day >= 21 && day <= 30) {
                System.out.println("Burcunuz: BOĞA");
            }
        } else if (month == 5) {
            if (1 <= day && day <= 21) {
                System.out.println("Burcunuz: BOĞA");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Burcunuz: İKİZLER");
            }
        } else if (month == 6) {
            if (1 <= day && day <= 21) {
                System.out.println("Burcunuz: İKİZLER");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Burcunuz: YENGEÇ");
            }
        } else if (month == 7) {
            if (1 <= day && day <= 22) {
                System.out.println("Burcunuz: YENGEÇ");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Burcunuz: ASLAN");
            }
        } else if (month == 8) {
            if (1 <= day && day <= 22) {
                System.out.println("Burcunuz: ASLAN");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Burcunuz: BAŞAK");
            }
        } else if (month == 9) {
            if (1 <= day && day <= 22) {
                System.out.println("Burcunuz: BAŞAK");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Burcunuz: TERAZİ");
            }
        } else if (month == 10) {
            if (1 <= day && day <= 22) {
                System.out.println("Burcunuz: TERAZİ");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Burcunuz: AKREP");
            }
        } else if (month == 11) {
            if (1 <= day && day <= 21) {
                System.out.println("Burcunuz: AKREP");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Burcunuz: YAY");
            }
        } else if (month == 12) {
            if (1 <= day && day <= 21) {
                System.out.println("Burcunuz: YAY");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Burcunuz: OĞLAK");
            }
        } else {
            System.out.println("Geçersiz ay girdiniz.");
        }
    }
}