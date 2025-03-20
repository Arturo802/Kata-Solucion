import java.lang.StringBuilder;


    /**
     * @param "String"
     * @return cadenas de tipo camelCase
     * @example"the-stealth-warrior"se convierte en"theStealthWarrior"
     *"The_Stealth_Warrior"se convierte a en"TheStealthWarrior"
     *"The_Stealth-Warrior"se convierte a en"TheStealthWarrior"*/
    public class Solucion {
        public static String toCamelCase(String s) {
            if (s == null || s.isEmpty()) {
                return s;
            }

            StringBuilder result = new StringBuilder();
            boolean capital = false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '_' || c == '-') {
                    capital = true;
                } else {
                    if (capital) {
                        result.append(Character.toUpperCase(c));
                        capital = false;
                    } else {
                        result.append(c);
                    }
                }
            }

            return result.toString();
        }
    }
