package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azer  reason: default package */
/* loaded from: classes2.dex */
public final class azer extends azdm {
    final long b;
    final TimeUnit c;
    final ayor d;

    public azer(ayok ayokVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        super(ayokVar);
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        this.a.az(new azeq(new azox(ayomVar), this.b, this.c, this.d.a()));
    }
}
