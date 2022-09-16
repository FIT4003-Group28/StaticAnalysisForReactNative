package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asdb  reason: default package */
/* loaded from: classes2.dex */
public class asdb extends asdi implements asha {
    private final cqat A;
    private final vwv B;
    private final ahjq C;
    private final bvjj D;
    private final dxio<awps> E;
    private final bnjv F;
    private final amfi G;
    private final brwl H;
    private final cfpe I;
    private final View.OnClickListener J;
    public final ascw a;
    public final cjta b;
    public final Resources c;
    private final ddom d;
    @dzsi
    private final amub e;
    private final amvh f;
    private cqtd g;
    @dzsi
    private cqtd h;
    private String i;
    private CharSequence j;
    @dzsi
    private String k;
    @dzsi
    private jav l;
    @dzsi
    private jba m;
    @dzsi
    private brve n;
    private cfpd o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private jjn w;
    @dzsi
    private Map<String, asda> x;
    private final asac y;
    private final btvo z;

    public asdb(ascw ascwVar, ddom ddomVar, @dzsi dowa dowaVar, @dzsi amub amubVar, amvh amvhVar, ilo iloVar, boolean z, boolean z2, View.OnClickListener onClickListener, @dzsi Long l, Boolean bool, @dzsi String str, btvo btvoVar, bvsl bvslVar, ahjq ahjqVar, bvjj bvjjVar, Resources resources, amfi amfiVar, cqat cqatVar, brwl brwlVar, bnjv bnjvVar, vwv vwvVar, cfpe cfpeVar, bxbe bxbeVar, dxio<awps> dxioVar, asac asacVar) {
        super(ddomVar, dowaVar, bvslVar, resources);
        dqvj dqvjVar;
        this.q = true;
        this.s = true;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = jjn.COLLAPSED;
        this.a = ascwVar;
        this.d = ddomVar;
        this.e = amubVar;
        this.f = amvhVar;
        this.C = ahjqVar;
        this.D = bvjjVar;
        this.c = resources;
        this.G = amfiVar;
        this.z = btvoVar;
        this.H = brwlVar;
        this.F = bnjvVar;
        this.A = cqatVar;
        this.r = z;
        this.p = z2;
        this.B = vwvVar;
        this.I = cfpeVar;
        bxbeVar.a(dtxw.ab);
        this.E = dxioVar;
        this.b = cjtd.c(iloVar.bZ());
        this.J = onClickListener;
        this.y = asacVar;
        HashMap hashMap = new HashMap();
        this.x = hashMap;
        hashMap.put(" restaurant ", new asda(2131231669, R.drawable.arrival_card_icon_circle_bar_cafe_restaurant, R.string.NAVIGATION_ARRIVAL_TITLE_RESTAURANT));
        this.x.put(" gas station ", new asda(2131231652, R.drawable.arrival_card_icon_circle_gasstation_grocery_mall, R.string.NAVIGATION_ARRIVAL_TITLE_GAS_STATION));
        this.x.put(" grocery ", new asda(2131231653, R.drawable.arrival_card_icon_circle_gasstation_grocery_mall, R.string.NAVIGATION_ARRIVAL_TITLE_GROCERY_STORE));
        this.x.put(" bar ", new asda(2131231645, R.drawable.arrival_card_icon_circle_bar_cafe_restaurant, R.string.NAVIGATION_ARRIVAL_TITLE_BAR));
        this.x.put(" cafe ", new asda(2131231646, R.drawable.arrival_card_icon_circle_bar_cafe_restaurant, R.string.NAVIGATION_ARRIVAL_TITLE_CAFE));
        this.x.put(" hotel ", new asda(2131231656, R.drawable.arrival_card_icon_circle_hotel_parking_postoffice, R.string.NAVIGATION_ARRIVAL_TITLE_HOTEL));
        this.x.put(" outlet mall ", new asda(2131231659, R.drawable.arrival_card_icon_circle_gasstation_grocery_mall, R.string.NAVIGATION_ARRIVAL_TITLE_MALL));
        this.x.put(" parking ", new asda(R.drawable.ic_qu_local_parking, R.drawable.arrival_card_icon_circle_hotel_parking_postoffice, R.string.NAVIGATION_ARRIVAL_TITLE_PARKING));
        this.x.put(" pharmacy ", new asda(2131231665, R.drawable.arrival_card_icon_circle_pharmacy, R.string.WELCOME_TO));
        this.x.put(" post office ", new asda(2131231667, R.drawable.arrival_card_icon_circle_hotel_parking_postoffice, R.string.NAVIGATION_ARRIVAL_TITLE_POST_OFFICE));
        Y(iloVar);
        Z(iloVar);
        aa(iloVar);
        ab(iloVar);
        ac(iloVar);
        ad(iloVar);
        X(iloVar);
        this.v = btvoVar.getUgcParameters().ax();
        cfnq cfnqVar = cfnq.ARRIVAL_CARD;
        boolean z3 = this.v;
        Handler handler = new Handler();
        boolean booleanValue = bool.booleanValue();
        String str2 = null;
        if ((ddomVar.a & 2) != 0) {
            dqvjVar = dqvj.c(ddomVar.e);
            if (dqvjVar == null) {
                dqvjVar = dqvj.DRIVE;
            }
        } else {
            dqvjVar = null;
        }
        this.o = cfpeVar.a(cfnqVar, z3, handler, l, booleanValue, str, dqvjVar, new Runnable(this) { // from class: ascy
            private final asdb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        }, this.i, amvhVar.s(resources), this.k, iloVar.aj() != null ? iloVar.aj().h() : null, !akqi.a.equals(iloVar.ai()) ? iloVar.ai().o() : str2);
    }

