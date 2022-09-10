package defpackage;

import android.graphics.Rect;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aowy  reason: default package */
/* loaded from: classes2.dex */
public final class aowy {
    public static final /* synthetic */ int s = 0;
    private final bvrb A;
    private final btrm B;
    private final int C;
    private final bmdv D;
    private final aphj E;
    public final akox c;
    public final begg d;
    public final gll e;
    public final ahjq f;
    public dcdn<akqi, Integer> j;
    public aowx k;
    @dzsi
    public alad l;
    @dzsi
    public aoxt m;
    public int n;
    public final int o;
    public int r;
    private final dxio<axsc> t;
    private final Executor u;
    private final aoxv v;
    private final dxio<akvz> w;
    @dzsi
    private akuh x;
    @dzsi
    private bvpk z;
    static final cqrp a = cqrp.d(200.0d);
    static final cqrp b = cqrp.d(15.0d);
    private static final dbsl<dmpn> F = aowt.a;
    public final Map<akqi, akti> g = new HashMap();
    public final Map<akqi, aoxt> h = new HashMap();
    public dcdc<aoxt> i = dcdc.e();
    private final aoww y = new aoww(this);
    private final aowp G = new aowp(this);
    final akzy q = new aowu(this);
    public final aowx p = new aowx(this) { // from class: aowq
        private final aowy a;

        {
            this.a = this;
        }

        @Override // defpackage.aowx
        public final void a(aoxt aoxtVar) {
            aowy aowyVar = this.a;
            ilo a2 = aoxtVar.a();
            begg beggVar = aowyVar.d;
            begj begjVar = new begj();
            begjVar.b(a2);
            begjVar.n = true;
            begjVar.c = jjn.EXPANDED;
            begjVar.q = true;
            beggVar.o(begjVar, false, null);
        }
    };

    public aowy(gga ggaVar, aoxv aoxvVar, akox akoxVar, dxio<axsc> dxioVar, btrm btrmVar, bvrb bvrbVar, Executor executor, aphj aphjVar, bmdv bmdvVar, begg beggVar, gll gllVar, ahjq ahjqVar, dxio<akvz> dxioVar2, anhg anhgVar, btvo btvoVar) {
        this.c = akoxVar;
        this.v = aoxvVar;
        this.t = dxioVar;
        this.B = btrmVar;
        this.A = bvrbVar;
        this.u = executor;
        this.d = beggVar;
        this.e = gllVar;
        this.f = ahjqVar;
        this.w = dxioVar2;
        this.E = aphjVar;
        this.D = bmdvVar;
        this.C = a.e(ggaVar);
        this.o = b.e(ggaVar);
    }

