package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: awev  reason: default package */
/* loaded from: classes3.dex */
public final class awev extends ges implements egq {
    private static final dcqe e = dcqe.c("awev");
    public cqkj a;
    private float ad;
    private cqkf<awec> ae;
    private cqkf<awec> af;
    public efg b;
    public awec c;
    public akpm d;
    @dzsi
    private String f = null;
    @dzsi
    private akqq g = null;

    @Override // defpackage.ges
    protected final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        float f;
        this.c.l();
        aweu aweuVar = new aweu(this);
        akqq akqqVar = this.g;
        if (akqqVar == null) {
            alad n = this.d.n();
            akqq akqqVar2 = n.i;
            f = n.k;
            akqqVar = akqqVar2;
        } else {
            f = this.ad;
        }
        akpm akpmVar = this.d;
        akyc l = akyt.l(akqqVar, f);
        l.b = 0;
        akpmVar.q(l, aweuVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle == null) {
            bvoo.h("onCreate: bundle should not be null", new Object[0]);
            return;
        }
        if (bundle.containsKey("camera_position_target")) {
            duhe duheVar = (duhe) bvrs.f(bundle, "camera_position_target", (dssr) duhe.c.cu(7));
            dbsk.s(duheVar);
            this.g = new akqq(duheVar);
            this.ad = bundle.getFloat("camera_position_zoom");
        }
        this.f = bundle.getString("area_name");
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.o();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.bd;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ae = this.a.c(new awdz(), null);
        this.af = this.a.c(new awdp(), null);
        this.ae.e(this.c);
        this.af.e(this.c);
        aljk aljkVar = new aljk();
        aljkVar.g = false;
        aljkVar.f = false;
        aljkVar.l = false;
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.G(this.ae.c(), 6);
        egjVar.av(this.af.c());
        egjVar.f(false);
        egjVar.w(this.c.p());
        egjVar.y(true);
        egjVar.ag(null);
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.I(2);
        egf g = egf.g();
        g.q();
        g.x = false;
        egjVar.A(g);
        egjVar.J(this);
        egjVar.z(aljkVar);
        efgVar.a(egjVar.a());
        this.c.n();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        akqq akqqVar = this.g;
        if (akqqVar != null) {
            bvrs.k(bundle, "camera_position_target", akqqVar.o());
            bundle.putFloat("camera_position_zoom", this.ad);
        }
        bundle.putString("area_name", this.f);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.c.m();
        this.ae.e(null);
        this.af.e(null);
        super.u();
    }
}
