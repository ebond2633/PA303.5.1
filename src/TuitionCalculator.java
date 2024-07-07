public class TuitionCalculator {
    public static void main(String[] args) {
        int tuition = 10000; // Initial tuition for the current year
        int totalCost = 0; // Accumulate total cost of four years' tuition

        for (int year = 1; year <= 14; year++) {
            // Increase tuition by 7% every year
            tuition += (tuition * 0.07);

            if (year > 10) {
                // Accumulate tuition cost after the tenth year
                totalCost += tuition;
            }

            if (year == 10) {
                // Store tuition cost in the tenth year
                int tuitionTenthYear = tuition;
                System.out.println("Tuition in ten years: $" + tuitionTenthYear);
            }
        }

        // Display the total cost for four years' worth of tuition after the tenth year
        System.out.println("Total cost for four years' worth of tuition after the tenth year: $" + totalCost);
    }
}

