package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azjh  reason: default package */
/* loaded from: classes2.dex */
public final class azjh extends azdm {
    final long b;
    final TimeUnit c;
    final ayor d;

    public azjh(ayoi ayoiVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        super(ayoiVar);
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azjf azjfVar = new azjf(ayomVar, this.b, this.c, this.d.a());
        ayomVar.sj(azjfVar);
        azjfVar.f(0L);
        this.a.az(azjfVar);
    }
}
