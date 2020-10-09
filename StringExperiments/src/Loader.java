import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        // task 1
        /*String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] earn = text.split("\\D+");
        int totalEarn = 0;
        for(String e : earn) {
            if(e.length() > 0) totalEarn += Integer.parseInt(e);
        }
        System.out.println("Общий заработок составляет: " + totalEarn);*/

        //task 2
        /*String text = "С момента выхода \"All You Need Is Love\" не прошло и года, но от благостного настроения \"лета любви\" не осталось и следа. Наступивший новый 1968 год принес массовые демонстрации против войны во Вьетнаме, убийство Мартина Лютера Кинга и последовавшие за ним расовые беспорядки в Америке, \"Пражскую весну\". В Париже студенты и рабочие и вовсе строили баррикады, грозясь свергнуть власть президента де Голля. На смену миру и любви пришли политика и революция.\n" +
                "Леннон, все острее ощущая и актуальность политических потрясений, и растущие нетерпеливые ожидания реакции \"Битлз\" на эти события со стороны важных для него новых друзей в радикально левом (вплоть до троцкизма и маоизма) лондонском контркультурном андерграунде, понял, что молчать больше невозможно.\n";
        String[] splitText = text.split("\\s");
        for(String word : splitText) {
            System.out.println(word);
        }*/

        //task 3
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String text = in.nextLine();
        String[] splitText = text.split("\\s");

        System.out.println("Фамилия: " + splitText[0]);
        System.out.println("Имя: " + splitText[1]);
        System.out.println("Отчество: " + splitText[2]);
        in.close();*/

        //task 4
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String phone = in.nextLine();
        phone = phone.replaceAll("\\D+", "");
        boolean result = phone.matches("[78]?\\d{10}");
        if (!result) {
            System.out.println("Неверный формат номера");
        } else {
            result = phone.matches("([7])\\d{10}");
            if (!result) {
                result = phone.matches("([8])\\d{10}");
                if (!result) {
                    result = phone.matches("\\d{10}");
                    if (!result) {
                        System.out.println("Неверный формат номера");
                    } else {
                        System.out.println("Результат: 7" + phone);
                    }
                } else {
                    System.out.println("Результат: 7" + phone.substring(1));
                }
            } else {
                System.out.println("Результат: " + phone);
            }
        }
        in.close();
    }
}