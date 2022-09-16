package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: chbw  reason: default package */
/* loaded from: classes4.dex */
public final class chbw extends gen implements chlr {
    public btvo a;
    private ddho ad;
    @dzsi
    private ilo ae;
    public chlt b;
    public cqkj c;
    @dzsi
    private cqkf<chmz> d;
    private djgl e;
    private ddho g;

    public static void g(Bundle bundle, djgl djglVar, ddho ddhoVar, ddho ddhoVar2, @dzsi ilo iloVar) {
        bvrs.k(bundle, "thanksPageProto", djglVar);
        bundle.putSerializable("pageVeType", ddhoVar);
        bundle.putSerializable("buttonVeType", ddhoVar2);
        bundle.putSerializable("placemark", iloVar);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<chmz> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.d = null;
        }
    }

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        if (bundle == null) {
            bundle = this.o;
        }
        djgl djglVar = (djgl) bvrs.f(bundle, "thanksPageProto", (dssr) djgl.g.cu(7));
        dbsk.s(djglVar);
        this.e = djglVar;
        Serializable serializable = bundle.getSerializable("pageVeType");
        dbsk.s(serializable);
        this.g = (ddho) serializable;
        Serializable serializable2 = bundle.getSerializable("buttonVeType");
        dbsk.s(serializable2);
        this.ad = (ddho) serializable2;
        ilo iloVar = (ilo) bundle.getSerializable("placemark");
        this.ae = iloVar;
        chls a = this.b.a(this.e, this, this.g, this.ad, iloVar, this.a);
        Dialog dialog = new Dialog(J(), 16973840);
        cqkf<chmz> c = this.c.c(new chfp(), null);
        this.d = c;
        c.e(a);
        dialog.setContentView(this.d.c());
        return dialog;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return this.g;
    }

    @Override // defpackage.chlr
    public final void q(boolean z) {
        aT();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        g(bundle, this.e, this.g, this.ad, this.ae);
    }
}
