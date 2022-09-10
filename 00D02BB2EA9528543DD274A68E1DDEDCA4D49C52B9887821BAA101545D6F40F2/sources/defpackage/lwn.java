package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: lwn  reason: default package */
/* loaded from: classes7.dex */
public final class lwn implements not {
    public final lwp a;
    @dzsi
    public cqkf<lwp> b = null;
    private final npk c;
    private final dbty<cqkf<lwp>> d;
    private final dbty<cqkf<lwp>> e;
    private final dbty<cqkf<lwp>> f;
    private final dbty<cqkf<lwp>> g;

    public lwn(final cqkj cqkjVar, final npk npkVar, lwp lwpVar) {
        dbsk.s(npkVar);
        this.c = npkVar;
        dbsk.s(lwpVar);
        this.a = lwpVar;
        this.d = dbud.a(new dbty(cqkjVar, npkVar) { // from class: lwj
            private final cqkj a;
            private final npk b;

            {
                this.a = cqkjVar;
                this.b = npkVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.d(new lqi(), this.b.h, false);
            }
        });
        this.e = dbud.a(new dbty(cqkjVar) { // from class: lwk
            private final cqkj a;

            {
                this.a = cqkjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.e(new lqw());
            }
        });
        this.f = dbud.a(new dbty(cqkjVar) { // from class: lwl
            private final cqkj a;

            {
                this.a = cqkjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.e(new lqu());
            }
        });
        this.g = dbud.a(new dbty(cqkjVar) { // from class: lwm
            private final cqkj a;

            {
                this.a = cqkjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.e(new lqt());
            }
        });
    }

    @Override // defpackage.not
    public final ViewGroup a() {
        return this.c.i;
    }

