package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
/* compiled from: PG */
/* renamed from: adgc  reason: default package */
/* loaded from: classes.dex */
public final class adgc extends kt implements ynl {
    private static final String f = zep.a("MDX.MediaRouteManager");
    public final axnm a;
    public final axnm b;
    public bhc c;
    public adnt d;
    public adgn e;
    private final yni g;
    private final axnm h;
    private final axnm i;
    private final axnm j;
    private final axnm k;
    private final axnm l;
    private final axnm m;
    private final axnm n;
    private final axnm o;
    private final axnm p;
    private final adex q;
    private boolean s;
    private adig t;
    private yiw u;
    private int r = 0;
    private final adny v = new adgb(this);

    public adgc(axnm axnmVar, yni yniVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, axnm axnmVar5, axnm axnmVar6, axnm axnmVar7, axnm axnmVar8, axnm axnmVar9, axnm axnmVar10, axnm axnmVar11, adex adexVar) {
        this.a = axnmVar;
        this.g = yniVar;
        this.i = axnmVar2;
        this.j = axnmVar3;
        this.k = axnmVar4;
        this.b = axnmVar5;
        this.l = axnmVar6;
        this.m = axnmVar7;
        this.o = axnmVar8;
        this.h = axnmVar9;
        this.n = axnmVar10;
        this.p = axnmVar11;
        this.q = adexVar;
    }

    private final bhc X(adig adigVar) {
        adig c;
        bhd bhdVar = (bhd) this.a.get();
        for (bhc bhcVar : bhd.i()) {
            if (adgl.g(bhcVar) && bhcVar.q != null && (c = ((adnq) this.l.get()).c(bhcVar.q)) != null && adigVar.g().equals(c.g())) {
                return bhcVar;
            }
        }
        return null;
    }

