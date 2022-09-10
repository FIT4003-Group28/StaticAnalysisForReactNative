package defpackage;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: brlh  reason: default package */
/* loaded from: classes4.dex */
public final class brlh implements atcv {
    static final long a = TimeUnit.SECONDS.toMillis(5);
    public static final /* synthetic */ int w = 0;
    @dzsi
    private asxw A;
    @dzsi
    private List<aryr> B;
    private final akzy C;
    public final Application b;
    public final btrm c;
    public final csct d;
    public final brdi e;
    public final bttf f;
    public final Executor g;
    public final cqat h;
    public final ckcn i;
    public final ckcq j;
    public final dxio<btyy> k;
    final asxv l;
    public final brdh m;
    public final dhjn n;
    public long o;
    public boolean p;
    public dbsg<Long> q;
    public final Object r;
    public final crzp<dbsg<String>> s;
    @dzsi
    public asto t;
    public final brlc u;
    @dzsi
    public int v;
    private final akfa x;
    private final crzo<daqq> y;
    @dzsi
    private akpm z;

    public brlh(Application application, btrm btrmVar, ckcw ckcwVar, brdi brdiVar, akfa akfaVar, bttf bttfVar, cqat cqatVar, dxio<btyy> dxioVar, Executor executor) {
        csct csctVar = new csct(application, new btso(application.getApplicationContext()));
        daqp bZ = daqq.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        daqq daqqVar = (daqq) bZ.b;
        daqqVar.e = 2;
        daqqVar.a |= 128;
        this.y = new crzo<>(bZ.bK());
        this.l = new brlg(this);
        this.u = new brlc(this);
        this.m = new brld(this);
        this.n = dhjo.h.bZ();
        this.o = Long.MIN_VALUE;
        this.p = false;
        this.q = dbpy.a;
        this.r = new Object();
        this.C = new brle(this);
        this.s = new brlf(this);
        this.b = application;
        this.c = btrmVar;
        this.d = csctVar;
        this.e = brdiVar;
        this.x = akfaVar;
        this.f = bttfVar;
        this.h = cqatVar;
        this.k = dxioVar;
        this.g = executor;
        this.i = (ckcn) ckcwVar.a(ckhi.d);
        this.j = ((ckcr) ckcwVar.a(ckhi.e)).a();
    }

    private final void q(List<aryr> list) {
        if (!list.equals(this.B)) {
            dhjn dhjnVar = this.n;
            if (dhjnVar.c) {
                dhjnVar.bF();
                dhjnVar.c = false;
            }
            dhjo dhjoVar = dhjo.h;
            ((dhjo) dhjnVar.b).g = dhjo.ck();
            for (aryr aryrVar : list) {
                dhjn dhjnVar2 = this.n;
                dblh bZ = dbli.e.bZ();
                dgrh h = aryrVar.e.h();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dbli dbliVar = (dbli) bZ.b;
                h.getClass();
                dbliVar.b = h;
                dbliVar.a |= 1;
                dgrn n = aryrVar.c.S().n();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dbli dbliVar2 = (dbli) bZ.b;
                n.getClass();
                dbliVar2.d = n;
                int i = dbliVar2.a | 4;
                dbliVar2.a = i;
                String str = aryrVar.b;
                if (str != null) {
                    str.getClass();
                    dbliVar2.a = i | 2;
                    dbliVar2.c = str;
                }
                dbli bK = bZ.bK();
                if (dhjnVar2.c) {
                    dhjnVar2.bF();
                    dhjnVar2.c = false;
                }
                dhjo dhjoVar2 = (dhjo) dhjnVar2.b;
                bK.getClass();
                dsrj<dbli> dsrjVar = dhjoVar2.g;
                if (!dsrjVar.a()) {
                    dhjoVar2.g = dsqw.cl(dsrjVar);
                }
                dhjoVar2.g.add(bK);
            }
            this.B = list;
            m();
        }
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        n(atlqVar, atlqVar2);
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
    }

    @Override // defpackage.asmo
    public final void c() {
    }

    public final void h(@dzsi akpm akpmVar) {
        akpm akpmVar2 = this.z;
        if (akpmVar2 != null) {
            akpmVar2.ac(this.C);
        }
        this.z = akpmVar;
        if (akpmVar != null) {
            akpmVar.ab(this.C);
        }
    }

    public final void i(@dzsi asxw asxwVar) {
        asxw asxwVar2 = this.A;
        if (asxwVar2 != null) {
            asxwVar2.G(this.l);
        }
        this.A = asxwVar;
        if (asxwVar != null) {
            asxwVar.F(this.l);
        }
    }

    public final void j() {
        synchronized (this.r) {
            this.q = dbpy.a;
            if (o() == 2) {
                csct csctVar = this.d;
                csctVar.c(71);
                csctVar.c(47);
                csctVar.c(316);
                csctVar.c(84);
                csctVar.c(100);
            }
            p(3);
        }
    }

    public final crzm<daqq> k() {
        return this.y.a;
    }

