package defpackage;

import android.graphics.Bitmap;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qgw  reason: default package */
/* loaded from: classes7.dex */
public final class qgw implements qgt {
    public final akto a;
    private final qhc e;
    private final Executor f;
    private final qgs h;
    private final qgz i;
    @dzsi
    private qhu j;
    @dzsi
    private dehn<Bitmap> l;
    public final List<aktd> b = new ArrayList();
    private final Map<String, akuh> g = new dzqd();
    public final Map<String, akuh> c = new dzqd();
    public List<qhu> d = dcdc.e();
    private boolean k = false;

    public qgw(akto aktoVar, qhc qhcVar, Executor executor, qgs qgsVar, qgz qgzVar) {
        this.a = aktoVar;
        this.e = qhcVar;
        this.f = executor;
        this.h = qgsVar;
        this.i = qgzVar;
    }

    private final void h(qhu qhuVar, List<qhu> list, boolean z) {
        dehn<Bitmap> dehnVar;
        dbsk.l(!this.k);
        this.j = qhuVar;
        this.d = list;
        this.k = true;
        akuh akuhVar = this.c.get(qhuVar.d());
        if (akuhVar == null) {
            String d = qhuVar.d();
            if (d != null && ((dehnVar = this.l) == null || dehnVar.isDone())) {
                qhc qhcVar = this.e;
                deig d2 = deig.d();
                final chr<Bitmap> d3 = qhcVar.b.d(d, new qhb(qhcVar, d2), null);
                d2.Pk(new Runnable(d3) { // from class: qha
                    private final chr a;

                    {
                        this.a = d3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.cancel(false);
                    }
                }, qhcVar.c);
                this.l = d2;
                deha.q(d2, new qgu(this, d, qhuVar, z), this.f);
            }
        } else {
            f(akuhVar, qhuVar, z);
        }
        for (qhu qhuVar2 : list) {
            String d4 = qhuVar2.d();
            if (d4 != null) {
                this.b.add(g(qhuVar2, d4));
            }
        }
    }

    private final void i() {
        for (aktd aktdVar : this.b) {
            aktdVar.j();
        }
        this.b.clear();
        this.k = false;
        this.j = null;
        this.d = dcdc.e();
    }

    private static dmoo j(String str, int i, int i2) {
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = i;
        dmpq bZ = dmpv.s.bZ();
        dmog dmogVar = (dmog) dmoh.h.bZ();
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar = (dmoh) dmogVar.b;
        int i3 = dmohVar.a | 4;
        dmohVar.a = i3;
        dmohVar.c = i2;
        str.getClass();
        dmohVar.a = i3 | 1;
        dmohVar.b = str;
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
        return dmooVar;
    }

    @Override // defpackage.qgt
    public final void a(qhu qhuVar, List<qhu> list) {
        h(qhuVar, list, false);
    }

    @Override // defpackage.qgt
    public final void b() {
        dbsk.l(this.k);
        dehn<Bitmap> dehnVar = this.l;
        if (dehnVar != null) {
            dehnVar.cancel(true);
        }
        i();
        dzrn it = ((dzrl) ((dznt) this.g).values()).iterator();
        while (it.hasNext()) {
            this.a.e().j((akuh) it.next());
        }
        dzrn it2 = ((dzrl) ((dznt) this.c).values()).iterator();
        while (it2.hasNext()) {
            this.a.e().j((akuh) it2.next());
        }
        this.g.clear();
        this.c.clear();
        this.e.a();
    }

    @Override // defpackage.qgt
    public final void c(qhu qhuVar, List<qhu> list) {
        dbsk.l(this.k);
        i();
        this.j = qhuVar;
        this.d = list;
        h(qhuVar, list, true);
    }

    @Override // defpackage.qgt
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.qgt
    public final boolean e(qhu qhuVar, List<qhu> list) {
        return this.k && qhuVar.equals(this.j) && list.equals(this.d);
    }

    public final void f(akuh akuhVar, qhu qhuVar, boolean z) {
        akto aktoVar = this.a;
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(akuhVar.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        int i = dmpnVar2.a | 32;
        dmpnVar2.a = i;
        dmpnVar2.g = 1;
        dmpnVar2.a = i | 64;
        dmpnVar2.h = 10;
        dmlp bZ = dmlq.e.bZ();
        dmls a = akxh.a(akra.f(qhuVar.a()));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a.getClass();
        dmlqVar.b = a;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.TOP;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar3.d = bK;
        dmpnVar3.a |= 4;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.d((akus) bZ2.b);
        dmpkVar.k(dsqvVar, bZ2.bK());
        int a2 = akuhVar.a();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmpnVar4.a |= 2048;
        dmpnVar4.k = a2;
        akti a3 = aktoVar.a((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        if (z) {
            qgz qgzVar = this.i;
            OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
            bvnx a4 = qgzVar.a.a();
            qgz.a(a4, 1);
            qgz.a(overshootInterpolator, 2);
            a3.c(new qgy(a4, overshootInterpolator));
        }
        this.b.add(a3);
    }

    public final akti g(qhu qhuVar, String str) {
        akuh akuhVar = this.g.get(str);
        if (akuhVar == null) {
            akvz e = this.a.e();
            dmqt dmqtVar = (dmqt) dmqx.e.bZ();
            dmqtVar.a(j(str, 0, 16));
            dmqtVar.a(j(str, 14, 8));
            dmqtVar.a(j(str, 16, 4));
            akuhVar = e.c((dmqx) dmqtVar.bK());
            this.g.put(str, akuhVar);
        }
        akto aktoVar = this.a;
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(akuhVar.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmpnVar2.a |= 32;
        dmpnVar2.g = 1;
        dmlp bZ = dmlq.e.bZ();
        dmls a = akxh.a(akra.f(qhuVar.a()));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a.getClass();
        dmlqVar.b = a;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.TOP;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar3.d = bK;
        dmpnVar3.a = 4 | dmpnVar3.a;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.d((akus) bZ2.b);
        dmpkVar.k(dsqvVar, bZ2.bK());
        dsqv<dmpn, dmlm> dsqvVar2 = dmnl.G;
        dmll bZ3 = dmlm.g.bZ();
        int i = ((dtxi) dtxn.x).a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmlm dmlmVar = (dmlm) bZ3.b;
        dmlmVar.a = 8 | dmlmVar.a;
        dmlmVar.e = i;
        dmpkVar.k(dsqvVar2, bZ3.bK());
        dsqv<dmpn, dnbc> dsqvVar3 = dmnl.F;
        dnbb bZ4 = dnbc.c.bZ();
        dnox bZ5 = dnpo.t.bZ();
        bZ5.b(dnow.GENERIC_INTERACTIVE);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnbc dnbcVar = (dnbc) bZ4.b;
        dnpo bK2 = bZ5.bK();
        bK2.getClass();
        dnbcVar.b = bK2;
        dnbcVar.a |= 1;
        dmpkVar.k(dsqvVar3, bZ4.bK());
        int a2 = akuhVar.a();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmpnVar4.a |= 2048;
        dmpnVar4.k = a2;
        akti a3 = aktoVar.a((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        a3.Pt(this.h.a(qhuVar, new qgv(this)));
        return a3;
    }
}
