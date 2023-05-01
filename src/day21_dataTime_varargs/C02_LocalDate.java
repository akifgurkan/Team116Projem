package day21_dataTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-04-25
        LocalDate tarih2 = LocalDate.ofYearDay(2024,200);
        System.out.println(tarih2); // 2024-07-18
        System.out.println(tarih.isAfter(tarih2)); // false
        System.out.println(tarih.isLeapYear()); // false
        System.out.println(tarih2.isLeapYear()); // true
        System.out.println(tarih.datesUntil(tarih2).count()); // 450

        System.out.println(tarih.getDayOfWeek()); // TUESDAY
        LocalDate dogumTarihi= LocalDate.of(1979,2,7);
        System.out.println(dogumTarihi.getDayOfWeek()); // WEDNESDAY

        System.out.println(tarih2.lengthOfYear()); // 366

        // kullanicidan iki kisinin dogum tarihlerini yil ay gun olarak alip
        // hangisinin daha once dogdugunu bulan bir method olusturun
    }
}


