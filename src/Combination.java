import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data=1,input1,input2,nr,data2=1,data3=1,formul;
        System.out.println("Eleman sayısını giriniz: ");
        input1 = scn.nextInt();
        System.out.println("Oluşturulacak grupların eleman sayısını giriniz: ");
        input2 = scn.nextInt();
        nr= input1-input2;
        for (int i=1;i <= nr; i++){
            data = data*i;
        }for(int j=1;j<=input2;j++){
            data2 = data2*j;
        }for(int k = 1; k <= input1;k++){
            data3 = data3*k;
        }
        formul = data3/(data2*data);
        System.out.println(formul);
    }
}
