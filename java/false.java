public class False {

    private static Faker faker = new Faker(new Locale("pt-BR"))

    public static String phoneNumber() {
        return faker.phoneNumber().cellPhone().replaceAll("[^0-9]+", "")
    }

    public static String userName() {
        return faker.name().username().replaceAll("[âãàáä]", "a").replaceAll("[êèéë]", "e")
                .replaceAll("[îíìï]", "i").replaceAll("[ôõòóö]", "o")
                .replaceAll("[ûúùü]", "u").replaceAll("[.]", "_")
    }

    public static String cpfInvalid() {
        return faker.numerify("###.###.###-##")
    }

    public static String cnpjInvalid() {
        return faker.numerify("##############")
    }

    public static int numeroAleatorio() {
        new Random().nextInt(100)
    }
}
