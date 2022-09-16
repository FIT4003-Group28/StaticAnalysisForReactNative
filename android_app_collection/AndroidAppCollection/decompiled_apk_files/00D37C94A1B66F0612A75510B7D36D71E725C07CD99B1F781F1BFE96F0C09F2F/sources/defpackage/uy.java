package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: uy  reason: default package */
/* loaded from: classes4.dex */
final class uy implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ Typeface b;
    final /* synthetic */ int c;

    public uy(TextView textView, Typeface typeface, int i) {
        this.a = textView;
        this.b = typeface;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setTypeface(this.b, this.c);
    }
}
