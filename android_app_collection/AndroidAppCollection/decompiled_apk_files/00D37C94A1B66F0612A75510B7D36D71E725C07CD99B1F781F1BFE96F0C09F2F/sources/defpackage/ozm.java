package defpackage;
/* compiled from: PG */
/* renamed from: ozm  reason: default package */
/* loaded from: classes4.dex */
public final class ozm implements oxq {
    private ozs a;

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        oyf pP = oxrVar.pP(0);
        oxrVar.pR();
        ozs ozsVar = this.a;
        ozsVar.d = oxrVar;
        ozsVar.c = pP;
    }

    @Override // defpackage.oxq
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.oxq
    public final int e(oxn oxnVar, oxz oxzVar) {
        return this.a.a(oxnVar, oxzVar);
    }

    @Override // defpackage.oxq
    public final boolean f(oxn oxnVar) {
        try {
            pct pctVar = new pct(new byte[27], 0);
            ozq ozqVar = new ozq();
            if (ozr.c(oxnVar, ozqVar, pctVar, true) && (ozqVar.a & 2) == 2 && ozqVar.e >= 7) {
                pctVar.v();
                oxnVar.g(pctVar.a, 0, 7);
                if (pctVar.h() != 127 || pctVar.n() != 1179402563) {
                    pctVar.v();
                    try {
                        if (pae.b(1, pctVar, true)) {
                            this.a = new ozv();
                        }
                    } catch (ouf unused) {
                    }
                } else {
                    this.a = new ozl();
                }
                return true;
            }
            return false;
        } catch (ouf unused2) {
            return false;
        }
    }
}
