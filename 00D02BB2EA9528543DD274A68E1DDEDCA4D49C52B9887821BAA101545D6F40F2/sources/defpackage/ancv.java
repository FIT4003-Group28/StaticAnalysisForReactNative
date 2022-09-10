package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ancv  reason: default package */
/* loaded from: classes2.dex */
public class ancv extends ges {
    @dzsi
    private ddho aA;
    private boolean aB;
    protected cqkf<anfa> ad;
    @dzsi
    public akqq ae;
    public akpm ai;
    public hwe aj;
    public efg ak;
    public cqkj al;
    public gfq am;
    public isr an;
    public btrm ao;
    public cqat ap;
    public afwp aq;
    public Executor ar;
    @dzsi
    private cqkf<jap> av;
    @dzsi
    private String aw;
    @dzsi
    private aktc ax;
    @dzsi
    private akzy ay;
    @dzsi
    private List<akpp> az;
    protected cqkf<jap> e;
    anef f;
    public anct g;
    private static final dcqe a = dcqe.c("ancv");
    public static final long b = TimeUnit.SECONDS.toMillis(4);
    public static final int c = 2132018113;
    public static final int d = 2132018112;
    private static final ancl au = new ancm();
    static final anef at = new anci();
    private boolean aC = false;
    public boolean af = false;
    public boolean ag = false;
    public ancl ah = au;
    private final akzy aO = new akzy(this) { // from class: ancc
        private final ancv a;

        {
            this.a = this;
        }

        @Override // defpackage.akzy
        public final void a(alad aladVar) {
            ancv ancvVar = this.a;
            if (!ancvVar.U()) {
                return;
            }
            if (ancvVar.bn() != null) {
                akqq akqqVar = aladVar.i;
                akqq bn = ancvVar.bn();
                dbsk.s(bn);
                if (akqo.c(akqqVar, bn, 2.0E-6d)) {
                    return;
                }
            }
            ancvVar.g.f(!ancvVar.ag);
        }
    };
    private final akzx aP = new akzx(this) { // from class: ancd
        private final ancv a;

        {
            this.a = this;
        }

        @Override // defpackage.akzx
        public final void l(akzs akzsVar) {
            ancv ancvVar = this.a;
            if (akzsVar.a) {
                ancvVar.ag = true;
            }
        }
    };
    private final akzy aQ = new akzy(this) { // from class: ance
        private final ancv a;

        {
            this.a = this;
        }

        @Override // defpackage.akzy
        public final void a(alad aladVar) {
            ancv ancvVar = this.a;
            if (!ancvVar.aD) {
                return;
            }
            if (ancvVar.bn() != null) {
                akqq akqqVar = aladVar.i;
                akqq bn = ancvVar.bn();
                dbsk.s(bn);
                if (akqo.c(akqqVar, bn, 2.0E-6d)) {
                    return;
                }
            }
            ancvVar.bs();
        }
    };
    @dzsi
    public andd as = null;
    private final ancn aR = new ancn(this);

    public static Drawable bq(int i, Context context) {
        Drawable drawable = context.getDrawable(i);
        return drawable == null ? bvlo.a().b(context.getResources(), i, bvlw.a) : drawable;
    }

