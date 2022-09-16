package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: elz  reason: default package */
/* loaded from: classes3.dex */
final class elz implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aqdi a;
    final /* synthetic */ TextView b;
    final /* synthetic */ zai c;

    public elz(aqdi aqdiVar, TextView textView, zai zaiVar) {
        this.a = aqdiVar;
        this.b = textView;
        this.c = zaiVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (ema.r(this.a) == null) {
            return true;
        }
        this.b.setBackground(null);
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        int i = zew.i(displayMetrics, 2);
        this.c.b(zew.i(displayMetrics, 6), i, zai.a(this.b.getTextSize() * this.b.getLineCount(), i) + zew.i(displayMetrics, 4), i);
        this.b.setBackground(this.c);
        return true;
    }
}
