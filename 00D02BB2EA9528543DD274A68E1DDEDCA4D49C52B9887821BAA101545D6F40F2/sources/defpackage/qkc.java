package defpackage;

import android.app.Application;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qkc  reason: default package */
/* loaded from: classes7.dex */
public final class qkc {
    public final dxio<qbt> a;
    public final cjqy b;
    public final cjqq c;
    public final Executor d;
    private final akox e;
    private final yzr f;
    private final qke g;
    private final btvo h;
    @dzsi
    private amub i;
    private boolean j;
    private List<yzq> k;
    private List<yzq> l;
    private List<aktc> m;

    public qkc(Application application, akox akoxVar, dxio<qbt> dxioVar, btvo btvoVar, cjqy cjqyVar, cjqq cjqqVar, Executor executor) {
        qke qkeVar = new qke(akoxVar);
        yzr yzrVar = new yzr(application.getResources());
        this.k = dcdc.e();
        this.l = dcdc.e();
        this.m = dcdc.e();
        this.e = akoxVar;
        this.a = dxioVar;
        this.f = yzrVar;
        this.g = qkeVar;
        this.h = btvoVar;
        this.b = cjqyVar;
        this.c = cjqqVar;
        this.d = executor;
    }

    public static cjtd d() {
        cjta b = cjtd.b();
        b.d = dtyc.cg;
        return b.a();
    }

    private final void e() {
        dmqc dmqcVar;
        if (this.j) {
            if (!this.e.i()) {
                return;
            }
            if (!this.k.isEmpty()) {
                if (this.k.equals(this.l)) {
                    return;
                }
                g();
                dccx F = dcdc.F();
                for (yzq yzqVar : this.k) {
                    qka qkaVar = new qka(this, alge.b(new algb(yzqVar.b()), dcdc.e(), new alfx(new Rect(), dcdc.e()), dbpy.a));
                    qke qkeVar = this.g;
                    akvz aE = qkeVar.a.aj().aE();
                    akuh a = aE.a(dmqc.LEGEND_STYLE_COMMUTE_ETA_CALLOUT);
                    akuh a2 = aE.a(dmqc.LEGEND_STYLE_COMMUTE_ETA_CALLOUT_DRIVING_ICON);
                    dpej e = yzqVar.e();
                    dpej dpejVar = dpej.DELAY_NODATA;
                    int ordinal = e.ordinal();
                    if (ordinal == 1) {
                        dmqcVar = dmqc.LEGEND_STYLE_COMMUTE_ETA_CALLOUT_DELAY_HEAVY;
                    } else if (ordinal != 2) {
                        dmqcVar = ordinal != 3 ? dmqc.LEGEND_STYLE_COMMUTE_ETA_CALLOUT_NO_DELAY : dmqc.LEGEND_STYLE_COMMUTE_ETA_CALLOUT_DELAY_LIGHT;
                    } else {
                        dmqcVar = dmqc.LEGEND_STYLE_COMMUTE_ETA_CALLOUT_DELAY_MEDIUM;
                    }
                    akuh a3 = qkeVar.a.aj().aE().a(dmqcVar);
                    dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                    dmpe f = a.f();
                    f.b(a2.e());
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar = (dmpn) dmpkVar.b;
                    dmph dmphVar = (dmph) f.bK();
                    dmphVar.getClass();
                    dmpnVar.b = dmphVar;
                    dmpnVar.a |= 1;
                    dmpe f2 = a.f();
                    dmpc e2 = a3.e();
                    String valueOf = String.valueOf(yzqVar.a());
                    String concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                    if (e2.c) {
                        e2.bF();
                        e2.c = false;
                    }
                    dmpd dmpdVar = (dmpd) e2.b;
                    dmpd dmpdVar2 = dmpd.h;
                    concat.getClass();
                    dmpdVar.a |= 1;
                    dmpdVar.b = concat;
                    f2.b(e2);
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                    dmph dmphVar2 = (dmph) f2.bK();
                    dmphVar2.getClass();
                    dmpnVar2.c = dmphVar2;
                    dmpnVar2.a |= 2;
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar3 = (dmpn) dmpkVar.b;
                    dmpnVar3.a |= 32;
                    dmpnVar3.g = 3;
                    dsqv<dmpn, akuj> dsqvVar = akvj.b;
                    akui bZ = akuj.e.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    akuj akujVar = (akuj) bZ.b;
                    akujVar.a |= 4;
                    akujVar.d = true;
                    dmpkVar.k(dsqvVar, bZ.bK());
                    dmlp bZ2 = dmlq.e.bZ();
                    dmlo dmloVar = xbb.a.get(0);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmlq dmlqVar = (dmlq) bZ2.b;
                    dmlqVar.c = dmloVar.j;
                    dmlqVar.a |= 2;
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar4 = (dmpn) dmpkVar.b;
                    dmlq bK = bZ2.bK();
                    bK.getClass();
                    dmpnVar4.d = bK;
                    dmpnVar4.a |= 4;
                    aktc d = qkeVar.a.aj().aC().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                    d.Pt(new qkb(this, yzqVar));
                    F.g(d);
                    this.e.aj().ak().b(d, qkaVar, amsb.ROUTE_DURATION, 0, xbb.a);
                }
                this.m = F.f();
                this.l = this.k;
                return;
            }
            f();
            return;
        }
        f();
    }

