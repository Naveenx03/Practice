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

    }
}