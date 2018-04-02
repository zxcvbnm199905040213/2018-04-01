public class E1 {
    private String name, pow, ox;
    public E1(){
    }
    public E1(String name1 , String pow1 , System ox1){
        name = name1;
        pow = pow1;
        ox = ox1;
    }
    public void setName(String name2){
        name = name2;
    }
    public void  setPow(String pow2){
        pow = pow2;
    }
    private void setOx(String ox2){
        ox = ox2;
    }
    private String getName(){return name;}
    private String getPow(){return pow;}
    private String getOx(){return ox;}
    private void showAll(){
        System.out.println("-------------------------------");
        System.out.println("name: "+this.getName());
        System.out.println("pow: "+this.getPow());
        System.out.println("ox: "+this.getOx());
        System.out.println("-------------------------------");
    }
}
