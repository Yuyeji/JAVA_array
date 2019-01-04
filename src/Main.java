public class Main {

    public static void main(String[] args) {
        int array[] = {10, 45, 30, 4, 23};  //배열 선언

        find_max find = new find_max(array);

        //find.find(); /*리턴값 없는 버전*/

        System.out.println("최댓값 : " +find.find()); /*리턴값 있는 버전*/

    }


    /*최대값 원소 찾기*/
    public static class find_max{
        //int a[] = {10, 45, 30, 4, 23};  //배열 선언
        int max = -1;    //최댓값
        int a[];

        public find_max(int arr[]){
            this.a = arr;
        }

        /*리턴값 없는 버전*/
        /*public void find(){
            for (int i = 0; i < a.length; i++) {
                if(a[i] > max){
                    max = a[i];
                }
            }
            System.out.println("최대값 : " + max);
        }*/

        /*리턴값 있는 버전*/
        public int find(){
            for (int i = 0; i < a.length; i++) {
                if(a[i] > max){
                    max = a[i];
                }
            }
            return max;
        }
    }
}