    @Override // defpackage.not
    public final void b(noe noeVar, View view) {
        cqkf<lwp> a;
        npi npiVar;
        ayn axcVar;
        ayn axcVar2;
        lwo c = this.a.c();
        lwo lwoVar = lwo.IN_HEADER;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            a = this.d.a();
        } else if (ordinal == 1) {
            a = this.e.a();
        } else if (ordinal == 2) {
            a = this.f.a();
        } else if (ordinal == 3) {
            a = this.g.a();
        } else {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Given PanelSize isn't supported: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        this.b = a;
        a.e(this.a);
        View c2 = this.b.c();
        npk npkVar = this.c;
        int ordinal2 = c.ordinal();
        if (ordinal2 == 0) {
            npiVar = npi.HEADER_NEW;
        } else if (ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 3) {
            npiVar = npi.STANDARD_NEW;
        } else {
            String valueOf2 = String.valueOf(c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb2.append("Given PanelSize isn't supported: ");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        }
        dbsk.s(c2);
        dbsk.s(view);
        nou nouVar = noeVar.a;
        npkVar.m = npiVar;
        if (nouVar != npkVar) {
            if (nouVar != null) {
                nouVar.c();
            }
            npkVar.a(c2, view, npiVar);
        } else if (npkVar.o != null) {
            npk.b(npkVar.j);
            int ordinal3 = npiVar.ordinal();
            if (ordinal3 == 0) {
                noz nozVar = npkVar.k;
                View view2 = npkVar.o;
                dbsk.s(view2);
                View view3 = npkVar.p;
                View view4 = npkVar.q;
                if (view3 != null) {
                    axcVar = nozVar.a(view2, view3, nozVar.h, nrk.c);
                } else if (view4 != null) {
                    ayv ayvVar = new ayv();
                    ayvVar.L(1);
                    axp axpVar = new axp(2);
                    axpVar.c = noz.b;
                    axpVar.b = 70L;
                    axpVar.C(view2);
                    ayvVar.J(axpVar);
                    ayv ayvVar2 = new ayv();
                    ayvVar2.L(0);
                    ayvVar2.G(200L);
                    ayg aygVar = new ayg(null);
                    aygVar.c = noz.c;
                    aygVar.C(view4);
                    ayvVar2.J(aygVar);
                    axm axmVar = new axm();
                    axmVar.c = noz.c;
                    axmVar.c = noz.c;
                    axmVar.B(nrk.b);
                    axmVar.C(nozVar.g);
                    axmVar.C(nozVar.h);
                    ayvVar2.J(axmVar);
                    ayvVar.J(ayvVar2);
                    axp axpVar2 = new axp(1);
                    axpVar2.c = noz.a;
                    axpVar2.b = 70L;
                    ayvVar.J(axpVar2);
                    axcVar = ayvVar;
                } else {
                    axcVar = new axc();
                }
                noz.b(nozVar.i);
                axcVar.A(new nox(nozVar));
                ayr.b(nozVar.f, axcVar);
                if (view4 != null) {
                    noz.c(view4);
                }
                if (view3 != view) {
                    if (view3 != null) {
                        noz.c(view3);
                    }
                    noz.c(view);
                    nozVar.h.addView(view);
                }
                if (view2 != c2) {
                    noz.c(view2);
                    noz.c(c2);
                    nozVar.g.addView(c2);
                }
            } else if (ordinal3 == 1) {
                noz nozVar2 = npkVar.k;
                View view5 = npkVar.o;
                dbsk.s(view5);
                View view6 = npkVar.p;
                View view7 = npkVar.q;
                if (view7 != null) {
                    axcVar2 = nozVar2.a(view5, view7, nozVar2.i, nrk.a);
                } else if (view6 != null) {
                    ayv ayvVar3 = new ayv();
                    ayvVar3.L(1);
                    axp axpVar3 = new axp(2);
                    axpVar3.c = noz.b;
                    axpVar3.b = 70L;
                    axpVar3.C(view5);
                    axpVar3.C(view6);
                    ayvVar3.J(axpVar3);
                    ayv ayvVar4 = new ayv();
                    ayvVar4.L(0);
                    ayvVar4.G(200L);
                    ayg aygVar2 = new ayg(null);
                    aygVar2.c = noz.c;
                    aygVar2.C(view);
                    aygVar2.C(nozVar2.i);
                    ayvVar4.J(aygVar2);
                    axm axmVar2 = new axm();
                    axmVar2.c = noz.c;
                    axmVar2.B(nrk.b);
                    axmVar2.C(nozVar2.g);
                    axmVar2.C(nozVar2.h);
                    ayvVar4.J(axmVar2);
                    ayvVar3.J(ayvVar4);
                    axp axpVar4 = new axp(1);
                    axpVar4.c = noz.a;
                    axpVar4.b = 70L;
                    axpVar4.D(nozVar2.i);
                    axpVar4.D(view);
                    ayvVar3.J(axpVar4);
                    axcVar2 = ayvVar3;
                } else {
                    axcVar2 = new axc();
                }
                noz.b(nozVar2.i);
                axcVar2.A(new noy(nozVar2));
                ayr.b(nozVar2.f, axcVar2);
                if (view6 != null) {
                    noz.c(view6);
                }
                if (view7 != view) {
                    if (view7 != null) {
                        noz.c(view7);
                    }
                    noz.c(view);
                    nozVar2.i.addView(view);
                }
                if (view5 != c2) {
                    noz.c(view5);
                    noz.c(c2);
                    nozVar2.g.addView(c2);
                }
            }
            npkVar.l.a();
        } else {
            npkVar.a(c2, view, npiVar);
        }
        npkVar.i.requestApplyInsets();
        nol.b(view);
        npkVar.o = c2;
        if (npiVar == npi.STANDARD_NEW) {
            npkVar.p = view;
            npkVar.q = null;
        } else {
            npkVar.p = null;
            npkVar.q = view;
        }
        noeVar.a(npkVar);
    }

    public final ViewGroup c() {
        return (ViewGroup) this.c.g.findViewById(npk.f);
    }
}
