package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azgh  reason: default package */
/* loaded from: classes3.dex */
public final class azgh extends itb implements axwo {
    public static final dcqe a = dcqe.c("azgh");
    public final gga b;
    public final bwqv c;
    public final ayay d;
    public final batm e;
    public final dxio<axwi> f;
    public final dxio<bwft> g;
    public final dxio<axzi> h;
    public final dxio<axyk> i;
    public final gfq j;
    private final caxo k;
    private final dxio<akfa> o;
    private final dxio<baju> p;
    private final dxio<afef> q;
    private final axwg r;
    private final Executor s;

    public azgh(gga ggaVar, bwqv bwqvVar, ayay ayayVar, batm batmVar, caxo caxoVar, dxio<akfa> dxioVar, dxio<axwi> dxioVar2, dxio<baju> dxioVar3, dxio<bwft> dxioVar4, dxio<afef> dxioVar5, axwg axwgVar, dxio<axzi> dxioVar6, dxio<axyk> dxioVar7, gfq gfqVar, Executor executor) {
        this.b = ggaVar;
        this.c = bwqvVar;
        this.d = ayayVar;
        this.e = batmVar;
        this.k = caxoVar;
        this.o = dxioVar;
        this.f = dxioVar2;
        this.p = dxioVar3;
        this.g = dxioVar4;
        this.q = dxioVar5;
        this.r = axwgVar;
        this.h = dxioVar6;
        this.i = dxioVar7;
        this.j = gfqVar;
        this.s = executor;
    }

