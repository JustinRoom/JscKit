package jsc.exam.jsckit;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import jsc.kit.vscrollscreen.VScrollScreenLayout;

public class VScrollScreenLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_scroll_screen_layout);

        VScrollScreenLayout scrollScreenLayout = findViewById(R.id.v_scroll_screen_layout);
        scrollScreenLayout.setOnScrollPageChangedListener(new VScrollScreenLayout.OnScrollPageChangedListener() {
            @Override
            public void onScroll(Context context, int pageIndex) {
                Toast.makeText(context, "The current page is " + (pageIndex + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
