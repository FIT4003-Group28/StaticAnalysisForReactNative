package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.gmm.streetview.model.PanoramaLevel;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxdn  reason: default package */
/* loaded from: classes4.dex */
public class bxdn implements bxcc {
    public static final int a = 0;
    @dzsi
    public bwzw A;
    @dzsi
    public bwzw B;
    private final hwe D;
    @dzsi
    private zcd E;
    @dzsi
    private bxcl F;
    @dzsi
    private final bxds G;
    private final ahkg H;
    private final btvo I;
    private final boolean J;
    private final dzsj<bwft> K;
    private final dxio<bbut> L;
    private final bnjv M;
    @dzsi
    private bxcd N;
    @dzsi
    private dggg P;
    private final boolean Q;
    @dzsi
    private final View.OnClickListener R;
    private final View.OnClickListener S;
    private final btrm W;
    @dzsi
    private final izb Y;
    private final brwl Z;
    private final brvv ad;
    public final gga b;
    public final cafi c;
    public final cqhn d;
    public final bwqv e;
    public final dxio<afha> f;
    @dzsi
    public akra g;
    public final bxaf i;
    public final dxio<begg> j;
    public final Executor k;
    public final bvjj l;
    @dzsi
    public dwfl m;
    @dzsi
    public final dggg p;
    @dzsi
    public UserOrientation q;
    public boolean r;
    public int t;
    @dzsi
    public bwrs<ilo> v;
    public boolean w;
    @dzsi
    public bruz x;
    @dzsi
    public brwk y;
    @dzsi
    public bwzk z;
    public boolean s = true;
    private boolean X = false;
    public boolean u = false;
    private boolean aa = false;
    public final bwrr<ilo> C = new bxdj(this);
    private final View.OnAttachStateChangeListener ab = new bxdk(this);
    private final View.OnLayoutChangeListener ac = new bxdl(this);
    @dzsi
    public bwzo h = null;
    public boolean o = false;
    private String O = "";
    private String U = "";
    public String n = "";
    private String V = "";

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bxdn(defpackage.gga r10, defpackage.ahkg r11, defpackage.btvo r12, defpackage.dzsj r13, defpackage.dxio r14, defpackage.dxio r15, defpackage.cafi r16, defpackage.cqhn r17, defpackage.bwqv r18, defpackage.dxio r19, defpackage.bvjj r20, defpackage.btrm r21, defpackage.brvv r22, defpackage.brwl r23, defpackage.bnjv r24, defpackage.bxaf r25, java.util.concurrent.Executor r26, defpackage.hwe r27, defpackage.dggg r28, defpackage.akra r29, boolean r30, defpackage.bwzo r31, android.view.View.OnClickListener r32, android.view.View.OnClickListener r33, defpackage.izb r34, defpackage.dwfl r35, defpackage.bwrs r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxdn.<init>(gga, ahkg, btvo, dzsj, dxio, dxio, cafi, cqhn, bwqv, dxio, bvjj, btrm, brvv, brwl, bnjv, bxaf, java.util.concurrent.Executor, hwe, dggg, akra, boolean, bwzo, android.view.View$OnClickListener, android.view.View$OnClickListener, izb, dwfl, bwrs, boolean):void");
    }

    public static jhz aa(ff ffVar, View.OnClickListener onClickListener, String str, String str2) {
        jhz a2 = jhz.a();
        a2.g = ibl.b();
        a2.u = ibl.b();
        a2.E = 2;
        a2.v = ibl.b();
        a2.d = gdj.b();
        a2.e = cqrt.f(R.drawable.sv_toolbar_action_background);
        a2.x = false;
        a2.q = cqta.f();
        a2.z = 1;
        a2.f(onClickListener);
        a2.l = ffVar.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        if (!dbsj.d(str)) {
            a2.a = str;
        }
        if (!dbsj.d(str2)) {
            a2.b = str2;
        }
        return a2;
    }

