package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ifq  reason: default package */
/* loaded from: classes3.dex */
final class ifq implements ankb {
    final /* synthetic */ igf a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ifr c;

    public ifq(ifr ifrVar, igf igfVar, boolean z) {
        this.c = ifrVar;
        this.a = igfVar;
        this.b = z;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        hqp.C(1, valueOf.length() != 0 ? "Skipping prefetch: ".concat(valueOf) : new String("Skipping prefetch: "));
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (!this.c.d && optional.isPresent()) {
            long d = this.c.b.d();
            ifr ifrVar = this.c;
            ifrVar.d(ifrVar.a, (apzg) optional.get(), this.a, 3, 1, 0, false, false, this.b, d);
        }
    }
}
