package fr.dc.bdw1.partiel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LancementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String face=null;
        String des = null;
        setContentView(R.layout.activity_lancement);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                face = null;
            } else {
                face = extras.getString("chaine1");


                face = (String) savedInstanceState.getSerializable("chaine1");


            }
        }
        if (savedInstanceState == null) {
            Bundle extra2 = getIntent().getExtras();
            if (extra2 == null) {
                des = null;
            } else {
                des = extra2.getString("chaine2");
                des = (String) savedInstanceState.getSerializable("chaine2");
            }
        }

       int desN = Integer.parseInt(des);
        int faceN =Integer.parseInt(face);
    }

}