package com.example.xpeng.hellochartsdemo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xpeng.hellochartsdemo.R;

import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.view.ComboLineColumnChartView;
import lecho.lib.hellocharts.view.LineChartView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLineChart;
    private Button mBtnPieChart;
    private Button mBtnComboChart;
    private Button mBtnPreviewChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        mBtnLineChart = (Button)findViewById(R.id.btn_line_chart);
        mBtnPieChart = (Button)findViewById(R.id.btn_pie_chart);
        mBtnComboChart = (Button)findViewById(R.id.btn_combo_chart);
        mBtnPreviewChart = (Button)findViewById(R.id.btn_preview_chart);
        mBtnLineChart.setOnClickListener(this);
        mBtnPieChart.setOnClickListener(this);
        mBtnComboChart.setOnClickListener(this);
        mBtnPreviewChart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_line_chart:
                Intent intent = new Intent(MainActivity.this,LineChartActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_pie_chart:
                Intent intent2 = new Intent(MainActivity.this,PieChartActivity.class);
                startActivity(intent2);
                break;

            case R.id.btn_combo_chart:
                Intent intent3 = new Intent(MainActivity.this,ComboLineColumnChartActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn_preview_chart:
                Intent intent4 = new Intent(MainActivity.this,PreviewLineChartActivity.class);
                startActivity(intent4);
                break;
                default:
                    break;
        }
    }
}
