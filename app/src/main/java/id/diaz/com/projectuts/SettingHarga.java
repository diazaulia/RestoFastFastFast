package id.diaz.com.projectuts;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SettingHarga extends AppCompatActivity {

    EditText harga_1,harga_2,harga_3,harga_4,harga_5,harga_6,harga_7;
    Button btn;
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
        setContentView(R.layout.activity_setting_harga);

        harga_1 = (EditText) findViewById(R.id.harga_1);
        harga_2 = (EditText) findViewById(R.id.harga_2);
        harga_3 = (EditText) findViewById(R.id.harga_3);
        harga_4 = (EditText) findViewById(R.id.harga_4);
        harga_5 = (EditText) findViewById(R.id.harga_5);
        harga_6 = (EditText) findViewById(R.id.harga_6);
        harga_7 = (EditText) findViewById(R.id.harga_7);

        btn = (Button) findViewById(R.id.simpanHarga);
        shd = getSharedPreferences(myprf, Context.MODE_PRIVATE);

        DP();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h1 = harga_1.getText().toString();
                String h2 = harga_2.getText().toString();
                String h3 = harga_3.getText().toString();
                String h4 = harga_4.getText().toString();
                String h5 = harga_5.getText().toString();
                String h6 = harga_6.getText().toString();
                String h7 = harga_7.getText().toString();

                SharedPreferences.Editor editor = shd.edit();

                editor.putString(hrg1,h1);
                editor.putString(hrg2,h2);
                editor.putString(hrg3,h3);
                editor.putString(hrg4,h4);
                editor.putString(hrg5,h5);
                editor.putString(hrg6,h6);
                editor.putString(hrg7,h7);
                editor.commit();
                Toast.makeText(SettingHarga.this, "Tersimpan!", Toast.LENGTH_SHORT).show();

                DP();

            }
        });



    }

    void DP() {
        harga_1.setText(shd.getString(hrg1,hrg1));
        harga_2.setText(shd.getString(hrg2,hrg2));
        harga_3.setText(shd.getString(hrg3,hrg3));
        harga_4.setText(shd.getString(hrg4,hrg4));
        harga_5.setText(shd.getString(hrg5,hrg5));
        harga_6.setText(shd.getString(hrg6,hrg6));
        harga_7.setText(shd.getString(hrg7,hrg7));
    }
}
