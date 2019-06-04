import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ProductArrayApplication {

    public static void main(String[] args){
        calculateProductArrayBasic(new long[]{1,2,3,4,5}); //Test 1
        calculateProductArrayBasic(new long[]{}); //Test 2
        calculateProductArrayBasic(new long[]{0}); //Test 3
        calculateProductArrayBasic(new long[]{1}); //Test 4
        calculateProductArrayBasic(new long[]{10,20}); //Test 5
        calculateProductArrayBasic(null); //Test 6
        calculateProductArrayBasic(new long[0]); //Test 7
        calculateProductArrayBasic(new long[]{5,0,23,0,70,0,0,1}); //Test 8
        calculateProductArrayBasic(new long[]{13,15,6,10,200,0}); //Test 9
        calculateProductArrayBasic(new long[]{15,31,50,0,0,35,34}); //Test 8

    }
    public static long[] calculateProductArrayBasic(long[] input) {
        if (input != null) {
            if (input.length!=0) {
                if (input.length==1){
                    if (input[0]==0) {
                        System.out.print("Probando "+Arrays.toString(input));
                        input[0]=1;
                        System.out.print(" - Resultado "+Arrays.toString(input));
                        System.out.println();
                        return input;

                    }else {
                        System.out.println("Probando "+Arrays.toString(input)+" - Resultado "+Arrays.toString(input));
                        return input;
                    }
                }else {


                    List<Long> InLis = Arrays.stream(input).boxed().collect(Collectors.toList());
                    List<Object> Converse = new ArrayList<>();
                    List<Long> Resultado = new ArrayList<>();
                    // List<int> InLis=Arrays.stream(intArr).boxed().collect(Collectors.toList());

                    int pro = 1;
                    for (int count = 0; count < InLis.size(); count++) {
                        Long searchVal = input[count];
                        int retVal = Arrays.binarySearch(input, searchVal);
                        int[] test = IntStream.range(0, input.length)
                                .filter(i -> i != retVal)
                                .map(i -> (int) input[i])
                                .toArray();
                        if (count > 0) {
                            Converse.addAll(InLis.subList(0, count));
                        }
                        Converse.addAll(Arrays.stream(input).boxed().collect(Collectors.toList()).subList(count + 1, input.length));
                        if (count != InLis.size() - 1) {
                            Converse.add("-");
                        }
                        //   Resultado.add(Arrays.toString(test));
                        //   System.out.println("nuevo Array = " + Resultado);


       /* for (int ciclo : test) {
            pro = pro * ciclo;
        }*/
                    }
                    for (Object Alist : Converse) {
                        // int resulta = Integer.parseInt(Alist);
                        //   pro = pro * resulta;
                        if (Alist instanceof Long) {
                            if (Resultado.size() > 0) {
                                Long temp = Resultado.get(Resultado.size() - 1);
                                Resultado.set(Resultado.size() - 1, temp * (Long) Alist);

                            } else {
                                Resultado.add((Long) Alist);
                            }
                        } else {
                            Resultado.add(1L);
                        }
                    }
                    System.out.println("Probando "+Arrays.toString(input)+" - Resultado "+Resultado);
                    return Resultado.stream().mapToLong(l -> l).toArray();
                }
            }else {
                System.out.println("Probando "+Arrays.toString(input)+" - Resultado "+Arrays.toString(input));
                return input;
            }
        }else {
            System.out.println("Probando "+Arrays.toString(input)+" - Resultado "+Arrays.toString(input));
            return input;
        }

    }

}
