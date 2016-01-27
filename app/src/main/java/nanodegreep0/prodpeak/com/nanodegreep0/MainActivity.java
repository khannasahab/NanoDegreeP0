package nanodegreep0.prodpeak.com.nanodegreep0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.spotify_streamer).setOnClickListener(this);
        findViewById(R.id.scores_app).setOnClickListener(this);
        findViewById(R.id.library_app).setOnClickListener(this);
        findViewById(R.id.build_bigger).setOnClickListener(this);
        findViewById(R.id.xyz_app).setOnClickListener(this);
        findViewById(R.id.capstone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String text = "No Match"; // we can pick from strings as well
        switch (id) {
            case R.id.spotify_streamer:
                text = "Spotify Streamer";
                break;
            case R.id.scores_app:
                text = "Scores";
                break;
            case R.id.library_app:
                text = "Library";
                break;
            case R.id.build_bigger:
                text = "Build Bigger";
                break;
            case R.id.xyz_app:
                text = "XYZ";
                break;
            case R.id.capstone:
                text = "Capstone";
                break;
        }
        Toast.makeText(this, "This Button will launch " + text + " App", Toast.LENGTH_SHORT).show();
    }
}
