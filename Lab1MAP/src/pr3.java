import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
    public static int[] add(int[] number1, int[] number2) {
        boolean hasCarryAtEnd = false;
        int length = number1.length;
        int carry = 0;
        for (int i = length - 1; i >= 0; --i) {
            int sum = number1[i] + number2[i] + carry;
            carry = sum / 10;
        }

        if (carry > 0) {
            hasCarryAtEnd = true;
        }

        carry = 0;
        int resultLength = length;
        if (hasCarryAtEnd) {
            ++resultLength;
        }

        int[] result = new int[resultLength];
        for (int i = length - 1, j = resultLength - 1; i >= 0 || j >= 0; --i, --j) {
            int sum = carry;
            if (i >= 0) {
                sum += number1[i] + number2[i];
            }
            carry = sum / 10;
            result[j] = sum % 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Arrays.stream(add(new int[]{1, 3, 0}, new int[]{8, 7, 0})).forEach(System.out::print);
    }
}
