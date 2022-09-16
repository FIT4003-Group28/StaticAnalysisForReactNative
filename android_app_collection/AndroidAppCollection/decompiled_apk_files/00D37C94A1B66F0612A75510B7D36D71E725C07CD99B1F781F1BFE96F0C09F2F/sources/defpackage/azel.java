package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azel  reason: default package */
/* loaded from: classes2.dex */
public final class azel extends azdm {
    final long b;
    final TimeUnit c;
    final ayor d;

    public azel(ayok ayokVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        super(ayokVar);
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        this.a.az(new azek(new azox(ayomVar), this.b, this.c, this.d.a()));
    }
}
