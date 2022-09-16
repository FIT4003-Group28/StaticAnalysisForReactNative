package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azma  reason: default package */
/* loaded from: classes2.dex */
public final class azma extends ayos {
    final ayov a;
    final long b;
    final TimeUnit c;
    final ayor d;

    public azma(ayov ayovVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        this.a = ayovVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        azlz azlzVar = new azlz(ayotVar, this.b, this.c);
        ayotVar.sj(azlzVar);
        ayqi.i(azlzVar.b, this.d.c(azlzVar, this.b, this.c));
        this.a.W(azlzVar);
    }
}
