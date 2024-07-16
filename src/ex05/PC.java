package ex05;

public class PC implements Electrical {

    //電源on/offを表す
    private boolean powerOn;//電源ON:ture 電源off:false

    
    // getterとsetter
    // private boolean isPowerOn(){
    //     return this.powerOn;

    // }
    
    //自クラス内のことなので、わざわざセッターで呼ばなくてもいい
    public void setPowerOn(boolean powerOn){

    }

    //インターフェースで定義されている抽象メソッドを実装
    @Override
    public void power(){
        if(powerOn){
        this.powerOn = false;
        System.out.println("PCの電源が切れました");
    }else{
        System.out.println("設定ファイルを読み込んでいます");
        this.powerOn = true;
        System.out.println("PCの電源が入りました");
        }
     }
        
    
}
