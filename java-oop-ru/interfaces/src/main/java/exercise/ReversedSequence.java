package exercise;

// BEGIN
/*класс ReversedSequence, который реализует стандартный интерфейс java.lang CharSequence.
Конструктор класса принимает на вход строку.
Ваша реализация должна представлять последовательность в перевернутом виде.*/
public class ReversedSequence implements CharSequence{

    private String inputString;
    private String reverseString;

    public ReversedSequence(String inputString) {
        reverseString = reverse(inputString);
    }

    /**
     * Returns the length of this character sequence.  The length is the number
     * of 16-bit {@code char}s in the sequence.
     *
     * @return the number of {@code char}s in this sequence
     */
    @Override
    public int length() {
        return reverseString.length();
    }

    /**
     * Returns the {@code char} value at the specified index.  An index ranges from zero
     * to {@code length() - 1}.  The first {@code char} value of the sequence is at
     * index zero, the next at index one, and so on, as for array
     * indexing.
     *
     * <p>If the {@code char} value specified by the index is a
     * {@linkplain Character##unicode surrogate}, the surrogate value
     * is returned.
     *
     * @param index the index of the {@code char} value to be returned
     * @return the specified {@code char} value
     * @throws IndexOutOfBoundsException if the {@code index} argument is negative or not less than
     *                                   {@code length()}
     */
    @Override
    public char charAt(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index > reverseString.length() - 1) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }

        return reverseString.charAt(index);
    }

    /**
     * Returns a {@code CharSequence} that is a subsequence of this sequence.
     * The subsequence starts with the {@code char} value at the specified index and
     * ends with the {@code char} value at index {@code end - 1}.  The length
     * (in {@code char}s) of the
     * returned sequence is {@code end - start}, so if {@code start == end}
     * then an empty sequence is returned.
     *
     * @param start the start index, inclusive
     * @param end   the end index, exclusive
     * @return the specified subsequence
     * @throws IndexOutOfBoundsException if {@code start} or {@code end} are negative,
     *                                   if {@code end} is greater than {@code length()},
     *                                   or if {@code start} is greater than {@code end}
     */
    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return reverseString;
    }

    private String reverse(String inputString) {
        StringBuilder sb = new StringBuilder();
        int start = inputString.length() - 1;
        for (int i = start; i > -1; i--) {
            sb.append(inputString.charAt(i));
        }
        return new String(sb);
    }


}
// END