public class Average {
    private double average1;
    private double average2;

    public Average(NumList numList1, NumList numList2) {
        this.average1 = numList1.getAverage();
        this.average2 = numList2.getAverage();
    }

    public String compareAverage() {
        if (average1 == average2) {
            return String.format("Среднее арифметическое первого массива %s равно среднему арифметическому второго " +
                    "массива %s", Math.round(average1 * 100.0) / 100.0, Math.round(average2 *
                    100.0) / 100.0);
        } else if (average1 > average2) {
            return String.format("Среднее арифметическое первого массива %s больше среднего арифметического второго " +
                    "массива %s", Math.round(average1 * 100.0) / 100.0, Math.round(average2 *
                    100.0) / 100.0);
        } else if (average1 < average2) {
            return String.format("Среднее арифметическое первого массива %s меньше среднего арифметического второго " +
                    "массива %s", Math.round(average1 * 100.0) / 100.0, Math.round(average2 *
                    100.0) / 100.0);
        }
        return null;
    }
}
