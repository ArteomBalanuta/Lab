import java.lang.reflect.Field;

public class NullChecker {
    public String v1;
    public String v2;
    public String v3;


    private void checkVars(String... args) throws IllegalAccessException {
        NullChecker obj = new NullChecker();
        try {
            obj.v1 = args[0];
            obj.v2 = args[1];
            obj.v3 = args[2];
            System.out.println("Input is: " + obj.v1 + "," + obj.v2 + ", " + obj.v3);
            if (v1.equals("NON") || v2.equals("NON") || v3.equals("NON")) {
                System.out.println("v1=" + obj.v1 + "   v2=" + obj.v2 + "   v3=" + obj.v3);
            }
        } catch (Exception e) {
            for (Field f : obj.getClass().getFields()) {
                if (f.get(obj) == null) {
                    System.out.println("Variable: " + f.getName() + " - null value found");
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        NullChecker checker = new NullChecker();
        checker.checkVars("1", null,"3");
    }
}
