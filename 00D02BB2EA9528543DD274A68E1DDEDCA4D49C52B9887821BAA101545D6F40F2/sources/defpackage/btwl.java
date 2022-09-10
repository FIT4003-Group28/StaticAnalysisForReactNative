package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btwl  reason: default package */
/* loaded from: classes.dex */
final class btwl implements Runnable {
    final /* synthetic */ bwrf a;
    final /* synthetic */ btyu b;
    final /* synthetic */ btwm c;

    public btwl(btwm btwmVar, bwrf bwrfVar, btyu btyuVar) {
        this.c = btwmVar;
        this.a = bwrfVar;
        this.b = btyuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a((ckco) this.c.b.a().a(ckja.m));
        if (this.b != null) {
            this.c.b.a().t(ckja.b, TimeUnit.HOURS.convert(this.c.a.b() - this.b.d, TimeUnit.MILLISECONDS));
        }
    }
}
