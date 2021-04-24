/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Tambahan;

/**
 *
 * @author reraparius
 */
public class TelevisiModern extends Televisi {
    public static final int TV = 0;
    public static final int TELETEXT = 1;
    int modusTampilan = TV;
    int halamanTeletext = 100;
    String discTray = null;
    public TelevisiModern(String deskripsi, int jumlahChannel) {
        super(deskripsi, jumlahChannel);
    }
    
    public void setHalamanTeletext(int halamanTeletext){
        this.halamanTeletext = halamanTeletext;
        System.out.println("Berpindah ke halaman teletext " + halamanTeletext);        
    }
    
    public void setModusTampilan(int modusTampilan){
        switch(modusTampilan){
            case TV:
                System.out.println("Modus tampilan : Televisi");
                break;
            case TELETEXT:
                System.out.println("Modus tampilan : Teletext");
                break;
        }
    }
    
    public String getDiscTray(){
        return discTray;
    }
    
    public void setDiscTray(String discTray){
        this.discTray = discTray;
    }
    
    public void playCD(){
        if(discTray == null){
            System.out.println("Tidak ada CD di dalam disc tray!");
            return;
        }
        System.out.println("Memutar file " + discTray);
    }
}

class User2{
    public static void main(String[] args){
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches", 100);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                  "METRO TV", "TRANS TV", "TPI", "TV 7",
                                   "TVRI", "TV G", "ANTV"};
        
        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannel();
        tv.setChannel(semuaChannel);
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
}

