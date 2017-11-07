package id.diaz.com.projectuts;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StrukPembelian extends AppCompatActivity {

    String h1,h2,h3,h4,h5,h6,h7;
    int mk1,mk2,mk3,mk4,mk5,mk6,mk7,gt;
    TextView item1,item2,item3,item4,item5,item6,item7,itemTotal;


    SharedPreferences shd;
    public static final String myprf = "myprfs";
    public static final String hrg1 = "hrg1";
    public static final String hrg2 = "hrg2";
    public static final String hrg3 = "hrg3";
    public static final String hrg4 = "hrg4";
    public static final String hrg5 = "hrg5";
    public static final String hrg6 = "hrg6";
    public static final String hrg7 = "hrg7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk_pembelian);
        shd = getSharedPreferences(myprf, Context.MODE_PRIVATE);
        Intent bin = getIntent();
        Bundle bun = bin.getExtras();

        if(bun!=null) {
            h1 = (String) bun.get("j1");
            h2 = (String) bun.get("j2");
            h3 = (String) bun.get("j3");
            h4 = (String) bun.get("j4");
            h5 = (String) bun.get("j5");
            h6 = (String) bun.get("j6");
            h7 = (String) bun.get("j7");
        }
        mk1 = Integer.parseInt(h1) * Integer.parseInt(shd.getString(hrg1,hrg1));
        mk2 = Integer.parseInt(h2) * Integer.parseInt(shd.getString(hrg2,hrg2));
        mk3 = Integer.parseInt(h3) * Integer.parseInt(shd.getString(hrg3,hrg3));
        mk4 = Integer.parseInt(h4) * Integer.parseInt(shd.getString(hrg4,hrg4));
        mk5 = Integer.parseInt(h5) * Integer.parseInt(shd.getString(hrg5,hrg5));
        mk6 = Integer.parseInt(h6) * Integer.parseInt(shd.getString(hrg6,hrg6));
        mk7 = Integer.parseInt(h7) * Integer.parseInt(shd.getString(hrg7,hrg7));
        gt  = mk1+mk2+mk3+mk4+mk5+mk6+mk7;

        item1 = (TextView) findViewById(R.id.item1);
        item2 = (TextView) findViewById(R.id.item2);
        item3 = (TextView) findViewById(R.id.item3);
        item4 = (TextView) findViewById(R.id.item4);
        item5 = (TextView) findViewById(R.id.item5);
        item6 = (TextView) findViewById(R.id.item6);
        item7 = (TextView) findViewById(R.id.item7);
        itemTotal = (TextView) findViewById(R.id.itemTotal);

        item1.setText("Rp."+String.valueOf(mk1)+",-");
        item2.setText("Rp."+String.valueOf(mk2)+",-");
        item3.setText("Rp."+String.valueOf(mk3)+",-");
        item4.setText("Rp."+String.valueOf(mk4)+",-");
        item5.setText("Rp."+String.valueOf(mk5)+",-");
        item6.setText("Rp."+String.valueOf(mk6)+",-");
        item7.setText("Rp."+String.valueOf(mk7)+",-");
        itemTotal.setText("Rp."+String.valueOf(gt)+",-");
    }
}
