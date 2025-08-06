class Main{
    public static void main(String[] args) {
        Stack ins1 = new Stack(5);
        Stack ins2= new Stack(5);
        Stack output = new Stack(5);
        ins1.push(6);
        ins1.push(8);
        ins1.push(9);
        ins1.push(11);
        ins1.push(4);        

        ins2.push(1);
        ins2.push(2);
        ins2.push(3);
        ins2.push(4);
        ins2.push(5);
        
        while(!ins1.isEmpty() && !ins2.isEmpty()){
            int a = ins1.pop();
            int b = ins2.pop();
            output.push(a+b);
        }

        output.display();
        System.out.println();

        Stack s1=new Stack(5);
        Stack s2= new Stack(5);
        Stack ouput=new Stack(10);
        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s1.push(10);
        s2.push(1);
        s2.push(3);
        s2.push(5);
        s2.push(7);
        s2.push(9);

        while(!s1.isEmpty() && !s2.isEmpty())
        {
            int a=s1.pop();
            int b= s2.pop();
            ouput.push(a);
            ouput.push(b);
        }
        ouput.display();
        System.out.println();
        Stack st1 = new Stack(5);
        Stack st2 = new Stack(5);
        Stack out = new Stack(10);
        st1.push(2);
        st1.push(4);
        st1.push(6);
        st1.push(8);
        st1.push(10);

        st2.push(1);
        st2.push(3);
        st2.push(5);
        st2.push(7);
        st2.push(2);

        while(!st1.isEmpty() && !st2.isEmpty()){
            int x = st1.pop();
            int y = st2.pop();
            if((x+y)%2==0){
                out.push(x);
                out.push(y);
            }
            else{
                out.push(y);
                out.push(x);
            }
        }
        Stack res = new Stack(10);
        while(!out.isEmpty()){
            res.push(out.pop());
        }
        res.display();
        System.out.println();
        Stack c1 = new Stack(3);
        Stack c2 = new Stack(5);
        c1.push(2);
        c1.push(4);
        c1.push(6);

        c2.push(1);
        c2.push(3);
        c2.push(5);
        c2.push(7);
        c2.push(9);

        Stack result = new Stack(8);
        int c1_len = c1.len();
        int c2_len = c2.len();
        if(c1_len!=c2_len){
            if(c1_len>c2_len){
                for(int i=0; i<c1_len-c2_len; i++){
                    result.push(c1.pop());
                }
            }
            else{
                for(int i=0; i<c2_len-c1_len; i++){
                    result.push(c2.pop());
                }
            }
        }
        while(!c1.isEmpty()){
            result.push(c1.pop());
            result.push(c2.pop());
        }
        result.display();
    }
}