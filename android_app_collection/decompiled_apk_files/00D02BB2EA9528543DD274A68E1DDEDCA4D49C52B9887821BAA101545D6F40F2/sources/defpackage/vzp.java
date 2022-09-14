package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: vzp  reason: default package */
/* loaded from: classes7.dex */
public final class vzp extends gew {
    public efg ad;
    public bvsl ae;
    public akpm af;
    public dxio<akzh> ag;
    public btrm ah;
    public cpv ai;
    public znd aj;
    @dzsi
    public zfg ak;
    public cqkf<zdo> al;
    public vzr am;
    public vzu an;
    private amte ao;
    private amub ap;
    private cqkf<zdo> aq;
    private cqkf<zdo> ar;
    private final Runnable as = new vzk(this);
    private final dbty<Integer> at = new vzl(this);
    private final dbsz<Integer> au = new vzm(this);
    private final zto av = new vzn(this);
    public vzv c;
    public zne d;
    public bwqv e;
    public cqkj f;
    public btvo g;

    private static boolean q(@dzsi amve amveVar) {
        return !amveVar.s().j && amtg.a(amveVar.s());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        vzu vzuVar = this.an;
        synchronized (vzuVar.j) {
            if (vzuVar.f != null) {
                vzuVar.e.c(vzuVar.k);
            }
            ardc ardcVar = vzuVar.g;
            if (ardcVar != null) {
                ardcVar.c();
            }
            arce arceVar = vzuVar.h;
            if (arceVar != null) {
                for (arcb arcbVar : arceVar.b) {
                    arcbVar.b();
                }
            }
            vzuVar.h = null;
        }
        vzr vzrVar = this.am;
        vzrVar.a.a(vzrVar);
        vzrVar.b.ac(vzrVar);
        super.Qe();
    }

