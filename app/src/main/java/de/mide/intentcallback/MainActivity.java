package de.mide.intentcallback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * MainActivity kann zwei weitere Activities (Activity A & Activity B)
 * aufrufen und unterscheiden, welche davon beendet wurde.
 * <br/><br/>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    private Button _zuActivity2Button = null;
    private Button _zuActivity3Button = null;

    /**
     * Lifecycle-Methode: Lädt Layout-Datei, füllt Referenzen für die Buttons und
     * setzt die Activity-Instanz selbst als Event-Handler-Objekt für die Buttons.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _zuActivity2Button = findViewById(R.id.button_gehe_zu_activity_a);
        _zuActivity3Button = findViewById(R.id.button_gehe_zu_activity_b);

        _zuActivity2Button.setOnClickListener(this);
        _zuActivity3Button.setOnClickListener(this);
    }

    /**
     * Event-Handler-Methode für die beiden Buttons.
     *
     * @param view Button, der betätigt wurde und damit das Event ausgelöst hat.
     */
    @Override
    public void onClick(View view) {

        Intent intent = null;
        if (view == _zuActivity2Button) {

            intent = new Intent(this, Activity2.class);

        } else if (view == _zuActivity3Button) {

            intent = new Intent(this, Activity3.class);

        } else {

            Log.e("Intent-Callback",
                    "Event-Handler-Methode für unerwartetes View-Element aufgerufen: " + view);
            return;
        }

        startActivity(intent);
    }

}