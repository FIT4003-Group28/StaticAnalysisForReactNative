package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bbep  reason: default package */
/* loaded from: classes3.dex */
public final class bbep extends ges {
    public bwqv a;
    private bwrs<ilo> ad;
    public efg b;
    public cqkj c;
    public bbhw d;
    public cjxo e;
    private cqkf<bbhq> f;
    private bbhv g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bbeq) btsx.b(bbeq.class, this)).cF(this);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bbhq> c = this.c.c(new bbfu(), null);
        this.f = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle != null) {
            try {
                bwrs<ilo> bwrsVar = (bwrs) this.a.d(bwrs.class, bundle, "cp");
                dbsk.s(bwrsVar);
                this.ad = bwrsVar;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        bbhw bbhwVar = this.d;
        bwrs<ilo> bwrsVar2 = this.ad;
        gga a = bbhwVar.a.a();
        bbhw.a(a, 1);
        cqhn a2 = bbhwVar.b.a();
        bbhw.a(a2, 2);
        bbfg a3 = bbhwVar.c.a();
        bbhw.a(a3, 3);
        bbib a4 = bbhwVar.d.a();
        bbhw.a(a4, 4);
        bbhy a5 = bbhwVar.e.a();
        bbhw.a(a5, 5);
        dxio a6 = ((dxjh) bbhwVar.f).a();
        bbhw.a(a6, 6);
        dxio a7 = ((dxjh) bbhwVar.g).a();
        bbhw.a(a7, 7);
        affz a8 = bbhwVar.h.a();
        bbhw.a(a8, 8);
        cjqy a9 = bbhwVar.i.a();
        bbhw.a(a9, 9);
        this.g = new bbhv(a, a2, a3, a4, a5, a6, a7, a8, a9, bwrsVar2);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.aN;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.g.n();
        this.f.e(this.g);
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        if (!btpf.c(ggaVar).e) {
            this.e.a(1);
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "cp", this.ad);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.e(null);
        this.g.o();
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        if (!btpf.c(ggaVar).e) {
            this.e.b();
        }
        super.u();
    }
}
