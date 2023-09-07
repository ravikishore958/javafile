public class largarray {
    public static void main(String[] args) {
        int[] num={11, 33, 45, 54, 11, 22, 112, 322};

        int largest=num[0];

        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
            largest=num[i];
        }

            
            
            

        }
        System.out.println(largest);
    }

    
    
}
 
