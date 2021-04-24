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
public class Televisi {
    private String deskripsi;
    private int jumlahChannel;
    private String[] channel = null;
    private int channelAktif;
    private int volume;
    
    public Televisi(String deskripsi, int jumlahChannel){
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public int getJumlahChannel(){
        return jumlahChannel;
    }
    
    public String[] getChannel(){
        if(channel == null){
            System.out.println("Belum ada channel yang di set!");
        }
        return channel;
    }
    
    public void setChannel(String[] channel){
        if(channel.length > jumlahChannel){
        } else{
            this.channel = channel;
            System.out.println("Informasi channel berhasil di update!");
        }
    }
    
    public int getChannelAktif(){
        return channelAktif;
    }
    
    public void setChannelAktif(int channelAktif){
        if(channelAktif > channel.length){
            return;
        }
        this.channelAktif = channelAktif;
        System.out.println("Channel Aktif : " + channel[channelAktif]);
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("intensitas volume sekarang : " + volume);
    }
}

class User{
    public static void main(String[] args){
        Televisi tv = new Televisi("LG, 32 inches", 10);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "NET TV", 
                                 "METRO TV", "TRANS TV", "MNCTV", "TV 7",
                                  "TVRI", "TV ONE", "ANTV"};
        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "NET TV",
                                    "METRO TV", "TRANS TV", "MNCTV", "TV 7"};
        System.out.println("Pak Lukman membeli televisi : " + tv.getDeskripsi());
        tv.getChannel();
        tv.setChannel(semuaChannel);
        tv.setChannel(channelFavorit);
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
}
}
