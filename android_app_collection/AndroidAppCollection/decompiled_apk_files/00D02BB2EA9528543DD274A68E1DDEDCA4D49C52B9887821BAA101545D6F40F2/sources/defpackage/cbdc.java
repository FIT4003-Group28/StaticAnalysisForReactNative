package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbdc  reason: default package */
/* loaded from: classes4.dex */
public final class cbdc extends bxel {
    public static final dcqe a = dcqe.c("cbdc");
    public bxeq ad;
    public cbde b;
    public cbdk c;
    public cbqf d;
    public bwqv e;
    public Executor f;
    @dzsi
    ilo g;

    public static cbdc i(bwqv bwqvVar, gga ggaVar, @dzsi ilo iloVar) {
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.EVENTS_UGC);
        bxkoVar.q(true);
        bxkoVar.z(301989894);
        bxkoVar.ae();
        bxkoVar.U();
        bxkoVar.ad();
        bxkoVar.w(1);
        bxkoVar.ab();
        bxkoVar.g(ggaVar.getString(R.string.UGC_EVENTS_LOCATION_PICKER_SEARCH_HINT));
        bxkoVar.g = true;
        bxkoVar.ac();
        if (iloVar != null && iloVar.o()) {
            bxkoVar.e(iloVar.n());
        }
        cbdc cbdcVar = new cbdc();
        cbdcVar.bu(bwqvVar, bxkoVar, null);
        Bundle bundle = new Bundle();
        if (iloVar != null) {
            bwqvVar.c(bundle, "placemark", iloVar);
        }
        cbdcVar.B(bundle);
        return cbdcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bxel
    public final void QC(egj egjVar) {
        egjVar.W(this.be);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        Nw(obj);
    }

    @Override // defpackage.bxel
    public final bxeq aJ() {
        bxeq bxeqVar = this.ad;
        return bxeqVar != null ? bxeqVar : new cbdb(this, this.f, this.d);
    }

    @Override // defpackage.bxel
    public final bxnw aT() {
        cbdk cbdkVar = this.c;
        ilo iloVar = this.g;
        cbdk.a(this, 1);
        bwqv a2 = cbdkVar.a.a();
        cbdk.a(a2, 3);
        gga a3 = cbdkVar.b.a();
        cbdk.a(a3, 4);
        akpm a4 = cbdkVar.c.a();
        cbdk.a(a4, 5);
        dxio a5 = ((dxjh) cbdkVar.d).a();
        cbdk.a(a5, 6);
        btvo a6 = cbdkVar.e.a();
        cbdk.a(a6, 7);
        return new cbdj(this, iloVar, a2, a3, a4, a5, a6);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        ilo iloVar = this.g;
        if (iloVar != null) {
            this.e.c(bundle, "placemark", iloVar);
        }
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        try {
            this.g = (ilo) this.e.d(ilo.class, bundle != null ? bundle : this.o, "placemark");
        } catch (IOException unused) {
            bvoo.h("Not able to create Placemark", new Object[0]);
        }
        super.l(bundle);
        cbde cbdeVar = this.b;
        bxek bxekVar = new bxek(this);
        cbde.a(bxekVar, 1);
        bxqd a2 = cbdeVar.a.a();
        cbde.a(a2, 2);
        gga a3 = cbdeVar.b.a();
        cbde.a(a3, 3);
        this.be = new cbdd(bxekVar, a2, a3);
    }
}
