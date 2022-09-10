package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bcnd  reason: default package */
/* loaded from: classes3.dex */
public class bcnd implements bcly, bcls, bclu, degu {
    @dzsi
    public dcdc<bclv> a;
    @dzsi
    public bcjn b;
    public final bckv c;
    public final bclj d;
    public final bcle e;
    @dzsi
    private bclr g;
    @dzsi
    private bcnc h;
    private final Executor i;
    private final bcky j;
    private final bcmk l;
    private final jkf m;
    private final bcku n;
    private final bcbw o;
    public dspd f = bcbv.b;
    private dehn<dcdc<dweu>> q = null;
    private final bcli k = new bcli(this) { // from class: bcmw
        private final bcnd a;

        {
            this.a = this;
        }

        @Override // defpackage.bcli
        public final boolean a(dspd dspdVar) {
            return dspdVar.equals(this.a.f);
        }
    };
    private boolean p = false;

    public bcnd(bcmk bcmkVar, cqhn cqhnVar, cqhu cqhuVar, Executor executor, jkf jkfVar, bckv bckvVar, bcku bckuVar, bcbw bcbwVar, bcle bcleVar, bclj bcljVar) {
        this.j = new bcnb(this, bcgn.a, bclb.a(bckvVar), cqhuVar);
        this.l = bcmkVar;
        this.i = executor;
        this.m = jkfVar;
        this.c = bckvVar;
        this.n = bckuVar;
        this.d = bcljVar;
        this.o = bcbwVar;
        this.e = bcleVar;
    }

    @Override // defpackage.degu
    public void a(Throwable th) {
    }

    @Override // defpackage.bcls
    public void c(dspd dspdVar) {
        bvrj.UI_THREAD.c();
        dbsk.m(this.p, "onCoverImageClicked(int) should not be called before the view model was initialized.");
        int i = true != this.f.equals(dspdVar) ? 2 : 3;
        this.f = dspdVar;
        r(dspdVar);
        if (!this.m.l().L().equals(jjn.FULLY_EXPANDED)) {
            this.m.B(jjn.FULLY_EXPANDED);
        }
        this.d.e(i);
        cqkx.p(this);
    }

    @Override // defpackage.bclu
    public void d() {
        cqkx.p(this);
    }

