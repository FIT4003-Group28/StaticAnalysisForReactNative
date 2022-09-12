package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dsr  reason: default package */
/* loaded from: classes6.dex */
public final class dsr {
    public final ahjq a;
    public final Executor b;
    public final akty c;
    public final aktz d;
    public final btrm e;
    @dzsi
    public crzm<GmmLocation> f;
    public final dsq g;
    @dzsi
    public akqq h;
    public boolean i;
    public boolean j;
    @dzsi
    public akte k;
    @dzsi
    public akti l;
    @dzsi
    public crzp<GmmLocation> m;
    private final akox n;
    private final dxio<akxn> o;
    private final Resources p;

    public dsr(akox akoxVar, ahjq ahjqVar, Executor executor, btrm btrmVar, Resources resources) {
        aktz aB = akoxVar.aj().aB();
        akty aC = akoxVar.aj().aC();
        final akvz aE = akoxVar.aj().aE();
        dsq dsqVar = new dsq(this);
        this.g = dsqVar;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = null;
        this.l = null;
        this.p = resources;
        this.n = akoxVar;
        this.a = ahjqVar;
        this.b = executor;
        this.e = btrmVar;
        this.c = aC;
        this.d = aB;
        this.o = new dxio(aE) { // from class: dso
            private final akvz a;

            {
                this.a = aE;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return new akxn(this.a);
            }
        };
        dceq a = dcet.a();
        a.b(ahld.class, new dst(ahld.class, dsqVar, bvrj.UI_THREAD));
        btrmVar.g(dsqVar, a.a());
    }

    public final void a(@dzsi akqq akqqVar) {
        akte akteVar;
        if (this.i || akqqVar == null) {
            return;
        }
        akti aktiVar = null;
        if (!akqqVar.equals(this.h)) {
            this.h = akqqVar;
            akteVar = this.k;
            if (akteVar == null) {
                akteVar = null;
            }
            akuh b = this.n.aj().aE().b(819L);
            dmqd dmqdVar = (dmqd) dmqg.p.bZ();
            double[] dArr = new double[360];
            akra f = akra.f(akqqVar);
            for (int i = 0; i < 180; i++) {
                akra C = f.C(akra.h((i * 360.0f) / 179.0f, (float) (f.r() * 84.0d)));
                int i2 = i + i;
                dArr[i2] = C.k();
                dArr[i2 + 1] = C.o();
            }
            dspd b2 = akxh.b(dArr);
            if (dmqdVar.c) {
                dmqdVar.bF();
                dmqdVar.c = false;
            }
            dmqg dmqgVar = (dmqg) dmqdVar.b;
            b2.getClass();
            int i3 = dmqgVar.a | 1;
            dmqgVar.a = i3;
            dmqgVar.b = b2;
            dmqgVar.a = i3 | 2;
            dmqgVar.c = 180;
            dmqg dmqgVar2 = (dmqg) dmqdVar.b;
            dmqgVar2.h = 2;
            dmqgVar2.a |= 16;
            int ordinal = bntp.STEP_ARROW_OVERLAY.ordinal();
            if (dmqdVar.c) {
                dmqdVar.bF();
                dmqdVar.c = false;
            }
            dmqg dmqgVar3 = (dmqg) dmqdVar.b;
            int i4 = dmqgVar3.a | 1024;
            dmqgVar3.a = i4;
            dmqgVar3.n = ordinal;
            dmqgVar3.a = i4 | 2048;
            dmqgVar3.o = 1;
            dmpz b3 = b.b();
            if (b3 != null) {
                dmqdVar.k(dmqa.e, b3);
            }
            akte c = this.d.c((dmqg) dmqdVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE);
            this.k = c;
            this.d.f(c);
        } else {
            akteVar = null;
        }
        akti aktiVar2 = this.l;
        if (aktiVar2 != null) {
            aktiVar = aktiVar2;
        }
        float f2 = this.n.k().p().m;
        akra f3 = akra.f(akqqVar);
        akra f4 = akra.f(f3.C(akra.h(f2 + 180.0f, ((float) f3.r()) * 84.0f)).S());
        dmpk g = this.o.a().b(dmlo.BOTTOM).a().g();
        dmlp bZ = dmlq.e.bZ();
        dmls a = akxh.a(f4);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a.getClass();
        dmlqVar.b = a;
        dmlqVar.a |= 1;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar = (dmpn) g.b;
        dmlq bK = bZ.bK();
        dmpn dmpnVar2 = dmpn.r;
        bK.getClass();
        dmpnVar.d = bK;
        dmpnVar.a |= 4;
        dmpe a2 = akxg.a(dfyn.a(this.p.getString(R.string.WALKING_CIRCLE_TEXT, 1), 20, 2, 50), ((akxj) this.o.a().c(dmqc.LEGEND_STYLE_MICRO_LANDMARK_RETAIL_TEXT_TITLE)).a);
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar3 = (dmpn) g.b;
        dmph dmphVar = (dmph) a2.bK();
        dmphVar.getClass();
        dmpnVar3.b = dmphVar;
        dmpnVar3.a |= 1;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar4 = (dmpn) g.b;
        int i5 = dmpnVar4.a | 64;
        dmpnVar4.a = i5;
        dmpnVar4.h = Integer.MAX_VALUE;
        dmpnVar4.a = i5 | 32;
        dmpnVar4.g = 1;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.b((akus) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.c((akus) bZ2.b);
        g.k(dsqvVar, bZ2.bK());
        int ordinal2 = bntp.STEP_ARROW_OVERLAY.ordinal();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar5 = (dmpn) g.b;
        dmpnVar5.a |= 8192;
        dmpnVar5.m = ordinal2;
        akxf.M(g);
        akti c2 = this.c.c((dmpn) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        this.l = c2;
        this.c.f(c2);
        if (akteVar != null) {
            this.d.h(akteVar);
            this.d.a(akteVar);
        }
        if (aktiVar == null) {
            return;
        }
        this.c.g(aktiVar);
        this.c.e(aktiVar);
    }
}