    private final void f() {
        if (this.l.isEmpty()) {
            return;
        }
        g();
        this.l = dcdc.e();
    }

    private final void g() {
        for (aktc aktcVar : this.m) {
            this.e.aj().ak().a(aktcVar);
            this.e.aj().aC().e(aktcVar);
        }
        this.m = dcdc.e();
    }

    private final boolean h() {
        return sif.a(this.h);
    }

    public final void a() {
        if (!h()) {
            return;
        }
        this.j = true;
        e();
    }

    public final void b() {
        if (!h()) {
            return;
        }
        this.j = false;
        e();
    }

    public final void c(@dzsi amub amubVar) {
        if (h() && this.i != amubVar) {
            if (amubVar != null) {
                yzr yzrVar = this.f;
                dpie dpieVar = amubVar.d.a;
                akrk akrkVar = amubVar.l;
                amvh j = amubVar.j();
                amvh k = amubVar.k();
                dccx F = dcdc.F();
                for (int i = 0; i < dpieVar.e.size(); i++) {
                    dpbp dpbpVar = dpieVar.e.get(i);
                    for (int i2 = 0; i2 < dpbpVar.c.size(); i2++) {
                        dpdy dpdyVar = dpbpVar.c.get(i2);
                        dpec dpecVar = dpdyVar.c;
                        if (dpecVar == null) {
                            dpecVar = dpec.o;
                        }
                        if (dpdyVar.d.size() > 0 && (dpecVar.a & 1) != 0) {
                            dqvj c = dqvj.c(dpecVar.b);
                            if (c == null) {
                                c = dqvj.DRIVE;
                            }
                            if (c == dqvj.DRIVE) {
                                String b = vxp.b(dpecVar, yzrVar.a.b, bvsz.ABBREVIATED);
                                if (b == null) {
                                    bvoo.h("Formatted duration should not be null", new Object[0]);
                                }
                                String e = dbsj.e(b);
                                akrk a = yzr.a(akrkVar, dpieVar, i, i2);
                                amvh b2 = yzr.b(a, dpieVar, i, i2, j);
                                amvh c2 = yzr.c(a, dpieVar, i, i2, k);
                                doxd doxdVar = dpecVar.k;
                                if (doxdVar == null) {
                                    doxdVar = doxd.l;
                                }
                                dpej b3 = dpej.b(doxdVar.c);
                                if (b3 == null) {
                                    b3 = dpej.DELAY_NODATA;
                                }
                                F.g(new yym(e, a, b2, c2, b3));
                            }
                        }
                    }
                }
                this.k = F.f();
            } else {
                this.k = dcdc.e();
            }
            this.i = amubVar;
            e();
        }
    }
}
