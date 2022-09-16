package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvpx  reason: default package */
/* loaded from: classes.dex */
final class bvpx implements Runnable {
    final /* synthetic */ bvpy a;

    public bvpx(bvpy bvpyVar) {
        this.a = bvpyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            long e = this.a.b.e();
            long e2 = this.a.e();
            if (e >= e2) {
                this.a.c.run();
                this.a.b();
                this.a.d(e);
            } else {
                long c = this.a.c();
                bvpy bvpyVar = this.a;
                long j = bvpyVar.d;
                if (j <= 0 || e - c < j) {
                    bvpyVar.e = bvpyVar.a.d(this, e2 - e, TimeUnit.MILLISECONDS);
                    bvpy bvpyVar2 = this.a;
                    bvqd.a(bvpyVar2.e, bvpyVar2.a);
                } else {
                    bvpyVar.c.run();
                    this.a.b();
                    this.a.d(e);
                }
            }
        }
    }
}
