package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cedc  reason: default package */
/* loaded from: classes4.dex */
public final class cedc extends ges implements bqld {
    private static final dcqe g = dcqe.c("cedc");
    public cqkj a;
    private ViewGroup ad;
    private cqkf<ceby> ae;
    private cedh af;
    public cqhn b;
    public bwqv c;
    public dzsj<cedh> d;
    public efg e;
    public btrm f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<ceby> cqkfVar = this.ae;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.ad;
            if (viewGroup != null) {
                viewGroup.removeView(this.ae.c());
            }
            this.ae = null;
        }
        this.ad = null;
    }

    @Override // defpackage.bqld
    public final void aS(bqlf bqlfVar) {
        if (this.af == null) {
            return;
        }
        int d = bqlfVar.d();
        int i = d - 1;
        if (d == 0) {
            throw null;
        }
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            return;
        }
        this.af.h(bqlfVar.a());
        dbsk.s(this.b);
        cqkx.p(this.af);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ad = viewGroup;
        cqkj cqkjVar = this.a;
        dbsk.s(cqkjVar);
        cqkf<ceby> d = cqkjVar.d(new cdud(), viewGroup, false);
        this.ae = d;
        d.e(this.af);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        btrm btrmVar = this.f;
        dbsk.s(btrmVar);
        cedh cedhVar = this.af;
        dbsk.s(cedhVar);
        btrmVar.a(cedhVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        try {
            bwqv bwqvVar = this.c;
            dbsk.s(bwqvVar);
            bwrs<ilo> e = bwqvVar.e(ilo.class, this.o, "placemark");
            dzsj<cedh> dzsjVar = this.d;
            dbsk.s(dzsjVar);
            cedh a = dzsjVar.a();
            dbsk.s(a);
            this.af = a;
            dbsk.s(e);
            a.h(e);
            this.af.i(this);
            btrm btrmVar = this.f;
            dbsk.s(btrmVar);
            cedh cedhVar = this.af;
            dbsk.s(cedhVar);
            dceq a2 = dcet.a();
            a2.b(cdjh.class, new cedi(0, cdjh.class, cedhVar, bvrj.UI_THREAD));
            a2.b(bqje.class, new cedi(1, bqje.class, cedhVar, bvrj.UI_THREAD));
            btrmVar.g(cedhVar, a2.a());
        } catch (IOException e2) {
            bvoo.h("Corrupted storage data: %s", e2);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.cB;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.e;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }
}
