package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azgu  reason: default package */
/* loaded from: classes2.dex */
public final class azgu extends ayoi {
    final ayor a;
    final long b;
    final long c;
    final TimeUnit d;

    public azgu(long j, long j2, TimeUnit timeUnit, ayor ayorVar) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = ayorVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        azgt azgtVar = new azgt(ayomVar);
        ayomVar.sj(azgtVar);
        ayor ayorVar = this.a;
        if (ayorVar instanceof azns) {
            ayoq a = ayorVar.a();
            ayqi.g(azgtVar, a);
            a.d(azgtVar, this.b, this.c, this.d);
            return;
        }
        ayqi.g(azgtVar, ayorVar.d(azgtVar, this.b, this.c, this.d));
    }
}
