package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvpu  reason: default package */
/* loaded from: classes4.dex */
final class bvpu implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bvqx b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;
    final /* synthetic */ bvpv e;

    public bvpu(bvpv bvpvVar, Runnable runnable, bvqx bvqxVar, long j, TimeUnit timeUnit) {
        this.e = bvpvVar;
        this.a = runnable;
        this.b = bvqxVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        if (!this.b.isDone()) {
            this.b.a(this.e.schedule(this, this.c, this.d).a);
        }
    }
}
