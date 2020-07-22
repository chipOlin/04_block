public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
		
		System.out.println("count = " + container.count);
		
		System.out.println("sumDigits(12345) = " + sumDigits(12345));
		System.out.println("sumDigits(10) = " + sumDigits(10));
		System.out.println("sumDigits(5059191) = " + sumDigits(5059191));
    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
		int sum = 0;
		String s = String.valueOf(number);
		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(String.valueOf(s.charAt(i)));
		}
        return sum;
    }
}
