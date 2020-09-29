public class stringManipulasi {
    public static void main(String[] args) {
        String str = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";
        String[] arr = {"Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke"};


        for(int i=0; i<arr.length; i++){
            String strFind = arr[i].toLowerCase();
            int count = 0, fromIndex = 0;

            while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
                count++;
                fromIndex++;
            }

            for(int j=0; j<count;j++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

