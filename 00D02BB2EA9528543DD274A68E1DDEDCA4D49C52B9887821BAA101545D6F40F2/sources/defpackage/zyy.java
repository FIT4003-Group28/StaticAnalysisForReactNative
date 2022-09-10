package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: zyy  reason: default package */
/* loaded from: classes7.dex */
public final class zyy extends ges {
    public cjqy a;
    public ckcw ad;
    public akpq ae;
    public zzn af;
    public aaaa ag;
    public zzu ah;
    public zzq ai;
    zzk aj;
    private zzz ak;
    private zzt al;
    private zzp am;
    private cqkf<jbk> an;
    private cqkf<zzo> ao;
    private final zzj ap = new zyv(this);
    private final Runnable aq = new zyw(this);
    public akpm b;
    public dxio<akzh> c;
    public dxio<zzh> d;
    public cqkj e;
    public btrm f;
    public efg g;

    private final void g(@dzsi egq egqVar) {
        egf a = egf.a();
        a.l(false);
        egj egjVar = new egj(this);
        egjVar.A(a);
        egjVar.w(null);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.aa();
        egjVar.ab(ibm.c());
        egjVar.F(this.an.c());
        egjVar.k(true);
        egjVar.v(this.ao.c(), true, this.am);
        egjVar.ad(false);
        egjVar.I(2);
        if (egqVar != null) {
            egjVar.J(egqVar);
        }
        this.g.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.an.e(null);
        this.ao.e(null);
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        zzq zzqVar = this.ai;
        zzk zzkVar = this.aj;
        Activity activity = (Activity) ((dxjd) zzqVar.a).a;
        zzq.a(activity, 1);
        zzn a = zzqVar.b.a();
        zzq.a(a, 2);
        zzq.a(zzkVar, 3);
        this.am = new zzp(activity, a, zzkVar);
        aaaa aaaaVar = this.ag;
        zzk zzkVar2 = this.aj;
        Activity activity2 = (Activity) ((dxjd) aaaaVar.a).a;
        aaaa.a(activity2, 1);
        aaaa.a(zzkVar2, 2);
        this.ak = new zzz(activity2, zzkVar2);
        zzu zzuVar = this.ah;
        zzk zzkVar3 = this.aj;
        zzp zzpVar = this.am;
        bvsl a2 = zzuVar.a.a();
        zzu.a(a2, 1);
        bvrb a3 = zzuVar.b.a();
        zzu.a(a3, 2);
        zzu.a(zzkVar3, 3);
        zzu.a(zzpVar, 4);
        this.al = new zzt(a2, a3, zzkVar3, zzpVar);
        this.an = this.e.c(new hxj(), null);
        this.ao = this.e.c(new zzf(), null);
        this.an.e(this.ak);
        this.ao.e(this.al);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        ((ckcn) this.ad.a(ckew.a)).b(this.aj.h());
        ((ckcn) this.ad.a(ckew.b)).b(this.aj.k());
        final zzh a = this.d.a();
        a.b();
        a.e.a(new Runnable(a) { // from class: zzg
            private final zzh a;

            {
                this.a = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzh zzhVar = this.a;
                zzhVar.a.e().j(zzhVar.c);
                zzhVar.b.d();
            }
        });
        super.am();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        zzk zzkVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        zzm zzmVar = (zzm) bvrs.e(bundle, zzm.class, (dssr) zzm.d.cu(7));
        if (zzmVar == null) {
            zzkVar = new zzk();
        } else {
            zzkVar = new zzk(dcbg.b(zzmVar.b).s(zzi.a).z(), zzmVar.c);
        }
        this.aj = zzkVar;
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g((egq) null);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxn.eI;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aj.c(this.ap);
        this.aj.c(this.ak.b());
        this.aj.c(this.al.d());
        this.ae.a(this.aq);
        this.ae.b(this.aq);
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(ardp.class, new zyz(ardp.class, this));
        btrmVar.g(this, a.a());
        g(new zyx(this));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.l(bundle, this.aj.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ae.c(this.aq);
        this.f.a(this);
        this.aj.d(this.al.d());
        this.aj.d(this.ak.b());
        this.aj.d(this.ap);
        this.d.a().b();
        super.u();
    }
}
