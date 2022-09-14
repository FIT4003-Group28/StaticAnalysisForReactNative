package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
/* compiled from: TextInlineImageSpan.java */
/* loaded from: classes.dex */
public abstract class n extends ReplacementSpan {
    public abstract Drawable a();

    public abstract void a(TextView textView);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract int f();

    public static void a(Spannable spannable, TextView textView) {
        n[] nVarArr;
        for (n nVar : (n[]) spannable.getSpans(0, spannable.length(), n.class)) {
            nVar.d();
            nVar.a(textView);
        }
    }
}
