package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ygh  reason: default package */
/* loaded from: classes7.dex */
public class ygh extends acoi implements yfq {
    public static final dcqe a = dcqe.c("ygh");
    private static final long r = TimeUnit.SECONDS.toMillis(2);
    private static final cqrp s = cqrp.d(22.0d);
    @dzsi
    private final akqi A;
    @dzsi
    private final akqi B;
    @dzsi
    private final eapd C;
    @dzsi
    private final String D;
    private boolean I;
    @dzsi
    private ckcv L;
    public final ivf b;
    public final qbt c;
    public final Activity d;
    public final yfu e;
    public final ygu f;
    public final vtn g;
    public final akqi h;
    @dzsi
    public zvb i;
    public int l;
    @dzsi
    public djxo m;
    @dzsi
    public CharSequence n;
    public final ygj p;
    private final jmn t;
    private final ydu u;
    private final bvrb y;
    private final ckcw z;
    private boolean E = false;
    public boolean j = false;
    private boolean F = false;
    private boolean G = false;
    int k = 0;
    private final yfp H = new yfz(this);
    public int q = 1;
    public dcdc<yfs> o = dcdc.e();
    private boolean J = false;
    private boolean K = false;
    private final Runnable M = new yga(this);
    private final bbb N = new ygb(this);
    private final View.OnLayoutChangeListener O = new ygd();
    private final jam P = new yge(this);

    public ygh(Activity activity, ivg ivgVar, cqhn cqhnVar, jmn jmnVar, ydu yduVar, ygu yguVar, yfu yfuVar, vtn vtnVar, bvrb bvrbVar, ckcw ckcwVar, qbt qbtVar, qdc qdcVar) {
        this.d = activity;
        this.b = ivgVar.a(this);
        dbsk.s(cqhnVar);
        this.t = jmnVar;
        this.f = yguVar;
        this.g = vtnVar;
        this.y = bvrbVar;
        this.z = ckcwVar;
        this.c = qbtVar;
        this.u = yduVar;
        this.e = yfuVar;
        this.h = akqi.b(qdcVar.b());
        this.C = qdcVar.e();
        this.D = qdcVar.f();
        this.L = ckcwVar.e();
        this.A = akqi.f(qdcVar.c());
        this.B = akqi.f(qdcVar.d());
        dpce a2 = qdcVar.a();
        this.i = a2 != null ? new zvb(a2) : null;
        this.p = new ygj();
        Y(new acnw(this) { // from class: yfw
            private final ygh a;

            {
                this.a = this;
            }

            @Override // defpackage.acnw
            public final void a(int i, int i2, boolean z, boolean z2) {
                this.a.O(i2, false);
            }
        });
    }

