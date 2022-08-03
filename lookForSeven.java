public class lookForSeven {
    public static void main(String args[]) {
        int [] array = {103, 501, 7002};
        String result = hasSeven(array);
        System.out.println(result);

        /* int [] array2 = {103, 501, 5002, 49};
        String result2 = hasSeven(array2);
        System.out.println(result2); */
    }

    public static String hasSeven(int [] array){
        for(int i=0; i<array.length; i++){
            while(array[i] > 0){
                if(array[i] % 10 != 7){
                    array[i] = (array[i] - array[i] % 10) / 10;
                }
                else
                    return "Boom!";
            }
            //System.out.println(array[i] % 10);
            //System.out.println((array[i] - array[i] % 10) / 10);
        }
        return "there is no 7 in the array";
    }
}
