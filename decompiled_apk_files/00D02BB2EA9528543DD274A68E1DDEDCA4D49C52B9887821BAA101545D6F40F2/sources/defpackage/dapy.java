package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: dapy  reason: default package */
/* loaded from: classes5.dex */
public final class dapy {
    public static void a(TextView textView, dapx dapxVar) {
        Typeface create;
        int c;
        int c2;
        Context context = textView.getContext();
        if (dapxVar.a != null && (c2 = daou.a(context).c(context, dapxVar.a)) != 0) {
            textView.setTextColor(c2);
        }
        if (dapxVar.b != null && (c = daou.a(context).c(context, dapxVar.b)) != 0) {
            textView.setLinkTextColor(c);
        }
        if (dapxVar.c != null) {
            float k = daou.a(context).k(context, dapxVar.c);
            if (k > 0.0f) {
                textView.setTextSize(0, k);
            }
        }
        if (dapxVar.d != null && (create = Typeface.create(daou.a(context).e(context, dapxVar.d), 0)) != null) {
            textView.setTypeface(create);
        }
        textView.setGravity(dapxVar.e);
    }

    public static void b(TextView textView, dapx dapxVar) {
        textView.setGravity(dapxVar.e);
    }
}
