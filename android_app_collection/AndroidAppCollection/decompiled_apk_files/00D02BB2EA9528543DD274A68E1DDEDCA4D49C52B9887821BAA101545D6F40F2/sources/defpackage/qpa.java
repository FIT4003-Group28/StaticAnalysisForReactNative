package defpackage;
/* compiled from: PG */
/* renamed from: qpa  reason: default package */
/* loaded from: classes7.dex */
final class qpa implements acnw {
    final /* synthetic */ qph a;

    public qpa(qph qphVar) {
        this.a = qphVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        cjte cjteVar = new cjte(deaf.TAP);
        if (z) {
            cjteVar = new cjte(deaf.SWIPE);
        }
        if (z2) {
            qph qphVar = this.a;
            qphVar.e.n(qphVar.f.g().d(this.a.h.get(i2).a().b()), cjteVar, this.a.h.get(i2).a().b());
        }
        qph qphVar2 = this.a;
        if (i2 == qphVar2.k) {
            qpf s = qphVar2.s();
            if (s == null) {
                return;
            }
            s.b().y();
            return;
        }
        if (!qphVar2.r(i2)) {
            bvoo.h("Cannot set active tab because it does not exist", new Object[0]);
        }
        qpf s2 = qphVar2.s();
        if (s2 != null) {
            s2.b().w();
            s2.a().f(false);
        }
        qphVar2.k = i2;
        qpf s3 = qphVar2.s();
        if (s3 != null) {
            s3.a().f(true);
            qphVar2.w();
            s3.b().s(qphVar2);
            s3.b().v();
        }
        cqkx.p(qphVar2);
    }
}
