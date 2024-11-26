package Task_3.Service;

public class InputValidator {

    public static int getValidatedSize(String input) throws NumberFormatException {
        int size = Integer.parseInt(input);
        if (size <= 0) {
            throw new NumberFormatException("The collection size must be a positive number.");
        }
        return size;
    }
}
