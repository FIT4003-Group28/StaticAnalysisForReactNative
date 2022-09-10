package defpackage;
/* compiled from: PG */
/* renamed from: bexz  reason: default package */
/* loaded from: classes3.dex */
public class bexz {
    private static final dpov c;
    private final btvo d;
    private final btrg e;
    private final axwi f;
    public int b = 1;
    @dzsi
    public azzu a = null;

    static {
        dpou bZ = dpov.f.bZ();
        dprc dprcVar = dprc.STARRED_ENTITY_LIST;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpov dpovVar = (dpov) bZ.b;
        dpovVar.c = dprcVar.f;
        dpovVar.a |= 2;
        dppw bZ2 = dppz.c.bZ();
        dppy dppyVar = dppy.PLACE_ENTITY_LIST_ITEM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dppz dppzVar = (dppz) bZ2.b;
        dppzVar.b = dppyVar.e;
        dppzVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpov dpovVar2 = (dpov) bZ.b;
        dppz bK = bZ2.bK();
        bK.getClass();
        dpovVar2.b();
        dpovVar2.d.add(bK);
        dpqj dpqjVar = dpqj.LOCAL_FOLLOWING;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpov dpovVar3 = (dpov) bZ.b;
        dpovVar3.e = dpqjVar.j;
        dpovVar3.a |= 4;
        c = bZ.bK();
    }

    public bexz(btvo btvoVar, btrg btrgVar, axwi axwiVar, @dzsi bexy bexyVar) {
        this.e = btrgVar;
        this.d = btvoVar;
        this.f = axwiVar;
        dehn<baad> i = axwiVar.i(baab.LOCAL_FOLLOWING_STARRED_PLACES);
        if (i == null) {
            return;
        }
        deha.q(i, new bexx(this, bexyVar, this), dege.a);
    }

    public final boolean a() {
        return this.d.getPlaceSheetParameters().f();
    }

    public final boolean b() {
        azzu azzuVar = this.a;
        return azzuVar != null && azzuVar.t() == baac.SHARED;
    }

    @dzsi
    public final baal c(ilo iloVar) {
        azzu azzuVar = this.a;
        if (azzuVar == null) {
            return null;
        }
        return this.f.d(azzuVar, iloVar);
    }

    public final boolean d(ilo iloVar) {
        azzu azzuVar = this.a;
        if (azzuVar == null) {
            return false;
        }
        return e(this.f.d(azzuVar, iloVar));
    }

    public final boolean e(baal baalVar) {
        azzu azzuVar = this.a;
        return azzuVar != null && azzuVar.g(baalVar);
    }

    public final boolean f(baal baalVar) {
        azzu azzuVar = this.a;
        if (azzuVar == null) {
            return false;
        }
        azzuVar.b(baalVar);
        return h();
    }

    public final boolean g(baal baalVar) {
        azzu azzuVar = this.a;
        return azzuVar != null && azzuVar.e(baalVar) && h();
    }

    public final boolean h() {
        azzu azzuVar = this.a;
        if (azzuVar == null) {
            return false;
        }
        this.f.j(azzuVar);
        return true;
    }

    public final void i(boolean z, degu<dpri> deguVar) {
        dpqn dpqnVar;
        btrg btrgVar = this.e;
        dpov dpovVar = c;
        if (z) {
            dpqnVar = dpqn.READABLE_ENTITY_LIST;
        } else {
            dpqnVar = dpqn.PRIVATE_ENTITY_LIST;
        }
        deha.q(btrgVar.c(dpovVar, dpqnVar), deguVar, dege.a);
    }
}
