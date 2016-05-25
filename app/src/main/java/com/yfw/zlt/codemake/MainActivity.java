package com.yfw.zlt.codemake;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.yfw.zlt.codemake.mode.Result;
import com.yfw.zlt.codemake.util.CodeUtils;

public class MainActivity extends AppCompatActivity {
    ImageView ivBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivBitmap= (ImageView) findViewById(R.id.ivBitmap);
        Result result = CodeUtils.getInstance().createBitmap();
        ivBitmap.setImageBitmap(result.getBitmap());
        String code = result.getCode();
        Log.i("ii","2:"+code);
    }
}
