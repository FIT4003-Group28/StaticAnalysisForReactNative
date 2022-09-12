package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bdgj  reason: default package */
/* loaded from: classes3.dex */
public final class bdgj extends gen implements btzi<dhva, dhve> {
    private static final dcqe af = dcqe.c("bdgj");
    @dzsi
    public bdgt a;
    public bhhf ad;
    public buma ae;
    @dzsi
    protected cqkf<bdgt> b;
    public boolean c = false;
    public bwqv d;
    public cqkj e;
    public ff g;

    private final void bp(boolean z, @dzsi dhve dhveVar) {
        int a;
        if (!this.aD) {
            return;
        }
        boolean z2 = false;
        this.c = false;
        if (z && dhveVar != null && ((a = dhvd.a(dhveVar.a)) == 0 || a == 1)) {
            z2 = true;
        }
        aT();
        Nw(new bdgu(z2, bo()));
    }

    public static bdgj g(bwqv bwqvVar, dggg dgggVar, boolean z) {
        return q(bwqvVar, dgggVar, z, null);
    }

    public static bdgj q(bwqv bwqvVar, dggg dgggVar, boolean z, @dzsi ilo iloVar) {
        bdgj bdgjVar = new bdgj();
        Bundle bundle = new Bundle();
        bvrs.k(bundle, "ARG_IMAGE_KEY", dgggVar);
        bundle.putBoolean("ARG_IS_VIDEO_KEY", z);
        bwqvVar.c(bundle, "ARG_PLACEMARK_KEY", iloVar);
        bdgjVar.B(bundle);
        return bdgjVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhva> btzrVar, btzy btzyVar) {
        bp(false, null);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhva> btzrVar, dhve dhveVar) {
        bp(true, dhveVar);
    }

    public final void bn() {
        ilo iloVar;
        String cR;
        dhuz bZ = dhva.d.bZ();
        dggg dgggVar = (dggg) bvrs.f(this.o, "ARG_IMAGE_KEY", (dssr) dggg.d.cu(7));
        dgggVar.getClass();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhva dhvaVar = (dhva) bZ.b;
        dgggVar.getClass();
        dhvaVar.b();
        dhvaVar.b.add(dgggVar);
        try {
            iloVar = (ilo) this.d.d(ilo.class, this.o, "ARG_PLACEMARK_KEY");
        } catch (IOException e) {
            bvoo.h("Failed to read Placemark from GmmStorage: %s", e);
            iloVar = null;
        }
        if (this.ad.a(iloVar) && (cR = iloVar.cR()) != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhva dhvaVar2 = (dhva) bZ.b;
            cR.getClass();
            dhvaVar2.a |= 2;
            dhvaVar2.c = cR;
        }
        this.ae.a(bZ.bK(), this, bvrj.UI_THREAD);
        this.c = true;
    }

    public final boolean bo() {
        Bundle bundle = this.o;
        bundle.getClass();
        return bundle.getBoolean("ARG_IS_VIDEO_KEY");
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cqkf<bdgt> c = this.e.c(new bdgs(), null);
        this.b = c;
        dbsk.s(c);
        c.e(this.a);
        Dialog dialog = new Dialog(J());
        dialog.getWindow().requestFeature(1);
        cqkf<bdgt> cqkfVar = this.b;
        dbsk.s(cqkfVar);
        dialog.setContentView(cqkfVar.c());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return dialog;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.c = bundle.getBoolean("STATE_IS_DELETING_KEY", false);
        }
        this.a = w(this.c);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.fl;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.c) {
            bn();
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("STATE_IS_DELETING_KEY", this.c);
    }

    public final bdgt w(boolean z) {
        return new bdgi(this, z);
    }
}
