package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bewj  reason: default package */
/* loaded from: classes3.dex */
public class bewj implements bega {
    public final dxio<afha> a;
    private final dbrn<drcm, List<dfzq>> b;
    private dcdc<cjho> c = dcdc.e();

    public bewj(dxio<afha> dxioVar, dbrn<drcm, List<dfzq>> dbrnVar) {
        this.a = dxioVar;
        this.b = dbrnVar;
    }

    public dcdc<cjho> a() {
        return this.c;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        final ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null || (iloVar.h().c & 2097152) == 0) {
            u();
            return;
        }
        dbrn<drcm, List<dfzq>> dbrnVar = this.b;
        drcm drcmVar = iloVar.h().aK;
        if (drcmVar == null) {
            drcmVar = drcm.d;
        }
        List<dfzq> a = dbrnVar.a(drcmVar);
        if (a.isEmpty()) {
            u();
        } else {
            this.c = dcbg.b(a).s(new dbrn(this, iloVar) { // from class: bewi
                private final bewj a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bewj bewjVar = this.a;
                    ilo iloVar2 = this.b;
                    dfzq dfzqVar = (dfzq) obj;
                    dxio<afha> dxioVar = bewjVar.a;
                    cjta c = cjtd.c(iloVar2.bZ());
                    c.d = dtxo.bj;
                    cjta c2 = cjtd.c(iloVar2.bZ());
                    c2.d = dtxo.bl;
                    cjhn q = cjho.q(dfzqVar, Integer.MAX_VALUE, null, dxioVar, c, c2.a(), null);
                    cjta c3 = cjtd.c(iloVar2.bZ());
                    c3.d = dtxo.bk;
                    q.c(c3.a());
                    return q.a();
                }
            }).z();
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.c = dcdc.e();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.c.isEmpty());
    }
}
