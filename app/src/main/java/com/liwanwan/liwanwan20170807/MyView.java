package com.liwanwan.liwanwan20170807;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 李婉婉 on 2017/8/7.8:57
 */
public class MyView extends View{
    Button fanhui;
    Button gengduo;
    TextView title;
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //初始化属性

        initAttrs(context,attrs);
        //填充试图
        View.inflate(context,R.layout.activity_main,null);
       fanhui=(Button) findViewById(R.id.fanhui);
       gengduo=(Button) findViewById(R.id.gengduo);
       title=(TextView) findViewById(R.id.title);

        //如果属性有值的话，那我们就需要给控件初始化数据了
        initData();

    }



    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initData() {
        if(title!=null){
           title.setText("自定义标题");
        }

        if(gengduo!=null){
            gengduo.setText("更多");
        }
        if(fanhui!=null){
            fanhui.setText("返回");
        }


    }

    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.MyView);

    }

}

