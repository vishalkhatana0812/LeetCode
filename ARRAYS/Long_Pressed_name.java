package ARRAYS;

public class Long_Pressed_name {
    
    public static void main(String[] args) {
        String name = "alex";
        String type = "aaallllexxxx";
        System.out.println(pressed(name, type));
    }
    public static boolean pressed(String name, String type){
        int p1=0;
        int p2=0;
        while(p1< name.length() && p2< type.length()){
            if(name.charAt(p1) == type.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                if(p2==0 || type.charAt(p2) != type.charAt(p2-1)){
                    return false;
                }
                while(p2<type.length()-1 && type.charAt(p2)==type.charAt(p2+1) ){
                    p2++;
                }
                p2++;
            }
        }
        if(p2 == type.length() && p1!=name.length()){
            return false;
        }
        if(p1==name.length() ){
            while(p2<type.length()&& type.charAt(p2)== type.charAt(p2-1)){
                p2++;
            }
        }
        return p2==type.length();
        }
}