    public static int f(aowo aowoVar) {
        aowo aowoVar2 = aowo.DAY;
        int ordinal = aowoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return 7;
            }
            return ordinal != 3 ? 12 : 4;
        }
        throw new AssertionError();
    }

    private final akty n() {
        return this.c.aj().aF().d();
    }

    private static boolean o(ilo iloVar) {
        return (iloVar.h().a & 16) != 0 && !iloVar.h().i.isEmpty();
    }

    private final synchronized void p(final dcdc<aoxt> dcdcVar, final int i, final dcdn<akqi, Integer> dcdnVar, final aowx aowxVar) {
        if (dchl.m(dcdcVar, this.i)) {
            return;
        }
        this.i = dcdcVar;
        this.r = i;
        this.j = dcdnVar;
        this.k = aowxVar;
        this.c.k.Pk(new Runnable(this, dcdcVar, i, dcdnVar, aowxVar) { // from class: aowr
            private final aowy a;
            private final dcdc b;
            private final dcdn c;
            private final aowx d;
            private final int e;

            {
                this.a = this;
                this.b = dcdcVar;
                this.e = i;
                this.c = dcdnVar;
                this.d = aowxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aowy aowyVar = this.a;
                dcdc<aoxt> dcdcVar2 = this.b;
                int i2 = this.e;
                dcdn<akqi, Integer> dcdnVar2 = this.c;
                aowx aowxVar2 = this.d;
                aowyVar.d();
                aowyVar.k(dcdcVar2, i2, dcdnVar2, aowxVar2);
                aowyVar.g();
            }
        }, this.u);
    }

    private final void q(aoxt aoxtVar, int i, dcdn<akqi, Integer> dcdnVar, boolean z, boolean z2, int i2, aowx aowxVar) {
        h(aoxtVar.a().ai());
        m(aoxtVar, l(aoxtVar, i, dcdnVar), z, z2, i2, aowxVar);
    }

    public final synchronized void a() {
        d();
        this.t.a().e(false);
        n().i(F);
        if (this.f.d() && this.f.a() != null) {
            GmmLocation a2 = this.f.a();
            akox akoxVar = this.c;
            dhjw bZ = dhjx.f.bZ();
            dhjy bZ2 = dhjz.e.bZ();
            double latitude = a2.getLatitude();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ2.b;
            dhjzVar.a |= 2;
            dhjzVar.c = latitude;
            double longitude = a2.getLongitude();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ2.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = longitude;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar = (dhjx) bZ.b;
            dhjz bK = bZ2.bK();
            bK.getClass();
            dhjxVar.b = bK;
            dhjxVar.a |= 1;
            akoxVar.p(akyt.e(alad.c(bZ.bK())));
        }
        this.c.ab(this.q);
        btrm btrmVar = this.B;
        aoww aowwVar = this.y;
        dceq a3 = dcet.a();
        a3.b(ardp.class, new aowz(ardp.class, aowwVar, bvrj.UI_THREAD));
        btrmVar.g(aowwVar, a3.a());
        this.v.h(this.G);
    }

    public final synchronized void b() {
        d();
        this.t.a().e(true);
        n().j(F);
        this.c.ac(this.q);
        this.B.a(this.y);
        this.v.i(this.G);
        this.i = dcdc.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(dcdc<aoxt> dcdcVar, aowx aowxVar) {
        p(dcdcVar, 1, dcmn.a, aowxVar);
    }

    public final void d() {
        for (akti aktiVar : this.g.values()) {
            n().e(aktiVar);
        }
        this.g.clear();
        this.h.clear();
    }

    public final void e(aowo aowoVar, dcdc<aoxt> dcdcVar) {
        Rect e = this.e.e();
        if (e.isEmpty()) {
            return;
        }
        e.set(e.left + this.o, e.top + this.o, e.right - this.o, e.bottom);
        akqr a2 = akqs.a();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            a2.d(dcdcVar.get(i).a().aj());
        }
        akqs b2 = a2.b();
        if (((float) akqo.l(b2, e.height(), e.width(), this.c.k().B())) > f(aowoVar)) {
            this.c.p(akyt.m(b2.c(), f(aowoVar), e));
        } else {
            this.c.p(akyt.o(b2, e));
        }
    }

    public final void g() {
        dccx F2 = dcdc.F();
        F2.i(this.g.keySet());
        this.v.d(F2.f());
    }

    public final void h(akqi akqiVar) {
        n().e(this.g.get(akqiVar));
        this.g.remove(akqiVar);
        this.h.remove(akqiVar);
    }

    public final void i(long j) {
        bvpk bvpkVar = this.z;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a2 = bvpk.a(new Runnable(this) { // from class: aows
            private final aowy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aowy aowyVar = this.a;
                akzh l = aowyVar.c.l();
                if (l == null) {
                    return;
                }
                alad p = l.p();
                alad aladVar = aowyVar.l;
                if (aladVar == null || !akqq.v(aladVar.i, p.i, 100.0d) || Math.abs(aladVar.k - p.k) / aladVar.k > 0.05d) {
                    aowyVar.l = p;
                    aowyVar.i(200L);
                    return;
                }
                aowyVar.k(aowyVar.i, aowyVar.r, aowyVar.j, aowyVar.k);
                aowyVar.g();
            }
        });
        this.z = a2;
        this.A.a(a2, bvrj.UI_THREAD, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void j(dcdc<aoxt> dcdcVar, int i, aowx aowxVar) {
        p(dcdcVar, i, dcmn.a, aowxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r0.b.get(0).b.isEmpty() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.dcdc<defpackage.aoxt> r18, int r19, defpackage.dcdn<defpackage.akqi, java.lang.Integer> r20, defpackage.aowx r21) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aowy.k(dcdc, int, dcdn, aowx):void");
    }

    public final String l(aoxt aoxtVar, int i, dcdn<akqi, Integer> dcdnVar) {
        if (i == 2) {
            if (dcdnVar == null || !dcdnVar.containsKey(aoxtVar.a().ai())) {
                return "";
            }
            if (aoxtVar.d() == 1) {
                return this.E.c(dcdnVar.get(aoxtVar.a().ai()).intValue(), 2).toString();
            }
            return this.E.c(dcdnVar.get(aoxtVar.a().ai()).intValue(), 3).toString();
        }
        if (i == 3) {
            dpuc dpucVar = aoxtVar.e().b;
            if (dpucVar == null) {
                dpucVar = dpuc.c;
            }
            if (dpucVar.b > 0) {
                bmdv bmdvVar = this.D;
                dpuc dpucVar2 = aoxtVar.e().b;
                if (dpucVar2 == null) {
                    dpucVar2 = dpuc.c;
                }
                return bmdvVar.d(dpucVar2.b, "", true);
            }
        } else if (i == 4) {
            aphj aphjVar = this.E;
            int i2 = aoxtVar.e().a;
            bvsx bvsxVar = new bvsx(aphjVar.a.getResources());
            bvsu d = bvsxVar.d(R.plurals.NUMBER_OF_VISITS_TITLE_SHORT, i2);
            d.a(bvsxVar.a(Integer.valueOf(i2)));
            return d.c().toString();
        }
        return "";
    }

    public final void m(aoxt aoxtVar, String str, boolean z, boolean z2, int i, @dzsi aowx aowxVar) {
        akuh b2;
        ilo a2 = aoxtVar.a();
        dmls a3 = akxh.a(akra.f(a2.aj()));
        dndr dndrVar = a2.p;
        dpxf cz = a2.cz();
        if (!z) {
            b2 = this.x;
            if (b2 == null) {
                dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                dmoo dmooVar = (dmoo) dmop.h.bZ();
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar = (dmop) dmooVar.b;
                dmopVar.a |= 1;
                dmopVar.b = 0;
                dmpq bZ = dmpv.s.bZ();
                dmog dmogVar = (dmog) dmoh.h.bZ();
                if (dmogVar.c) {
                    dmogVar.bF();
                    dmogVar.c = false;
                }
                dmoh dmohVar = (dmoh) dmogVar.b;
                int i2 = dmohVar.a | 1;
                dmohVar.a = i2;
                dmohVar.b = "http://mt0.google.com/vt/icon/name=icons/spotlight/measle_spotlight_L.png&scale=4";
                dmohVar.a = i2 | 4;
                dmohVar.c = 4;
                bZ.a(dmogVar);
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar2 = (dmop) dmooVar.b;
                dmpv bK = bZ.bK();
                bK.getClass();
                dmopVar2.d = bK;
                dmopVar2.a |= 4;
                dmqtVar.a(dmooVar);
                b2 = this.w.a().c((dmqx) dmqtVar.bK());
                this.x = b2;
            }
        } else if (dndrVar == dndr.HOME) {
            b2 = this.w.a().a(dmqc.LEGEND_STYLE_HOME);
        } else if (dndrVar == dndr.WORK) {
            b2 = this.w.a().a(dmqc.LEGEND_STYLE_WORK);
        } else if (dpxf.f.equals(cz)) {
            b2 = this.w.a().a(dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GENERIC);
        } else {
            akvz a4 = this.w.a();
            dpxe dpxeVar = cz.e;
            if (dpxeVar == null) {
                dpxeVar = dpxe.g;
            }
            b2 = a4.b(dpxeVar.c);
        }
        akuh a5 = this.w.a().a(dmqc.LEGEND_STYLE_PERSONAL_PLACES_TEXT_TITLE);
        akuh a6 = this.w.a().a(dmqc.LEGEND_STYLE_PERSONAL_PLACES_TEXT_SUBTITLE);
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(b2.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        dmlp bZ2 = dmlq.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ2.b;
        a3.getClass();
        dmlqVar.b = a3;
        dmlqVar.a |= 1;
        dmlo dmloVar = z ? dmlo.TOP : dmlo.CENTER;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ2.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmlq bK2 = bZ2.bK();
        bK2.getClass();
        dmpnVar2.d = bK2;
        dmpnVar2.a |= 4;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        int i3 = dmpnVar3.a | 64;
        dmpnVar3.a = i3;
        dmpnVar3.h = i;
        if (z) {
            int i4 = true != z2 ? 17 : 1;
            dmpnVar3.a = i3 | 32;
            dmpnVar3.g = i4;
            dmpe a7 = akxg.a(dfyn.a(a2.h().i, 20, 2, 50), a5);
            if (a7.c) {
                a7.bF();
                a7.c = false;
            }
            dmph dmphVar2 = (dmph) a7.b;
            dmphVar2.e = 2;
            dmphVar2.a |= 4;
            if (!dbsj.d(str)) {
                dmpc e = a6.e();
                if (e.c) {
                    e.bF();
                    e.c = false;
                }
                dmpd dmpdVar = (dmpd) e.b;
                dmpd dmpdVar2 = dmpd.h;
                int i5 = dmpdVar.a | 16;
                dmpdVar.a = i5;
                dmpdVar.f = true;
                str.getClass();
                dmpdVar.a = i5 | 1;
                dmpdVar.b = str;
                a7.b(e);
            }
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar4 = (dmpn) dmpkVar.b;
            dmph dmphVar3 = (dmph) a7.bK();
            dmphVar3.getClass();
            dmpnVar4.c = dmphVar3;
            dmpnVar4.a |= 2;
        } else {
            dmpnVar3.a = i3 | 32;
            dmpnVar3.g = 2;
        }
        akxf.I(dmpkVar);
        akti c = n().c((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        n().f(c);
        c.Pt(new aowv(this, aoxtVar, aowxVar));
        this.g.put(a2.ai(), c);
        if (z) {
            this.h.put(a2.ai(), aoxtVar);
        } else {
            this.h.remove(a2.ai());
        }
    }
}