    public static ancv w(anee aneeVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("args", aneeVar);
        ancv ancvVar = new ancv();
        ancvVar.B(bundle);
        return ancvVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        this.ao.a(this.aR);
        super.Qd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final anee aJ() {
        return (anee) this.o.getSerializable("args");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int aR() {
        return this.aB ? -1 : 0;
    }

    protected void aS(akpm akpmVar) {
        akqq akqqVar = this.ae;
        if (akqqVar != null) {
            akyc i = akyt.i(akqqVar, 16.0f);
            i.b = aR();
            akpmVar.p(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aT() {
        this.ag = true;
        bs();
        andd anddVar = this.as;
        if (anddVar != null) {
            anddVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aU() {
        gfq.l(this);
    }

    protected boolean aV() {
        return false;
    }

    public anct aX() {
        return this.g;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        btrm btrmVar = this.ao;
        ancn ancnVar = this.aR;
        dceq a2 = dcet.a();
        a2.b(ardp.class, new ancw(ardp.class, ancnVar, bvrj.UI_THREAD));
        btrmVar.g(ancnVar, a2.a());
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ad = this.al.e(new anem());
        anee aneeVar = (anee) this.o.getSerializable("args");
        dbsk.s(aneeVar);
        this.ae = aneeVar.g();
        this.e = this.al.c(this.f.a(), null);
        cqiw<jap> b2 = this.f.b();
        if (b2 != null) {
            this.av = this.al.c(b2, null);
        }
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public void am() {
        akpm akpmVar;
        andd anddVar = this.as;
        if (anddVar != null && (akpmVar = this.ai) != null) {
            akpmVar.aj().ax(anddVar.b);
            anddVar.c();
        }
        akpm akpmVar2 = this.ai;
        if (akpmVar2 != null && this.ax != null) {
            akty aC = akpmVar2.aj().aC();
            aktc aktcVar = this.ax;
            dbsk.s(aktcVar);
            aC.e(aktcVar);
        }
        super.am();
    }

    @dzsi
    public final akqq bn() {
        return ((anee) this.o.getSerializable("args")).g();
    }

    public final void bo() {
        akpm akpmVar;
        if (this.ax == null || (akpmVar = this.ai) == null) {
            return;
        }
        akty aC = akpmVar.aj().aC();
        aktc aktcVar = this.ax;
        dbsk.s(aktcVar);
        aC.f(aktcVar);
    }

    public final void bp() {
        akpm akpmVar;
        if (this.ax == null || (akpmVar = this.ai) == null) {
            return;
        }
        akty aC = akpmVar.aj().aC();
        aktc aktcVar = this.ax;
        dbsk.s(aktcVar);
        aC.g(aktcVar);
    }

    public final void br() {
        this.ah.a();
    }

    public final void bs() {
        this.ah.b();
    }

    @Override // defpackage.ges, defpackage.gfo
    public boolean e() {
        bxlx a2 = bxlz.a(this);
        if (a2 == null || !a2.d()) {
            Nz(null);
            return false;
        }
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        anef anefVar;
        Bitmap c2;
        anee aJ = aJ();
        if (aJ == null) {
            bvoo.h("Cannot create fragment, no args found.", new Object[0]);
            aU();
            return;
        }
        this.aA = aJ.r();
        super.l(bundle);
        this.ae = aJ.g();
        this.aB = aJ.h();
        this.aw = aJ.p();
        this.aC = aJ.i();
        this.af = aJ.l();
        this.g = new anct(this, aJ);
        dbsg<anef> q = aJ.q();
        if (q.a()) {
            anefVar = q.b();
        } else {
            anefVar = at;
        }
        this.f = anefVar;
        dcdc<anec> u = aJ.u();
        dccx F = dcdc.F();
        for (anec anecVar : u) {
            Drawable bq = bq(anecVar.a(), H());
            if (bq instanceof BitmapDrawable) {
                c2 = ((BitmapDrawable) bq).getBitmap();
            } else {
                c2 = bvlf.c(bq, bq.getIntrinsicWidth(), bq.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            F.g(akpp.p(anecVar.b(), true, 2, c2));
        }
        this.az = F.f();
        String m = aJ.m();
        if (!this.af || m == null) {
            return;
        }
        if (aJ.o()) {
            this.ah = new ancp(this);
        } else {
            this.ah = new ancu(this, m);
        }
    }

    @Override // defpackage.ges
    public ddho p() {
        ddho ddhoVar = this.aA;
        dbsk.s(ddhoVar);
        return ddhoVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        akpm akpmVar;
        super.s();
        this.ag = false;
        this.g.f(this.aC);
        this.e.e(this.g);
        cqkf<jap> cqkfVar = this.av;
        if (cqkfVar != null) {
            cqkfVar.e(this.g);
        }
        this.ad.e(this.g);
        egf a2 = egf.a();
        a2.x = false;
        a2.l(false);
        egj egjVar = new egj(this);
        egjVar.A(a2);
        egjVar.F(this.e.c());
        egjVar.f(false);
        egjVar.ag(null);
        egjVar.k(true);
        egjVar.I(2);
        egjVar.w(null);
        egjVar.M(this.ad.c());
        dbsg<cjmu> x = aJ().x();
        if (x.a()) {
            egjVar.aq(x.b());
        }
        if (aV()) {
            egjVar.c(this.aq.f());
        }
        cqkf<jap> cqkfVar2 = this.av;
        if (cqkfVar2 != null) {
            egjVar.aw(cqkfVar2.c(), this.f.c());
        }
        this.ak.a(egjVar.a());
        if (this.ai != null) {
            if (!TextUtils.isEmpty(this.aw) && (akpmVar = this.ai) != null && this.aw != null && this.ae != null) {
                akto aF = akpmVar.aj().aF();
                String str = this.aw;
                dbsk.s(str);
                akqq akqqVar = this.ae;
                dbsk.s(akqqVar);
                dmls a3 = akxh.a(akra.f(akqqVar));
                akvz e = aF.e();
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
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmpv dmpvVar = (dmpv) bZ.b;
                dmpvVar.a |= 1;
                dmpvVar.b = -9211021;
                dmoa bZ2 = dmob.g.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmob dmobVar = (dmob) bZ2.b;
                int i = dmobVar.a | 1;
                dmobVar.a = i;
                dmobVar.b = 14;
                dmobVar.a = i | 2;
                dmobVar.c = 8;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmpv dmpvVar2 = (dmpv) bZ.b;
                dmob bK = bZ2.bK();
                bK.getClass();
                dmpvVar2.e = bK;
                dmpvVar2.a |= 4;
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar2 = (dmop) dmooVar.b;
                dmpv bK2 = bZ.bK();
                bK2.getClass();
                dmopVar2.d = bK2;
                dmopVar2.a |= 4;
                dmqtVar.a(dmooVar);
                aktg c2 = e.c((dmqx) dmqtVar.bK());
                dmqt dmqtVar2 = (dmqt) dmqx.e.bZ();
                dmoo dmooVar2 = (dmoo) dmop.h.bZ();
                if (dmooVar2.c) {
                    dmooVar2.bF();
                    dmooVar2.c = false;
                }
                dmop dmopVar3 = (dmop) dmooVar2.b;
                dmopVar3.a |= 1;
                dmopVar3.b = 0;
                dmpq bZ3 = dmpv.s.bZ();
                dmsr bZ4 = dmsu.u.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dmsu dmsuVar = (dmsu) bZ4.b;
                dmsuVar.a |= 4;
                dmsuVar.d = -1;
                dmsu dmsuVar2 = (dmsu) bZ4.b;
                dmsuVar2.o = 2;
                int i2 = dmsuVar2.a | 2048;
                dmsuVar2.a = i2;
                int i3 = i2 | 1024;
                dmsuVar2.a = i3;
                dmsuVar2.n = 4;
                dmsuVar2.a = i3 | 8;
                dmsuVar2.e = 12;
                bZ4.b(dmlo.TOP);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dmsu dmsuVar3 = (dmsu) bZ4.b;
                int i4 = dmsuVar3.a | 8192;
                dmsuVar3.a = i4;
                dmsuVar3.s = 12.0f;
                int i5 = i4 | 16384;
                dmsuVar3.a = i5;
                dmsuVar3.t = 8.0f;
                int i6 = i5 | 256;
                dmsuVar3.a = i6;
                dmsuVar3.l = 1721671326;
                int i7 = i6 | 512;
                dmsuVar3.a = i7;
                dmsuVar3.m = 4;
                int i8 = i7 | 64;
                dmsuVar3.a = i8;
                dmsuVar3.j = 2;
                dmsuVar3.a = i8 | 128;
                dmsuVar3.k = 2;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dmpv dmpvVar3 = (dmpv) bZ3.b;
                dmsu bK3 = bZ4.bK();
                bK3.getClass();
                dmpvVar3.f = bK3;
                dmpvVar3.a |= 8;
                if (dmooVar2.c) {
                    dmooVar2.bF();
                    dmooVar2.c = false;
                }
                dmop dmopVar4 = (dmop) dmooVar2.b;
                dmpv bK4 = bZ3.bK();
                bK4.getClass();
                dmopVar4.d = bK4;
                dmopVar4.a |= 4;
                dmqtVar2.a(dmooVar2);
                aktg c3 = e.c((dmqx) dmqtVar2.bK());
                akty d2 = aF.d();
                dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                dmpe dmpeVar = (dmpe) dmph.f.bZ();
                dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar = (dmpd) dmpcVar.b;
                str.getClass();
                dmpdVar.a |= 1;
                dmpdVar.b = str;
                int a4 = c2.a();
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar2 = (dmpd) dmpcVar.b;
                dmpdVar2.a |= 2;
                dmpdVar2.c = a4;
                dmpeVar.b(dmpcVar);
                int a5 = c3.a();
                if (dmpeVar.c) {
                    dmpeVar.bF();
                    dmpeVar.c = false;
                }
                dmph dmphVar = (dmph) dmpeVar.b;
                dmphVar.a |= 1;
                dmphVar.c = a5;
                if (dmpkVar.c) {
                    dmpkVar.bF();
                    dmpkVar.c = false;
                }
                dmpn dmpnVar = (dmpn) dmpkVar.b;
                dmph dmphVar2 = (dmph) dmpeVar.bK();
                dmphVar2.getClass();
                dmpnVar.b = dmphVar2;
                dmpnVar.a |= 1;
                dmlp bZ5 = dmlq.e.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dmlq dmlqVar = (dmlq) bZ5.b;
                a3.getClass();
                dmlqVar.b = a3;
                dmlqVar.a |= 1;
                dmlo dmloVar = dmlo.TOP;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dmlq dmlqVar2 = (dmlq) bZ5.b;
                dmlqVar2.c = dmloVar.j;
                dmlqVar2.a = 2 | dmlqVar2.a;
                if (dmpkVar.c) {
                    dmpkVar.bF();
                    dmpkVar.c = false;
                }
                dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                dmlq bK5 = bZ5.bK();
                bK5.getClass();
                dmpnVar2.d = bK5;
                dmpnVar2.a |= 4;
                dsqv<dmpn, akuj> dsqvVar = akvj.b;
                akui bZ6 = akuj.e.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                akuj akujVar = (akuj) bZ6.b;
                akujVar.a |= 1;
                akujVar.b = 144.0f;
                dmpkVar.k(dsqvVar, bZ6.bK());
                aktc d3 = d2.d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                d3.Pu();
                this.ax = d3;
                this.ay = new ancj(this);
            }
            aS(this.ai);
            bo();
            this.ae = null;
            akzy akzyVar = this.ay;
            if (akzyVar != null) {
                this.ai.ab(akzyVar);
            }
            List<akpp> list = this.az;
            if (list != null) {
                this.aj.d(list, true);
            } else {
                this.aj.h();
            }
            if (this.aC) {
                this.ai.ab(this.aO);
            }
            if (this.af) {
                this.ai.ab(this.aQ);
            }
            this.ai.ad(this.aP);
            if (!this.g.b()) {
                return;
            }
            this.as = new andd(this.an, this.ar, new andc(this) { // from class: ancf
                private final ancv a;

                {
                    this.a = this;
                }

                @Override // defpackage.andc
                public final Object a() {
                    return this.a.aX().d();
                }
            }, new anda(this) { // from class: ancg
                private final ancv a;

                {
                    this.a = this;
                }

                @Override // defpackage.anda
                public final Object a() {
                    return Boolean.valueOf(this.a.ai.U());
                }
            }, new Runnable(this) { // from class: anch
                private final ancv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a.aX());
                }
            });
            this.ai.aj().aw(this.as.b);
            this.as.b();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        this.e.e(null);
        cqkf<jap> cqkfVar = this.av;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.ad.e(null);
        akpm akpmVar = this.ai;
        if (akpmVar != null) {
            akpmVar.ae(this.aP);
            if (this.af) {
                this.ai.ac(this.aQ);
            }
            if (this.aC) {
                this.ai.ac(this.aO);
            }
            akzy akzyVar = this.ay;
            if (akzyVar != null) {
                this.ai.ac(akzyVar);
            }
            this.aj.h();
        }
        bp();
        super.u();
    }
}
