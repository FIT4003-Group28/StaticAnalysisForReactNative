package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ifp  reason: default package */
/* loaded from: classes3.dex */
final class ifp implements ankb {
    final /* synthetic */ igf a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ifr e;

    public ifp(ifr ifrVar, igf igfVar, int i, boolean z, boolean z2) {
        this.e = ifrVar;
        this.a = igfVar;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        hqp.C(1, valueOf.length() != 0 ? "Skipping prefetch: ".concat(valueOf) : new String("Skipping prefetch: "));
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (!this.e.d && optional.isPresent()) {
            long d = this.e.b.d();
            ifr ifrVar = this.e;
            igf igfVar = this.a;
            int i = this.b;
            boolean z = this.c;
            ifrVar.d(ifrVar.a, (apzg) optional.get(), igfVar, 2, 1, i, z, z, this.d, d);
        }
    }
}