    private final void B(ProgressDialog progressDialog, final Runnable runnable) {
        if (btlu.i(this.o.a().j()) == btlt.INCOGNITO) {
            afdt afdtVar = afdt.a;
            this.q.a().r();
            return;
        }
        this.p.a().b(new azgg(progressDialog), new bvqg(runnable) { // from class: azfk
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                Boolean bool = (Boolean) obj;
                this.a.run();
            }
        });
    }

    private final ProgressDialog t() {
        ProgressDialog progressDialog = new ProgressDialog(this.b, 0);
        progressDialog.setMessage(this.b.getString(R.string.LOADING_DATA));
        return progressDialog;
    }

    @Override // defpackage.axwo
    public final void a(final bwrs<ilo> bwrsVar, final boolean z) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, bwrsVar, z, t) { // from class: azfc
            private final azgh a;
            private final bwrs b;
            private final boolean c;
            private final ProgressDialog d;

            {
                this.a = this;
                this.b = bwrsVar;
                this.c = z;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final azgh azghVar = this.a;
                final bwrs bwrsVar2 = this.b;
                final boolean z2 = this.c;
                final ProgressDialog progressDialog = this.d;
                azghVar.e.a(new Runnable(azghVar, bwrsVar2, z2, progressDialog) { // from class: azfm
                    private final azgh a;
                    private final bwrs b;
                    private final boolean c;
                    private final ProgressDialog d;

                    {
                        this.a = azghVar;
                        this.b = bwrsVar2;
                        this.c = z2;
                        this.d = progressDialog;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        azgh azghVar2 = this.a;
                        bwrs bwrsVar3 = this.b;
                        boolean z3 = this.c;
                        ProgressDialog progressDialog2 = this.d;
                        gga ggaVar = azghVar2.b;
                        if (ggaVar.aZ) {
                            bwqv bwqvVar = azghVar2.c;
                            ayzl ayzlVar = new ayzl();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("show_post_save_snackbar", z3);
                            bwqvVar.c(bundle, "save_to_lists_placemark", bwrsVar3);
                            ayzlVar.B(bundle);
                            ggaVar.D(ayzlVar);
                        }
                        progressDialog2.dismiss();
                    }
                });
            }
        });
    }

    @Override // defpackage.axwo
    public final void b(final gfw gfwVar, final baal baalVar) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, baalVar, gfwVar, t) { // from class: azfq
            private final azgh a;
            private final baal b;
            private final gfw c;
            private final ProgressDialog d;

            {
                this.a = this;
                this.b = baalVar;
                this.c = gfwVar;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azgh azghVar = this.a;
                baal baalVar2 = this.b;
                gfw gfwVar2 = this.c;
                ProgressDialog progressDialog = this.d;
                dbrn dbrnVar = new dbrn(azghVar) { // from class: azfp
                    private final azgh a;

                    {
                        this.a = azghVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        bwqv bwqvVar = this.a.c;
                        bwrs a2 = bwrs.a((baal) obj);
                        Bundle bundle = new Bundle();
                        bwqvVar.c(bundle, "local_list_item_ref", a2);
                        ayze ayzeVar = new ayze();
                        ayzeVar.B(bundle);
                        return ayzeVar;
                    }
                };
                baad b = baalVar2.b();
                if (b == null) {
                    bvoo.h("Trying to edit dangling item [id=%s] without parent list.", baalVar2);
                } else if (baalVar2.m()) {
                    azghVar.q(baalVar2, dbrnVar, gfwVar2, progressDialog);
                } else {
                    azghVar.p(b, new dbrn(baalVar2, dbrnVar) { // from class: azfd
                        private final baal a;
                        private final dbrn b;

                        {
                            this.a = baalVar2;
                            this.b = dbrnVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            baal baalVar3 = this.a;
                            dbrn dbrnVar2 = this.b;
                            baal d = ((baad) obj).d(baalVar3.a());
                            if (d != null) {
                                baalVar3 = d;
                            }
                            return (ges) dbrnVar2.a(baalVar3);
                        }
                    }, gfwVar2, progressDialog);
                }
            }
        });
    }

    @Override // defpackage.axwo
    public final void c(final gfw gfwVar, final baad baadVar) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, baadVar, gfwVar, t) { // from class: azfr
            private final azgh a;
            private final baad b;
            private final gfw c;
            private final ProgressDialog d;

            {
                this.a = this;
                this.b = baadVar;
                this.c = gfwVar;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azgh azghVar = this.a;
                azghVar.p(this.b, new dbrn(azghVar) { // from class: azfo
                    private final azgh a;

                    {
                        this.a = azghVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        bwqv bwqvVar = this.a.c;
                        bwrs a2 = bwrs.a((baad) obj);
                        Bundle bundle = new Bundle();
                        bwqvVar.c(bundle, "local_list_ref", a2);
                        ayyz ayyzVar = new ayyz();
                        ayyzVar.B(bundle);
                        return ayyzVar;
                    }
                }, this.c, this.d);
            }
        });
    }

    @Override // defpackage.axwo
    public final void d(final baad baadVar, final gfw gfwVar) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, baadVar, gfwVar, t) { // from class: azfu
            private final azgh a;
            private final baad b;
            private final gfw c;
            private final ProgressDialog d;

            {
                this.a = this;
                this.b = baadVar;
                this.c = gfwVar;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azgh azghVar = this.a;
                azghVar.p(this.b, new dbrn(azghVar) { // from class: azfn
                    private final azgh a;

                    {
                        this.a = azghVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return ayrr.g(this.a.c, bwrs.a((baad) obj));
                    }
                }, this.c, this.d);
            }
        });
    }

    @Override // defpackage.axwo
    public final void e(final gfw gfwVar, final bwrs<dcdc<ilo>> bwrsVar) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, gfwVar, bwrsVar, t) { // from class: azfs
            private final azgh a;
            private final gfw b;
            private final bwrs c;
            private final ProgressDialog d;

            {
                this.a = this;
                this.b = gfwVar;
                this.c = bwrsVar;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final azgh azghVar = this.a;
                final gfw gfwVar2 = this.b;
                final bwrs bwrsVar2 = this.c;
                final ProgressDialog progressDialog = this.d;
                azghVar.e.a(new Runnable(azghVar, bwrsVar2, gfwVar2, progressDialog) { // from class: azft
                    private final azgh a;
                    private final bwrs b;
                    private final gfw c;
                    private final ProgressDialog d;

                    {
                        this.a = azghVar;
                        this.b = bwrsVar2;
                        this.c = gfwVar2;
                        this.d = progressDialog;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        azgh azghVar2 = this.a;
                        bwrs bwrsVar3 = this.b;
                        gfw gfwVar3 = this.c;
                        ProgressDialog progressDialog2 = this.d;
                        bwqv bwqvVar = azghVar2.c;
                        ayzh ayzhVar = new ayzh();
                        Bundle bundle = new Bundle();
                        bwqvVar.c(bundle, "new_list_placemark", bwrsVar3);
                        ayzhVar.B(bundle);
                        gfwVar3.aZ(ayzhVar);
                        progressDialog2.dismiss();
                    }
                });
            }
        });
    }

    @Override // defpackage.axwo
    public final void f(String str) {
        g(axwf.c(str));
    }

    @Override // defpackage.axwo
    public final void g(final axwf axwfVar) {
        final ProgressDialog t = t();
        t.show();
        btlu j = this.o.a().j();
        if (j == null || btlu.i(j) != btlt.GOOGLE || !j.u()) {
            r(axwfVar, t);
        } else {
            this.p.a().a(new bvqg(this, axwfVar, t) { // from class: azfe
                private final azgh a;
                private final axwf b;
                private final ProgressDialog c;

                {
                    this.a = this;
                    this.b = axwfVar;
                    this.c = t;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    azgh azghVar = this.a;
                    axwf axwfVar2 = this.b;
                    ProgressDialog progressDialog = this.c;
                    Boolean bool = (Boolean) obj;
                    azghVar.i.a();
                    axvr axvrVar = (axvr) axwfVar2;
                    if (axyk.a(axvrVar.b) != null) {
                        azghVar.r(axwfVar2, progressDialog);
                    } else {
                        deha.q(azghVar.f.a().h(axvrVar.a), new azgb(azghVar, progressDialog, axwfVar2), dege.a);
                    }
                }
            });
        }
    }

    @Override // defpackage.axwo
    public final void h(ilo iloVar) {
        dhjx ak = iloVar.ak();
        if (ak == null) {
            return;
        }
        deha.q(this.f.a().g(), new azga(this, ak, iloVar), dege.a);
    }

    @Override // defpackage.axwo
    public final void i(baad baadVar) {
        s(baadVar, 1);
    }

    @Override // defpackage.axwo
    public final void j(dibq dibqVar) {
        if ((dibqVar.a & 32) != 0) {
            dpql dpqlVar = dibqVar.e;
            if (dpqlVar == null) {
                dpqlVar = dpql.c;
            }
            dqhy b = dqhy.b(dpqlVar.a);
            if (b == null) {
                b = dqhy.UNKNOWN_STATUS_CODE;
            }
            if (b != dqhy.OK) {
                this.d.c();
                return;
            }
        }
        if (dibqVar.d) {
            this.d.d();
        }
        s(this.f.a().b(dibqVar), 3);
    }

    @Override // defpackage.axwo
    public final void k(final baab baabVar) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, baabVar, t) { // from class: azfh
            private final azgh a;
            private final baab b;
            private final ProgressDialog c;

            {
                this.a = this;
                this.b = baabVar;
                this.c = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final azgh azghVar = this.a;
                baab baabVar2 = this.b;
                ProgressDialog progressDialog = this.c;
                if (baabVar2 == baab.STARRED_PLACES) {
                    azghVar.e.a(new Runnable(azghVar) { // from class: azfi
                        private final azgh a;

                        {
                            this.a = azghVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b.D(ayen.g());
                        }
                    });
                    progressDialog.dismiss();
                    return;
                }
                deha.q(azghVar.f.a().i(baabVar2), new azgd(azghVar, progressDialog, baabVar2), dege.a);
            }
        });
    }

    @Override // defpackage.axwo
    public final dehn<baad> l(baad baadVar, ddho ddhoVar) {
        if (!this.b.aZ) {
            return deha.c();
        }
        dehn<baad> a2 = deha.a(baadVar);
        if (!baadVar.w()) {
            a2 = this.f.a().l(baadVar, baac.SHARED);
        }
        deha.q(a2, new azgf(this, ddhoVar), dege.a);
        return a2;
    }

    @Override // defpackage.axwo
    public final dehn<baad> m(baad baadVar, axwn axwnVar) {
        if (!this.b.aZ || baadVar.t() == baac.PUBLISHED) {
            return deha.c();
        }
        deig d = deig.d();
        caxm a2 = this.k.a(caxa.LISTS);
        caxi caxiVar = new caxi(new azfj(this, d, baadVar, axwnVar));
        if (!a2.e) {
            throw new IllegalStateException("Not enabled".toString());
        }
        a2.d(a2.b, a2.c, caxiVar);
        return d;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [cqkp] */
    @Override // defpackage.axwo
    public final Boolean n(ilo iloVar) {
        boolean z = false;
        if (!this.r.c()) {
            return false;
        }
        ayen ayenVar = (ayen) this.b.z(ayen.class);
        if (ayenVar != null && ayenVar.aT()) {
            ayfn ayfnVar = ayenVar.aQ;
            dbsk.s(ayfnVar);
            azxb f = azxb.f(iloVar.ai(), iloVar.aj());
            int i = 0;
            while (true) {
                if (i < ayfnVar.b.size()) {
                    ilo g = ayfn.g(ayfnVar.b.get(i).a().b());
                    azxb f2 = g == null ? null : azxb.f(g.ai(), g.aj());
                    if (f2 != null && f.h(f2)) {
                        ghw ghwVar = ayfnVar.d;
                        dbsk.s(ghwVar);
                        ayfnVar.c(ghwVar, i, 0, null);
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.axwo
    public final void o(final baad baadVar, final gfw gfwVar) {
        final ProgressDialog t = t();
        B(t, new Runnable(this, baadVar, gfwVar, t) { // from class: azfv
            private final azgh a;
            private final baad b;
            private final gfw c;
            private final ProgressDialog d;

            {
                this.a = this;
                this.b = baadVar;
                this.c = gfwVar;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azgh azghVar = this.a;
                azghVar.p(this.b, new dbrn(azghVar) { // from class: azfl
                    private final azgh a;

                    {
                        this.a = azghVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azgh azghVar2 = this.a;
                        return azrm.aS(azghVar2.c, bwrs.a((baad) obj), true, azghVar2.b.getString(R.string.ADD_PLACE_TO_LIST_HINT), false);
                    }
                }, this.c, this.d);
            }
        });
    }

    public final void p(final baad baadVar, final dbrn<baad, ges> dbrnVar, final gfw gfwVar, final ProgressDialog progressDialog) {
        if (baadVar.ab()) {
            q(baadVar, dbrnVar, gfwVar, progressDialog);
        } else {
            bvqj.e(this.f.a().h(baadVar.l()), new bvqg(this, baadVar, dbrnVar, gfwVar, progressDialog) { // from class: azfw
                private final azgh a;
                private final baad b;
                private final dbrn c;
                private final gfw d;
                private final ProgressDialog e;

                {
                    this.a = this;
                    this.b = baadVar;
                    this.c = dbrnVar;
                    this.d = gfwVar;
                    this.e = progressDialog;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    azgh azghVar = this.a;
                    baad baadVar2 = this.b;
                    dbrn dbrnVar2 = this.c;
                    gfw gfwVar2 = this.d;
                    ProgressDialog progressDialog2 = this.e;
                    baad baadVar3 = (baad) obj;
                    if (baadVar3 == null) {
                        bvoo.h("Failed to calibrate list [id=%s] with sync storage before edit flow.", baadVar2.l());
                    } else {
                        baadVar2 = baadVar3;
                    }
                    azghVar.q(baadVar2, dbrnVar2, gfwVar2, progressDialog2);
                }
            }, this.s);
        }
    }

    public final <T> void q(final T t, final dbrn<T, ges> dbrnVar, final gfw gfwVar, final ProgressDialog progressDialog) {
        this.e.a(new Runnable(this, dbrnVar, t, gfwVar, progressDialog) { // from class: azfx
            private final azgh a;
            private final dbrn b;
            private final Object c;
            private final gfw d;
            private final ProgressDialog e;

            {
                this.a = this;
                this.b = dbrnVar;
                this.c = t;
                this.d = gfwVar;
                this.e = progressDialog;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azgh azghVar = this.a;
                dbrn dbrnVar2 = this.b;
                Object obj = this.c;
                gfw gfwVar2 = this.d;
                ProgressDialog progressDialog2 = this.e;
                ges gesVar = (ges) dbrnVar2.a(obj);
                if (gfwVar2 != null && ((fd) gfwVar2).U()) {
                    gfwVar2.aZ(gesVar);
                } else {
                    gga ggaVar = azghVar.b;
                    if (ggaVar.aZ) {
                        ggaVar.D(gesVar);
                    }
                }
                progressDialog2.dismiss();
            }
        });
    }

    public final void r(axwf axwfVar, ProgressDialog progressDialog) {
        deha.q(this.f.a().k(axwfVar, dbpy.a), new azgc(this, axwfVar, progressDialog), dege.a);
    }

    public final void s(final baad baadVar, final int i) {
        this.e.a(new Runnable(this, baadVar, i) { // from class: azfg
            private final azgh a;
            private final baad b;
            private final int c;

            {
                this.a = this;
                this.b = baadVar;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ayen ayenVar;
                azgh azghVar = this.a;
                baad baadVar2 = this.b;
                int i2 = this.c;
                if (azghVar.j.d() instanceof ayrr) {
                    ayenVar = ayen.aU(azghVar.c, bwrs.a(baadVar2), baadVar2.w(), dtxo.T, 0);
                } else if (azghVar.j.d() instanceof ayzh) {
                    ayenVar = ayen.aU(azghVar.c, bwrs.a(baadVar2), baadVar2.w(), dtyb.k, 0);
                } else if (azghVar.j.d() instanceof bqzm) {
                    ayenVar = ayen.aU(azghVar.c, bwrs.a(baadVar2), false, null, 2);
                } else {
                    bwqv bwqvVar = azghVar.c;
                    bwrs a2 = bwrs.a(baadVar2);
                    ayen ayenVar2 = new ayen();
                    Bundle bundle = new Bundle();
                    bwqvVar.c(bundle, "arg_local_list", a2);
                    bundle.putBoolean("is_starred_places_list", false);
                    bundle.putString("arg_action_on_start", axwl.a(i2));
                    ayenVar2.B(bundle);
                    ayenVar = ayenVar2;
                }
                azghVar.b.D(ayenVar);
            }
        });
    }
}
