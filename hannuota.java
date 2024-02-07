package chapter1;
//汉诺塔问题
public class hannuota {
    public static void main(String[] args){
        Tower answer = new Tower();
        answer.move(64, 'A', 'B', 'C');
    }
}

class Tower{
    //num表示移动的个数，a,b,c 分别表示三个塔
    public void move(int num, char a, char b, char c){
        if(num == 1){
            System.out.println(a + "->" + c);
        }else{
            //若有多个盘只需要把除最底层以外的盘看成一个整体
            move(num - 1, a, c, b);//输出A->B
            System.out.println(a + "->" + c);//输出A->C
            move(num - 1, b, a, c);//输出B->C
        }
    }
}