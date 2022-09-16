package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: kcd  reason: default package */
/* loaded from: classes3.dex */
final class kcd implements Runnable {
    final /* synthetic */ Handler a;
    final /* synthetic */ kce b;

    public kcd(kce kceVar, Handler handler) {
        this.b = kceVar;
        this.a = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.w();
        this.a.removeCallbacks(this.b.g);
        this.b.v(true);
        this.b.k.c(kbn.a());
    }
}
