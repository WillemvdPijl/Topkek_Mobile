package topkek.dev4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoofdmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoofdmenu);

        //Intent maakt de page zelf aan final staat ervoor omdat hij het anders niet pakt in de method zelf (startActivity)
        final Intent testPageOne = new Intent(this,MainActivity.class );
        final Intent testPageTwo = new Intent(this, MapsActivity.class);
        final Intent testPageThree = new Intent(this, ScrollingActivity.class);

        //Buttons  zijn logisch, je maakt een nieuwe Button -naam- aan. findViewById == ID opzoeken van de button die je wilt gebruiken
        //2x klikken op een button in XML file voor het ID
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);

        //OnClick methode, gewoon kopieren als je het nodig hebt(wel namen veranderen) On buttonclick roept hij dus de intent testPageOne aan bij de eerste
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(testPageOne);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
             startActivity(testPageTwo);
            }

        });

        button2.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(testPageThree);
            }
        });
    }



}