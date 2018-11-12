package keep.com.revealorhideanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void crossfade(View v) {
        CrossfadeActivity.startActivity(this);
    }

    public void cardFlip(View view) {
        CardFlipActivity.startActivity(this);
    }
}
