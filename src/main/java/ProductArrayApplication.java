import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ProductArrayApplication {

    public static void main(String[] args){
        calculateProductArrayBasic(new long[]{1,2,3,4,5});

    }
    public static long[] calculateProductArrayBasic(long[] input) {
        if (input != null) {
            if (input.length!=0) {
                if (input.length==1){
                    if (input[0]==0) {
                        return new long[]{1};
                    }else {
                        return new long[]{input[0]};
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
                    System.out.println("test = " + Resultado);
                    return Resultado.stream().mapToLong(l -> l).toArray();
                }
            }else {
                return new long[]{};
            }
        }else {
            return null;
        }

    }

}
