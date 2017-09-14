package bodor.com.mediatextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.angebagui.mediumtextview.MediumTextView;

/**
 * mediaTextView displays content with text image video etc in post detail, it can be
 * a pain to do it with content came from CMS so I decided to design that view to display
 * the content quickly it's different with webview.
 */
public class MainActivity extends AppCompatActivity {
         String content = "<p>This is MediumTextView demo</p>";
        String html = "<iframe height=498 width=510 src='http://player.youku.com/embed/XMzAyMjc3NzcyOA==' frameborder=0 'allowfullscreen'></iframe>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediumTextView mediumTextView = (MediumTextView) findViewById(R.id.mediumTextView);
        mediumTextView.setText(html);

    }

}
