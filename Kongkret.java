//kelas kongkret

public class kongkret {
    String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nm){
     this.nama= nm;   
    
    }
 
    private static <T> void kongkret (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        kongkret ko = new kongkret();
        
        ko.setNama("Noval");
        System.out.println(ko.getNama());
        kongkret("Ini Contoh");
        
    }
    
}
