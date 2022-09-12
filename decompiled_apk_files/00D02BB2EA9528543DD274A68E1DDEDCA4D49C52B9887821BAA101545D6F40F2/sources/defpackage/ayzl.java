package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ayzl  reason: default package */
/* loaded from: classes3.dex */
public final class ayzl extends ges {
    public axwg a;
    public dxio<axwy> ad;
    @dzsi
    private cqkf<azbd> ae;
    @dzsi
    private azcp af;
    private bwrs<ilo> ag;
    private boolean ah;
    public efg b;
    public cqkj c;
    public gga d;
    public bwqv e;
    public azcq f;
    public dxio<axwo> g;

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof baad) {
            azcp azcpVar = this.af;
            dbsk.s(azcpVar);
            azcpVar.f((baad) obj);
        }
        if (!(obj instanceof baal)) {
            return;
        }
        azcp azcpVar2 = this.af;
        dbsk.s(azcpVar2);
        azcpVar2.g((baal) obj);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<azbd> c = this.c.c(new azaz(), null);
        this.ae = c;
        dbsk.s(c);
        c.e(this.af);
        cqkf<azbd> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        azcp azcpVar = this.af;
        dbsk.s(azcpVar);
        azcpVar.h();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            bwrs<ilo> e = this.e.e(ilo.class, bundle, "save_to_lists_placemark");
            dbsk.s(e);
            this.ag = e;
            this.ah = bundle.getBoolean("show_post_save_snackbar");
            azcq azcqVar = this.f;
            bwrs<ilo> bwrsVar = this.ag;
            gga a = azcqVar.a.a();
            azcq.a(a, 1);
            axwi a2 = azcqVar.b.a();
            azcq.a(a2, 2);
            Executor a3 = azcqVar.c.a();
            azcq.a(a3, 3);
            Executor a4 = azcqVar.d.a();
            azcq.a(a4, 4);
            azcd a5 = azcqVar.e.a();
            azcq.a(a5, 5);
            dxio a6 = ((dxjh) azcqVar.f).a();
            azcq.a(a6, 6);
            axwo a7 = azcqVar.g.a();
            azcq.a(a7, 7);
            axwy a8 = azcqVar.h.a();
            azcq.a(a8, 8);
            btrm a9 = azcqVar.i.a();
            azcq.a(a9, 9);
            gfq a10 = azcqVar.j.a();
            azcq.a(a10, 10);
            azcq.a(azcqVar.k.a(), 11);
            azcq.a(this, 12);
            azcq.a(bwrsVar, 13);
            azcp azcpVar = new azcp(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, this, bwrsVar);
            if (this.ah) {
                azcpVar.i(new ayzk(this));
            }
            this.af = azcpVar;
        } catch (IOException e2) {
            Throwable cause = e2.getCause();
            dbsk.s(cause);
            dbue.b(cause);
            Throwable cause2 = e2.getCause();
            dbsk.s(cause2);
            throw new RuntimeException(cause2);
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyb.C;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(null);
        cqkf<azbd> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        egjVar.ag(cqkfVar.c());
        egjVar.ak(jkc.q, jkc.q);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egf a = egf.a();
        a.n();
        egjVar.A(a);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.e.c(bundle, "save_to_lists_placemark", this.ag);
    }
}
