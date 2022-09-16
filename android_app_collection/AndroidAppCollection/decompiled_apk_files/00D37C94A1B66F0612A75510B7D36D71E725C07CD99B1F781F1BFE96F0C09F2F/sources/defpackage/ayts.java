package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ayts  reason: default package */
/* loaded from: classes2.dex */
public final class ayts extends aynr {
    final aynu a;
    final long b;
    final TimeUnit c;
    final ayor d;

    public ayts(aynu aynuVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        this.a = aynuVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.aynr
    public final void V(ayns aynsVar) {
        aypf aypfVar = new aypf();
        aynsVar.sj(aypfVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        aypfVar.d(this.d.c(new aytq(this, atomicBoolean, aypfVar, aynsVar), this.b, this.c));
        this.a.U(new aytr(aypfVar, atomicBoolean, aynsVar));
    }
}
