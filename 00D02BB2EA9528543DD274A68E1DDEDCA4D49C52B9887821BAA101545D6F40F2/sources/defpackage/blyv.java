package defpackage;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: blyv  reason: default package */
/* loaded from: classes3.dex */
public class blyv extends blxc {
    public static final /* synthetic */ int v = 0;
    private static final dcdn<dgka, Integer> w;
    private static final dcdn<dspd, ddho> x;
    private final dzsj<akfa> A;
    private final bvrb B;
    @dzsi
    private final blye C;
    @dzsi
    private View.OnTouchListener D;
    @dzsi
    private View.OnTouchListener E;
    private final angp G;
    private cqss H;
    public final blpg d;
    public final Activity e;
    public final cjqy f;
    public final cqat g;
    public final String h;
    public final bqji i;
    @dzsi
    blvu j;
    blzf k;
    @dzsi
    public final String l;
    @dzsi
    public cqfc m;
    public cqfc n;
    @dzsi
    public final akqi r;
    public final blpk s;
    public final blzs t;
    private final blwj y;
    private final dzsj<blpp> z;
    public float o = 0.0f;
    public float p = 0.0f;
    public float q = 0.0f;
    private boolean F = false;
    public int u = 0;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dgka.AIRPORT, 2131231643);
        dcdgVar.f(dgka.HOTEL_OR_INN, 2131231656);
        dcdgVar.f(dgka.ATM_OR_BANK, 2131231672);
        dcdgVar.f(dgka.ATTRACTION, 2131231644);
        dcdgVar.f(dgka.BAR_OR_WINERY, 2131231645);
        dcdgVar.f(dgka.CAFE, 2131231646);
        dcdgVar.f(dgka.CAR_WASH, 2131231647);
        dcdgVar.f(dgka.CONVENIENCE_STORE, 2131231648);
        dcdgVar.f(dgka.BEVERAGE_OR_LIQUOR_STORE, 2131231649);
        dcdgVar.f(dgka.FLORIST_OR_GARDEN, 2131231651);
        dcdgVar.f(dgka.GAS_STATION, 2131231652);
        dcdgVar.f(dgka.GROCERIES_OR_PRODUCE, 2131231653);
        dcdgVar.f(dgka.HOSPITAL_OR_MEDICAL_CENTER, 2131231655);
        dcdgVar.f(dgka.LAUNDRY, 2131231657);
        dcdgVar.f(dgka.MALL_OR_RETAIL, 2131231659);
        dcdgVar.f(dgka.MOVIE_OR_THEATER, 2131231660);
        dcdgVar.f(dgka.LIBRARY_OR_BOOKSTORE, 2131231658);
        dcdgVar.f(dgka.PARKING_LOT, Integer.valueOf((int) R.drawable.ic_qu_local_parking));
        dcdgVar.f(dgka.PHARMACY, 2131231665);
        dcdgVar.f(dgka.PIZZA, 2131231666);
        dcdgVar.f(dgka.POST_OFFICE, 2131231667);
        dcdgVar.f(dgka.PRINT_SHOP_OR_OFFICE_SUPPLY, 2131231668);
        dcdgVar.f(dgka.RESTAURANT, 2131231669);
        dcdgVar.f(dgka.SHIPPING, 2131231675);
        dcdgVar.f(dgka.TAXI, 2131231676);
        dcdgVar.f(dgka.EDUCATION, 2131231671);
        dcdgVar.f(dgka.OFFICE_OR_CORPORATE, 2131231661);
        dcdgVar.f(dgka.SUBWAY, 2131231764);
        dcdgVar.f(dgka.TRAIN_STATION, 2131231739);
        dcdgVar.f(dgka.BUS_STATION, 2131231737);
        dcdgVar.f(dgka.FERRY_OR_BOATING, 2131231622);
        dcdgVar.f(dgka.MOUNTAIN_OR_TRAILS, 2131231757);
        w = dcdgVar.b();
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(dspd.B("unsure"), dtxz.u);
        dcdgVar2.f(dspd.B("satisfaction_negative"), dtxz.x);
        dcdgVar2.f(dspd.B("satisfaction_neutral"), dtxz.y);
        dcdgVar2.f(dspd.B("satisfaction_positive"), dtxz.z);
        x = dcdgVar2.b();
    }

    public blyv(blzf blzfVar, @dzsi blvu blvuVar, @dzsi String str, @dzsi akqi akqiVar, blpk blpkVar, String str2, Activity activity, blzs blzsVar, blye blyeVar, angp angpVar, blpg blpgVar, dzsj<akfa> dzsjVar, cjqy cjqyVar, bvrb bvrbVar, dzsj<blpp> dzsjVar2, cqat cqatVar, bqji bqjiVar, blwk blwkVar) {
        this.e = activity;
        this.z = dzsjVar2;
        this.A = dzsjVar;
        this.f = cjqyVar;
        this.B = bvrbVar;
        this.y = blwkVar.a(str2);
        this.d = blpgVar;
        this.C = blyeVar;
        this.j = blvuVar;
        this.l = str;
        this.r = akqiVar;
        this.s = blpkVar;
        this.t = blzsVar;
        this.G = angpVar;
        this.k = blzfVar;
        this.g = cqatVar;
        this.h = str2;
        this.i = bqjiVar;
    }

    public static ViewPropertyAnimator aB(View view, long j, long j2, TimeInterpolator timeInterpolator) {
        return view.animate().setStartDelay(j).setDuration(j2).setInterpolator(timeInterpolator).translationY(0.0f);
    }

    private final void aC(blvu blvuVar) {
        this.B.b(new blyo(this, this.A.a().o(), blvuVar), bvrj.BACKGROUND_THREADPOOL);
    }

    @dzsi
    private final dgkm aD(int i) {
        if (!ab().booleanValue() || this.j.n != blvt.MULTIPLE_CHOICE || i < 0 || i >= this.j.b().size()) {
            return null;
        }
        return this.j.b().get(i);
    }

    @dzsi
    private final dcdc<dgkm> aE() {
        if (av().booleanValue()) {
            return this.j.b();
        }
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqss B() {
        return this.H;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence C() {
        return (!ab().booleanValue() || this.b) ? "" : this.j.j;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence D() {
        return (!ab().booleanValue() || this.b) ? "" : this.j.k;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence E() {
        return (!ab().booleanValue() || this.b) ? "" : this.j.h;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence F() {
        return (!ab().booleanValue() || this.b) ? "" : this.j.i;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean G() {
        return ab();
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqtd H() {
        int i = 2131231715;
        if (ab().booleanValue() && !this.b) {
            i = aA(this.j);
        }
        return cqrt.g(i, B());
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqfc I() {
        return this.m;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqfc J() {
        return this.n;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean K() {
        boolean z = false;
        if (ab().booleanValue()) {
            blvu blvuVar = this.j;
            if (blvuVar.g && !dbtw.a(blvuVar.b)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Float L() {
        return Float.valueOf(this.o);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Float M() {
        return Float.valueOf(this.p);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean N() {
        return Boolean.valueOf(this.t.b());
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqtv O() {
        return cqrp.c(this.t.j);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Float P() {
        return Float.valueOf(this.t.h);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean Q(int i) {
        boolean z = false;
        if (av().booleanValue() && this.j.b().size() == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean R() {
        boolean z = false;
        if (ab().booleanValue() && this.j.n == blvt.RATING) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean S() {
        boolean z = false;
        if (ab().booleanValue() && this.j.n == blvt.REVIEW) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence T() {
        if (R().booleanValue()) {
            btlu j = this.A.a().j();
            String v2 = (j == null || !btlu.i(j).equals(btlt.GOOGLE)) ? "" : j.v();
            if (!dbsj.d(v2)) {
                return this.e.getString(R.string.TODO_LIST_ONE_TAP_DISCLAIMER, new Object[]{v2});
            }
            return this.e.getString(R.string.POSTING_PUBLICLY);
        }
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence U() {
        if (S().booleanValue()) {
            return this.e.getString(R.string.WRITE_REVIEW_HINT);
        }
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public jez V() {
        return new jez(this) { // from class: blyl
            private final blyv a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                blyv blyvVar = this.a;
                if (blyvVar.R().booleanValue()) {
                    blyvVar.u = (int) f;
                    dnqh a = bzwi.a(blyvVar.s);
                    if (cjqmVar.a().a()) {
                        dsqp dsqpVar = (dsqp) a.cu(5);
                        dsqpVar.bC(a);
                        dnqg dnqgVar = (dnqg) dsqpVar;
                        String b = cjqmVar.a().b();
                        if (dnqgVar.c) {
                            dnqgVar.bF();
                            dnqgVar.c = false;
                        }
                        dnqh dnqhVar = (dnqh) dnqgVar.b;
                        dnqh dnqhVar2 = dnqh.p;
                        b.getClass();
                        dnqhVar.a |= 2;
                        dnqhVar.c = b;
                        a = dnqgVar.bK();
                    }
                    cjqy cjqyVar = blyvVar.f;
                    cjtk[] cjtkVarArr = new cjtk[1];
                    blvu blvuVar = blyvVar.j;
                    dned bZ = dnee.e.bZ();
                    dnjs dnjsVar = dnjs.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnee dneeVar = (dnee) bZ.b;
                    dnjsVar.getClass();
                    dneeVar.c = dnjsVar;
                    dneeVar.b = 3;
                    dnee dneeVar2 = (dnee) bZ.b;
                    dneeVar2.d = 1;
                    dneeVar2.a |= 8;
                    cjtkVarArr[0] = new blwf(blvuVar, bZ.bK(), blyvVar.h, blyvVar.g, blyvVar.j.c(), blyvVar.f.b());
                    cjqyVar.u(cjtkVarArr);
                    bqji bqjiVar = blyvVar.i;
                    bqku c = bqla.c();
                    bqkw k = bqkx.k();
                    k.c(blyvVar.r);
                    k.f(blyvVar.u);
                    k.e("");
                    c.b(k.h());
                    bqky h = bqkz.h();
                    h.g(chbv.NEVER_SHOW);
                    h.d(a);
                    c.c(h.a());
                    bqla d = c.d();
                    ily ilyVar = new ily();
                    ilyVar.j(blyvVar.r);
                    bqjiVar.c(d, bwrs.a(ilyVar.d()), null);
                    blyvVar.ar(0, false);
                    blyvVar.k.p(4);
                }
            }
        };
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl W() {
        blzf blzfVar = this.k;
        ily ilyVar = new ily();
        ilyVar.j(this.r);
        ilyVar.F(C().toString());
        bwrs<ilo> a = bwrs.a(ilyVar.d());
        bqjf r = bqjh.r();
        r.j(this.u);
        r.n(chbv.NEVER_SHOW);
        r.f(bzwi.a(this.s));
        bqjh o = r.o();
        blvu blvuVar = this.j;
        blzfVar.b.R(a, o);
        blzfVar.d(blvuVar, false);
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl X() {
        if (ab().booleanValue()) {
            cjqy cjqyVar = this.f;
            cjte cjteVar = new cjte(deaf.SWIPE);
            cjta b = cjtd.b();
            b.d = dtxz.t;
            b.b = this.l;
            b.g(this.j.d);
            cjqyVar.m(cjteVar, b.a());
            if (R().booleanValue() && this.k.g().booleanValue()) {
                this.k.p(5);
            }
            this.k.p(5);
        }
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean Y() {
        boolean z = false;
        if (ab().booleanValue()) {
            boolean z2 = this.j.o;
            Boolean bool = false;
            if (bool.booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public int aA(blvu blvuVar) {
        dgka dgkaVar = blvuVar.l;
        dcdn<dgka, Integer> dcdnVar = w;
        if (dcdnVar.containsKey(dgkaVar)) {
            return dcdnVar.get(dgkaVar).intValue();
        }
        return 2131231715;
    }

    @Override // defpackage.blxc
    public Boolean ab() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.blxc
    public Boolean ad() {
        return false;
    }

    public void an(@dzsi blvu blvuVar, boolean z) {
        this.j = blvuVar;
        this.F = z;
    }

    @Override // defpackage.blxc, defpackage.blwp
    /* renamed from: ao */
    public String b() {
        return (!ab().booleanValue() || this.b) ? "" : this.j.m;
    }

    @Override // defpackage.blxc, defpackage.blwp
    /* renamed from: ap */
    public String d(Integer num) {
        dgkm aD = aD(num.intValue());
        return aD == null ? "" : aD.d;
    }

    @dzsi
    public cjtd aq() {
        if (ab().booleanValue()) {
            cjta b = cjtd.b();
            b.d = dtxz.d;
            b.b = this.l;
            b.g(this.j.d);
            return b.a();
        }
        return null;
    }

    public final void ar(int i, boolean z) {
        blye blyeVar = this.C;
        if (blyeVar != null) {
            String b = b();
            dcdc<dgkm> aE = aE();
            CharSequence C = C();
            CharSequence D = D();
            cqss B = B();
            cqtd H = H();
            boolean b2 = this.t.b();
            blzs blzsVar = this.t;
            blyeVar.ap(b, aE, C, D, B, H, i, b2, blzsVar.j, blzsVar.h, blzsVar.i, z, this.o, this.p);
        }
    }

    public void as() {
        blye blyeVar = this.C;
        String b = b();
        dcdc<dgkm> aE = aE();
        CharSequence C = C();
        CharSequence D = D();
        cqss B = B();
        cqtd H = H();
        boolean b2 = this.t.b();
        blzs blzsVar = this.t;
        blyeVar.ap(b, aE, C, D, B, H, -1, b2, blzsVar.j, blzsVar.h, blzsVar.i, false, this.o, this.p);
        this.b = true;
        blzf blzfVar = this.k;
        if (blzfVar.a.a() != null) {
            blzfVar.e();
        }
        blzfVar.b.I();
    }

    public cqkl at() {
        this.b = false;
        this.z.a().e();
        this.k.e();
        return cqkl.a;
    }

    @dzsi
    public blwp au() {
        return this.C;
    }

    public Boolean av() {
        boolean z = false;
        if (ab().booleanValue() && this.j.n == blvt.MULTIPLE_CHOICE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void aw() {
        this.b = true;
    }

    public void ax(cqss cqssVar) {
        this.H = cqssVar;
    }

    public void ay(boolean z) {
        blzs blzsVar = this.t;
        blzsVar.a();
        blzsVar.j = 0;
        blzsVar.i = 0.0f;
        blzsVar.f = false;
        this.m = new blyt(this, this.F, z);
        blvu blvuVar = this.j;
        if (blvuVar != null) {
            this.f.u(new blwg(this.h, blvuVar, this.k.m(), this.k.d, this.F, this.g, this.j.c(), this.f.b()));
        }
    }

    @dzsi
    public akqi az() {
        return this.r;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean c(Integer num) {
        dgkm aD = aD(num.intValue());
        boolean z = false;
        if (aD != null && aD.d.length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean e() {
        if (!av().booleanValue()) {
            return false;
        }
        if (!cqhl.a(this.e) || this.j.b().size() <= 3) {
            for (int i = 0; i < this.j.b().size(); i++) {
                String d = d(Integer.valueOf(i));
                if (d != null && d.trim().length() > 8) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqtd f(Integer num) {
        cqtd b;
        dgkm aD = aD(num.intValue());
        if (aD == null || (b = blzn.b(aD, irg.b())) == null) {
            return null;
        }
        cqtd b2 = blzn.b(aD, B());
        return b2 == null ? b : new blym(new Object[]{b2, b}, b2, b);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean h(Integer num) {
        boolean z = false;
        if (f(num) != null && !j(num).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence i(Integer num) {
        dgkm aD = aD(num.intValue());
        if (aD == null) {
            return null;
        }
        return aD.f;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean j(Integer num) {
        CharSequence i = i(num);
        boolean z = false;
        if (i != null && !dbtw.a(i.toString())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean k(Integer num) {
        boolean z = false;
        if (!j(num).booleanValue() && !h(num).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqss l(Integer num) {
        if (aD(num.intValue()) == null) {
            return null;
        }
        return new cqus(this.e, B(), irg.H());
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqtd m() {
        cqss cqssVar = this.H;
        if (cqssVar == null) {
            cqssVar = irg.H();
        }
        return irn.ad(cqsu.a(cqssVar, 0.2f));
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cjtd n() {
        if (ab().booleanValue()) {
            cjta b = cjtd.b();
            b.b = this.l;
            b.g(this.j.d);
            b.d = dtxz.c;
            return b.a();
        }
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cjtd o(Integer num) {
        dgkm aD = aD(num.intValue());
        if (!ab().booleanValue() || aD == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.b = this.l;
        b.g(aD.b);
        dcdn<dspd, ddho> dcdnVar = x;
        if (dcdnVar.containsKey(aD.c)) {
            b.d = dcdnVar.get(aD.c);
        } else {
            b.d = dtxz.s;
        }
        return b.a();
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cjtd p() {
        if (ab().booleanValue()) {
            cjta b = cjtd.b();
            b.d = dtxz.o;
            b.b = this.l;
            b.g(this.j.d);
            return b.a();
        }
        return null;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl r(Integer num) {
        int a;
        if (ab().booleanValue()) {
            if (av().booleanValue()) {
                aC(this.j);
                dgkm aD = aD(num.intValue());
                dspd dspdVar = aD == null ? null : aD.c;
                this.y.a(this.j, dspdVar, this.s);
                blwh o = this.z.a().o();
                dspd dspdVar2 = this.j.c;
                o.a();
                o.a.put(dspdVar2, dspdVar);
            }
            ar(num.intValue(), false);
            blzf blzfVar = this.k;
            dgkm aD2 = aD(num.intValue());
            int i = 1;
            if (aD2 != null && (a = dgkl.a(aD2.g)) != 0) {
                i = a;
            }
            blzfVar.q(i);
        }
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl s() {
        if (ab().booleanValue()) {
            aC(this.j);
            blwj blwjVar = this.y;
            blvu blvuVar = this.j;
            blpk blpkVar = this.s;
            dned bZ = dnee.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnee dneeVar = (dnee) bZ.b;
            dneeVar.d = 2;
            dneeVar.a |= 8;
            blwjVar.b(blvuVar, bZ.bK(), blpkVar);
            this.k.p(5);
            if (S().booleanValue()) {
                this.k.p(5);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl v() {
        blvu blvuVar = this.j;
        if (blvuVar == null) {
            return cqkl.a;
        }
        this.f.u(new blwf(blvuVar, 3, this.h, this.g, blvuVar.c(), this.f.b()));
        angp angpVar = this.G;
        dbpy<Object> dbpyVar = dbpy.a;
        dbpy<Object> dbpyVar2 = dbpy.a;
        dvya bZ = dvyw.bv.bZ();
        String str = this.j.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        str.getClass();
        dvywVar.a |= 4;
        dvywVar.g = str;
        angpVar.g(dbpyVar, dbpyVar2, bZ.bK(), dbpy.a, bzwi.b(this.s), dbpy.a, dbpy.a);
        blzf blzfVar = this.k;
        blzfVar.a.f();
        blzfVar.c = true;
        blzfVar.b.H();
        as();
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public View.OnTouchListener x() {
        if (this.D == null) {
            this.D = new blww(this.e, new blyn(this));
        }
        return this.D;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public View.OnTouchListener y() {
        if (this.E == null) {
            this.E = new blyq(this);
        }
        return this.E;
    }
}
