package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bfso  reason: default package */
/* loaded from: classes3.dex */
public final class bfso extends bfdi {
    private static final dcqe d = dcqe.c("bfso");
    public bwqv a;
    @dzsi
    private cqkf<bfrr> ad;
    public dzsj<bfsh> b;
    public cqkj c;
    @dzsi
    private ViewGroup e;
    @dzsi
    private bfsh f;
    private bwrs<ilo> g;

    public static bfso g(bwqv bwqvVar, bwrs<ilo> bwrsVar) {
        bfso bfsoVar = new bfso();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark_ref", bwrsVar);
        bfsoVar.B(bundle);
        return bfsoVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bfsp) btsx.b(bfsp.class, this)).cI(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bfrr> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.e;
            if (viewGroup != null) {
                viewGroup.removeView(this.ad.c());
            }
            this.ad = null;
        }
        this.e = null;
        super.Qe();
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.PRICES;
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        View view = this.P;
        if (view == null) {
            return;
        }
        View a = cqhu.a(view, bfpq.a);
        if (!(a instanceof RecyclerView)) {
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) a;
        recyclerView.post(new Runnable(recyclerView) { // from class: bfsn
            private final RecyclerView a;

            {
                this.a = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.l(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.g;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        bfsh bfshVar;
        this.e = viewGroup;
        cqkf<bfrr> d2 = this.c.d(new bfpq(), viewGroup, false);
        this.ad = d2;
        d2.e(this.f);
        View a = cqhu.a(this.ad.c(), bfpq.a);
        if (a != null && (bfshVar = this.f) != null) {
            bfshVar.C(a);
        }
        cqkf<bfrr> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bwrs<ilo> e = this.a.e(ilo.class, this.o, "placemark_ref");
            dbsk.s(e);
            this.g = e;
            dbsk.s((ilo) bwrs.b(e));
            bfsh a = this.b.a();
            this.f = a;
            a.t(this.g);
        } catch (IOException | ClassCastException | NullPointerException unused) {
            bvoo.h("PlacemarkRef is invalid.", new Object[0]);
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.e();
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bfsh bfshVar = this.f;
        if (bfshVar != null) {
            bfshVar.D(configuration);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.hy;
    }
}
