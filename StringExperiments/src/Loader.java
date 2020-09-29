import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] earn = text.split("\\D+");
        int totalEarn = 0;
        for(String e : earn) {
            if(e.length() > 0) totalEarn += Integer.parseInt(e);
        }
        System.out.println("Общий заработок составляет: " + totalEarn);
    }
}