    public final void l(crhp crhpVar) {
        if (crhpVar.d()) {
            if (!crhpVar.e().g) {
                doud b = brlj.b(crhpVar.e().g());
                dodr e = brlj.e(crhpVar.e().g(), crhpVar.e().a, b);
                dhjn dhjnVar = this.n;
                dodn bZ = dodt.h.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dodt dodtVar = (dodt) bZ.b;
                dodtVar.a |= 4;
                dodtVar.d = false;
                e.getClass();
                dodtVar.c = e;
                dodtVar.b = 2;
                dodt dodtVar2 = (dodt) bZ.b;
                dodtVar2.e = 1;
                dodtVar2.a |= 8;
                String encodeToString = Base64.encodeToString(bZ.bK().bS(), 11);
                if (dhjnVar.c) {
                    dhjnVar.bF();
                    dhjnVar.c = false;
                }
                dhjo dhjoVar = (dhjo) dhjnVar.b;
                dhjo dhjoVar2 = dhjo.h;
                encodeToString.getClass();
                dhjoVar.a |= 1;
                dhjoVar.b = encodeToString;
                dhjn dhjnVar2 = this.n;
                duhe o = akqq.d(b.a.f(0), b.b.f(0)).o();
                if (dhjnVar2.c) {
                    dhjnVar2.bF();
                    dhjnVar2.c = false;
                }
                dhjo dhjoVar3 = (dhjo) dhjnVar2.b;
                o.getClass();
                dhjoVar3.d = o;
                dhjoVar3.a |= 4;
            }
        } else {
            dhjn dhjnVar3 = this.n;
            if (dhjnVar3.c) {
                dhjnVar3.bF();
                dhjnVar3.c = false;
            }
            dhjo dhjoVar4 = (dhjo) dhjnVar3.b;
            dhjo dhjoVar5 = dhjo.h;
            dhjoVar4.a &= -2;
            dhjoVar4.b = dhjo.h.b;
            dhjn dhjnVar4 = this.n;
            if (dhjnVar4.c) {
                dhjnVar4.bF();
                dhjnVar4.c = false;
            }
            dhjo dhjoVar6 = (dhjo) dhjnVar4.b;
            dhjoVar6.d = null;
            dhjoVar6.a &= -5;
        }
        this.o = this.h.e();
        m();
    }

    public final void m() {
        if (btlu.n(this.x.j())) {
            return;
        }
        akpm akpmVar = this.z;
        if (akpmVar != null) {
            dhjn dhjnVar = this.n;
            dhjx aa = akpmVar.aa();
            if (dhjnVar.c) {
                dhjnVar.bF();
                dhjnVar.c = false;
            }
            dhjo dhjoVar = (dhjo) dhjnVar.b;
            dhjo dhjoVar2 = dhjo.h;
            aa.getClass();
            dhjoVar.c = aa;
            dhjoVar.a |= 2;
        }
        csct csctVar = this.d;
        int i = this.v;
        dspd bR = this.n.bK().bR();
        ckzs bZ = ckzv.e.bZ();
        String packageName = csctVar.a.getPackageName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckzv ckzvVar = (ckzv) bZ.b;
        packageName.getClass();
        int i2 = ckzvVar.a | 1;
        ckzvVar.a = i2;
        ckzvVar.b = packageName;
        if (i != 0) {
            ckzvVar.c = i - 1;
            ckzvVar.a = i2 | 2;
        }
        ckzt bZ2 = ckzu.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ckzu ckzuVar = (ckzu) bZ2.b;
        bR.getClass();
        ckzuVar.a |= 1;
        ckzuVar.b = bR;
        ckzu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckzv ckzvVar2 = (ckzv) bZ.b;
        bK.getClass();
        ckzvVar2.d = bK;
        ckzvVar2.a |= 4;
        ckyp ckypVar = (ckyp) ckyq.c.bZ();
        if (ckypVar.c) {
            ckypVar.bF();
            ckypVar.c = false;
        }
        ckyq ckyqVar = (ckyq) ckypVar.b;
        ckyqVar.b = 335;
        ckyqVar.a |= 1;
        ckypVar.k(ckzr.a, bZ.bK());
        ckyq ckyqVar2 = (ckyq) ckypVar.bK();
        synchronized (csctVar.d) {
            ArrayList arrayList = new ArrayList();
            for (ckyq ckyqVar3 : csctVar.c) {
                int a2 = ckyo.a(ckyqVar3.b);
                if (a2 != 0 && a2 == 336) {
                }
                arrayList.add(ckyqVar3);
            }
            csctVar.c = arrayList;
        }
        csctVar.b(ckyqVar2);
    }

    public final void n(astc astcVar, @dzsi astc astcVar2) {
        dbsg<Long> d = astcVar.d();
        dbsg<Long> d2 = astcVar2 == null ? dbpy.a : astcVar2.d();
        synchronized (this.r) {
            if (this.q.a() && dbsd.a(d2, this.q) && (astcVar.h != null || !dbsd.a(d, this.q))) {
                j();
                return;
            }
            List<aryr> list = astcVar.i;
            aryr aryrVar = astcVar.h;
            if (aryrVar != null) {
                q(dcdc.f(aryrVar));
            } else if (list == null || list.isEmpty()) {
                if (((dhjo) this.n.b).g.size() == 0) {
                    return;
                }
                dhjn dhjnVar = this.n;
                if (dhjnVar.c) {
                    dhjnVar.bF();
                    dhjnVar.c = false;
                }
                ((dhjo) dhjnVar.b).g = dhjo.ck();
                this.B = null;
                m();
            } else {
                q(list);
            }
        }
    }

    public final int o() {
        daqq l = this.y.a.l();
        dbsk.s(l);
        int a2 = daqm.a(l.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public final synchronized void p(int i) {
        daqq l = this.y.a.l();
        dbsk.s(l);
        crzo<daqq> crzoVar = this.y;
        dsqp dsqpVar = (dsqp) l.cu(5);
        dsqpVar.bC(l);
        daqp daqpVar = (daqp) dsqpVar;
        if (daqpVar.c) {
            daqpVar.bF();
            daqpVar.c = false;
        }
        daqq daqqVar = (daqq) daqpVar.b;
        daqqVar.e = i - 1;
        daqqVar.a |= 128;
        crzoVar.b(daqpVar.bK());
    }
}
