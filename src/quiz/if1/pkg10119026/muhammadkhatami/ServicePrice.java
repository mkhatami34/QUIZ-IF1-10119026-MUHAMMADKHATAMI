/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119026.muhammadkhatami;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO1 / IF-1
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi layanan haircut
 */
public class ServicePrice extends ServiceItem{
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPricService(float priceService){
        this.priceService = priceService;
    }
    
    @Override
    public void displayService(){
        System.out.println("#********************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("*****Service List*****");
        System.out.println("1. Haircut : IDR 45k");
        System.out.println("2. Haircut + Hairwash : IDR 55k");
        System.out.println("3. Hairwash : IDR 15k");
        System.out.println("#*********************#");
        
    }
    
    @Override
    public void getPrice(int serviceItem){
        System.out.println("Haircut : IDR 45k");
        System.out.println("Haircut + Hairwash : IDR 55k");
        System.out.println("Hairwash : IDR 15k");
    }
    
    public boolean checkMemberStatus(String statusMember){
        
    }
    
    public float getSale(boolean isMember, float parServicePrice){
        
    }
    
    public float getTotalPay(float priceService, float discout){
        
    }
}
