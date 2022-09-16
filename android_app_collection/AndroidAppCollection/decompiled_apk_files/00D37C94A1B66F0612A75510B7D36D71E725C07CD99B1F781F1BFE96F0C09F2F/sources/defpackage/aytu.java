package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aytu  reason: default package */
/* loaded from: classes2.dex */
public final class aytu extends aynr {
    final long a;
    final TimeUnit b;
    final ayor c;

    public aytu(long j, TimeUnit timeUnit, ayor ayorVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = ayorVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        aytt ayttVar = new aytt(aynsVar);
        aynsVar.sj(ayttVar);
        ayqi.i(ayttVar, this.c.c(ayttVar, this.a, this.b));
    }
}