    private final adgn Y(bhc bhcVar) {
        bhd bhdVar = (bhd) this.a.get();
        if (!bhcVar.equals(bhd.g()) && bhcVar.n((bgo) this.j.get())) {
            if (((adgl) this.h.get()).e(bhcVar)) {
                return new adgn(bhcVar.c, bhcVar.d, adgm.c);
            }
            if (!adgl.g(bhcVar)) {
                if (((adgl) this.h.get()).f(bhcVar)) {
                    return new adgn(bhcVar.c, bhcVar.d, adgm.b);
                }
                String str = f;
                String valueOf = String.valueOf(bhcVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unknown type of route info: ");
                sb.append(valueOf);
                zep.c(str, sb.toString());
                return null;
            } else if (bhcVar.q == null) {
                zep.c(f, "Can not find screen from MDx route");
                return null;
            } else {
                adig c = ((adnq) this.l.get()).c(bhcVar.q);
                if (c == null) {
                    zep.c(f, "Can not get MDx screen from the route info");
                    return null;
                } else if (c instanceof adif) {
                    return new adgn(bhcVar.c, bhcVar.d, adgm.a);
                } else {
                    if (c instanceof adid) {
                        return new adgn(bhcVar.c, bhcVar.d, new adgm(2));
                    }
                    String str2 = f;
                    String valueOf2 = String.valueOf(c);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                    sb2.append("Can not determine the type of screen: ");
                    sb2.append(valueOf2);
                    zep.c(str2, sb2.toString());
                    return null;
                }
            }
        }
        return null;
    }

    private final synchronized void Z(bhc bhcVar) {
        bhcVar.g();
    }

    private final void aa() {
        if (this.s) {
            return;
        }
        ((adoa) this.i.get()).k();
        this.s = true;
    }

    private final void ab(boolean z) {
        this.g.d(new adgo(z));
    }

    private final void ac() {
        boolean z;
        if (this.s) {
            adel adelVar = (adel) this.o.get();
            ylr.c();
            synchronized (adelVar.c) {
                z = true;
                if (adelVar.a.isEmpty() && adelVar.b.isEmpty()) {
                    z = false;
                }
            }
            if (z || this.r > 0) {
                return;
            }
            ((adoa) this.i.get()).l();
            this.s = false;
        }
    }

    @Override // defpackage.kt
    public final void A(bhc bhcVar, int i) {
        bhc bhcVar2;
        axnm axnmVar;
        String str = f;
        String valueOf = String.valueOf(bhcVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("MediaRouter.onRouteUnselected: ");
        sb.append(valueOf);
        sb.append(" reason: ");
        sb.append(i);
        zep.h(str, sb.toString());
        if (!this.q.b() && (bhcVar2 = this.c) != null && bhcVar2.equals(bhcVar)) {
            if (this.e.a() - 1 == 3 && (axnmVar = this.k) != null) {
                ((aijf) axnmVar.get()).o(new aijq());
            }
            this.d = null;
            this.e = null;
            this.c = null;
            M(true);
        }
    }

    public final bhc J(ScreenId screenId) {
        adig a = ((adnq) this.l.get()).a(screenId);
        if (a != null) {
            return X(a);
        }
        return null;
    }

    public final void K(Object obj) {
        ylr.c();
        ((adel) this.o.get()).a(obj);
        ac();
    }

    public final synchronized void L() {
        adnt adntVar = this.d;
        boolean z = false;
        int i = 1;
        if (adntVar != null && adntVar.ad()) {
            z = true;
        }
        bhd bhdVar = (bhd) this.a.get();
        if (true == z) {
            i = 2;
        }
        bhd.o(i);
    }

    public final synchronized void M(boolean z) {
        adgn adgnVar = this.e;
        if (adgnVar != null) {
            String str = adgnVar.a;
            int a = adgnVar.a();
            str.length();
            adyf.e(a).length();
        }
        this.g.d(new adgp(this.e, z));
    }

    public final void N() {
        ylr.c();
        aa();
        int i = this.r;
        this.r = i + 1;
        if (i == 0) {
            ((adoa) this.i.get()).g(this.v);
            Q(this);
            adkr adkrVar = (adkr) this.p.get();
            adkrVar.f.g(adkrVar.h.g(adkrVar.e));
            adkrVar.f.g(adkrVar.d.g(adkrVar.e));
            bhd bhdVar = (bhd) this.a.get();
            this.q.a();
            if (this.q.b()) {
                bhl bhlVar = new bhl();
                bhlVar.b(true);
                bhd.n(bhlVar.a());
            }
            bhdVar.p((bgo) this.j.get(), this);
            adga adgaVar = (adga) this.m.get();
            adyf adyfVar = adgaVar.m;
            if (Math.random() < 0.5d) {
                adgaVar.f.g(adgaVar.j);
                adgaVar.a();
            }
            adnt adntVar = this.d;
            adgn Y = Y(bhd.j());
            this.e = Y;
            if (Y != null) {
                this.c = bhd.j();
                this.d = ((adoa) this.i.get()).e();
                if (this.e.a() == 4 && this.k.get() != null) {
                    ((aijf) this.k.get()).o(new aijq(5, 3));
                }
            } else {
                if (this.d != null) {
                    zep.h(f, "onStart: disconnecting previously selected mdx session");
                    this.d.C();
                }
                this.c = null;
                this.d = null;
            }
            if (adntVar == this.d) {
                return;
            }
            M(false);
        }
    }

    public final void O() {
        ylr.c();
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            ((adkr) this.p.get()).f.c();
            adga adgaVar = (adga) this.m.get();
            adgaVar.f.m(adgaVar.j);
            adgaVar.c.removeCallbacks(adgaVar.k);
            if (this.d == null) {
                ((adel) this.o.get()).a(this);
                if (this.q.b()) {
                    ((bhd) this.a.get()).q((bgo) this.j.get(), this, 0);
                } else {
                    ((bhd) this.a.get()).r(this);
                }
            }
            ac();
        }
    }

    public final void P(Object obj) {
        ylr.c();
        aa();
        ((adel) this.o.get()).b(obj, true);
    }

    public final void Q(Object obj) {
        ylr.c();
        aa();
        ((adel) this.o.get()).b(obj, false);
    }

    public final void R(adig adigVar, yiw yiwVar) {
        ylr.c();
        if ((adigVar instanceof adid) || (adigVar instanceof adif)) {
            String str = f;
            String valueOf = String.valueOf(adigVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Selecting mdx route for ");
            sb.append(valueOf);
            zep.h(str, sb.toString());
            bhc X = X(adigVar);
            if (X == null) {
                this.t = adigVar;
                this.u = yiwVar;
                return;
            }
            Z(X);
            if (yiwVar == null) {
                return;
            }
            yiwVar.b(adigVar, true);
            return;
        }
        yiwVar.a(adigVar, new IllegalArgumentException("screen must be DIAL or ManualPairing"));
    }

    public final void S() {
        bhd bhdVar = (bhd) this.a.get();
        bhc j = bhd.j();
        if (bhd.g() == j) {
            return;
        }
        String str = j.c;
        adfe a = adff.a();
        a.b(true);
        ((adfg) this.n.get()).b(str, a.a());
        L();
    }

    public final boolean T(bhc bhcVar) {
        return ((adgl) this.h.get()).f(bhcVar) || adgl.g(bhcVar);
    }

    public final boolean U(bhc bhcVar, adnl adnlVar) {
        adnlVar.getClass();
        aqxo.p(adnlVar.g());
        return V(bhcVar, adnlVar);
    }

    public final boolean V(bhc bhcVar, adnl adnlVar) {
        ylr.c();
        if (!T(bhcVar)) {
            zep.m(f, "unable to select non youtube mdx route");
            return false;
        }
        adfg adfgVar = (adfg) this.n.get();
        String str = bhcVar.c;
        adfc a = adfd.a();
        a.a = adnlVar;
        adfd a2 = a.a();
        synchronized (adfgVar.c) {
            adfgVar.b = ampr.a(str, a2);
        }
        Z(bhcVar);
        return true;
    }

    public final void W(bhc bhcVar) {
        bhcVar.getClass();
        V(bhcVar, null);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahgk ahgkVar = (ahgk) obj;
                bhd bhdVar = (bhd) this.a.get();
                bhd.m(((ajad) this.b.get()).a());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahgk.class};
    }

    @Override // defpackage.kt
    public final void s(bhc bhcVar) {
        adig c;
        String.valueOf(String.valueOf(bhcVar)).length();
        if (this.t != null && adgl.g(bhcVar) && bhcVar.q != null && (c = ((adnq) this.l.get()).c(bhcVar.q)) != null && this.t.g().equals(c.g())) {
            Z(bhcVar);
            yiw yiwVar = this.u;
            if (yiwVar != null) {
                yiwVar.b(this.t, true);
            }
            this.t = null;
            this.u = null;
        }
        if (Y(bhcVar) != null) {
            ab(true);
        }
    }

    @Override // defpackage.kt
    public final void t(bhc bhcVar) {
        if (Y(bhcVar) != null) {
            ab(true);
        }
    }

    @Override // defpackage.kt
    public final void u(bhc bhcVar) {
        if (Y(bhcVar) != null) {
            ab(false);
        }
    }

    @Override // defpackage.kt
    public final void y(bhc bhcVar, int i) {
        String str = f;
        String valueOf = String.valueOf(bhcVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("MediaRouter.onRouteSelected: ");
        sb.append(valueOf);
        sb.append(" reason: ");
        sb.append(i);
        zep.h(str, sb.toString());
        adgn Y = Y(bhcVar);
        this.e = Y;
        if (Y != null) {
            if (Y.a() - 1 != 3) {
                this.d = ((adoa) this.i.get()).e();
            } else if (this.k.get() != null) {
                ((aijf) this.k.get()).o(new aijq(5, 3));
            }
            this.c = bhcVar;
        } else {
            this.c = null;
            this.d = null;
        }
        this.t = null;
        this.u = null;
        M(true);
    }
}
