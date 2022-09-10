package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: nle  reason: default package */
/* loaded from: classes7.dex */
public final class nle implements nlz, btph {
    public static final /* synthetic */ int n = 0;
    private static final long o = TimeUnit.SECONDS.toMillis(30);
    private static final long p = TimeUnit.SECONDS.toMillis(90);
    private static final long q = TimeUnit.SECONDS.toMillis(6);
    private final vul A;
    private final int B;
    @dzsi
    private nll D;
    @dzsi
    private nly E;
    private long F;
    private boolean G;
    @dzsi
    private bvpk H;
    private final crfr J;
    public final ahjq a;
    public final axwq b;
    public final ksr c;
    public final nln d;
    public dcdc<azva> e;
    @dzsi
    public GmmLocation f;
    @dzsi
    public dcdc<azva> g;
    @dzsi
    public dcdc<dpjx> h;
    @dzsi
    public crqd i;
    @dzsi
    public crqd j;
    public boolean k;
    public boolean l;
    @dzsi
    public btlu m;
    private final akfa r;
    private final Executor s;
    private final btrm t;
    private final cqat u;
    private final nlm v;
    private final nkz w;
    private final boolean x;
    private final boolean y;
    private final bvrb z;
    private final crzp<btlu> C = new nlc(this);
    private final nld I = new nld(this);

    public nle(ahjq ahjqVar, axwq axwqVar, akfa akfaVar, Executor executor, btrm btrmVar, cqat cqatVar, ksr ksrVar, nln nlnVar, nlm nlmVar, nkz nkzVar, bvrb bvrbVar, crfr crfrVar, boolean z, boolean z2, vul vulVar, int i) {
        dbsk.s(ahjqVar);
        this.a = ahjqVar;
        dbsk.s(axwqVar);
        this.b = axwqVar;
        this.r = akfaVar;
        this.s = executor;
        dbsk.s(btrmVar);
        this.t = btrmVar;
        dbsk.s(cqatVar);
        this.u = cqatVar;
        dbsk.s(ksrVar);
        this.c = ksrVar;
        dbsk.s(nlnVar);
        this.d = nlnVar;
        dbsk.s(nlmVar);
        this.v = nlmVar;
        dbsk.s(nkzVar);
        this.w = nkzVar;
        dbsk.s(bvrbVar);
        this.z = bvrbVar;
        dbsk.s(crfrVar);
        this.J = crfrVar;
        this.x = z;
        this.y = z2;
        this.A = vulVar;
        this.B = i;
        this.e = dcdc.e();
    }

    private final void j(dcdc<dpjx> dcdcVar) {
        nll nllVar = this.D;
        if (nllVar != null) {
            nllVar.a(dcdcVar, new nlk(this) { // from class: nla
                private final nle a;

                {
                    this.a = this;
                }

                @Override // defpackage.nlk
                public final void a(dcdc dcdcVar2) {
                    nle nleVar = this.a;
                    nleVar.l = true;
                    nleVar.g(dcdcVar2);
                }
            });
            this.D = null;
        }
        this.t.b(new crii(this.A, dcdcVar, 60000));
        this.k = false;
    }

    @dzsi
    private static nlw k(dcdc<nlw> dcdcVar, dpjs dpjsVar) {
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            nlw nlwVar = dcdcVar.get(i);
            i++;
            if (nlwVar.q() == dpjsVar) {
                return nlwVar;
            }
        }
        return null;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nlz
    public final void b(nly nlyVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(this.E == null);
        this.r.C().d(this.C, this.s);
        dbsk.s(nlyVar);
        this.E = nlyVar;
        this.k = true;
        this.l = false;
        this.D = this.v.a();
        dcdc<dpjx> dcdcVar = this.h;
        if (dcdcVar != null) {
            j(dcdcVar);
        }
        btrm btrmVar = this.t;
        nld nldVar = this.I;
        dceq a = dcet.a();
        a.b(crhp.class, new nlf(0, crhp.class, nldVar, bvrj.UI_THREAD));
        a.b(azre.class, new nlf(1, azre.class, nldVar, bvrj.UI_THREAD));
        a.b(amqo.class, new nlf(2, amqo.class, nldVar, bvrj.UI_THREAD));
        btrmVar.g(nldVar, a.a());
        this.c.a();
    }

