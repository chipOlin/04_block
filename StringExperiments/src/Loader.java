import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String regularExpression = "(\\d+)";

        Pattern ptrn = Pattern.compile(regularExpression);
        Matcher matcher = ptrn.matcher(text);

        if(matcher.find()){
            System.out.println(matcher.group(0));
        } else {
            System.out.println("not found");
        }
    }
}