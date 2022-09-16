package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azkb  reason: default package */
/* loaded from: classes3.dex */
final class azkb implements Callable<baad> {
    final /* synthetic */ baab a;
    final /* synthetic */ azkc b;

    public azkb(azkc azkcVar, baab baabVar) {
        this.b = azkcVar;
        this.a = baabVar;
    }

    @Override // java.util.concurrent.Callable
    @dzsi
    public final /* bridge */ /* synthetic */ baad call() {
        if (this.a == baab.LOCAL_FOLLOWING_STARRED_PLACES) {
            dbsg<azxi> f = this.b.c.a().f();
            if (!f.a()) {
                return null;
            }
            return azzu.aq(f.b());
        } else if (this.a == baab.LOCAL_DEAL) {
            dbsg<azxi> g = this.b.c.a().g();
            if (!g.a()) {
                return null;
            }
            return azzu.aq(g.b());
        } else {
            axxa a = this.b.c.a();
            dpou bZ = dpov.f.bZ();
            baab baabVar = this.a;
            baac baacVar = baac.PRIVATE;
            drcs drcsVar = drcs.UNKNOWN_SHARING_STATE;
            int ordinal = baabVar.ordinal();
            dprc dprcVar = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? dprc.UNKNOWN_ENTITY_LIST_TYPE : dprc.CUSTOM_ENTITY_LIST : dprc.STARRED_ENTITY_LIST : dprc.WANT_TO_GO_ENTITY_LIST : dprc.FAVORITES_ENTITY_LIST;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpov dpovVar = (dpov) bZ.b;
            dpovVar.c = dprcVar.f;
            dpovVar.a |= 2;
            dpqj dpqjVar = dpqj.UNIVERSAL_ENTITY_LIST;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpov dpovVar2 = (dpov) bZ.b;
            dpovVar2.e = dpqjVar.j;
            dpovVar2.a |= 4;
            dppw bZ2 = dppz.c.bZ();
            dppy dppyVar = dppy.PLACE_ENTITY_LIST_ITEM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dppz dppzVar = (dppz) bZ2.b;
            dppzVar.b = dppyVar.e;
            dppzVar.a |= 1;
            dppz bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpov dpovVar3 = (dpov) bZ.b;
            bK.getClass();
            dpovVar3.b();
            dpovVar3.d.add(bK);
            dbsg<azxi> e = a.e(bZ.bK());
            if (!e.a()) {
                return null;
            }
            azzu aq = azzu.aq(e.b());
            this.b.t(aq);
            return aq;
        }
    }
}