    @Override // defpackage.bclw
    public void e(@dzsi final ilo iloVar) {
        dehn<dcdc<dweu>> dehnVar;
        if (!this.p || (dehnVar = this.q) == null) {
            return;
        }
        dehnVar.Pk(new Runnable(this, iloVar) { // from class: bcmy
            private final bcnd a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bcnd bcndVar = this.a;
                ilo iloVar2 = this.b;
                dcdc<bclv> dcdcVar = bcndVar.a;
                dbuh.d(dcdcVar);
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    dcdcVar.get(i).B(iloVar2);
                }
            }
        }, this.i);
    }

    @Override // defpackage.bclw
    public bclv f() {
        dbsk.m(this.p, "getFocusedGalleryViewModel() should not be called before the view model was initialized.");
        bcnc bcncVar = this.h;
        dbuh.d(bcncVar);
        int intValue = bcncVar.a(this.f).c(0).intValue();
        dcdc<bclv> dcdcVar = this.a;
        dbuh.d(dcdcVar);
        return dcdcVar.get(intValue);
    }

    @Override // defpackage.bclw
    public List<bclv> g() {
        dbsk.m(this.p, "getGalleryViewModels() should not be called before the view model was initialized.");
        dcdc<bclv> dcdcVar = this.a;
        dbuh.d(dcdcVar);
        return dcdcVar;
    }

    @Override // defpackage.bclw
    public void h(Map<String, Parcelable> map) {
        throw null;
    }

    @Override // defpackage.bcly
    public bclr i() {
        dbsk.m(this.p, "getCarouselViewModel() should not be called before the view model was initialized.");
        bclr bclrVar = this.g;
        dbuh.d(bclrVar);
        return bclrVar;
    }

    @Override // defpackage.bcly
    public void j() {
        if (this.q != null) {
            return;
        }
        bcbx a = this.o.a();
        dbuh.d(a);
        dehn<dcdc<dweu>> a2 = a.a();
        this.q = a2;
        deha.q(a2, this, this.i);
    }

    @Override // defpackage.bcly
    public Boolean k() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.bcly
    public bcli l() {
        return this.k;
    }

    @Override // defpackage.bcly
    public ViewTreeObserver.OnPreDrawListener m(final RecyclerView recyclerView) {
        return new ViewTreeObserver.OnPreDrawListener(this, recyclerView) { // from class: bcmz
            private final bcnd a;
            private final RecyclerView b;

            {
                this.a = this;
                this.b = recyclerView;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                bcnd bcndVar = this.a;
                bcndVar.e.b(this.b);
                return true;
            }
        };
    }

    @Override // defpackage.bcly
    public bclx n() {
        return new bcna(this);
    }

    @Override // defpackage.bcly
    public void o() {
        this.b = null;
    }

    @Override // defpackage.degu
    /* renamed from: p */
    public void b(@dzsi dcdc<dweu> dcdcVar) {
        bvrj.UI_THREAD.c();
        bcbx a = this.o.a();
        dbuh.d(a);
        if (dcdcVar == null) {
            return;
        }
        dcdc<bclt> d = a.d();
        int size = d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            d.get(i2).i(this);
        }
        bcmj a2 = this.l.a(d, this.n, this.d, (ilo) bwrs.b(this.c.d()));
        this.h = new bcnc(d);
        bcbu b = a.b();
        dbuh.d(b);
        dcdc<bclv> e = b.e();
        int size2 = e.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bclv bclvVar = e.get(i3);
            bclvVar.o(this.j);
            bclvVar.C(this);
        }
        dspd dspdVar = bcbv.b;
        int size3 = dcdcVar.size();
        while (true) {
            if (i >= size3) {
                break;
            }
            dweu dweuVar = dcdcVar.get(i);
            i++;
            if (b.c(dweuVar)) {
                dspdVar = dweuVar.d;
                break;
            }
        }
        this.g = a2;
        this.a = e;
        this.p = true;
        q(dspdVar);
        cqkx.p(this);
        RecyclerView e2 = this.c.e();
        if (e2 == null) {
            return;
        }
        e2.post(new Runnable(this) { // from class: bcmx
            private final bcnd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bcnd bcndVar = this.a;
                dbsg<dspd> a3 = bcndVar.c.k().a();
                if (a3.a()) {
                    bcndVar.r(a3.b());
                }
            }
        });
    }

    public void q(dspd dspdVar) {
        dbsk.m(this.p, "setInitialFocusedGallery() should not be called before the view model was initialized.");
        bcnc bcncVar = this.h;
        dbuh.d(bcncVar);
        if (!bcncVar.a(dspdVar).a()) {
            dspdVar = bcbv.b;
        }
        this.f = dspdVar;
    }

    public final void r(dspd dspdVar) {
        Context context;
        bcnc bcncVar = this.h;
        if (bcncVar == null) {
            return;
        }
        dbsg<Integer> a = bcncVar.a(dspdVar);
        if (!a.a()) {
            return;
        }
        int intValue = a.b().intValue();
        RecyclerView e = this.c.e();
        if (e == null) {
            return;
        }
        abs absVar = e.l;
        if (!(absVar instanceof bcfd)) {
            return;
        }
        bcfd bcfdVar = (bcfd) absVar;
        int ad = bcfdVar.ad();
        int af = bcfdVar.af();
        if ((intValue >= ad && intValue <= af) || (context = e.getContext()) == null) {
            return;
        }
        int a2 = jmj.a(context, 12);
        int a3 = jmj.a(context, 136);
        if (intValue != bcfdVar.ac()) {
            bcfdVar.k(context, intValue, bcfdVar.D - a3);
        } else {
            bcfdVar.k(context, intValue, a2);
        }
    }
}
