package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wjx  reason: default package */
/* loaded from: classes7.dex */
public class wjx implements dbrn<dooq, djym> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ djym a(dooq dooqVar) {
        dooq dooqVar2 = dooqVar;
        djyl bZ = djym.f.bZ();
        dsrj<dpce> dsrjVar = dooqVar2.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djym djymVar = (djym) bZ.b;
        djymVar.b();
        dsod.bv(dsrjVar, djymVar.b);
        if ((dooqVar2.a & 8) != 0) {
            doui douiVar = dooqVar2.c;
            if (douiVar == null) {
                douiVar = doui.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djym djymVar2 = (djym) bZ.b;
            douiVar.getClass();
            djymVar2.c = douiVar;
            djymVar2.a |= 1;
        }
        if ((dooqVar2.a & 16) != 0) {
            wka wkaVar = new wka();
            dooy dooyVar = dooqVar2.d;
            if (dooyVar == null) {
                dooyVar = dooy.g;
            }
            djys a = wkaVar.a(dooyVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djym djymVar3 = (djym) bZ.b;
            a.getClass();
            djymVar3.d = a;
            djymVar3.a |= 2;
        }
        for (dopa dopaVar : dooqVar2.e) {
            djyu a2 = new wkb().a(dopaVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djym djymVar4 = (djym) bZ.b;
            a2.getClass();
            dsrj<djyu> dsrjVar2 = djymVar4.e;
            if (!dsrjVar2.a()) {
                djymVar4.e = dsqw.cl(dsrjVar2);
            }
            djymVar4.e.add(a2);
        }
        return bZ.bK();
    }
}
