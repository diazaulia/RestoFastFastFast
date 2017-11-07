package id.diaz.com.projectuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView jml_1,jml_2,jml_3,jml_4,jml_5,jml_6,jml_7;
    String j1,j2,j3,j4,j5,j6,j7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jml_1 = (EditText) findViewById(R.id.jml_1);
        jml_2 = (EditText) findViewById(R.id.jml_2);
        jml_3 = (EditText) findViewById(R.id.jml_3);
        jml_4 = (EditText) findViewById(R.id.jml_4);
        jml_5 = (EditText) findViewById(R.id.jml_5);
        jml_6 = (EditText) findViewById(R.id.jml_6);
        jml_7 = (EditText) findViewById(R.id.harga_7);

        Toast.makeText(this, "A11.2014.08101 Diaz Aulia Fahmi", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.topmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.setingHarga){
            startActivity(new Intent(this, SettingHarga.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void doHitung(View view) {
        Intent it = new Intent(this, StrukPembelian.class);
        j1 = jml_1.getText().toString();
        j2 = jml_2.getText().toString();
        j3 = jml_3.getText().toString();
        j4 = jml_4.getText().toString();
        j5 = jml_5.getText().toString();
        j6 = jml_6.getText().toString();
        j7 = jml_7.getText().toString();
        it.putExtra("j1",j1);
        it.putExtra("j2",j2);
        it.putExtra("j3",j3);
        it.putExtra("j4",j4);
        it.putExtra("j5",j5);
        it.putExtra("j6",j6);
        it.putExtra("j7",j7);
        startActivity(it);
    }
}
