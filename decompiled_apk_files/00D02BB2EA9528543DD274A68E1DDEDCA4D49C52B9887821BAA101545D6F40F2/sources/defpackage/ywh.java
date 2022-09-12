package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ywh  reason: default package */
/* loaded from: classes7.dex */
public class ywh extends acoi implements yvq {
    public static final dcqe a = dcqe.c("ywh");
    private static final dcep<dqvh> h = dcep.C(dqvh.TRANSIT_VEHICLE_TYPE_BUS, dqvh.TRANSIT_VEHICLE_TYPE_TRAM);
    private static final dcdn<dqvh, Integer> i;
    public final gga b;
    public final xcj c;
    public final dgsn d;
    public final yuu e;
    public final yuw f;
    public final ywo g;
    private final cqat j;
    private final vtn k;
    @dzsi
    private final doza l;
    private final zef m;
    private dcdc<yvx> n;
    private final dqvh o;
    private final ytc p;
    @dzsi
    private final String q;
    private boolean r;
    @dzsi
    private ywf s;
    private final ywg t;
    private boolean y;
    private long u = 0;
    private final iyk z = new ywd();
    private final View.OnLayoutChangeListener A = new ywe();

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dqvh.TRANSIT_VEHICLE_TYPE_BUS, Integer.valueOf((int) R.string.TRANSIT_LINE_SEEKER_BUS_LINE));
        dcdgVar.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAIN, Integer.valueOf((int) R.string.TRANSIT_LINE_SEEKER_TRAIN_LINE));
        dcdgVar.f(dqvh.TRANSIT_VEHICLE_TYPE_SUBWAY, Integer.valueOf((int) R.string.TRANSIT_LINE_SEEKER_SUBWAY_LINE));
        dcdgVar.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAM, Integer.valueOf((int) R.string.TRANSIT_LINE_SEEKER_TRAM_LIGHT_RAIL_LINE));
        dcdgVar.f(dqvh.TRANSIT_VEHICLE_TYPE_RAIL, Integer.valueOf((int) R.string.TRANSIT_LINE_SEEKER_RAIL_LINE));
        dcdgVar.f(dqvh.TRANSIT_VEHICLE_TYPE_FERRY, Integer.valueOf((int) R.string.TRANSIT_LINE_SEEKER_FERRY_LINE));
        i = dcdgVar.b();
    }

    public ywh(gga ggaVar, cqat cqatVar, vtn vtnVar, xcj xcjVar, yuu yuuVar, yuw yuwVar, ytc ytcVar, @dzsi doza dozaVar, dgsn dgsnVar, zef zefVar, List<yvx> list, @dzsi String str, ywo ywoVar) {
        this.b = ggaVar;
        this.j = cqatVar;
        this.k = vtnVar;
        this.c = xcjVar;
        ywf ywfVar = null;
        this.l = true != alca.y(dozaVar, doza.INFORMATION) ? null : dozaVar;
        dqvh b = bzlx.b(dgsnVar);
        this.o = b;
        this.d = dgsnVar;
        this.m = zefVar;
        this.n = dcdc.r(list);
        this.e = yuuVar;
        this.f = yuwVar;
        this.p = ytcVar;
        this.q = str;
        this.g = ywoVar;
        this.t = new ywg(this);
        if (h.contains(b) && dcbg.b(this.n).s(ywb.a).B().size() > 1) {
            if (M() != null) {
                dcdc<yvx> dcdcVar = this.n;
                int size = dcdcVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dcdcVar.get(i2).p();
                }
                cqkx.p(this);
            }
            ywfVar = new ywf(this);
        }
        this.s = ywfVar;
        T(ywoVar.a());
        this.r = ywoVar.b() && list.size() < 5;
        this.y = false;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            final yvx yvxVar = this.n.get(i3);
            jhk g = this.m.g();
            if (g != null) {
                String a2 = this.k.a(g.a, vtj.TRANSIT_AUTO);
                if (a2 != null) {
                    yvxVar.g = this.k.f(a2, bvlw.a, new vtk(this, yvxVar) { // from class: yvz
                        private final ywh a;
                        private final yvx b;

                        {
                            this.a = this;
                            this.b = yvxVar;
                        }

                        @Override // defpackage.vtk
                        public final void a(cqtd cqtdVar) {
                            ywh ywhVar = this.a;
                            this.b.g = cqtdVar;
                            if (!ywhVar.b.aZ || !ywhVar.z().booleanValue()) {
                                return;
                            }
                            ywhVar.e.b();
                        }
                    });
                }
            }
            yvxVar.h = new dbty(this, yvxVar) { // from class: ywa
                private final ywh a;
                private final yvx b;

                {
                    this.a = this;
                    this.b = yvxVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return Boolean.valueOf(this.a.C() == this.b);
                }
            };
            this.y = this.y || aa(yvxVar);
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            if (aa(this.n.get(i4))) {
                Z(i4);
                return;
            }
        }
    }

    private static boolean aa(yvp yvpVar) {
        return dbsj.d(yvpVar.i());
    }

    @Override // defpackage.yvq
    @dzsi
    public cjtd A() {
        xcj xcjVar = this.c;
        i();
        boolean a2 = xcjVar.a();
        ddho i2 = this.g.i();
        if (!z().booleanValue() || !a2 || i2 == null) {
            return null;
        }
        return cjtd.a(i2);
    }

    @Override // defpackage.yvq
    @dzsi
    public String B() {
        if (this.n.isEmpty()) {
            return this.b.getString(R.string.TRANSIT_SEEKER_UNABLE_TO_LOAD_LINE_DETAILS_TEXT);
        }
        return null;
    }

    @Override // defpackage.yvq
    public String F() {
        String string;
        zbd zbdVar = new zbd(this.b);
        String f = f();
        jhk h2 = h();
        zcv zcvVar = null;
        String b = (f != null || h2 == null || !h2.c.a()) ? null : h2.c.b();
        if (true != dbsj.d(f)) {
            b = f;
        }
        if (!dbsj.d(b)) {
            gga ggaVar = this.b;
            dqvh Q = Q();
            String string2 = ywp.a.containsKey(Q) ? ggaVar.getString(ywp.a.get(Q).intValue()) : null;
            if (dbsj.d(string2)) {
                zbdVar.b(b);
            } else {
                if (zbd.a((CharSequence) f)) {
                    string = this.b.getString(R.string.TRANSIT_SEEKER_SINGLE_LETTER_LINE_NAME_VEHICLE_TYPE_TEXT, new Object[]{b, string2});
                } else {
                    string = this.b.getString(R.string.TRANSIT_SEEKER_LINE_NAME_VEHICLE_TYPE_TEXT, new Object[]{b, string2});
                }
                zbdVar.c(string);
            }
        }
        if (!z().booleanValue()) {
            String N = N();
            if (!dbsj.d(N)) {
                zbdVar.c(N);
            }
        }
        if (y() != null) {
            yvx C = C();
            if (C != null) {
                zcvVar = C.h();
            }
            if (zcvVar != null) {
                zbdVar.c(zcvVar.d());
            } else {
                doza dozaVar = this.l;
                if (dozaVar != null) {
                    zbdVar.c(alca.h(this.b, dozaVar));
                }
            }
        }
        return zbdVar.toString();
    }

    @Override // defpackage.yvq
    @dzsi
    public yvo G() {
        ywf ywfVar = this.s;
        if (ywfVar == null || !ywfVar.a().booleanValue() || !dbsj.d(B())) {
            return null;
        }
        return this.s;
    }

    @Override // defpackage.yvq
    public View.OnLayoutChangeListener H() {
        return this.A;
    }

    @Override // defpackage.yvq
    public List<cqkp> I() {
        if (this.r) {
            return Collections.nCopies(Math.max(5 - this.n.size(), 0), cqkp.T);
        }
        return dcdc.e();
    }

    @Override // defpackage.yvq
    public cqss J() {
        return cqta.e(bvoa.a(a()) ? a() : -12417548);
    }

    @Override // defpackage.yvq
    @dzsi
    public String K() {
        dqvh Q = Q();
        dcdn<dqvh, Integer> dcdnVar = i;
        if (dcdnVar.containsKey(Q)) {
            return this.b.getString(dcdnVar.get(Q).intValue());
        }
        return null;
    }

    @Override // defpackage.yvq
    @dzsi
    public String L() {
        return this.q;
    }

    @Override // defpackage.yvq
    @dzsi
    public jad M() {
        yvx C = C();
        if (C == null || !C.n()) {
            return null;
        }
        return this.t;
    }

    @dzsi
    public String N() {
        return null;
    }

    @Override // defpackage.yvq
    @dzsi
    /* renamed from: O */
    public yvx C() {
        int intValue = Os().intValue();
        if (intValue < 0 || intValue >= this.n.size()) {
            return null;
        }
        return this.n.get(intValue);
    }

    @Override // defpackage.yvq
    /* renamed from: P */
    public dcdc<? extends yvp> D() {
        return this.n;
    }

    public dqvh Q() {
        return this.o;
    }

    public void R(akqq akqqVar) {
        dcdc<yvx> dcdcVar = this.n;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            yvx yvxVar = dcdcVar.get(i2);
            dpum dpumVar = yvxVar.d.d;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            int e = (int) akqo.e(akqqVar, akqq.f(dpumVar));
            bvsl bvslVar = yvxVar.b;
            dovy bZ = dowb.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dowb dowbVar = (dowb) bZ.b;
            dowbVar.a |= 1;
            dowbVar.b = e;
            yvxVar.f = bvslVar.i(bZ.bK());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S() {
        yvx C = C();
        if (C == null) {
            return;
        }
        qbt qbtVar = C.a;
        qdf o = qdg.o();
        qaw qawVar = (qaw) o;
        qawVar.a = C.e();
        qawVar.b = C.c.o();
        qawVar.c = C.e;
        o.g(2);
        qbtVar.t(o.h());
    }

    public void T(boolean z) {
        this.z.b(z);
    }

    public boolean U(final akqi akqiVar) {
        int n = dcft.n(this.n, new dbsl(akqiVar) { // from class: ywc
            private final akqi a;

            {
                this.a = akqiVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                akqi akqiVar2 = this.a;
                dcqe dcqeVar = ywh.a;
                dpsn dpsnVar = ((yvx) obj).c().c;
                if (dpsnVar == null) {
                    dpsnVar = dpsn.d;
                }
                return akqi.j(dpsnVar).equals(akqiVar2);
            }
        });
        if (n >= 0) {
            Z(n);
            return true;
        }
        return false;
    }

    public void V() {
        this.u = this.j.e();
    }

    public void W() {
        this.p.a();
    }

    @Override // defpackage.yvn
    public int a() {
        yvx C = C();
        if (C == null) {
            return 0;
        }
        return C.a();
    }

    @Override // defpackage.yvn
    public dcdc<String> b() {
        yvx C = C();
        if (C == null) {
            return dcdc.e();
        }
        return C.b();
    }

    @Override // defpackage.yvn
    public drij c() {
        yvx C = C();
        return C == null ? drij.e : C.c();
    }

    @Override // defpackage.yvn
    @dzsi
    public cqtd d() {
        yvx C = C();
        if (C == null) {
            return null;
        }
        return C.d();
    }

    @Override // defpackage.zef
    public zvb e() {
        return this.m.e();
    }

    @Override // defpackage.zef
    @dzsi
    public String f() {
        return this.m.f();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk g() {
        return this.m.g();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk h() {
        return this.m.h();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{i(), this.m.e()});
    }

    @Override // defpackage.zef
    public akqi i() {
        akqi i2 = this.m.i();
        dbsk.s(i2);
        return i2;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk j() {
        return this.m.j();
    }

    @Override // defpackage.zef
    @dzsi
    public String k() {
        return this.m.k();
    }

    @Override // defpackage.zef
    @dzsi
    public zvb l() {
        return this.m.l();
    }

    @Override // defpackage.zef
    @dzsi
    public View.OnClickListener m() {
        return this.m.m();
    }

    @Override // defpackage.zef
    @dzsi
    public cjtd n() {
        return this.m.n();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk o() {
        return this.m.o();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk p() {
        return this.m.p();
    }

    @Override // defpackage.zef
    @dzsi
    public Integer q() {
        return Integer.valueOf(this.d.v);
    }

    @Override // defpackage.yvn
    public dcdc<dpce> r() {
        yvx C = C();
        return C == null ? dcdc.e() : C.r();
    }

    @Override // defpackage.yvn
    @dzsi
    public String s() {
        yvx C = C();
        if (C == null) {
            return null;
        }
        return C.q();
    }

    @Override // defpackage.yvn
    public void t() {
        V();
        this.e.b();
    }

    @Override // defpackage.yvn
    public void u() {
        S();
    }

    @Override // defpackage.yvn
    public cjtd v() {
        return null;
    }

    @Override // defpackage.yvn
    public long w() {
        return this.u;
    }

    @Override // defpackage.yvn
    public yvm x() {
        if (z().booleanValue()) {
            return yvm.DRAW_ALL;
        }
        return yvm.DO_NOT_DRAW;
    }

    @Override // defpackage.yvq
    @dzsi
    public cqtd y() {
        doza dozaVar = this.l;
        if (dozaVar == null) {
            return null;
        }
        return cqrt.f(alca.b(dozaVar));
    }

    @Override // defpackage.yvq
    public Boolean z() {
        return this.z.a();
    }
}