    private final CharSequence W(boolean z) {
        if (!z) {
            return this.j;
        }
        Resources resources = this.c;
        return resources.getString(R.string.JOURNEY_TO, this.f.s(resources));
    }

    private final void X(ilo iloVar) {
        String string;
        String string2;
        Map<String, asda> map;
        this.i = "";
        if (ae()) {
            return;
        }
        if (this.f.y() && (this.f.z().a & 1) != 0 && !iloVar.bg()) {
            return;
        }
        if (!iloVar.bg()) {
            if (this.y.a) {
                string2 = this.c.getString(R.string.ARRIVING_AT);
            } else {
                string2 = this.c.getString(R.string.WELCOME_TO);
            }
            this.i = string2;
            Map<String, asda> map2 = this.x;
            if (map2 == null) {
                return;
            }
            for (String str : map2.keySet()) {
                if (af(iloVar).contains(str) && (map = this.x) != null) {
                    this.i = this.c.getString(map.get(str).c.intValue());
                    return;
                }
            }
            return;
        }
        int q = new eaph(this.A.b(), eaou.l(TimeZone.getDefault())).q();
        if (q < 4) {
            string = this.c.getString(R.string.GOOD_EVENING);
        } else if (q < 12) {
            string = this.c.getString(R.string.GOOD_MORNING);
        } else if (q < 16) {
            string = this.c.getString(R.string.GOOD_AFTERNOON);
        } else {
            string = this.c.getString(R.string.GOOD_EVENING);
        }
        this.i = string;
    }

    private final void Y(ilo iloVar) {
        if (iloVar.p == dndr.HOME) {
            this.j = this.c.getString(R.string.WELCOME_HOME);
            this.q = false;
            this.s = false;
            this.u = false;
        } else if (iloVar.p == dndr.WORK) {
            this.j = this.c.getString(R.string.COMMUTE_TO_WORK);
            this.q = false;
            this.s = false;
            this.u = false;
        } else if (!this.f.y() || (this.f.z().a & 1) == 0) {
            this.j = this.f.s(this.c);
            if (!ae()) {
                return;
            }
            this.j = this.c.getString(R.string.ARRIVAL_DASHBOARD_GENERIC_DESTINATION);
        } else {
            Resources resources = this.c;
            this.j = resources.getString(R.string.PARKED_NEAR, this.f.s(resources));
        }
    }

    private final void Z(ilo iloVar) {
        if (iloVar.p == dndr.HOME || iloVar.p == dndr.WORK) {
            this.k = null;
        } else {
            this.k = iloVar.B();
        }
    }

