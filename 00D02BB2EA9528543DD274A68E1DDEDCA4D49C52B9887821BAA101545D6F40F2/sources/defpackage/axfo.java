package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axfo  reason: default package */
/* loaded from: classes3.dex */
public final class axfo extends hxf {
    public axhs ad;
    public akfa ae;
    public axhq af;
    private cqkf<axom> ag;
    private String ah;
    public axpd b;
    @dzsi
    public Parcelable c;
    @dzsi
    public Parcelable d;
    public cqkj e;
    public efg f;
    public axpa g;

    @dzsi
    private final Parcelable aS(@dzsi axot axotVar) {
        abs aT = aT(axotVar);
        if (aT == null) {
            return null;
        }
        return aT.B();
    }

    @dzsi
    private static final abs aT(@dzsi axot axotVar) {
        View o = axotVar == null ? null : cqkx.o(axotVar);
        if (o == null) {
            return null;
        }
        View a = cqhu.a(o, axmp.a);
        if (a instanceof RecyclerView) {
            return ((RecyclerView) a).l;
        }
        return null;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((axfp) btsx.b(axfp.class, this)).cr(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.c = aS(this.b.j());
        this.d = aS(this.b.k());
        this.ag.e(null);
        super.Qe();
    }

    @Override // defpackage.fd
    public final void Qj(@dzsi Bundle bundle) {
        super.Qj(bundle);
        this.ag.c().post(new Runnable(this) { // from class: axfn
            private final axfo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axfo axfoVar = this.a;
                if (axfoVar.c != null) {
                    axfoVar.aR(axfoVar.b.j(), axfoVar.c);
                }
                if (axfoVar.d != null) {
                    axfoVar.aR(axfoVar.b.k(), axfoVar.d);
                }
            }
        });
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof axjg) {
            if (((axjg) obj).a()) {
                axhs axhsVar = this.ad;
                String str = this.ah;
                dbsk.s(str);
                axhsVar.k(str).c();
                return;
            }
            gga ggaVar = this.aE;
            if (!this.aD || ggaVar == null) {
                return;
            }
            ggaVar.g().f();
        }
    }

    public final void aR(@dzsi axot axotVar, @dzsi Parcelable parcelable) {
        abs aT;
        if (parcelable == null || (aT = aT(axotVar)) == null) {
            return;
        }
        aT.C(parcelable);
    }

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        btlu j = this.ae.j();
        if (j != null) {
            String str = this.ah;
            dbsk.s(str);
            if (!str.equals(j.j())) {
                return;
            }
            axhq axhqVar = this.af;
            if (!axhqVar.d()) {
                return;
            }
            axhqVar.e(false, j);
        }
    }

    @Override // defpackage.hxf
    public final jib g() {
        ff J = J();
        String string = this.o.getString("displayName");
        dbsk.s(string);
        jhz e = jib.g(J, string).e();
        e.F = 1;
        e.x = false;
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<axom> e = this.e.e(new axku());
        this.ag = e;
        e.e(this.b);
        return this.ag.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        String string = this.o.getString("obfuscatedGaiaId");
        dbsk.s(string);
        this.ah = string;
        axpa axpaVar = this.g;
        axhs axhsVar = this.ad;
        dbsk.s(string);
        axgi k = axhsVar.k(string);
        axok axokVar = axok.values()[this.o.getInt("selectedTabIndex")];
        dbsk.s(axokVar);
        dzsj<gga> dzsjVar = axpaVar.a;
        axpm a = axpaVar.b.a();
        dbsk.s(a);
        axpy a2 = axpaVar.c.a();
        dbsk.s(a2);
        cqhn a3 = axpaVar.d.a();
        dbsk.s(a3);
        cjqy a4 = axpaVar.e.a();
        dbsk.s(a4);
        cpv a5 = axpaVar.f.a();
        dbsk.s(a5);
        dbsk.s(k);
        final axpd axpdVar = new axpd(dzsjVar, a, a2, a3, a4, a5, k, axokVar);
        axpdVar.l.c.c(new aa(axpdVar) { // from class: axoy
            private final axpd a;

            {
                this.a = axpdVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                axpd axpdVar2 = this.a;
                axgh axghVar = (axgh) obj;
                axgg axggVar = axgg.IDLE;
                axok axokVar2 = axok.FOLLOWERS;
                int ordinal = axghVar.a().ordinal();
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        axpdVar2.o = false;
                        axpdVar2.n = true;
                        cqkx.p(axpdVar2);
                        return;
                    } else if (ordinal != 5) {
                        return;
                    } else {
                        Throwable d = axghVar.d();
                        if (!(d instanceof btzz) || !((btzz) d).a.equals(btzy.k)) {
                            axpdVar2.k.p(axpdVar2.g.a().getString(R.string.DATA_REQUEST_ERROR));
                        } else {
                            axpdVar2.k.p(axpdVar2.g.a().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY));
                        }
                        axpdVar2.o = true;
                        axpdVar2.n = false;
                        cqkx.p(axpdVar2);
                        return;
                    }
                }
                if (axpdVar2.m.isEmpty()) {
                    axpm axpmVar = axpdVar2.h;
                    axgi axgiVar = axpdVar2.l;
                    boolean c = axghVar.c();
                    dbsk.s(axpmVar.a.a());
                    axpf a6 = axpmVar.b.a();
                    dbsk.s(a6);
                    axpp a7 = axpmVar.c.a();
                    dbsk.s(a7);
                    dzsj<gga> dzsjVar2 = axpmVar.d;
                    Executor a8 = axpmVar.e.a();
                    dbsk.s(a8);
                    bvjj a9 = axpmVar.f.a();
                    dbsk.s(a9);
                    akfa a10 = axpmVar.g.a();
                    dbsk.s(a10);
                    axhs a11 = axpmVar.h.a();
                    dbsk.s(a11);
                    dbsk.s(axgiVar);
                    final axpr axprVar = new axpr(a6, a7, dzsjVar2, a8, a9, a10, a11, axgiVar, c);
                    axprVar.h.c.c(new aa(axprVar) { // from class: axph
                        private final axpr a;

                        {
                            this.a = axprVar;
                        }

                        @Override // defpackage.aa
                        public final void m(Object obj2) {
                            final axpr axprVar2 = this.a;
                            axgh axghVar2 = (axgh) obj2;
                            axgg a12 = axghVar2.a();
                            axprVar2.i.a = a12 == axgg.PARTIALLY_LOADED;
                            if (a12 == axgg.LOADED || a12 == axgg.PARTIALLY_LOADED) {
                                dsrj<dqae> dsrjVar = axghVar2.b().c;
                                axprVar2.g.clear();
                                axprVar2.g.addAll(dchl.k(dsrjVar, new dbrn(axprVar2) { // from class: axpk
                                    private final axpr a;

                                    {
                                        this.a = axprVar2;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj3) {
                                        return this.a.j((dqae) obj3);
                                    }
                                }));
                                if ((axghVar2.b().a & 2) != 0 && axprVar2.f) {
                                    axprVar2.c.an(bvjk.gZ, axprVar2.d.j(), axghVar2.b().d);
                                }
                            }
                            cqkx.p(axprVar2);
                        }
                    });
                    axprVar.h.e.c(new aa(axprVar) { // from class: axpi
                        private final axpr a;

                        {
                            this.a = axprVar;
                        }

                        @Override // defpackage.aa
                        public final void m(Object obj2) {
                            axpr axprVar2 = this.a;
                            axgh axghVar2 = (axgh) obj2;
                            axgg a12 = axghVar2.a();
                            if (a12 == axgg.LOADED || a12 == axgg.PARTIALLY_LOADED) {
                                if (!axghVar2.b().c.isEmpty()) {
                                    axprVar2.j = true;
                                } else {
                                    axprVar2.j = false;
                                }
                                cqkx.p(axprVar2);
                                if ((axghVar2.b().a & 2) == 0 || !axprVar2.f) {
                                    return;
                                }
                                axprVar2.c.an(bvjk.ha, axprVar2.d.j(), axghVar2.b().d);
                            }
                        }
                    });
                    axpy axpyVar = axpdVar2.i;
                    axgi axgiVar2 = axpdVar2.l;
                    axpf a12 = axpyVar.a.a();
                    dbsk.s(a12);
                    dbsk.s(axpyVar.b.a());
                    dzsj<gga> dzsjVar3 = axpyVar.c;
                    dbsk.s(axgiVar2);
                    final axpz axpzVar = new axpz(a12, dzsjVar3, axgiVar2);
                    axpzVar.a.d.c(new aa(axpzVar) { // from class: axpw
                        private final axpz a;

                        {
                            this.a = axpzVar;
                        }

                        @Override // defpackage.aa
                        public final void m(Object obj2) {
                            final axpz axpzVar2 = this.a;
                            axgh axghVar2 = (axgh) obj2;
                            axgg a13 = axghVar2.a();
                            axpzVar2.c.a = a13 == axgg.PARTIALLY_LOADED;
                            if (a13 == axgg.LOADED || a13 == axgg.PARTIALLY_LOADED) {
                                dsrj<dqae> dsrjVar = axghVar2.b().c;
                                axpzVar2.b.clear();
                                axpzVar2.b.addAll(dchl.k(dsrjVar, new dbrn(axpzVar2) { // from class: axpx
                                    private final axpz a;

                                    {
                                        this.a = axpzVar2;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj3) {
                                        return this.a.j((dqae) obj3);
                                    }
                                }));
                            }
                            cqkx.p(axpzVar2);
                        }
                    });
                    axpdVar2.m = dcdc.g(axprVar, axpzVar);
                    axpdVar2.NP(axpdVar2.j);
                }
                axpdVar2.o = false;
                axpdVar2.n = false;
                cqkx.p(axpdVar2);
            }
        });
        final axoz axozVar = new axoz(axpdVar);
        ((AccessibilityManager) axpdVar.g.a().getSystemService("accessibility")).addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener(axozVar) { // from class: cpu
            private final axoz a;

            {
                this.a = axozVar;
            }

            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                cqkx.p(this.a.a);
            }
        });
        this.b = axpdVar;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.P);
        egjVar.e(this);
        this.f.a(egjVar.a());
    }
}
