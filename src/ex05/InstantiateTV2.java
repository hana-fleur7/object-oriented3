package ex05;

public class InstantiateTV2 {
    public static void main(String[] args) {
        
        //TVクラスのhitachiTVインスタンスを生成
        TV hitachiTV = new TV();
        hitachiTV.changeChannel(5);//5チャンネルに変える

        hitachiTV.power();//電源を入れる

        hitachiTV.changeChannel(5);//5チャンネルに変える

    }

}
