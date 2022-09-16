package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bgqt  reason: default package */
/* loaded from: classes3.dex */
public final class bgqt extends bfdi implements begp {
    public bwqv a;
    @dzsi
    private cqkf<bgsk> ad;
    public dzsj<bgsk> b;
    public cqkj c;
    public bgsk d;
    bwrs<ilo> e;
    private boolean f = false;
    @dzsi
    private ViewGroup g;

    public static bgqt g(bwqv bwqvVar, @dzsi bwrs<ilo> bwrsVar) {
        return i(bwqvVar, bwrsVar, dhnl.b, null);
    }

    public static bgqt i(bwqv bwqvVar, @dzsi bwrs<ilo> bwrsVar, dhnl dhnlVar, @dzsi String str) {
        bgqt bgqtVar = new bgqt();
        Bundle bundle = new Bundle();
        if (!dhnlVar.equals(dhnl.b)) {
            bvrs.k(bundle, "business_categories_response", dhnlVar);
        }
        if (str != null) {
            bundle.putString("category", str);
        }
        bwqvVar.c(bundle, "placemark_ref", bwrsVar);
        bgqtVar.B(bundle);
        return bgqtVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bgqu) btsx.b(bgqu.class, this)).cK(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bgsk> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                viewGroup.removeView(this.ad.c());
            }
            this.ad = null;
        }
        this.g = null;
        super.Qe();
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.DIRECTORY;
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        View view = this.P;
        if (!(view instanceof RecyclerView)) {
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.post(new Runnable(recyclerView) { // from class: bgqs
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

    @Override // defpackage.begp
    public final void aU() {
        bgsk bgskVar = this.d;
        if (bgskVar != null) {
            bgskVar.m(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.e;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.g = viewGroup;
        cqkf<bgsk> d = this.c.d(new bgrt(), viewGroup, false);
        this.ad = d;
        d.e(this.d);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        bgsk bgskVar = this.d;
        if (bgskVar != null && this.f) {
            bgskVar.i();
        }
        this.f = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        bgsk bgskVar = this.d;
        if (bgskVar != null) {
            bgskVar.m(false);
        }
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bwrs<ilo> e = this.a.e(ilo.class, this.o, "placemark_ref");
            dbsk.s(e);
            this.e = e;
            bgsk a = this.b.a();
            this.d = a;
            a.e().c((dhnl) bvrs.g(this.o, "business_categories_response", (dssr) dhnl.b.cu(7), dhnl.b));
            this.d.g(this.o.getString("category", ""));
            this.d.h(this.e);
        } catch (IOException e2) {
            throw new RuntimeException("PlaceMallsDirectoryTabFragment cannot be created without a Placemark", e2);
        }
    }
}
