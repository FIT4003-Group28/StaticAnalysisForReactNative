package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: jv  reason: default package */
/* loaded from: classes.dex */
final class jv implements Runnable {
    final /* synthetic */ Typeface a;
    final /* synthetic */ jx b;

    public jv(jx jxVar, Typeface typeface) {
        this.b = jxVar;
        this.a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
