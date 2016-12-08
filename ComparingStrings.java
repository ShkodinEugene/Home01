
public class ComparingStrings {

	public static boolean MatchesSearch(String[] str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        for (int stringNumber = 0; stringNumber < ObtainingTheStringLength(str); stringNumber++) {
            for (int nextNumber = stringNumber + 1; nextNumber < ObtainingTheStringLength(str); nextNumber++) {
                if (str[stringNumber].equals(str[nextNumber])) {
                    return true;
                }
            }
        }

        return false;
    }

    private static int ObtainingTheStringLength(String[] array) {
        return array.length;
    }
    public static boolean testStrings() {
        String[] str = {"asd", "cvfs", "vfsc", "gfda", "vfdsdx", "fdas", "dscea", "dxda", "dcccc"};
        return MatchesSearch(str) == true;
    }
}
