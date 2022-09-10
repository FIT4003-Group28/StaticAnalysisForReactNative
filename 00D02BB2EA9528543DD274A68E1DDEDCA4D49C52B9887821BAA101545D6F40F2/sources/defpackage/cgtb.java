package defpackage;

import java.util.Collection;
/* renamed from: cgtb  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgtb implements dbrn {
    static final dbrn a = new cgtb();

    private cgtb() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Collection collection = (Collection) obj;
        dbsk.a(!collection.isEmpty());
        cgsk cgskVar = (cgsk) dcft.p(collection, 0);
        dvyw c = cgskVar.c();
        dwqc b = cgskVar.b();
        dwpc dwpcVar = cgskVar.a().b;
        if (dwpcVar == null) {
            dwpcVar = dwpc.e;
        }
        String str = dwpcVar.b;
        dwpc dwpcVar2 = cgskVar.a().b;
        if (dwpcVar2 == null) {
            dwpcVar2 = dwpc.e;
        }
        dpum dpumVar = dwpcVar2.c;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        return new cgsn(c, b, str, akqq.f(dpumVar).i(), dcdc.r(collection));
    }
}
