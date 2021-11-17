package lesson5;

    public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            KalkTest [] kalkTests =new KalkTest[0];

            String text = scanner.nextLine();

            String operators[] = text.split("[0-9]+");
            String KalkTest[] = text.split("[*+-/=]");
            int agregate = Integer.parseInt(KalkTest[0]);
            for (int i = 1; i <= KalkTest.length; i++) {
                switch (operators[i]) {
                    case "+":
                        agregate += Integer.parseInt(KalkTest[i]);
                        break;
                    case "-":
                        agregate -= Integer.parseInt(KalkTest[i]);
                        break;
                    case "*":
                        agregate *= Integer.parseInt(KalkTest[i]);
                        break;
                    case "/":
                        agregate /= Integer.parseInt(KalkTest[i]);
                        break;
                    case "=":
                        System.out.println(agregate);
                        break;
                }
            }
        }
    }

