package cn.openpilot.account;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;

public class MainActivity extends Activity {

    @BindView(R.id.test)
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
