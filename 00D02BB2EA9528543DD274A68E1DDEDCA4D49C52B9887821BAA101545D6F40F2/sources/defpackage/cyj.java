package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cyj  reason: default package */
/* loaded from: classes5.dex */
public final class cyj extends gen {
    public cqkj a;
    public cyr b;
    @dzsi
    cyf c;
    @dzsi
    private cqkf<cyf> d;
    @dzsi
    private dqmr e;

    public static cyj g(dqmr dqmrVar) {
        cyj cyjVar = new cyj();
        Bundle bundle = new Bundle();
        bundle.putByteArray("WhyThisAdDialogFragment.whyThisAd", dqmrVar.bS());
        cyjVar.B(bundle);
        return cyjVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((cyk) btsx.b(cyk.class, this)).b(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cyf> e = this.a.e(new cxs());
        this.d = e;
        e.e(this.c);
        return this.d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cqkf<cyf> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.d = null;
        }
        this.c = null;
        this.e = null;
        super.am();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        return new gdf(J(), 16973941);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        dqmr dqmrVar = (dqmr) bvrs.b(this.o.getByteArray("WhyThisAdDialogFragment.whyThisAd"), (dssr) dqmr.h.cu(7));
        this.e = dqmrVar;
        if (this.c != null || dqmrVar == null) {
            return;
        }
        cyr cyrVar = this.b;
        cyr.a(this, 1);
        cyr.a(dqmrVar, 2);
        cyd a = cyrVar.a.a();
        cyr.a(a, 3);
        btrm a2 = cyrVar.b.a();
        cyr.a(a2, 4);
        gga a3 = cyrVar.c.a();
        cyr.a(a3, 5);
        cztz a4 = cyrVar.d.a();
        cyr.a(a4, 6);
        cyi a5 = cyrVar.e.a();
        cyr.a(a5, 7);
        cjqy a6 = cyrVar.f.a();
        cyr.a(a6, 8);
        akfa a7 = cyrVar.g.a();
        cyr.a(a7, 9);
        dxio a8 = ((dxjh) cyrVar.h).a();
        cyr.a(a8, 10);
        this.c = new cyq(this, dqmrVar, a, a2, a3, a4, a5, a6, a7, a8);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyi.cM;
    }
}
