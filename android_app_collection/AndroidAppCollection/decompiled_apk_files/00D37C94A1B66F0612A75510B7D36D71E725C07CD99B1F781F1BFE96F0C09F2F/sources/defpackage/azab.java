package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azab  reason: default package */
/* loaded from: classes2.dex */
public final class azab extends aynx {
    final ayor b;
    final long c;
    final TimeUnit d;

    public azab(long j, TimeUnit timeUnit, ayor ayorVar) {
        this.c = j;
        this.d = timeUnit;
        this.b = ayorVar;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        azaa azaaVar = new azaa(bameVar);
        bameVar.f(azaaVar);
        ayqi.j(azaaVar, this.b.c(azaaVar, this.c, this.d));
    }
}
