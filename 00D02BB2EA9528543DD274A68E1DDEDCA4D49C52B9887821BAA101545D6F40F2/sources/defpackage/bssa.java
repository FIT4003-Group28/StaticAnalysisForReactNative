package defpackage;
/* compiled from: PG */
/* renamed from: bssa  reason: default package */
/* loaded from: classes4.dex */
final class bssa implements cqrh {
    final /* synthetic */ bsse a;

    public bssa(bsse bsseVar) {
        this.a = bsseVar;
    }

    @Override // defpackage.cqrh
    public final void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        if (!this.a.G.f() && (cqkpVar instanceof bssn)) {
            cqkp a = ((bssn) cqkpVar).a();
            if (a instanceof bssr) {
                this.a.e(((bssr) a).a());
            }
        }
        bsse bsseVar = this.a;
        if (bsseVar.I || cqkpVar != bsseVar.E) {
            return;
        }
        bsseVar.N = true;
    }
}
