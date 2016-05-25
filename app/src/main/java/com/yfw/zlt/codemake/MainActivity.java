package com.yfw.zlt.codemake;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yfw.zlt.codemake.mode.Result;
import com.yfw.zlt.codemake.util.CodeUtils;
import com.yfw.zlt.codemake.util.CountDownTimerUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView ivBitmap;
    TextView mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (TextView) findViewById(R.id.mButt);
        mButton.setOnClickListener(this);
        //图形验证码
//        ivBitmap= (ImageView) findViewById(R.id.ivBitmap);
//        Result result = CodeUtils.getInstance().createBitmap();
//        ivBitmap.setImageBitmap(result.getBitmap());
//        String code = result.getCode();
//        Log.i("ii","2:"+code);
        timeEnd();
    }

    /**
     * 倒计时
     * @param
     */
    private void timeEnd(){
        CountDownTimerUtils mCountDownTimerUtils = new CountDownTimerUtils(mButton, 60000, 1000);
        mCountDownTimerUtils.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mButt:
                timeEnd();
                Toast.makeText(MainActivity.this,"1111",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
