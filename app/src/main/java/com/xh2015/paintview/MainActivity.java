package com.xh2015.paintview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xh2015.paintview.widget.PaintView;

public class MainActivity extends AppCompatActivity {

    private PaintView mPaintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPaintView = (PaintView)findViewById(R.id.paint_layout);

        findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPaintView.removeAllPaint();
            }
        });

        findViewById(R.id.btn_undo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPaintView.undo();
            }
        });

        findViewById(R.id.btn_redo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPaintView.redo();
            }
        });
    }
}
