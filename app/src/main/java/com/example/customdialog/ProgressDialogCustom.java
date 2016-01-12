package com.example.customdialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by fernando on 11/01/16.
 */
public class ProgressDialogCustom extends ProgressDialog{
    private AnimationDrawable animation;

    public static ProgressDialog new_instance(Context context){
        ProgressDialogCustom ob=new ProgressDialogCustom(context,R.style.AppTheme);
        ob.setIndeterminate(true);
        ob.setCancelable(false);
        return ob;
    }

    public ProgressDialogCustom(Context context,int style) {
        super(context,style);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template_progress);
        ImageView img=(ImageView)findViewById(R.id.animation);
        img.setBackgroundResource(R.drawable.animation_loader);
        animation=(AnimationDrawable)img.getBackground();
    }

    @Override
    public void show(){
        super.show();
        animation.start();
    }

    @Override
    public void dismiss(){
        super.dismiss();
        animation.stop();
    }
}
