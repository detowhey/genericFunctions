public String cpfGenerator() {
        int d1, d2, rest;

        String nDigResult;
        String concatNumber;
        String generatedNumber;

        final Random randomNumber = new Random();

        final int n1 = randomNumber.nextInt(10);
        final int n2 = randomNumber.nextInt(10);
        final int n3 = randomNumber.nextInt(10);
        final int n4 = randomNumber.nextInt(10);
        final int n5 = randomNumber.nextInt(10);
        final int n6 = randomNumber.nextInt(10);
        final int n7 = randomNumber.nextInt(10);
        final int n8 = randomNumber.nextInt(10);
        final int n9 = randomNumber.nextInt(10);
        final int sum = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
        final int value = (sum / 11) * 11;

        d1 = sum - value;

        rest = (d1 % 11);

        if (d1 < 2)
            d1 = 0;
        else
            d1 = 11 - rest;

        final int sum2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
        final int value2 = (sum2 / 11) * 11;

        d2 = sum2 - value2;
        rest = (d2 % 11);

        if (d2 < 2)
        d2 = 0;
        else
        d2 = 11 - rest;

        concatNumber = n1 + String.valueOf(n2) + n3 + "." + n4 + n5 + n6 + "." + n7 + n8 + n9 + "-";
        nDigResult = String.valueOf(d1) + d2;
        generatedNumber = concatNumber + nDigResult;
        return generatedNumber;
}
