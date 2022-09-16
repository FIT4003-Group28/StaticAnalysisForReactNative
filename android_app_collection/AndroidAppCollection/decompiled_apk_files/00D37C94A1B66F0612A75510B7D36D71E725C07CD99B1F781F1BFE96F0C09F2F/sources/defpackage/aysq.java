package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aysq  reason: default package */
/* loaded from: classes2.dex */
public final class aysq extends aynr {
    final aynu a;
    final long b;
    final TimeUnit c;
    final ayor d;

    public aysq(aynu aynuVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        this.a = aynuVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        this.a.U(new aysp(aynsVar, this.b, this.c, this.d));
    }
}