    public static alcb F(Activity activity, vtn vtnVar) {
        alcb a2 = alcc.a();
        a2.a = activity;
        a2.b = vtnVar;
        a2.d = s.e(activity);
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if ((r3.l.get(0).a & 1) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean G(defpackage.djxo r3, int r4) {
        /*
            dsrj<djxn> r0 = r3.d
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 <= r4) goto L3c
            dsrj<djxn> r0 = r3.d
            java.lang.Object r0 = r0.get(r4)
            djxn r0 = (defpackage.djxn) r0
            dphe r0 = r0.b
            if (r0 != 0) goto L18
            dphe r0 = defpackage.dphe.x
        L18:
            dsrj<dotv> r0 = r0.l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            dsrj<djxn> r3 = r3.d
            java.lang.Object r3 = r3.get(r4)
            djxn r3 = (defpackage.djxn) r3
            dphe r3 = r3.b
            if (r3 != 0) goto L2e
            dphe r3 = defpackage.dphe.x
        L2e:
            dsrj<dotv> r3 = r3.l
            java.lang.Object r3 = r3.get(r2)
            dotv r3 = (defpackage.dotv) r3
            int r3 = r3.a
            r3 = r3 & r1
            if (r3 == 0) goto L3c
            goto L3d
        L3c:
            r1 = 0
        L3d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygh.G(djxo, int):java.lang.Boolean");
    }

    private final void P(djxo djxoVar, boolean z) {
        yfu yfuVar;
        if (!this.J || (yfuVar = this.e) == null || !this.I) {
            return;
        }
        boolean z2 = this.G;
        this.G = true;
        yfuVar.a(djxoVar, z, this.d, this.l, k(), !z2);
    }

    public static jib y(@dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, View.OnClickListener onClickListener, boolean z) {
        jhz a2 = jhz.a();
        a2.z = 0;
        a2.f(onClickListener);
        a2.o = cjtd.a(dtyc.dr);
        a2.x = !z;
        if (charSequence != null) {
            a2.a = charSequence;
        }
        if (charSequence2 != null) {
            a2.b = charSequence2;
        }
        a2.q = cqta.f();
        a2.x = false;
        a2.d = ibq.E();
        if (!z) {
            a2.e = vos.c();
        }
        return a2.b();
    }

    @dzsi
    public yfs A() {
        if (this.q == 5) {
            return this.o.get(this.l);
        }
        return null;
    }

    public void B() {
        this.e.b();
        this.G = false;
    }

    @dzsi
    public final zvb C(djxo djxoVar, int i) {
        if (G(djxoVar, i).booleanValue()) {
            dphe dpheVar = djxoVar.d.get(i).b;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            dpgl dpglVar = dpheVar.l.get(0).b;
            if (dpglVar == null) {
                dpglVar = dpgl.g;
            }
            return new zvb(dcdc.r(dpglVar.b));
        }
        return this.i;
    }

    public void D(boolean z) {
        if (this.F != z) {
            this.F = z;
            cqkx.p(this.H);
        }
    }

    @Override // defpackage.acoi, defpackage.acoe
    public bbb E() {
        return this.N;
    }

    public final void H() {
        yfs A = A();
        if (A != null) {
            A.e();
        }
        this.E = false;
    }

    public final void I() {
        if (!this.E) {
            this.y.a(this.M, bvrj.UI_THREAD, r);
            this.E = true;
        }
    }

    public final void M(int i) {
        if (this.q == 5) {
            return;
        }
        this.q = i;
        q(true);
    }

    public final void N(int i) {
        ((ckco) this.z.a(ckki.a)).a(i - 1);
        ckcv ckcvVar = this.L;
        if (ckcvVar == null || i != 1) {
            return;
        }
        ckcvVar.a((ckcr) this.z.a(ckki.c));
        this.L = null;
    }

    @Override // defpackage.jbk
    public jib NC() {
        A();
        return y(k(), l(), this.t, f().booleanValue());
    }

    public final void O(int i, boolean z) {
        if (i < 0 || i >= this.o.size()) {
            return;
        }
        this.l = i;
        this.n = null;
        djxo djxoVar = this.m;
        if (djxoVar != null && i < djxoVar.d.size()) {
            this.i = C(this.m, i);
        }
        H();
        djxo djxoVar2 = this.m;
        dbsk.s(djxoVar2);
        P(djxoVar2, z);
        q(true);
    }

    @Override // defpackage.izy
    public cqkl b() {
        v();
        return cqkl.a;
    }

    @Override // defpackage.izy
    public void c() {
        this.b.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.b.c();
    }

    @Override // defpackage.izy
    public long e() {
        return TimeUnit.SECONDS.toMillis(60L);
    }

    @Override // defpackage.qvn
    public Boolean f() {
        return Boolean.valueOf(this.F);
    }

    @Override // defpackage.yfq
    public Boolean g() {
        boolean z = true;
        if (this.q != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.yfq
    @dzsi
    public jam h() {
        if (this.P.a().booleanValue()) {
            return this.P;
        }
        return null;
    }

    @Override // defpackage.yfq
    public Integer j() {
        return Integer.valueOf(this.l);
    }

    @Override // defpackage.yfq
    @dzsi
    public CharSequence k() {
        zvb zvbVar = this.i;
        if (this.n == null && zvbVar != null && this.k > 0) {
            alcb F = F(this.d, this.g);
            F.b();
            int i = this.k;
            F.g = Integer.valueOf((i + i) / 3);
            F.e = new vtl(this) { // from class: yfy
                private final ygh a;

                {
                    this.a = this;
                }

                @Override // defpackage.vtl
                public final void a(Drawable drawable) {
                    ygh yghVar = this.a;
                    yghVar.n = null;
                    yghVar.q(false);
                }
            };
            this.n = F.a().b(zvbVar.c());
        }
        return this.n;
    }

    @Override // defpackage.yfq
    @dzsi
    public CharSequence l() {
        String b;
        yfs A = A();
        if (A == null || (b = A.c().get(A.f().intValue()).b()) == null) {
            return null;
        }
        return this.d.getString(R.string.TRANSIT_LINE_HEADER_SUBTITLE_DEPARTURE_STATION, new Object[]{b});
    }

    @Override // defpackage.yfq
    public CharSequence m() {
        return bqq.c(this.d, R.string.TRANSIT_LINE_PAGE_INDICATOR_CONTENT_DESCRIPTION, "departureIndex", Integer.valueOf(this.l + 1), "departureCount", Integer.valueOf(this.o.size()));
    }

    @Override // defpackage.yfq
    public Boolean n() {
        return Boolean.valueOf(this.K);
    }

    @Override // defpackage.yfq
    public View.OnLayoutChangeListener o() {
        return this.O;
    }

    public void p() {
        q(true);
    }

    public final void q(boolean z) {
        this.K = z;
        cqkx.p(this);
        cqkx.p(this.H);
    }

    @Override // defpackage.yfq
    /* renamed from: r */
    public dcdc<yfs> i() {
        return this.o;
    }

    public void s() {
        this.e.b();
        this.j = false;
    }

    public void t() {
        this.j = true;
    }

    public void u() {
        this.I = true;
        djxo djxoVar = this.m;
        if (djxoVar != null) {
            P(djxoVar, false);
        }
    }

    public void v() {
        ydu yduVar = this.u;
        ygf ygfVar = new ygf(this);
        akqi akqiVar = this.h;
        akqi akqiVar2 = this.A;
        akqi akqiVar3 = this.B;
        eapd eapdVar = this.C;
        String str = this.D;
        bvrj.UI_THREAD.c();
        bvrj.UI_THREAD.c();
        btzc btzcVar = yduVar.c;
        if (btzcVar != null) {
            btzcVar.a();
            yduVar.c = null;
            yduVar.d = null;
        }
        djxq bZ = djxr.g.bZ();
        String o = akqiVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djxr djxrVar = (djxr) bZ.b;
        o.getClass();
        djxrVar.a |= 1;
        djxrVar.b = o;
        if (akqiVar2 != null) {
            String o2 = akqiVar2.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djxr djxrVar2 = (djxr) bZ.b;
            o2.getClass();
            djxrVar2.a |= 2;
            djxrVar2.c = o2;
        }
        if (akqiVar3 != null) {
            String o3 = akqiVar3.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djxr djxrVar3 = (djxr) bZ.b;
            o3.getClass();
            djxrVar3.a |= 4;
            djxrVar3.d = o3;
        }
        if (eapdVar != null) {
            long j = eapdVar.a;
            djxr djxrVar4 = (djxr) bZ.b;
            djxrVar4.a |= 8;
            djxrVar4.e = j / 1000;
        }
        if (str != null) {
            djxr djxrVar5 = (djxr) bZ.b;
            str.getClass();
            djxrVar5.a |= 16;
            djxrVar5.f = str;
        }
        djxp bZ2 = djxs.b.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djxs djxsVar = (djxs) bZ2.b;
        djxr bK = bZ.bK();
        bK.getClass();
        dsrj<djxr> dsrjVar = djxsVar.a;
        if (!dsrjVar.a()) {
            djxsVar.a = dsqw.cl(dsrjVar);
        }
        djxsVar.a.add(bK);
        ydr ydrVar = new ydr(yduVar, ygfVar);
        yduVar.d = yduVar.b.e();
        yduVar.c = yduVar.e.b(bZ2.bK(), ydrVar, yduVar.a);
    }

    public void w(boolean z) {
        this.J = z;
    }

    public View.OnLayoutChangeListener x() {
        return new View.OnLayoutChangeListener(this) { // from class: yfx
            private final ygh a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int width;
                ygh yghVar = this.a;
                View findViewById = view.findViewById(yeu.a);
                if (findViewById == null || yghVar.k == (width = findViewById.getWidth())) {
                    return;
                }
                yghVar.k = width;
                yghVar.q(false);
            }
        };
    }

    public yfp z() {
        return this.H;
    }
}
