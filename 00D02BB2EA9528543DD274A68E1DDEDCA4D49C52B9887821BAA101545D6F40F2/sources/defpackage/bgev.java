package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bgev  reason: default package */
/* loaded from: classes3.dex */
public final class bgev extends bfdi {
    private static final dcqe f = dcqe.c("bgev");
    public bwqv a;
    @dzsi
    private ViewGroup ae;
    private bwrs<ilo> af;
    private int ag;
    private View ah;
    private boolean ai;
    public cqkj b;
    public bgpu c;
    @dzsi
    cqkf<bgoa> d;
    public bgpt e;
    private final Object g = new Object();
    private final ViewTreeObserver.OnDrawListener ad = new bgeu(this);

    public bgev() {
        ((btvq) btsr.a(btvq.class)).rp();
    }

    public static bgev g(bwqv bwqvVar, bwrs<ilo> bwrsVar, int i) {
        bgev bgevVar = new bgev();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "LocalPosts.Placemark", bwrsVar);
        bundle.putInt("LocalPosts.ActiveLocalPostIndex", i);
        bgevVar.B(bundle);
        return bgevVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bgoa> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.ae;
            if (viewGroup != null) {
                viewGroup.removeView(this.d.c());
            }
            this.d = null;
        }
        this.ae = null;
        super.Qe();
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.UPDATES;
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        View view = this.P;
        if (view == null) {
            return;
        }
        View a = cqhu.a(view, bgll.a);
        if (!(a instanceof RecyclerView)) {
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) a;
        recyclerView.post(new Runnable(recyclerView) { // from class: bget
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
        bwrs<ilo> bwrsVar = this.af;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ae = viewGroup;
        cqkf<bgoa> c = this.b.c(new bgll(), null);
        this.d = c;
        if (this.e == null) {
            try {
                bwrs<ilo> e = this.a.e(ilo.class, this.o, "LocalPosts.Placemark");
                dbsk.s(e);
                this.af = e;
                ilo c2 = e.c();
                if (c2 != null) {
                    bgpt a = this.c.a();
                    this.e = a;
                    int i = this.ag;
                    final bwrs<ilo> bwrsVar = this.af;
                    a.h(c2, i, new bgez(this, bwrsVar) { // from class: bges
                        private final bgev a;
                        private final bwrs b;

                        {
                            this.a = this;
                            this.b = bwrsVar;
                        }

                        @Override // defpackage.bgez
                        public final void a(dipk dipkVar, diov diovVar, int i2, boolean z, boolean z2, int i3) {
                            bgev bgevVar = this.a;
                            bwrs bwrsVar2 = this.b;
                            gga ggaVar = bgevVar.aE;
                            if (ggaVar != null) {
                                ggaVar.D(bgex.g(bgevVar.a, dipkVar, diovVar, z, z2, i3, bwrsVar2, i2));
                            }
                        }
                    }, bgnk.PLACESHEET_POST_TAB);
                }
            } catch (IOException | ClassCastException | NullPointerException unused) {
                bvoo.h("PlacemarkRef is invalid.", new Object[0]);
                gn gnVar = this.A;
                dbsk.s(gnVar);
                gnVar.e();
            }
        }
        c.e(this.e);
        View c3 = c.c();
        this.ah = c3;
        return c3;
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ag = this.o.getInt("LocalPosts.ActiveLocalPostIndex");
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.az;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        synchronized (this.g) {
            if (!this.ai) {
                this.ah.getViewTreeObserver().addOnDrawListener(this.ad);
                this.ai = true;
            }
        }
        bgpt bgptVar = this.e;
        if (bgptVar != null) {
            bgptVar.j();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        synchronized (this.g) {
            if (this.ai) {
                this.ah.getViewTreeObserver().removeOnDrawListener(this.ad);
                this.ai = false;
            }
        }
        bgpt bgptVar = this.e;
        if (bgptVar != null) {
            bgptVar.i();
        }
        super.u();
    }
}
