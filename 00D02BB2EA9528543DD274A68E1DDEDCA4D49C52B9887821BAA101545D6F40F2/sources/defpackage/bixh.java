package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bixh  reason: default package */
/* loaded from: classes3.dex */
public class bixh implements biwg {
    public static final dcdn<dnwv, Integer> a;
    public static final dcep<dnwv> b;
    private static final dcdn<dnwv, ddho> e;
    private static final dcdn<dnwv, Integer> f;
    private static final cjtd g;
    public final gga c;
    public int d;
    private final beas h;
    private final dnwv i;
    @dzsi
    private bear k;
    @dzsi
    private cqtd m;
    private dbty<CharSequence> j = bixe.a;
    private cjtd l = g;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dnwv.ORDER_FOOD, dtxy.kB);
        dcdgVar.f(dnwv.RESTAURANT_RESERVATION, dtyi.cU);
        dcdgVar.f(dnwv.SEARCH_INVENTORY, dtxy.mi);
        dcdgVar.f(dnwv.SHOP_ONLINE, dtxy.mu);
        e = dcdgVar.b();
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(dnwv.ORDER_FOOD, 2131231675);
        dcdgVar2.f(dnwv.RESTAURANT_RESERVATION, 2131232260);
        dcdgVar2.f(dnwv.SEARCH_INVENTORY, 2131231637);
        dcdgVar2.f(dnwv.SHOP_ONLINE, 2131231653);
        f = dcdgVar2.b();
        dcdg p = dcdn.p();
        p.f(dnwv.ORDER_FOOD, Integer.valueOf((int) R.string.PLACE_ACTIONS_ORDER_FOOD));
        p.f(dnwv.RESTAURANT_RESERVATION, Integer.valueOf((int) R.string.PLACE_RESERVATION));
        p.f(dnwv.SHOP_ONLINE, Integer.valueOf((int) R.string.PLACE_ACTIONS_SHOP_ONLINE));
        a = p.b();
        b = dcep.B(dnwv.SEARCH_INVENTORY);
        g = cjtd.a(dtxy.mC);
    }

    public bixh(gga ggaVar, beas beasVar, dnwv dnwvVar) {
        this.c = ggaVar;
        this.h = beasVar;
        this.i = dnwvVar;
    }

    private final void p() {
        this.d = 0;
        this.j = bixf.a;
        this.m = null;
        this.k = null;
        this.l = g;
    }

    @Override // defpackage.biwg
    public Boolean a() {
        return Boolean.valueOf(this.d <= 0);
    }

    @Override // defpackage.biwg
    public Boolean b() {
        return false;
    }

    @Override // defpackage.biwg
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.biwg
    @dzsi
    public cqtd d() {
        return this.m;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.valueOf(this.d > 0);
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        bear bearVar = this.k;
        if (bearVar != null) {
            bearVar.b(b.contains(this.i));
        }
        return cqkl.a;
    }

    @Override // defpackage.biwg
    public jic g() {
        return null;
    }

    @Override // defpackage.biwg
    public CharSequence h() {
        return this.j.a();
    }

    @Override // defpackage.biwg
    public Integer i() {
        return 1;
    }

    @Override // defpackage.biwg
    public dcdc<biwf> j() {
        return dcdc.e();
    }

    @Override // defpackage.biwg
    public CharSequence k() {
        return this.j.a();
    }

    @Override // defpackage.biwg
    public Boolean l() {
        return false;
    }

    @Override // defpackage.biwg
    public cjtd m() {
        return this.l;
    }

    public void n(ilo iloVar) {
        cjtd a2;
        p();
        this.i.equals(dnwv.SHOP_ONLINE);
        dnwv dnwvVar = this.i;
        dnxj dnxjVar = iloVar.h().au;
        if (dnxjVar == null) {
            dnxjVar = dnxj.b;
        }
        for (dnwx dnwxVar : dnxjVar.a) {
            dnwv b2 = dnwv.b(dnwxVar.b);
            if (b2 == null) {
                b2 = dnwv.UNKNOWN_ACTION_TYPE;
            }
            if (b2 == dnwvVar && (dnwxVar.a & 64) != 0) {
                return;
            }
        }
        final dnwx T = iloVar.T(this.i);
        int size = T != null ? T.c.size() : 0;
        this.d = size;
        if (size <= 0) {
            return;
        }
        if (b.contains(this.i)) {
            this.d = 1;
        }
        final dnwv dnwvVar2 = this.i;
        dbsk.s(T);
        this.j = new dbty(this, dnwvVar2, T) { // from class: bixg
            private final bixh a;
            private final dnwv b;
            private final dnwx c;

            {
                this.a = this;
                this.b = dnwvVar2;
                this.c = T;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bixh bixhVar = this.a;
                dnwv dnwvVar3 = this.b;
                dnwx dnwxVar2 = this.c;
                if (bixh.a.containsKey(dnwvVar3) || bixh.b.contains(dnwvVar3)) {
                    dnxh dnxhVar = dnwxVar2.c.get(0).a;
                    if (dnxhVar == null) {
                        dnxhVar = dnxh.c;
                    }
                    String str = dnxhVar.a;
                    if (bixh.b.contains(dnwvVar3)) {
                        return str;
                    }
                    if (!bixh.a.containsKey(dnwvVar3)) {
                        return "";
                    }
                    bvsx bvsxVar = new bvsx(bixhVar.c.getResources());
                    bvsu c = bvsxVar.c(bixh.a.get(dnwvVar3).intValue());
                    if (bixhVar.d == 1 && !dbsj.d(str)) {
                        bvsv a3 = bvsxVar.a(" · ");
                        a3.f(bvsxVar.a(str));
                        a3.m(R.color.qu_daynight_black_alpha_54);
                        c.f(a3);
                    }
                    return c.c();
                }
                return "";
            }
        };
        dnwv dnwvVar3 = this.i;
        dcdn<dnwv, Integer> dcdnVar = f;
        this.m = !dcdnVar.containsKey(dnwvVar3) ? null : cqrt.g(dcdnVar.get(dnwvVar3).intValue(), ibm.x());
        cjtd bZ = iloVar.bZ();
        dnwv dnwvVar4 = this.i;
        dcdn<dnwv, ddho> dcdnVar2 = e;
        if (!dcdnVar2.containsKey(dnwvVar4)) {
            a2 = g;
        } else {
            cjta c = cjtd.c(bZ);
            c.d = dcdnVar2.get(dnwvVar4);
            a2 = c.a();
        }
        this.l = a2;
        this.k = this.h.a(T);
    }

    public void o() {
        p();
    }
}