    @Override // defpackage.gew
    public final void Qm() {
        if (bg()) {
            vzu vzuVar = this.an;
            dbsk.s(vzuVar);
            vzuVar.b();
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkj cqkjVar = this.f;
        dbsk.s(cqkjVar);
        this.al = cqkjVar.c(new wad(), null);
        cqkj cqkjVar2 = this.f;
        dbsk.s(cqkjVar2);
        this.aq = cqkjVar2.c(new way(), null);
        cqkj cqkjVar3 = this.f;
        dbsk.s(cqkjVar3);
        this.ar = cqkjVar3.c(new vzy(), null);
        vzv vzvVar = this.c;
        amub amubVar = this.ap;
        dbty<Integer> dbtyVar = this.at;
        int e = waq.a.e(J());
        zfg zfgVar = this.ak;
        int intValue = zfgVar != null ? zfgVar.i().intValue() : 0;
        boolean q = q(this.ap.d);
        askv askvVar = new askv(this.g, this.aH, arym.GUIDED_NAV, this.ag.a().c);
        dbsz<Integer> dbszVar = this.au;
        Activity activity = (Activity) ((dxjd) vzvVar.a).a;
        vzv.a(activity, 1);
        akox a = vzvVar.b.a();
        vzv.a(a, 2);
        dxio a2 = ((dxjh) vzvVar.c).a();
        vzv.a(a2, 3);
        akpq a3 = vzvVar.d.a();
        vzv.a(a3, 4);
        dxio a4 = ((dxjh) vzvVar.e).a();
        vzv.a(a4, 5);
        gll a5 = vzvVar.f.a();
        vzv.a(a5, 6);
        vzv.a(this, 7);
        vzv.a(amubVar, 8);
        vzv.a(dbtyVar, 9);
        vzv.a(askvVar, 13);
        vzv.a(dbszVar, 14);
        this.an = new vzu(activity, a, a2, a3, a4, a5, this, amubVar, dbtyVar, e, intValue, q, askvVar, dbszVar);
        vzr vzrVar = new vzr(this.an, this.ah, this.af, this.ap);
        this.am = vzrVar;
        btrm btrmVar = vzrVar.a;
        dceq a6 = dcet.a();
        a6.b(alhw.class, new vzs(alhw.class, vzrVar));
        btrmVar.g(vzrVar, a6.a());
        vzrVar.b.ab(vzrVar);
        vzu vzuVar = this.an;
        Resources resources = vzuVar.a.getResources();
        akxa aj = vzuVar.d.aj().aj();
        if (aj != null) {
            synchronized (vzuVar.j) {
                if (vzuVar.f != null) {
                    vzuVar.g = new ardc(resources, aj);
                    vzuVar.h = new arce(resources, new arcr(vzuVar.g));
                    vzuVar.e.a(vzuVar.k);
                }
            }
            return null;
        }
        throw new IllegalStateException("RoutePreviewMapHelper.onCreate should not be called with a map container that has a null ClientRenderOpFactory.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(View view, CharSequence... charSequenceArr) {
        gga ggaVar = this.aE;
        if (ggaVar == null || view == null) {
            return;
        }
        bvsi bvsiVar = new bvsi(ggaVar);
        for (CharSequence charSequence : charSequenceArr) {
            bvsiVar.c(charSequence);
        }
        this.ai.f(view, bvsiVar.toString());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        int i;
        super.l(bundle);
        try {
            amte amteVar = (amte) this.e.d(amte.class, this.o, "storageItem");
            dbsk.s(amteVar);
            this.ao = amteVar;
            amub b = this.ao.b(this.o.getInt("tripIndex"), J().getApplicationContext());
            dbsk.s(b);
            this.ap = b;
            if (bundle == null) {
                i = this.o.getInt("currentStepIndex");
            } else {
                i = bundle.getInt("currentStepIndex");
            }
            if (q(this.ap.d)) {
                amve amveVar = this.ap.d;
                this.ak = zqc.r(J().getResources(), this.ae, amveVar.s(), amveVar.t(), amtg.c(amveVar), this.av);
            }
            zne zneVar = this.d;
            amub amubVar = this.ap;
            zfg zfgVar = this.ak;
            Runnable runnable = this.as;
            ff ffVar = (ff) ((dxjd) zneVar.a).a;
            zne.a(ffVar, 1);
            bvsl a = zneVar.b.a();
            zne.a(a, 2);
            vtn a2 = zneVar.c.a();
            zne.a(a2, 3);
            afwr a3 = zneVar.d.a();
            zne.a(a3, 4);
            cjqy a4 = zneVar.e.a();
            zne.a(a4, 5);
            zrl a5 = zneVar.f.a();
            zne.a(a5, 6);
            bvly a6 = zneVar.g.a();
            zne.a(a6, 7);
            bvlo a7 = zneVar.h.a();
            zne.a(a7, 8);
            btvo a8 = zneVar.i.a();
            zne.a(a8, 9);
            gce a9 = zneVar.j.a();
            zne.a(a9, 10);
            zrt a10 = zneVar.k.a();
            zne.a(a10, 11);
            zne.a(this, 12);
            zne.a(amubVar, 13);
            zne.a(runnable, 16);
            this.aj = new znd(ffVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, this, amubVar, i, zfgVar, runnable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.c;
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.al.e(this.aj);
        this.aq.e(this.aj);
        this.ar.e(this.aj);
        egk egkVar = new egk();
        egkVar.a(this.al.c());
        egj egjVar = new egj(this);
        egjVar.F(this.al.c());
        egjVar.at(this.aq.c());
        egjVar.av(this.ar.c());
        egjVar.w(null);
        egjVar.ag(null);
        egjVar.k(true);
        egjVar.m(egkVar);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.A(egf.b());
        egjVar.e(new ecs(this) { // from class: vzj
            private final vzp a;

            {
                this.a = this;
            }

            @Override // defpackage.ecs
            public final void Qf() {
                vzp vzpVar = this.a;
                vzpVar.i(vzpVar.al.c(), vzpVar.aj.g().u, vzpVar.aj.h().c());
            }
        });
        egjVar.J(new vzo(this));
        efg efgVar = this.ad;
        dbsk.s(efgVar);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        znd zndVar = this.aj;
        dbsk.s(zndVar);
        bundle.putInt("currentStepIndex", zndVar.j().intValue());
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        this.al.e(null);
        this.aq.e(null);
        this.ar.e(null);
        super.u();
    }
}
