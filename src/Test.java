public class Test {
    public static void main(String[] args) {
        String s = "())(()())(()";

        char[] str = s.toCharArray();
        char[] str2 = new char[str.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                if (str[i] == '(' && str[j] == ')') {
                    str2[i] = str[i];
                    str2[j] = str[j];
                    str[i] = '0';
                    str[j] = '0';
                }
            }
        }

        for (char c : str2) {
            if (c == ')' || c == '(') {
                sb.append(c);
            }
        }

        System.out.println(sb.length() + " - " + sb);
    }
}
