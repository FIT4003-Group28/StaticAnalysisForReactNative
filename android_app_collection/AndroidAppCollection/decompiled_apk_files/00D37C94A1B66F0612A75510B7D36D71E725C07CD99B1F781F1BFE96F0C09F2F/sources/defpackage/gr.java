package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: gr  reason: default package */
/* loaded from: classes3.dex */
final class gr implements Runnable {
    final /* synthetic */ Typeface a;
    final /* synthetic */ gt b;

    public gr(gt gtVar, Typeface typeface) {
        this.b = gtVar;
        this.a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
