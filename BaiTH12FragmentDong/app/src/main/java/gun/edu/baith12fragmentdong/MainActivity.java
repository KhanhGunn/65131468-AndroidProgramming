package gun.edu.baith12fragmentdong;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        ContentFragment contentFrag = new ContentFragment();
        fragmentTransaction.add(R.id.frameContentHoder, contentFrag);

        FooterFragment footerFrag = new FooterFragment();
        fragmentTransaction.add(R.id.frameFooterHoder, footerFrag);

        fragmentTransaction.commit();
    }
}