    private final cqix<?> aq(int i, int i2, final bwzv bwzvVar, final bwzw bwzwVar) {
        return cqgr.fT(new bwwg(), bxcm.g(true, cqrt.f(i2), this.b.getString(i), true, new View.OnClickListener(this, bwzvVar, bwzwVar) { // from class: bxcx
            private final bxdn a;
            private final bwzv b;
            private final bwzw c;

            {
                this.a = this;
                this.b = bwzvVar;
                this.c = bwzwVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.ao(this.b, this.c);
            }
        }, cjtd.c));
    }

    private final bxcl ar() {
        if (this.F == null) {
            this.F = new bxcl(this.b, new bxcz(this), this.Y);
        }
        return this.F;
    }

    private static int as(dgge dggeVar) {
        dgge dggeVar2 = dgge.IMAGE_UNKNOWN;
        int ordinal = dggeVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 0;
            }
            if (ordinal == 3) {
                return 4;
            }
            if (ordinal == 4) {
                return 1;
            }
            if (ordinal == 5) {
                return 8;
            }
            if (ordinal == 8) {
                return 9;
            }
            return ordinal != 10 ? 99 : 10;
        }
        return 7;
    }

    private final void at() {
        if (this.B != null) {
            this.B = null;
            cqkx.p(this);
        }
        deha.q(deha.a(bwzw.e().a()), new bxdm(this), this.k);
    }

    @Override // defpackage.bxce
    public View.OnClickListener A() {
        return new View.OnClickListener() { // from class: bxcy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
    }

    @Override // defpackage.bxce
    public Boolean B() {
        return false;
    }

    @Override // defpackage.bxce
    public CharSequence C() {
        return this.b.getString(R.string.STREETVIEW_SEE_INSIDE);
    }

    @Override // defpackage.bxce
    public void D(@dzsi bxcd bxcdVar) {
        this.N = bxcdVar;
    }

    @Override // defpackage.bxce
    public Boolean E() {
        boolean z = false;
        if ((o().booleanValue() || a() != null || b().booleanValue()) && (cqhl.a(this.b) || !x().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxce
    public float F() {
        return 0.45f;
    }

    @Override // defpackage.bxce
    public float G() {
        return 1.0f - F();
    }

    @Override // defpackage.bxce
    public int H() {
        if (o().booleanValue()) {
            return this.t;
        }
        if (a() == null && !b().booleanValue()) {
            return 0;
        }
        return cqrp.f(96.0d).e(this.b);
    }

    @Override // defpackage.bxce
    public View.OnLayoutChangeListener I() {
        return this.ac;
    }

    @Override // defpackage.bxce
    public Boolean J() {
        return false;
    }

    @Override // defpackage.bxce
    public List<cqix<?>> K() {
        bwzw bwzwVar = this.B;
        if (bwzwVar == null) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        if (!bwzwVar.c().m(bwzv.EXTERIOR)) {
            F.g(aq(R.string.STREETVIEW_NEARBY_PHOTOS, 2131232268, bwzv.EXTERIOR, bwzwVar));
        }
        if (!bwzwVar.c().m(bwzv.INTERIOR)) {
            F.g(aq(R.string.STREETVIEW_NEARBY_INTERIOR_PHOTOS, 2131232292, bwzv.INTERIOR, bwzwVar));
        }
        if (!bwzwVar.c().m(bwzv.FOOD)) {
            F.g(aq(R.string.STREETVIEW_NEARBY_FOOD_PHOTOS, 2131232403, bwzv.FOOD, bwzwVar));
        }
        if (!bwzwVar.c().m(bwzv.NIGHT)) {
            F.g(aq(R.string.STREETVIEW_NEARBY_NIGHT_PHOTOS, 2131232350, bwzv.NIGHT, bwzwVar));
        }
        if (!bwzwVar.c().m(bwzv.WINTER)) {
            F.g(aq(R.string.STREETVIEW_NEARBY_WINTER_PHOTOS, 2131232127, bwzv.WINTER, bwzwVar));
        }
        return F.f();
    }

    public Boolean L() {
        return Boolean.valueOf(this.H.c());
    }

    @dzsi
    public akra M() {
        return this.g;
    }

    public void N() {
        btrm btrmVar = this.W;
        dceq a2 = dcet.a();
        a2.b(dwgl.class, new bxdp(dwgl.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
    }

    public void O() {
        this.W.a(this);
    }

    public void P(bwzk bwzkVar) {
        this.z = bwzkVar;
    }

    public void Q(String str) {
        this.O = str.trim();
    }

    public void R(bwzo bwzoVar) {
        this.h = bwzoVar;
        if (this.q == null) {
            this.q = bwzoVar.w();
        }
    }

    public void S() {
        this.h = null;
        bxds bxdsVar = this.G;
        if (bxdsVar != null) {
            bxdsVar.h();
        }
    }

    public void T() {
        this.X = false;
        cqkx.p(this);
    }

    public void U(akqq akqqVar) {
        W(null);
        bwzk bwzkVar = this.z;
        if (bwzkVar != null) {
            bwzkVar.a(akqqVar, false);
        }
        cqkx.p(this);
    }

    public void V(dhjz dhjzVar) {
        at();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r0 != r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(@defpackage.dzsi defpackage.dggg r5) {
        /*
            r4 = this;
            dggg r0 = r4.P
            r1 = 0
            r4.X = r1
            if (r0 == 0) goto L29
            if (r5 == 0) goto L29
            java.lang.String r2 = r0.c
            java.lang.String r3 = r5.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            int r0 = r0.b
            dgge r0 = defpackage.dgge.b(r0)
            if (r0 != 0) goto L1d
            dgge r0 = defpackage.dgge.IMAGE_UNKNOWN
        L1d:
            int r2 = r5.b
            dgge r2 = defpackage.dgge.b(r2)
            if (r2 != 0) goto L27
            dgge r2 = defpackage.dgge.IMAGE_UNKNOWN
        L27:
            if (r0 == r2) goto L38
        L29:
            java.lang.String r0 = ""
            r4.O = r0
            r2 = 0
            r4.m = r2
            r4.g = r2
            r4.U = r0
            r4.V = r0
            r4.u = r1
        L38:
            r4.P = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxdn.W(dggg):void");
    }

    public bwzl X() {
        dggg dgggVar = this.P;
        if (dgggVar != null) {
            return new bwzl(dgggVar);
        }
        return new bwzl();
    }

    @dzsi
    public ilo Y() {
        bwrs<ilo> bwrsVar = this.v;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    @dzsi
    public bwrs<ilo> Z() {
        return this.v;
    }

    @Override // defpackage.bxcc
    @dzsi
    public zcd a() {
        return this.E;
    }

    public void ab(List<PanoramaLevel> list, @dzsi PanoramaLevel panoramaLevel) {
        ar().e(list, panoramaLevel, false);
    }

    public void ac() {
        this.aa = true;
        cqkx.p(this);
    }

    public void ad(zcd zcdVar) {
        this.E = zcdVar;
    }

    public void ae(String str) {
        this.U = str;
    }

    public void af(String str) {
        this.n = str;
    }

    public void ag(String str) {
        this.V = str;
    }

    public Uri ah() {
        String str = this.I.getImageryViewerParameters().e;
        bwzo bwzoVar = this.h;
        UserOrientation w = bwzoVar != null ? bwzoVar.w() : new UserOrientation();
        akra akraVar = this.g;
        if (akraVar == null) {
            akraVar = akra.c(0, 0);
        }
        String replace = str.replace("<lat>", String.valueOf(akraVar.i() / 1000000.0f)).replace("<lng>", String.valueOf(akraVar.m() / 1000000.0f)).replace("<fovy>", String.valueOf(w.b)).replace("<heading>", String.valueOf(w.a)).replace("<tilt>", String.valueOf(w.b())).replace("<panoId>", X().a.c);
        dgge b = dgge.b(X().a.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        return Uri.parse(replace.replace("<ImagerySource>", Integer.toString(as(b))));
    }

    public String aj() {
        dggg dgggVar = this.p;
        return dgggVar != null ? dgggVar.c : "";
    }

    public void ak() {
        this.o = true;
    }

    public void al() {
        dwfl dwflVar = this.m;
        if (dwflVar == null) {
            return;
        }
        if (cknv.g(dwflVar)) {
            bbut a2 = this.L.a();
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            String str = dgggVar.c;
            bwzo bwzoVar = this.h;
            a2.C(str, bwzoVar != null ? bwzoVar.w() : new UserOrientation());
            return;
        }
        this.L.a().I(dwflVar, Y());
    }

    public void am() {
        this.K.a().j(this.O, ah().toString(), ai(), dtyb.eq);
    }

    public void an() {
        bwzo bwzoVar = this.h;
        if (bwzoVar != null && !bwzoVar.q()) {
            this.h.i();
        }
        cqkx.p(this);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this.b.getCurrentFocus());
        }
    }

    public final void ao(@dzsi bwzv bwzvVar, @dzsi bwzw bwzwVar) {
        if (bwzwVar != null) {
            if (bwzwVar.b().isEmpty() && bwzwVar.c().D()) {
                return;
            }
            bwzx c = bwzx.c(this.b);
            c.a = bwzvVar;
            c.d = bwzwVar;
            bwzk bwzkVar = this.z;
            if (bwzkVar != null) {
                bwzkVar.d(false);
            }
            new bxag().aJ(this.b);
        }
    }

    @Override // defpackage.bxcc
    public Boolean b() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.bxcc
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: bxcv
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxdn bxdnVar = this.a;
                bxdnVar.l.ao(bvjk.gE);
                bxdnVar.s = false;
                cqkx.p(bxdnVar);
            }
        };
    }

    @Override // defpackage.bxcc
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: bxdg
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dggg dgggVar;
                bxdn bxdnVar = this.a;
                bxdnVar.o = false;
                bwzo bwzoVar = bxdnVar.h;
                if (bwzoVar == null || (dgggVar = bxdnVar.p) == null) {
                    return;
                }
                bwzoVar.aJ(dgggVar, bxdnVar.q);
            }
        };
    }

    @Override // defpackage.bxce
    public jib f() {
        jhz aa = aa(this.b, this.S, this.U, this.V);
        aa.m = new View.OnClickListener(this) { // from class: bxda
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxdn bxdnVar = this.a;
                if (dbsj.d(bxdnVar.n)) {
                    return;
                }
                Uri parse = Uri.parse(bxdnVar.n);
                if (parse.getScheme() == null) {
                    parse = parse.buildUpon().scheme("https").build();
                }
                Runnable b = bmek.b(bxdnVar.b, bxdnVar.c, bxdnVar.f, parse.toString());
                if (b == null) {
                    return;
                }
                b.run();
            }
        };
        if (L().booleanValue()) {
            String string = this.b.getString(R.string.ACCESSIBILITY_ENTER_LOOK_AROUND);
            jhm a2 = jhm.a();
            a2.a = string;
            a2.b = string;
            a2.c = cqrt.f(2131232669);
            a2.h = 1;
            a2.f = cjtd.a(dtyb.dY);
            a2.d(new View.OnClickListener(this) { // from class: bxdb
                private final bxdn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.an();
                }
            });
            aa.c(a2.c());
        }
        String string2 = this.b.getString(R.string.SHARE);
        jhm a3 = jhm.a();
        a3.a = string2;
        a3.b = string2;
        a3.c = cqrt.f(2131231745);
        a3.h = 1;
        a3.f = cjtd.a(dtyb.eq);
        a3.d(new View.OnClickListener(this) { // from class: bxdc
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.am();
            }
        });
        aa.c(a3.c());
        String string3 = this.b.getString(R.string.REPORT_A_PROBLEM);
        jhm a4 = jhm.a();
        a4.a = string3;
        a4.b = string3;
        a4.c = cqrt.f(2131232680);
        a4.h = 1;
        a4.f = cjtd.a(dtyb.cE);
        a4.d(new View.OnClickListener(this) { // from class: bxdd
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.al();
            }
        });
        aa.c(a4.c());
        return aa.b();
    }

    @Override // defpackage.bxce
    public izc g() {
        return ar();
    }

    @Override // defpackage.bxce
    @dzsi
    public bruz h() {
        return this.x;
    }

    @Override // defpackage.bxce
    @dzsi
    public brwk i() {
        return this.y;
    }

    @Override // defpackage.bxce
    public Boolean j() {
        duuu duuuVar = this.I.getImageryViewerParameters().i;
        if (duuuVar == null) {
            duuuVar = duuu.d;
        }
        int a2 = duut.a(duuuVar.c);
        boolean z = true;
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 4 || a2 == 5) {
            return false;
        }
        bwzw bwzwVar = this.A;
        if (bwzwVar == null || bwzwVar.b().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxce
    public Boolean k() {
        duuu duuuVar = this.I.getImageryViewerParameters().i;
        if (duuuVar == null) {
            duuuVar = duuu.d;
        }
        int a2 = duut.a(duuuVar.c);
        boolean z = true;
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 4 || a2 == 5) {
            bwzw bwzwVar = this.A;
            if (bwzwVar == null || bwzwVar.b().isEmpty()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.bxce
    public Boolean l() {
        duuu duuuVar = this.I.getImageryViewerParameters().i;
        if (duuuVar == null) {
            duuuVar = duuu.d;
        }
        int a2 = duut.a(duuuVar.c);
        boolean z = true;
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 5 || a2 == 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxce
    public View.OnClickListener m() {
        return new View.OnClickListener(this) { // from class: bxcw
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxdn bxdnVar = this.a;
                bxdnVar.ao(null, bxdnVar.A);
            }
        };
    }

    @Override // defpackage.bxce
    public CharSequence n() {
        return this.b.getString(R.string.STREETVIEW_GALLERY_ENTRYPOINT);
    }

    @Override // defpackage.bxce
    public Boolean o() {
        bwrs<ilo> bwrsVar = this.v;
        boolean z = false;
        if (bwrsVar != null && bwrsVar.c() != null && this.aa) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxce
    public String q() {
        return this.O;
    }

    @Override // defpackage.bxce
    public Boolean r() {
        return Boolean.valueOf(this.Q);
    }

    @Override // defpackage.bxce
    public void s() {
        this.X = true;
        cqkx.p(this);
    }

    @Override // defpackage.bxce
    @dzsi
    public bxcf t() {
        return this.G;
    }

    @Override // defpackage.bxce
    public Boolean u() {
        boolean z = false;
        if (!this.X && this.u) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxce
    public Boolean v() {
        return Boolean.valueOf(this.J);
    }

    @Override // defpackage.bxce
    public void w(boolean z) {
        this.r = z;
        cqkx.p(this);
    }

    @Override // defpackage.bxce
    public Boolean x() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.bxce
    public View.OnClickListener y() {
        return new View.OnClickListener(this) { // from class: bxdh
            private final bxdn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxdn bxdnVar = this.a;
                bwzk bwzkVar = bxdnVar.z;
                if (bwzkVar != null) {
                    bwzkVar.d(!bxdnVar.r);
                }
            }
        };
    }

    @Override // defpackage.bxce
    public CharSequence z() {
        if (this.r) {
            return this.b.getString(R.string.ACCESSIBILITY_HIDE_MAP);
        }
        return this.b.getString(R.string.ACCESSIBILITY_SHOW_MAP);
    }

    @Override // defpackage.bxcc
    public Boolean c() {
        int a2;
        dwfl dwflVar = this.m;
        boolean z = false;
        if (dwflVar != null && (a2 = dwfc.a(dwflVar.f)) != 0 && a2 == 3 && this.l.s(bvjk.gE, 0) < 3 && this.s) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private final void ap(@dzsi bwrs<ilo> bwrsVar) {
        bwrs<ilo> bwrsVar2;
        boolean z;
        bwrs<ilo> bwrsVar3 = this.v;
        if (bwrsVar3 == bwrsVar || !this.w) {
            this.v = bwrsVar;
            bruz bruzVar = this.x;
            if (bruzVar != null && bwrsVar != null) {
                bruzVar.QR(bwrsVar);
            }
            brwk brwkVar = this.y;
            if (brwkVar != null && (bwrsVar2 = this.v) != null) {
                brwkVar.QR(bwrsVar2);
            }
        } else {
            if (bwrsVar3 != null) {
                bwqv.t(bwrsVar3, this.C);
            }
            this.v = bwrsVar;
            if (bwrsVar != null) {
                this.e.g(bwrsVar, this.C);
            }
        }
        if (bwrsVar == null || bwrsVar.c() == null) {
            this.A = null;
            this.i.a();
            z = true;
        } else {
            z = false;
        }
        bwzk bwzkVar = this.z;
        if (bwzkVar != null) {
            bwzkVar.b();
        }
        if (z) {
            cqkx.p(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148 A[RETURN] */
    @Override // defpackage.bxce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p(@defpackage.dzsi defpackage.bwrs<defpackage.ilo> r15) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxdn.p(bwrs):boolean");
    }

    public drrp ai() {
        bwzo bwzoVar = this.h;
        UserOrientation w = bwzoVar != null ? bwzoVar.w() : new UserOrientation();
        akra akraVar = this.g;
        if (akraVar == null) {
            akraVar = akra.c(0, 0);
        }
        drro bZ = drrp.d.bZ();
        drrk bZ2 = drrn.e.bZ();
        drrl bZ3 = drrm.d.bZ();
        String str = X().a.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drrm drrmVar = (drrm) bZ3.b;
        str.getClass();
        drrmVar.a |= 1;
        drrmVar.b = str;
        dgge b = dgge.b(X().a.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        int a2 = dplh.a(as(b));
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drrm drrmVar2 = (drrm) bZ3.b;
        int i = a2 - 1;
        if (a2 != 0) {
            drrmVar2.c = i;
            drrmVar2.a |= 2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drrn drrnVar = (drrn) bZ2.b;
            drrm bK = bZ3.bK();
            bK.getClass();
            drrnVar.d = bK;
            drrnVar.a |= 4;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drrn drrnVar2 = (drrn) bZ2.b;
            drrnVar2.b = 1;
            drrnVar2.a |= 1;
            drof bZ4 = drog.i.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drog drogVar = (drog) bZ4.b;
            drogVar.b = 0;
            drogVar.a |= 1;
            double i2 = akraVar.i() / 1000000.0f;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drog drogVar2 = (drog) bZ4.b;
            drogVar2.a |= 4;
            drogVar2.d = i2;
            double m = akraVar.m() / 1000000.0f;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drog drogVar3 = (drog) bZ4.b;
            int i3 = drogVar3.a | 2;
            drogVar3.a = i3;
            drogVar3.c = m;
            float f = w.b;
            int i4 = i3 | 64;
            drogVar3.a = i4;
            drogVar3.f = f;
            float f2 = w.a;
            drogVar3.a = i4 | 128;
            drogVar3.g = f2;
            float b2 = w.b();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drog drogVar4 = (drog) bZ4.b;
            drogVar4.a |= 256;
            drogVar4.h = b2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drrn drrnVar3 = (drrn) bZ2.b;
            drog bK2 = bZ4.bK();
            bK2.getClass();
            drrnVar3.c = bK2;
            drrnVar3.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drrp drrpVar = (drrp) bZ.b;
            drrn bK3 = bZ2.bK();
            bK3.getClass();
            drrpVar.b = bK3;
            drrpVar.a |= 4;
            return bZ.bK();
        }
        throw null;
    }
}
