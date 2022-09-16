package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
/* loaded from: classes.dex */
public abstract class y extends ReplacementSpan implements l {
    public static void a(Spannable spannable, TextView textView) {
        y[] yVarArr;
        for (y yVar : (y[]) spannable.getSpans(0, spannable.length(), y.class)) {
            yVar.c();
            yVar.a(textView);
        }
    }

    public abstract Drawable a();

    public abstract void a(TextView textView);

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();
}
