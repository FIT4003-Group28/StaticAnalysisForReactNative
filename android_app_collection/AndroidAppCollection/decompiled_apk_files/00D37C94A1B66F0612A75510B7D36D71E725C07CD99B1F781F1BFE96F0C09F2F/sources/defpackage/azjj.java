package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azjj  reason: default package */
/* loaded from: classes2.dex */
public final class azjj extends ayoi {
    final ayor a;
    final long b;
    final TimeUnit c;

    public azjj(long j, TimeUnit timeUnit, ayor ayorVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = ayorVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        azji azjiVar = new azji(ayomVar);
        ayomVar.sj(azjiVar);
        ayqi.j(azjiVar, this.a.c(azjiVar, this.b, this.c));
    }
}
