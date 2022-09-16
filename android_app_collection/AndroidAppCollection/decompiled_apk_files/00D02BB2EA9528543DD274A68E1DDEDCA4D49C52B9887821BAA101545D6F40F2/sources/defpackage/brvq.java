package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: brvq  reason: default package */
/* loaded from: classes4.dex */
public class brvq extends bebz {
    public final brvs l;
    public final ddho m;
    private List<bdzv> n;

    public brvq(btvo btvoVar, dxio<akfa> dxioVar, dxio<apyz> dxioVar2, becb becbVar, brvs brvsVar, bebr bebrVar, beam beamVar, bebo beboVar, bkgz bkgzVar, bkgy bkgyVar, ddho ddhoVar) {
        super(dxioVar, dxioVar2, becbVar, bebrVar, btvoVar, beamVar, beboVar, bkgzVar, bkgyVar, ddhoVar);
        this.n = dcdc.e();
        this.l = brvsVar;
        this.m = ddhoVar;
    }

    @Override // defpackage.bebz, defpackage.bdzw
    public List<bdzv> a() {
        return this.n;
    }

    @Override // defpackage.bebz, defpackage.bdzw
    public void b(bwrs<ilo> bwrsVar) {
        dcdc r;
        this.n = dcdc.e();
        final ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        List<bdzv> c = c(iloVar);
        if (c.isEmpty()) {
            dnxj dnxjVar = iloVar.h().au;
            if (dnxjVar == null) {
                dnxjVar = dnxj.b;
            }
            r = dcdc.r(dcbg.b(dcdc.r(dnxjVar.a)).o(brvn.a).s(new dbrn(this, iloVar) { // from class: brvo
                private final brvq a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    brvq brvqVar = this.a;
                    ilo iloVar2 = this.b;
                    dnwx dnwxVar = (dnwx) obj;
                    brvs brvsVar = brvqVar.l;
                    ddho ddhoVar = brvqVar.m;
                    beas a = brvsVar.a.a();
                    brvs.a(a, 1);
                    brvs.a(iloVar2, 2);
                    brvs.a(dnwxVar, 3);
                    brvs.a(ddhoVar, 4);
                    return new brvp(a, iloVar2, dnwxVar, ddhoVar);
                }
            }).z());
        } else {
            r = dcdc.r(c);
        }
        this.n = r;
    }
}
