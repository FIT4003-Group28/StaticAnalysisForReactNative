package defpackage;
/* compiled from: PG */
/* renamed from: anbi  reason: default package */
/* loaded from: classes.dex */
public final class anbi {
    public final btvo a;
    public final cjqq b;
    dbsg<dpsv> c;
    @dzsi
    dpsv d = null;
    private final bvjj e;
    private final akox f;

    public anbi(btvo btvoVar, bvjj bvjjVar, akox akoxVar, cjqq cjqqVar) {
        this.c = dbpy.a;
        this.a = btvoVar;
        this.e = bvjjVar;
        this.f = akoxVar;
        this.b = cjqqVar;
        dpsv dpsvVar = (dpsv) bvjjVar.H(bvjk.dU, dpsv.class, dpsv.UNKNOWN_VERTICAL);
        this.c = (dpsvVar == null || dpsvVar == dpsv.UNKNOWN_VERTICAL) ? dbpy.a : dbsg.i(dpsvVar);
    }

    public final void a() {
        if (!this.c.a() || this.c.b() != dpsv.DINING || d()) {
            if (!this.c.a() && this.d == null) {
                return;
            }
            this.c = dbpy.a;
            b();
            c();
        }
    }

    public final void b() {
        if (!this.c.a() || this.c.b() == dpsv.UNKNOWN_VERTICAL) {
            this.e.P(bvjk.dU);
        } else {
            this.e.ai(bvjk.dU, this.c.b());
        }
    }

    public final void c() {
        akry akryVar = null;
        if (!this.c.a() || this.c.b() == this.d) {
            if (this.c.a()) {
                return;
            }
            this.f.aj().B();
            this.d = null;
            return;
        }
        dpsv dpsvVar = dpsv.UNKNOWN_VERTICAL;
        int ordinal = this.c.b().ordinal();
        if (ordinal == 1) {
            akryVar = akry.EXPLORE_EAT_AND_DRINK;
        } else if (ordinal == 2) {
            akryVar = akry.EXPLORE_PLAY;
        } else if (ordinal == 3) {
            akryVar = akry.EXPLORE_SHOP;
        } else if (ordinal == 4) {
            akryVar = akry.EXPLORE_SERVICES;
        }
        if (akryVar == null) {
            return;
        }
        this.f.aj().A(akryVar);
        this.d = this.c.b();
    }

    public final boolean d() {
        return this.a.getSearchParameters().l() || this.a.getSearchParameters().m();
    }
}
