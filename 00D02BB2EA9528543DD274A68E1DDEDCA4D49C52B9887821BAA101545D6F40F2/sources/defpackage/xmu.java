package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xmu  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class xmu implements dbrn {
    static final dbrn a = new xmu();

    private xmu() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dpgw dpgwVar = (dpgw) obj;
        drii bZ = drij.e.bZ();
        String str = dpgwVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drij drijVar = (drij) bZ.b;
        str.getClass();
        drijVar.a |= 1;
        drijVar.b = str;
        if ((dpgwVar.a & 128) != 0) {
            dnoh dnohVar = dpgwVar.i;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            dpum h = akqq.e(dnohVar).h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drij drijVar2 = (drij) bZ.b;
            h.getClass();
            drijVar2.d = h;
            drijVar2.a |= 4;
        }
        akqi f = akqi.f(dpgwVar.n);
        if (f != null) {
            dpsn i = f.i();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drij drijVar3 = (drij) bZ.b;
            i.getClass();
            drijVar3.c = i;
            drijVar3.a |= 2;
        }
        return bZ.bK();
    }
}
