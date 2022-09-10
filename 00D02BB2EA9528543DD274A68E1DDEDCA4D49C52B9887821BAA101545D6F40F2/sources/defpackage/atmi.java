package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: atmi  reason: default package */
/* loaded from: classes2.dex */
public class atmi extends crsy implements atna, ahvl {
    private final boolean A;
    private final btvo B;
    private final dxio<vtn> C;
    private final arre D;
    private final asuq E;
    private final btpc F;
    @dzsi
    private final ahvo G;
    @dzsi
    private final dxio<cztz> H;
    @dzsi
    private final btyh I;
    @dzsi
    private final asbr J;
    @dzsi
    private final ashh K;
    @dzsi
    private dqvj L;
    @dzsi
    private final arpe M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private final ckgv R;
    private final ckhe S;
    @dzsi
    public final afwo a;
    public Runnable c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final btxv w;
    private final bvjj x;
    private final bvrb y;
    private final akfa z;

    public atmi(btxv btxvVar, ckcw ckcwVar, atcu atcuVar, atcw atcwVar, Context context, cjqq cjqqVar, bvrb bvrbVar, btrm btrmVar, bvjj bvjjVar, akfa akfaVar, bvsl bvslVar, btvo btvoVar, cqat cqatVar, @dzsi atmz atmzVar, @dzsi arre arreVar, crsx crsxVar, boolean z, atmr atmrVar, asuq asuqVar, atoi atoiVar, dxio<vtn> dxioVar, @dzsi ahvo ahvoVar, @dzsi dxio<cztz> dxioVar2, @dzsi btyh btyhVar, @dzsi dxio<afwr> dxioVar3, @dzsi asbr asbrVar, @dzsi ashh ashhVar, btpc btpcVar, @dzsi arpe arpeVar, cpv cpvVar) {
        super(atcuVar, atcwVar, context, cjqqVar, btrmVar, bvslVar, cqatVar, atmzVar, crsxVar, atmrVar, atoiVar, null, bvrbVar.h(), btvoVar.getNavigationParameters());
        this.P = false;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.y = bvrbVar;
        this.z = akfaVar;
        this.B = btvoVar;
        this.A = z;
        this.D = arreVar;
        this.x = bvjjVar;
        this.E = asuqVar;
        this.C = dxioVar;
        this.G = ahvoVar;
        this.H = dxioVar2;
        this.I = btyhVar;
        this.a = dxioVar3 == null ? null : dxioVar3.a().l();
        this.J = asbrVar;
        this.w = btxvVar;
        this.F = btpcVar;
        this.K = ashhVar;
        this.M = arpeVar;
        this.R = (ckgv) ckcwVar.a(ckhi.aP);
        this.S = (ckhe) ckcwVar.a(ckhi.aQ);
    }

    private final void aA(Configuration configuration) {
        asho b;
        ashh ashhVar = this.K;
        if (ashhVar == null || (b = ashhVar.b()) == null) {
            return;
        }
        int i = configuration.orientation;
        boolean booleanValue = p().booleanValue();
        b.e(cqrt.d(i == 1 ? booleanValue ? R.dimen.navigation_header_with_grippy_height_port : R.dimen.navigation_header_height_port : booleanValue ? R.dimen.navigation_header_with_grippy_height_land : R.dimen.navigation_header_height_land).e(this.i));
    }

    private final void aB(afwm afwmVar) {
        afwo afwoVar = this.a;
        if (afwoVar != null) {
            afwoVar.e(afwmVar);
            cqkx.p(this);
        }
        this.w.a(new atmh(this, afwmVar));
        atmg atmgVar = new atmg(this);
        this.c = atmgVar;
        this.y.a(atmgVar, bvrj.UI_THREAD, 250L);
    }

    public static boolean ah(int i, int i2) {
        return i != i2;
    }

    @Override // defpackage.atna
    public cqkl B() {
        atmz atmzVar = this.n;
        if (atmzVar != null) {
            atmzVar.c();
        }
        Qq().m();
        return cqkl.a;
    }

    @Override // defpackage.atna
    public cqkl C() {
        Qq().Ql();
        return cqkl.a;
    }

    @Override // defpackage.atna
    public cqkl D() {
        Qq().f();
        return cqkl.a;
    }

    @Override // defpackage.atna
    public cqkl E() {
        atmz atmzVar = this.n;
        if (atmzVar != null) {
            atmzVar.c();
        }
        Qq().b();
        return cqkl.a;
    }

