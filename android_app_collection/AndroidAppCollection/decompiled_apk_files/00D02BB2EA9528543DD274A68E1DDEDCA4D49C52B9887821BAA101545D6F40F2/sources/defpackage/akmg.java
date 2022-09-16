package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: akmg  reason: default package */
/* loaded from: classes2.dex */
public final class akmg extends ges {
    public cqkj a;
    public cjqy ad;
    public aefv ae;
    public MajorEvent af;
    public alax ag;
    private final dbty<Runnable> ah = new akmb(this);
    private jbk ai;
    private cqkf<jbk> aj;
    private cqkf<akof> ak;
    private akof al;
    private boolean am;
    @dzsi
    private akob an;
    public efg b;
    public cqat c;
    public dxio<akox> d;
    public gll e;
    public bvrb f;
    public akoc g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.am = true;
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cqkf<jbk> cqkfVar = this.aj;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<akof> cqkfVar2 = this.ak;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        this.ak = null;
        this.aj = null;
        super.am();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null || !bundle.containsKey("dw_disruptions_major_event_parcel_key")) {
            this.af = (MajorEvent) this.o.getParcelable("dw_disruptions_major_event_parcel_key");
        } else {
            this.af = (MajorEvent) bundle.getParcelable("dw_disruptions_major_event_parcel_key");
        }
        MajorEvent majorEvent = this.af;
        if (majorEvent == null || majorEvent.a().isEmpty()) {
            bvoo.i(new RuntimeException());
            J().g().e();
            return;
        }
        this.ai = new akmc(this);
        this.aj = this.a.c(new hxj(), null);
        cqkf<akof> c = this.a.c(new akmz(), null);
        this.ak = c;
        aefv aefvVar = (aefv) c.c();
        this.ae = aefvVar;
        aefvVar.l(new akmd(this));
        ff J = J();
        final dxio<akox> dxioVar = this.d;
        dxioVar.getClass();
        this.al = new akok(J, new dxio(dxioVar) { // from class: akma
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.a();
            }
        }, this.e, this.c, this.af, this.ae);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.al == null || this.ak == null || this.aj == null) {
            return;
        }
        diuv diuvVar = this.af.g().c;
        if (diuvVar == null) {
            diuvVar = diuv.g;
        }
        alax a = alay.a(aknz.a(diuvVar.d), this.d.a(), false);
        this.ag = a;
        a.a();
        this.aj.e(this.ai);
        this.ak.e(this.al);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.H(this.ae);
        egjVar.F(this.aj.c());
        egf a2 = egf.a();
        a2.l(false);
        a2.r();
        a2.m = true;
        a2.j();
        a2.x = false;
        a2.n = false;
        egjVar.A(a2);
        egjVar.w(null);
        egjVar.ac();
        egjVar.av(null);
        egjVar.Q(null);
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        if (this.am) {
            egjVar.J(new akme(this));
            this.am = false;
        }
        this.b.a(egjVar.a());
        this.an = new akob(this.f, this.ah);
        this.d.a().j().k(this.an);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        MajorEvent majorEvent = this.af;
        if (majorEvent != null) {
            bundle.putParcelable("dw_disruptions_major_event_parcel_key", majorEvent);
        }
        super.t(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.d.a().j().l(this.an);
        this.an = null;
        alax alaxVar = this.ag;
        if (alaxVar != null) {
            alaxVar.b();
            this.ag.c();
            this.ag = null;
        }
        super.u();
    }
}
