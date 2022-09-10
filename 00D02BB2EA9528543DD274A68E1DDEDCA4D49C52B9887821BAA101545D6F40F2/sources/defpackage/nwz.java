package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwz  reason: default package */
/* loaded from: classes7.dex */
public final class nwz implements nxe {
    public final dzsj<bqji> a;
    private final dzsj<begg> b;

    public nwz(dzsj<bqji> dzsjVar, dzsj<begg> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 32) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtrm dtrmVar = nviVar.a.g;
        if (dtrmVar == null) {
            dtrmVar = dtrm.l;
        }
        boolean z = true;
        if ((dtrmVar.a & 1) != 0) {
            float f = Float.NaN;
            if (Float.isNaN(Float.NaN) && (dtrmVar.a & 4) != 0) {
                f = dtrmVar.d;
                z = false;
            }
            dgrh dgrhVar = dtrmVar.b;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            akqi k = akqi.k(dgrhVar);
            String str = (dtrmVar.a & 512) != 0 ? dtrmVar.i : null;
            ily ilyVar = new ily();
            ilyVar.j(k);
            ilyVar.F(str);
            ilyVar.H(dtrmVar.k);
            if ((dtrmVar.a & 1024) != 0) {
                doch bZ = docm.i.bZ();
                String str2 = dtrmVar.j;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                docm docmVar = (docm) bZ.b;
                str2.getClass();
                docmVar.a |= 8;
                docmVar.e = str2;
                ilyVar.B(bZ.bK());
            }
            ilo d = ilyVar.d();
            if (!z) {
                String str3 = dtrmVar.e;
                docc bZ2 = docg.M.bZ();
                if (!Float.isNaN(f)) {
                    int i = (int) f;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    docg docgVar = (docg) bZ2.b;
                    docgVar.a |= 512;
                    docgVar.q = i;
                }
                if (!str3.isEmpty()) {
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    docg docgVar2 = (docg) bZ2.b;
                    str3.getClass();
                    docgVar2.a |= 1024;
                    docgVar2.r = str3;
                }
                d.bt(bZ2.bK());
            }
            boolean z2 = dtrmVar.g;
            bqjf r = bqjh.r();
            r.g(z);
            r.n(z2 ? chbv.ALWAYS_SHOW : chbv.NEVER_SHOW);
            if (z) {
                r.j((int) f);
                this.a.a().b(bwrs.a(d), r.o());
                return;
            }
            begg a = this.b.a();
            dnqg bZ3 = dnqh.p.bZ();
            int i2 = ddda.fe.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ3.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i2;
            dnqh.b(dnqhVar);
            a.p(d, bZ3.bK(), new nwy(this, r, d));
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.WRITE_REVIEW);
    }
}
