package defpackage;

import android.view.Surface;
/* compiled from: PG */
/* renamed from: pfy  reason: default package */
/* loaded from: classes4.dex */
final class pfy implements Runnable {
    final /* synthetic */ Surface a;
    final /* synthetic */ pgd b;

    public pfy(pgd pgdVar, Surface surface) {
        this.b = pgdVar;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