    private final void aa(ilo iloVar) {
        int i;
        int i2;
        Map<String, asda> map;
        Map<String, asda> map2 = this.x;
        int i3 = R.drawable.arrival_card_icon_circle_pin;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                if (af(iloVar).contains(str) && (map = this.x) != null) {
                    asda asdaVar = map.get(str);
                    i2 = asdaVar.a.intValue();
                    i = asdaVar.b.intValue();
                    break;
                }
            }
        }
        i = R.drawable.arrival_card_icon_circle_pin;
        i2 = 2131231715;
        if (this.f.y() && (this.f.z().a & 1) != 0) {
            i2 = R.drawable.ic_qu_local_parking;
            i = R.drawable.arrival_card_icon_circle_hotel_parking_postoffice;
        }
        dndr dndrVar = iloVar.p;
        if (dndrVar != null) {
            int ordinal = dndrVar.ordinal();
            if (ordinal == 1) {
                i2 = 2131231654;
            } else if (ordinal == 2) {
                i2 = 2131231777;
            } else if (ordinal == 3) {
                i2 = 2131231796;
            } else if (ordinal == 4) {
                i2 = 2131231285;
            }
            i = R.drawable.arrival_card_icon_circle_home_work;
        }
        ilo iloVar2 = (ilo) bwrs.a(iloVar).c();
        dbsk.s(iloVar2);
        amfu h = this.G.h(bhzs.a(iloVar2.bm()), asdb.class.getName(), null);
        cqtd j = h == null ? null : h.j();
        if (j != null) {
            this.g = j;
            i = -1;
        }
        if (j == null) {
            cqrt.g(i2, ibl.q());
            this.g = cqrt.g(i2, ibl.g());
        }
        if (this.g == null) {
            this.g = cqrt.g(2131231715, ibl.g());
        } else {
            i3 = i;
        }
        if (i3 != -1) {
            this.h = cqrt.f(i3);
        } else {
            this.h = null;
        }
    }

    private final void ab(ilo iloVar) {
        if (iloVar.p == dndr.HOME || iloVar.p == dndr.WORK) {
            this.t = true;
        }
    }

    private final void ac(ilo iloVar) {
        dvxn aC = iloVar.aC();
        if (!iloVar.bg() && aC != null && (aC.a & 1) != 0) {
            dwfl dwflVar = aC.b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            if ((dwflVar.a & 128) != 0) {
                dwfl dwflVar2 = aC.b;
                if (dwflVar2 == null) {
                    dwflVar2 = dwfl.w;
                }
                this.l = new ascz(this, dwflVar2, iloVar);
                return;
            }
        }
        this.l = null;
    }

    private final void ad(ilo iloVar) {
        if (iloVar.bg() || !iloVar.h) {
            this.m = null;
            return;
        }
        begh beghVar = new begh();
        beghVar.b = true;
        if (af(iloVar).contains("gas station")) {
            beghVar.a = true;
        }
        bnjs a = this.F.a(iloVar);
        a.c = this.C.a();
        a.o = beghVar;
        this.n = this.H.a(a, new Runnable(this) { // from class: ascx
            private final asdb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a();
            }
        }, null, false, false, false, null, dtxw.S, null);
        this.m = a.a();
    }

    private final boolean ae() {
        return this.f.s(this.c).equals(this.c.getString(R.string.DA_POINT_ON_MAP));
    }

    private static final String af(ilo iloVar) {
        String lowerCase = iloVar.ar().toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 2);
        sb.append(" ");
        sb.append(lowerCase);
        sb.append(" ");
        return sb.toString();
    }

    @Override // defpackage.asha
    public cqkl A() {
        ascu ascuVar = ((asct) this.a).a;
        ascuVar.q(ascuVar.f);
        return cqkl.a;
    }

    @Override // defpackage.asha
    public Boolean B() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.asha
    public Boolean C() {
        amub amubVar = this.e;
        boolean z = false;
        if (amubVar != null) {
            if (amubVar.h == dqvj.TWO_WHEELER) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.asha
    public Boolean D() {
        return Boolean.valueOf(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(Boolean bool) {
        this.r = bool.booleanValue();
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(boolean z) {
        this.p = z;
        cqkx.p(this);
    }

    @Override // defpackage.asha
    public CharSequence G() {
        int i = true != this.p ? R.string.NAVIGATION_ARRIVALS_DASHBOARD_SAVE_PARKING_BODY_PRE_CHANGE_LOCATION : R.string.NAVIGATION_ARRIVALS_DASHBOARD_SAVE_PARKING_BODY_POST_CHANGE_LOCATION;
        bvsx bvsxVar = new bvsx(this.c);
        bvsu c = bvsxVar.c(R.string.NAVIGATION_ARRIVALS_DASHBOARD_CHANGE_PARKING_LOCATION);
        c.m(R.color.qu_google_blue_500);
        Spannable c2 = c.c();
        bvsu c3 = bvsxVar.c(i);
        c3.a(c2);
        return c3.c();
    }

    @Override // defpackage.asha
    public cqkl H() {
        asct asctVar = (asct) this.a;
        ascu ascuVar = asctVar.a;
        if (ascuVar.aD) {
            float max = Math.max(16.0f, ascuVar.aT.n().k);
            akpm akpmVar = asctVar.a.aT;
            alaa a = alad.a();
            a.c(asctVar.a.aT.n().i);
            a.c = max;
            alao.d(akpmVar, a.a());
            ff J = asctVar.a.J();
            aneb z = anee.z();
            z.r(J.getString(R.string.CHANGE_PARKING_LOCATION_PICKER_TITLE));
            z.q(J.getString(R.string.CHANGE_PARKING_LOCATION_PICKER_SUBTITLE));
            z.g(dtyb.N);
            z.c(dtyb.L);
            z.e(dtyb.O);
            asctVar.a.aZ(ancv.w(z.a()));
        }
        return cqkl.a;
    }

    @Override // defpackage.asha
    public Boolean I() {
        return false;
    }

    @Override // defpackage.asha
    public cqkl J() {
        this.E.a().f();
        return cqkl.a;
    }

    @Override // defpackage.asha
    public View.OnClickListener K() {
        return this.J;
    }

    @Override // defpackage.asha
    public Boolean L() {
        boolean z = true;
        if (this.c.getConfiguration().orientation != 2 && !this.w.c(jjn.COLLAPSED)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean M(jjn jjnVar) {
        boolean z = this.w != jjnVar;
        this.w = jjnVar;
        return Boolean.valueOf(z);
    }

    public Boolean N() {
        return Boolean.valueOf(zba.e(this.e, this.C, this.D, this.B));
    }

    @Override // defpackage.asha
    public cqsn a() {
        return cqsk.a(this.i);
    }

    @Override // defpackage.asha
    public cqsn b() {
        return cqsk.a(W(false));
    }

    public CharSequence c() {
        return W(true);
    }

    @Override // defpackage.asha
    @dzsi
    public cqsn d() {
        return cqsk.a(this.k);
    }

    @Override // defpackage.asha
    public Boolean e() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.asha
    public cqtd f() {
        return this.g;
    }

    @Override // defpackage.asha
    @dzsi
    public cqtd g() {
        return this.h;
    }

    @Override // defpackage.asha
    @dzsi
    public jav h() {
        return this.l;
    }

    @Override // defpackage.asha
    public cfoa i() {
        return this.o;
    }

    @Override // defpackage.asha
    public Boolean j() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.asha
    @dzsi
    public CharSequence k() {
        ddom ddomVar = this.d;
        if ((ddomVar.a & 8192) == 0 || TimeUnit.SECONDS.toMinutes(ddomVar.q + 30) <= 0) {
            return null;
        }
        Resources resources = this.c;
        return resources.getString(R.string.TIME_SAVED, bvtb.e(resources, this.d.q, bvsz.ABBREVIATED).toString());
    }

    @Override // defpackage.asha
    public Boolean l() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.asha
    public cqkl m() {
        asct asctVar = (asct) this.a;
        ascu ascuVar = asctVar.a;
        amte amteVar = ascuVar.f;
        gga ggaVar = ascuVar.aE;
        dbsk.s(ggaVar);
        amvh b = vyr.b(amteVar.c[1]);
        qcw x = qcx.x();
        x.s(dqvj.WALK);
        x.b(dcdc.f(b));
        asctVar.a.bb.b(new ascp(ggaVar, asctVar.a.aA.a(), x.a()), bvrj.UI_THREAD);
        return cqkl.a;
    }

    @Override // defpackage.asha
    public Boolean n() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.asha
    public cqsn o() {
        if (this.e == null) {
            return cqsk.a("");
        }
        bvsx bvsxVar = new bvsx(this.c);
        Spanned e = bvtb.e(this.c, this.e.E(), bvsz.ABBREVIATED);
        String s = this.e.l().s(this.c);
        bvsu c = bvsxVar.c(R.string.CONTINUE_NAVIGATION_TO_DESTINATION);
        c.a(e, s);
        return cqsk.a(c.c());
    }

    @Override // defpackage.asha
    public cqsn p() {
        Resources resources = this.c;
        return cqsk.a(resources.getString(R.string.RESTART_NAVIGATION_TO_DESTINATION, this.f.s(resources)));
    }

    @Override // defpackage.asha
    public cqkl q() {
        if (N().booleanValue()) {
            ascu ascuVar = ((asct) this.a).a;
            amte amteVar = ascuVar.g;
            dbsk.s(amteVar);
            ascuVar.q(amteVar);
        } else {
            asct asctVar = (asct) this.a;
            amte amteVar2 = asctVar.a.g;
            dbsk.s(amteVar2);
            gga ggaVar = asctVar.a.aE;
            dbsk.s(ggaVar);
            qcw x = qcx.x();
            x.s(amteVar2.d());
            x.r(amteVar2.e());
            x.b(dcdc.r(Arrays.asList(amteVar2.c).subList(1, amteVar2.c.length)));
            asctVar.a.bb.b(new ascq(ggaVar, asctVar.a.aA.a(), x.a()), bvrj.UI_THREAD);
        }
        return cqkl.a;
    }

    @Override // defpackage.asha
    public Boolean r() {
        return Boolean.valueOf(this.m != null);
    }

    @Override // defpackage.asha
    @dzsi
    public CharSequence s() {
        jba jbaVar = this.m;
        if (jbaVar != null) {
            return this.c.getString(R.string.ABOUT_A_PLACE, jbaVar.g());
        }
        return null;
    }

    @Override // defpackage.asha
    @dzsi
    public brve t() {
        return this.n;
    }

    @Override // defpackage.asha
    public cqkl u() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.asha
    public cqkl v() {
        asct asctVar = (asct) this.a;
        asctVar.a.aZ.a();
        asctVar.a.bb.b(new asco(asctVar), bvrj.UI_THREAD);
        return cqkl.a;
    }

    @Override // defpackage.asha
    public cjtd w(ddho ddhoVar) {
        cjta cjtaVar = this.b;
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    public void x(ilo iloVar) {
        Y(iloVar);
        Z(iloVar);
        aa(iloVar);
        ab(iloVar);
        ac(iloVar);
        ad(iloVar);
        X(iloVar);
        cqkx.p(this);
    }

    @Override // defpackage.asha
    public Boolean y() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.asha
    public cqkl z() {
        E(Boolean.valueOf(!this.r));
        ascw ascwVar = this.a;
        boolean z = this.r;
        asct asctVar = (asct) ascwVar;
        ascu ascuVar = asctVar.a;
        ascuVar.af = z;
        if (z) {
            ascuVar.aP.a().f(false);
        } else if (ascuVar.an != null) {
            awtn awtnVar = asctVar.a.an;
            dbsk.s(awtnVar);
            ascuVar.aP.a().i(awtnVar);
        } else {
            ascuVar.aP.a().j();
        }
        ascu ascuVar2 = asctVar.a;
        ascuVar2.ag = false;
        ascuVar2.b.F(false);
        cqkx.p(this);
        return cqkl.a;
    }
}
