package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bnmi  reason: default package */
/* loaded from: classes3.dex */
public final class bnmi extends ges {
    public Activity a;
    private dvev ad;
    private long ae;
    private bnom af;
    private boolean ag;
    private cqkf<bnoi> ah;
    public cqkj b;
    public efg c;
    public cjxo d;
    public cztz e;
    public bnoh f;
    public dxio<afha> g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf<bnoi> c = this.b.c(new bnoc(), null);
        this.ah = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return !this.af.m().booleanValue() || this.ad.h;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (btpf.a(this.a)) {
            this.d.a(7);
        }
        dvev dvevVar = (dvev) bvrs.b(this.o.getByteArray("triggerKey"), (dssr) dvev.B.cu(7));
        dbsk.s(dvevVar);
        this.ad = dvevVar;
        if (this.af == null) {
            this.ae = this.o.getLong("amountOfTimeLeftMillisKey", -1L);
            Activity activity = this.a;
            dvev dvevVar2 = this.ad;
            gn gnVar = this.A;
            dbsk.s(gnVar);
            this.af = new bnom(activity, dvevVar2, gnVar, this.e, this.f, this.ae, this.g);
            this.ag = false;
        } else {
            this.ag = true;
        }
        this.ah.e(this.af);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.w(this.ah.c());
        egjVar.f(false);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        if (this.ag) {
            this.af.t();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (btpf.a(this.a)) {
            this.d.b();
        }
        this.ah.e(null);
        this.o.putLong("amountOfTimeLeftMillisKey", this.af.s());
        super.u();
    }
}
