package e.android.picturechanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.pic);
    }

    public void TW(View view) {
        imageView.setImageResource(R.drawable.twitter);
    }

    public void FB(View view) {
        imageView.setImageResource(R.drawable.facebook);
    }

    public void GH(View view) {
        imageView.setImageResource(R.drawable.github);
    }

    public void BB(View view) {
        imageView.setImageResource(R.drawable.bitbucket);
    }
}
