package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: blzr  reason: default package */
/* loaded from: classes3.dex */
final class blzr implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ blzs b;

    public blzr(blzs blzsVar, TextView textView) {
        this.b = blzsVar;
        this.a = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        blzs blzsVar = this.b;
        blzsVar.g = false;
        if (blzsVar.f) {
            this.a.setMaxLines(4);
        }
    }
}