    @Override // defpackage.nlz
    public final void d() {
        bvrj.UI_THREAD.c();
        dbsk.s(this.E);
        this.c.b();
        this.t.a(this.I);
        this.t.b(new crii(this.A, null, Integer.MAX_VALUE));
        nll nllVar = this.D;
        if (nllVar != null) {
            nllVar.b();
            this.D = null;
        }
        bvpk bvpkVar = this.H;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.H = null;
        }
        this.E = null;
        this.r.C().c(this.C);
    }

    @Override // defpackage.nlz
    public final void e() {
        dbsk.l(!this.G);
        this.G = true;
        this.J.a();
        a();
    }

    @Override // defpackage.nlz
    public final void f() {
        dbsk.l(this.G);
        this.G = false;
        this.J.b();
    }

    public final void g(dcdc<nlw> dcdcVar) {
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            if (btlu.i(this.m) == btlt.GOOGLE) {
                nlw k = k(dcdcVar, dpjs.ENTITY_TYPE_HOME);
                nlw k2 = k(dcdcVar, dpjs.ENTITY_TYPE_WORK);
                if (k != null) {
                    arrayList.add(k);
                }
                if (k2 != null) {
                    arrayList.add(k2);
                }
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    nlw nlwVar = dcdcVar.get(i);
                    dpjs q2 = nlwVar.q();
                    if (arrayList.size() < this.B && q2 != dpjs.ENTITY_TYPE_HOME && q2 != dpjs.ENTITY_TYPE_WORK) {
                        arrayList.add(nlwVar);
                    }
                }
            }
            nly nlyVar = this.E;
            dbsk.s(nlyVar);
            nlyVar.a(dcdc.r(arrayList));
        }
        this.F = this.u.e();
    }

    public final void h(dcdc<azva> dcdcVar) {
        azva azvaVar;
        dcdcVar.size();
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        dccx F3 = dcdc.F();
        azva azvaVar2 = null;
        if (this.x) {
            azvaVar = this.w.a(dcdcVar, dndr.HOME, this.f);
            if (azvaVar != null) {
                F3.g(azvaVar);
            }
        } else {
            azvaVar = null;
        }
        if (this.y && (azvaVar2 = this.w.a(dcdcVar, dndr.WORK, this.f)) != null) {
            F3.g(azvaVar2);
        }
        if (this.A == vul.FREE_NAV) {
            F3 = dcdc.F();
            if (azvaVar2 != null) {
                F3.g(azvaVar2);
            } else if (azvaVar != null) {
                F3.g(azvaVar);
            }
        }
        dcdc<azva> f = F3.f();
        dcdc<azva> dcdcVar2 = this.e;
        boolean z = false;
        dbsk.a(dcdcVar2 == null || dcdcVar2.size() <= 2);
        dbsk.a(f == null || f.size() <= 2);
        if (dcdcVar2 != null || f != null) {
            if (dcdcVar2 != null && f != null && dcdcVar2.size() == f.size()) {
                for (int i = 0; i < dcdcVar2.size(); i++) {
                    if (dcdcVar2.get(i).a != null && dcdcVar2.get(i).d != null && dcdcVar2.get(i).a.equals(f.get(i).a) && dcdcVar2.get(i).d.equals(f.get(i).d)) {
                    }
                }
            }
            this.k = true;
            break;
        }
        this.e = f;
        int size = f.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            azva azvaVar3 = f.get(i2);
            dndr dndrVar = azvaVar3.a;
            dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
            dpjq bZ = dpjx.n.bZ();
            String o2 = azvaVar3.c.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = z;
            }
            dpjx dpjxVar = (dpjx) bZ.b;
            o2.getClass();
            int i4 = dpjxVar.a | 2;
            dpjxVar.a = i4;
            dpjxVar.c = o2;
            String str = azvaVar3.d;
            if (str != null) {
                str.getClass();
                dpjxVar.a = i4 | 1;
                dpjxVar.b = str;
            }
            dpjs g = amvj.g(azvaVar3.a);
            if (g != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = z;
                }
                dpjx dpjxVar2 = (dpjx) bZ.b;
                dpjxVar2.f = g.h;
                dpjxVar2.a |= 256;
            }
            akqq akqqVar = azvaVar3.e;
            if (akqqVar != null) {
                dnog bZ2 = dnoh.d.bZ();
                double d = akqqVar.a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = z;
                }
                dnoh dnohVar = (dnoh) bZ2.b;
                int i5 = dnohVar.a | 1;
                dnohVar.a = i5;
                dnohVar.b = d;
                double d2 = akqqVar.b;
                dnohVar.a = i5 | 2;
                dnohVar.c = d2;
                dnoh bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar3 = (dpjx) bZ.b;
                bK.getClass();
                dpjxVar3.d = bK;
                dpjxVar3.a |= 4;
            }
            dpjx bK2 = bZ.bK();
            F2.g(bK2);
            nln nlnVar = this.d;
            dbsk.s(dndrVar);
            int i6 = i3 + 1;
            ddjr ddjrVar = ddjr.CAR_OVERVIEW_OFFLINE;
            amvg amvgVar = new amvg(amvh.M(bK2, nlnVar.a));
            dpjs g2 = amvj.g(dndrVar);
            if (g2 != null) {
                amvgVar.a = g2;
            }
            F.g(nlnVar.a(amvgVar.a(), -1, dpej.DELAY_NODATA, -1, dowa.REGIONAL, dcdc.e(), "", ddjrVar, i3, "", ""));
            i2++;
            i3 = i6;
            z = false;
        }
        final dcdc<nlw> f2 = F.f();
        this.h = F2.f();
        if (this.E == null || !this.k) {
            return;
        }
        g(f2);
        dcdc<dpjx> dcdcVar3 = this.h;
        dbsk.s(dcdcVar3);
        j(dcdcVar3);
        bvpk a = bvpk.a(new Runnable(this, f2) { // from class: nlb
            private final nle a;
            private final dcdc b;

            {
                this.a = this;
                this.b = f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nle nleVar = this.a;
                dcdc dcdcVar4 = this.b;
                if (!nleVar.l) {
                    dccx G = dcdc.G(dcdcVar4.size());
                    int size2 = dcdcVar4.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        nln nlnVar2 = nleVar.d;
                        nlv r = ((nlw) dcdcVar4.get(i7)).r();
                        r.h(nlnVar2.a.getResources().getString(R.string.CAR_OVERVIEW_CARD_OFFLINE));
                        G.g(r.a());
                    }
                    nleVar.g(G.f());
                }
            }
        });
        this.H = a;
        this.z.a(a, bvrj.UI_THREAD, q);
    }

    public final dcdc<crqg> i(crqd crqdVar) {
        boolean z = true;
        if (this.A != vul.OVERVIEW_SUGGESTIONS && this.A != vul.FREE_NAV) {
            z = false;
        }
        dbsk.g(z, "Unexpected directionsAssistMode: %s\n unable to get ImplicitDestinations", this.A);
        return this.A == vul.OVERVIEW_SUGGESTIONS ? crqdVar.h : crqdVar.g;
    }

    public final void a() {
        nll nllVar;
        long j = this.G ? o : p;
        crqd crqdVar = this.i;
        boolean z = crqdVar != null && !i(crqdVar).isEmpty();
        crqd crqdVar2 = this.j;
        boolean z2 = crqdVar2 != null && !i(crqdVar2).isEmpty();
        if (!z || !z2 || this.u.e() - this.F >= j) {
            if (!z && !z2) {
                return;
            }
            dccx F = dcdc.F();
            crqd crqdVar3 = this.i;
            if (crqdVar3 != null) {
                dcdc<crqg> i = i(crqdVar3);
                int size = i.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    crqg crqgVar = i.get(i2);
                    nln nlnVar = this.d;
                    int i4 = i3 + 1;
                    ddjr ddjrVar = ddjr.CAR_OVERVIEW_IMPLICIT_DESTINATIONS;
                    cray crayVar = crqgVar.b;
                    akru e = crayVar.e(-1.0f);
                    dccx F2 = dcdc.F();
                    if (e != null) {
                        akra akraVar = new akra();
                        int a = e.a();
                        for (int i5 = 0; i5 < a; i5++) {
                            e.c(i5, akraVar);
                            F2.g(akraVar.S());
                        }
                    }
                    amve amveVar = crayVar.a.d;
                    F.g(nlnVar.a(crqgVar.a, crayVar.a(), crayVar.f(), crayVar.g, crayVar.a.I, F2.f(), amveVar.b().c, ddjrVar, i3, amveVar.m(), amveVar.k()));
                    i2++;
                    i3 = i4;
                }
            }
            this.l = true;
            g(F.f());
            if (this.E == null || (nllVar = this.D) == null) {
                return;
            }
            nllVar.b();
            this.D = null;
        }
    }
}
