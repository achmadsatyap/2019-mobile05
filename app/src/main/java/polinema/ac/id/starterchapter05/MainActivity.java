package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import polinema.ac.id.starterchapter05.activities.StaticActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void handlerClickPraktikumFragment(View view) {
    }

    public void handlerClickDynamicFragment(View view) {
    }

    public void handlerClickStaticFragment(View view) {
        Intent intent = new Intent(this, StaticActivity.class);
        startActivity(intent);
    }
}