    @Override // defpackage.atna
    public cqkl F() {
        atmz atmzVar = this.n;
        if (atmzVar != null) {
            atmzVar.c();
        }
        Qq().i();
        return cqkl.a;
    }

    @Override // defpackage.atna
    public List<zdn> G() {
        atlq atlqVar = this.o;
        if (atlqVar == null || !atlqVar.b()) {
            return dcdc.e();
        }
        amub amubVar = atlqVar.m.g().a;
        dccx F = dcdc.F();
        F.i(amubVar.e);
        dcdc<doxc> dcdcVar = amubVar.u;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            doxc doxcVar = dcdcVar.get(i);
            if ((doxcVar.a & 4) != 0) {
                dowz dowzVar = doxcVar.d;
                if (dowzVar == null) {
                    dowzVar = dowz.e;
                }
                F.g(zry.b(dowzVar));
            }
        }
        return zry.d(this.C.a(), F.f(), null, ab().booleanValue());
    }

    @Override // defpackage.atna
    /* renamed from: H */
    public arpe al() {
        return this.M;
    }

    @Override // defpackage.atna
    public Boolean I() {
        return false;
    }

    @Override // defpackage.atna
    public Boolean J() {
        btlu j = this.z.j();
        boolean z = false;
        if (j != null && j.u() && this.B.getUgcParameters().O() > 0 && this.F.i() && !this.J.b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public Boolean K() {
        boolean z = false;
        if (J().booleanValue()) {
            btvo btvoVar = this.B;
            bvjj bvjjVar = this.x;
            final EnumSet I = bvjjVar.I(bvjk.ja, dkxe.class);
            if (bvjjVar.m(bvjk.iZ, false)) {
                I.add(dkxe.INCIDENT_CRASH);
                I.add(dkxe.INCIDENT_MOBILE_CAMERA);
            }
            if (dcbg.b(auej.c(btvoVar)).p(new dbsl(I) { // from class: aueh
                private final EnumSet a;

                {
                    this.a = I;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    EnumSet enumSet = this.a;
                    dkxe b = dkxe.b(((dkxf) obj).b);
                    if (b == null) {
                        b = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
                    }
                    return !enumSet.contains(b);
                }
            })) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public Boolean L() {
        boolean z = false;
        if (!this.B.getEnableFeatureParameters().z) {
            return false;
        }
        dkof dkofVar = this.B.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.f) {
            return false;
        }
        dkof dkofVar2 = this.B.getLocationSharingParameters().q;
        if (dkofVar2 == null) {
            dkofVar2 = dkof.s;
        }
        if (dkofVar2.g && this.L != dqvj.DRIVE) {
            return false;
        }
        if (btlu.i(this.z.j()) == btlt.GOOGLE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public Boolean M() {
        return Boolean.valueOf(this.x.m(bvjk.gt, false));
    }

    @Override // defpackage.atna
    public Boolean N() {
        ahvo ahvoVar = this.G;
        boolean z = false;
        if (ahvoVar != null && ahvoVar.f()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.crsy, defpackage.atcy, defpackage.asmo
    public void NZ(@dzsi Bundle bundle) {
        super.NZ(bundle);
        ahvo ahvoVar = this.G;
        if (ahvoVar != null) {
            ahvoVar.a(this);
        }
    }

    @Override // defpackage.atna
    public Boolean O() {
        ahvo ahvoVar = this.G;
        boolean z = false;
        if (ahvoVar != null && ahvoVar.e()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.crsy, defpackage.atcv
    public void Oc(atlq atlqVar, atlq atlqVar2) {
        asld asldVar;
        boolean z;
        boolean z2;
        boolean z3 = false;
        super.az(atlqVar, false);
        if (atlqVar.b()) {
            this.P = atlqVar.v;
            if (!x().booleanValue()) {
                if (atlqVar2 == null) {
                    asldVar = asld.FOLLOWING;
                } else {
                    asldVar = atlqVar2.c.a;
                }
                asld asldVar2 = atlqVar.c.a;
                if (asldVar != asld.OVERVIEW && asldVar2 == asld.OVERVIEW) {
                    this.R.a();
                    this.S.a();
                } else if (asldVar == asld.OVERVIEW && asldVar2 != asld.OVERVIEW) {
                    this.R.b();
                    this.S.c();
                }
            }
            crqf crqfVar = atlqVar.m;
            String str = null;
            if (crqfVar.g() == null) {
                this.L = null;
            } else {
                this.L = crqfVar.g().a.h;
                this.i.getString(R.string.VIA_ROADS_CLAUSE, crqfVar.g().a.p);
            }
            atmz atmzVar = this.n;
            if (atmzVar != null) {
                if (!this.u && !atlqVar.c.a.c()) {
                    z2 = false;
                    atmzVar.b(z2);
                }
                z2 = true;
                atmzVar.b(z2);
            }
            this.l.a().d();
            if (ab().booleanValue() && this.q != null) {
                dpej e = this.l.a().e();
                dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
                dpej dpejVar = dpej.DELAY_NODATA;
                int ordinal = e.ordinal();
                int i = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? R.color.google_grey300 : R.color.google_dark_green500 : R.color.google_dark_yellow800 : R.color.google_dark_red500;
                bvsv a = this.j.a(this.q.toString());
                a.m(i);
                this.q = a.c();
                this.r = TextUtils.concat(this.q, "  •  ", dbsj.e(an()));
            }
            CharSequence f = this.l.f();
            if (O().booleanValue()) {
                str = this.i.getString(R.string.JOURNEY_SHARING_IN_PROGRESS);
            }
            bvsi bvsiVar = new bvsi(this.i);
            bvsiVar.c(f);
            bvsiVar.c(str);
            bvsiVar.c(this.i.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_CLOSE_STEP_LIST));
            this.s = bvsiVar.toString();
            bvsi bvsiVar2 = new bvsi(this.i);
            bvsiVar2.c(f);
            bvsiVar2.c(str);
            bvsiVar2.c(this.i.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_OPEN_STEP_LIST));
            this.t = bvsiVar2.toString();
            this.k.ac().m(atlqVar.g);
            amub amubVar = atlqVar.m.g().a;
            if ((!amubVar.an() || amubVar.s != null) && amubVar.K != amtz.OFFLINE) {
                z = false;
                this.N = z;
                if (!crqfVar.j && atlqVar.c.a != asld.OVERVIEW) {
                    z3 = true;
                }
                this.O = z3;
                if (atlqVar != null && atlqVar.b() && atlqVar2 != null && atlqVar2.b() && atlqVar.m.g().a.h != atlqVar2.m.g().a.h) {
                    Qq().c();
                }
                au();
            }
            z = true;
            this.N = z;
            if (!crqfVar.j) {
                z3 = true;
            }
            this.O = z3;
            if (atlqVar != null) {
                Qq().c();
            }
            au();
        }
    }

    @Override // defpackage.atna
    public cqkl P() {
        atmz atmzVar = this.n;
        if (atmzVar != null) {
            atmzVar.c();
        }
        if (this.F.i()) {
            atcu Qq = Qq();
            asbr asbrVar = this.J;
            boolean z = false;
            if (asbrVar != null && asbrVar.b) {
                z = true;
            }
            Qq.g(z);
        }
        return cqkl.a;
    }

    @Override // defpackage.atna
    public cqkl Q() {
        ahvo ahvoVar = this.G;
        if (ahvoVar != null) {
            if (ahvoVar.e()) {
                R();
            } else if (!this.G.f()) {
                this.x.S(bvjk.gt, true);
                S();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.crsy, defpackage.atcy, defpackage.asmo
    public void Qo(Configuration configuration) {
        super.Qo(configuration);
        this.k.s();
        aA(configuration);
    }

    @Override // defpackage.crsy, defpackage.atcy, defpackage.asmo
    public void Qp() {
        super.Qp();
        ahvo ahvoVar = this.G;
        if (ahvoVar != null) {
            ahvoVar.b(this);
        }
    }

    public final void R() {
        ahvo ahvoVar = this.G;
        if (ahvoVar != null) {
            if (!ahvoVar.e() && !this.G.f()) {
                return;
            }
            this.G.d();
            this.n.c();
        }
    }

    public final void S() {
        ahvo ahvoVar = this.G;
        if (ahvoVar == null || ahvoVar.e() || this.G.f()) {
            return;
        }
        this.n.c();
        Qq().h();
    }

    @Override // defpackage.atna
    public Boolean T() {
        atlq atlqVar = this.o;
        if (atlqVar == null || !atlqVar.b() || !vxx.d(atlqVar.e(), this.B)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(atlqVar.m.g().a.ai() < 10);
    }

    @Override // defpackage.atna
    public Boolean U() {
        afwo afwoVar = this.a;
        boolean z = false;
        if (afwoVar != null && afwoVar.d(afwm.TRAFFIC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public Boolean V() {
        afwo afwoVar = this.a;
        boolean z = false;
        if (afwoVar != null && afwoVar.d(afwm.SATELLITE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public Boolean W() {
        return Boolean.valueOf(this.i.getResources().getConfiguration().smallestScreenWidthDp <= 360);
    }

    @Override // defpackage.atna
    public Boolean X() {
        btyh btyhVar = this.I;
        if (btyhVar == null || btyhVar.b()) {
            return false;
        }
        atlq atlqVar = this.o;
        if (atlqVar == null || !atlqVar.b()) {
            return true;
        }
        return Boolean.valueOf(vxx.i(atlqVar.m.g().a.h));
    }

    @Override // defpackage.atna
    public Boolean Y() {
        btyh btyhVar = this.I;
        boolean z = false;
        if (btyhVar != null && !btyhVar.b()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public cqkl Z() {
        aB(afwm.TRAFFIC);
        return cqkl.a;
    }

    @Override // defpackage.atna
    public cqkl aa() {
        aB(afwm.SATELLITE);
        return cqkl.a;
    }

    @Override // defpackage.atna
    public Boolean ab() {
        boolean z = false;
        if (this.P && !j().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atna
    public jku ac(final boolean z) {
        return new jku(this, z) { // from class: atmd
            private final atmi a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.jku
            public final int a() {
                atmi atmiVar = this.a;
                return atmiVar.ai(atmiVar.i.getResources().getConfiguration(), this.b);
            }
        };
    }

    @Override // defpackage.atna
    public cqfd ad() {
        return new cqfd(this) { // from class: atme
            private final atmi a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                atmi atmiVar = this.a;
                Configuration configuration = atmiVar.i.getResources().getConfiguration();
                if (configuration.orientation != 2 || !(view instanceof TextView) || view.getId() != R.id.navigation_one_line_label) {
                    if (configuration.orientation == 1 && (view instanceof TextView) && view.getId() == R.id.navigation_time_remaining_label) {
                        int ai = atmiVar.ai(configuration, true);
                        if (atmi.ah(atmiVar.d, ai)) {
                            atmiVar.d = ai;
                            view.requestLayout();
                            view.invalidate();
                        }
                    }
                } else {
                    int ai2 = atmiVar.ai(configuration, true);
                    if (atmi.ah(atmiVar.e, ai2)) {
                        atmiVar.e = ai2;
                        view.requestLayout();
                        view.invalidate();
                    }
                }
                return true;
            }
        };
    }

    @Override // defpackage.atna
    public cqfd ae() {
        return new cqfd(this) { // from class: atmf
            private final atmi a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                atmi atmiVar = this.a;
                if (view instanceof TextView) {
                    Configuration configuration = atmiVar.i.getResources().getConfiguration();
                    if (configuration.orientation == 2) {
                        int ai = atmiVar.ai(configuration, true);
                        if (atmi.ah(atmiVar.g, ai)) {
                            atmiVar.g = ai;
                            view.requestLayout();
                            view.invalidate();
                        }
                    } else if (configuration.orientation == 1) {
                        int ai2 = atmiVar.ai(configuration, true);
                        if (atmi.ah(atmiVar.f, ai2)) {
                            atmiVar.f = ai2;
                            view.requestLayout();
                            view.invalidate();
                        }
                    }
                }
                return true;
            }
        };
    }

    public void af(boolean z) {
        this.Q = z;
        au();
    }

    @Override // defpackage.atna
    public Boolean ag() {
        return Boolean.valueOf(this.Q);
    }

    public final int ai(Configuration configuration, boolean z) {
        int i;
        if (!ak().booleanValue() || !btpf.c(this.i).f) {
            i = configuration.screenWidthDp;
        } else {
            i = w().i().intValue() - 16;
        }
        int i2 = 0;
        if (z) {
            if (true == r().booleanValue()) {
                i2 = 29;
            }
            if (O().booleanValue()) {
                i2 += 29;
            }
            i2 += G().size() * 27;
        }
        return (int) TypedValue.applyDimension(1, ((i - atlu.a(this, this.i).intValue()) - atlu.b(this, this.i).intValue()) - i2, this.i.getResources().getDisplayMetrics());
    }

    @Override // defpackage.atna
    public Boolean ak() {
        return true;
    }

    @Override // defpackage.crsy, defpackage.atcy, defpackage.asmo
    public void b() {
        super.b();
        if (this.k.ac().v() != null) {
            this.k.ac().v().h();
        }
        if (this.k.ac().t() != null) {
            this.k.ac().t().i();
        }
        aA(this.i.getResources().getConfiguration());
    }

    @Override // defpackage.crsy, defpackage.atcy, defpackage.asmo
    public void c() {
        super.c();
        if (this.k.ac().v() != null) {
            this.k.ac().v().i();
        }
        if (this.k.ac().t() != null) {
            this.k.ac().t().j();
        }
    }

    @Override // defpackage.ahvl
    public void g() {
        au();
    }

    @Override // defpackage.ahvl
    public void h() {
        if (!this.B.getLocationSharingParameters().y) {
            if (this.H != null) {
                if (O().booleanValue()) {
                    ahvo ahvoVar = this.G;
                    dbsk.s(ahvoVar);
                    List<String> g = ahvoVar.g();
                    if (g.size() == 1) {
                        cztq a = cztt.a(this.H.a());
                        a.e(R.string.JOURNEY_SHARING_CREATED_ONE_USER, g.get(0));
                        a.a(R.string.JOURNEY_CANCEL, new View.OnClickListener(this) { // from class: atma
                            private final atmi a;

                            {
                                this.a = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.R();
                            }
                        }).c();
                    } else {
                        cztq a2 = cztt.a(this.H.a());
                        a2.e(R.string.JOURNEY_SHARING_CREATED, new Object[0]);
                        a2.a(R.string.JOURNEY_CANCEL, new View.OnClickListener(this) { // from class: atmb
                            private final atmi a;

                            {
                                this.a = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.R();
                            }
                        }).c();
                    }
                } else {
                    cztq a3 = cztt.a(this.H.a());
                    a3.e(R.string.JOURNEY_WAS_NOT_CREATED, new Object[0]);
                    a3.a(R.string.JOURNEY_RETRY, new View.OnClickListener(this) { // from class: atmc
                        private final atmi a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.S();
                        }
                    }).c();
                }
            }
            au();
        }
    }

    @Override // defpackage.ahvl
    public void i() {
        au();
    }

    @Override // defpackage.asum
    public asuq n() {
        return this.E;
    }

    @Override // defpackage.asum
    public asus o() {
        return ap().ac();
    }

    @Override // defpackage.atna
    public Boolean p() {
        x().booleanValue();
        return false;
    }

    @Override // defpackage.atna
    public Boolean q() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.atna
    public Boolean r() {
        return Boolean.valueOf(this.N);
    }

    @Override // defpackage.atna
    public Boolean s() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.atna
    public Boolean t() {
        return Boolean.valueOf(this.O);
    }

    @Override // defpackage.atna
    public cqkl u() {
        this.k.R();
        return cqkl.a;
    }

    @Override // defpackage.atna
    public Boolean v() {
        return Boolean.valueOf(this.A);
    }

    @Override // defpackage.atna
    @dzsi
    public atnj w() {
        return this.n;
    }

    @Override // defpackage.atna
    public Boolean x() {
        return false;
    }

    @dzsi
    public jkh y() {
        return this.n;
    }

    @Override // defpackage.atna
    public aryh z() {
        return this.D.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // defpackage.atna
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cjtd aj() {
        /*
            r4 = this;
            atlq r0 = r4.o
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = r2
            goto L26
        L8:
            crqf r0 = r0.m
            cray r0 = r0.g()
            amub r0 = r0.a
            int r3 = r0.ai()
            if (r3 <= 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            defpackage.dbsk.l(r3)
            int r3 = r0.ai()
            int r3 = r3 + (-1)
            amvh r0 = r0.ah(r3)
        L26:
            if (r0 != 0) goto L2a
        L28:
            r0 = r2
            goto L43
        L2a:
            dpjs r0 = r0.b
            dpej r3 = defpackage.dpej.DELAY_NODATA
            int r0 = r0.ordinal()
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L3e
            r1 = 5
            if (r0 == r1) goto L3b
            goto L28
        L3b:
            ddho r0 = defpackage.dtxw.au
            goto L43
        L3e:
            ddho r0 = defpackage.dtxw.av
            goto L43
        L41:
            ddho r0 = defpackage.dtxw.at
        L43:
            if (r0 != 0) goto L46
            return r2
        L46:
            cjtd r0 = defpackage.cjtd.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atmi.aj():cjtd");
    }
}
