package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wsl  reason: default package */
/* loaded from: classes7.dex */
public class wsl implements wpv, cqkn {
    private Boolean A;
    private final Boolean B;
    @dzsi
    private doza C;
    @dzsi
    private cqtd D;
    @dzsi
    private cjtd E;
    @dzsi
    private final cqtd F;
    @dzsi
    private final xmy G;
    @dzsi
    private final eapd H;
    private final wsk I;
    @dzsi
    private final dpyy J;
    @dzsi
    private final String K;
    private final boolean L;
    private int M;
    @dzsi
    private final ddho N;
    @dzsi
    private final String O;
    @dzsi
    private wpr P;
    @dzsi
    private wqd Q;
    @dzsi
    private final dooa R;
    @dzsi
    private String S;
    @dzsi
    private String U;
    @dzsi
    private dphe V;
    @dzsi
    private xas W;
    @dzsi
    private cqfd X;
    @dzsi
    private qco Y;
    @dzsi
    public cqtd a;
    private final xax b;
    private final dxio<qbt> c;
    private final cqat d;
    @dzsi
    private final donz e;
    @dzsi
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    @dzsi
    private final CharSequence j;
    @dzsi
    private final zef k;
    private final boolean l;
    private final cqtv m;
    @dzsi
    private CharSequence n;
    @dzsi
    private final String o;
    @dzsi
    private final akqi p;
    @dzsi
    private final String q;
    @dzsi
    private final xmw r;
    @dzsi
    private final akqi s;
    @dzsi
    private final String t;
    @dzsi
    private final String u;
    @dzsi
    private final String v;
    @dzsi
    private final CharSequence w;
    @dzsi
    private final eaol x;
    @dzsi
    private final eaol y;
    @dzsi
    private final eapg z;

    public wsl(Application application, dxio<qbt> dxioVar, btvo btvoVar, cqat cqatVar, @dzsi zuz zuzVar, wsg wsgVar, xax xaxVar, vtn vtnVar, xcq xcqVar, xcr xcrVar, xaz xazVar, cqhn cqhnVar, @dzsi akqi akqiVar, @dzsi String str, @dzsi dnoh dnohVar, @dzsi akqi akqiVar2, dooj doojVar, @dzsi zef zefVar, dool doolVar, @dzsi String str2, boolean z, @dzsi Long l, wsk wskVar, List<dood> list, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi String str3, int i, @dzsi xmw xmwVar, boolean z2, boolean z3, boolean z4) {
        wsl wslVar;
        jhk jhkVar;
        Application application2;
        String o;
        eaol eaolVar;
        String str4;
        CharSequence h;
        cqtd cqtdVar;
        doza dozaVar;
        cjtd cjtdVar;
        xmw xmwVar2;
        cqtd cqtdVar2;
        vxz vxzVar;
        int a;
        this.b = xaxVar;
        this.c = dxioVar;
        this.d = cqatVar;
        this.s = akqiVar2;
        this.N = ddhoVar;
        this.O = str3;
        this.M = i;
        this.k = zefVar;
        this.l = z4;
        donz donzVar = donz.ON_TIME;
        int ordinal = doolVar.ordinal();
        if (ordinal == 1) {
            this.m = cqrt.d(R.dimen.departure_board_medium_line_name_width);
        } else if (ordinal != 2) {
            this.m = cqrt.d(R.dimen.departure_board_short_line_name_width);
        } else {
            this.m = cqrt.d(R.dimen.departure_board_long_line_name_width);
        }
        this.o = str;
        this.p = akqiVar;
        this.t = str2;
        this.A = Boolean.valueOf(!list.isEmpty() && (a = dpkh.a(list.get(0).d)) != 0 && a == 3);
        this.L = z3;
        this.h = btvoVar.getDirectionsPageParameters() != null && btvoVar.getDirectionsPageParameters().B;
        if (list.isEmpty() || list.get(0).b != 1) {
            wslVar = this;
            jhkVar = null;
            wslVar.u = str2;
            wslVar.e = null;
            wslVar.f = null;
            wslVar.F = null;
            wslVar.i = false;
            wslVar.q = null;
            wslVar.x = null;
            wslVar.y = null;
            wslVar.z = null;
            if (list.isEmpty()) {
                application2 = application;
                o = null;
            } else {
                dood doodVar = list.get(0);
                doof doofVar = doodVar.b == 2 ? (doof) doodVar.c : doof.e;
                application2 = application;
                o = xkg.o(application2, doofVar);
            }
            wslVar.j = dbsj.e(o);
            wslVar.v = null;
            wslVar.w = null;
            wslVar.C = null;
            wslVar.D = null;
            wslVar.H = null;
            wslVar.I = wsk.ALWAYS_RELEVANT;
            wslVar.B = true;
            wslVar.J = null;
            wslVar.a = null;
            wslVar.K = null;
            wslVar.g = false;
            wslVar.G = null;
            wslVar.r = null;
            wslVar.R = null;
        } else {
            dood doodVar2 = list.get(0);
            dooa dooaVar = doodVar2.b == 1 ? (dooa) doodVar2.c : dooa.m;
            this.R = dooaVar;
            String l2 = xkg.l(dooaVar);
            this.u = true == dbsj.d(l2) ? str2 : l2;
            String str5 = (dooaVar.a & 64) != 0 ? dooaVar.h : (doodVar2.a & 8) != 0 ? doodVar2.e : null;
            this.q = str5;
            this.n = xkg.k(application, dooaVar);
            int i2 = dooaVar.a;
            if ((i2 & 16) != 0 && (i2 & 1) == 0) {
                h = dooaVar.f;
                str4 = str5;
            } else if ((i2 & 1) != 0) {
                dgaw dgawVar = dooaVar.c;
                str4 = str5;
                int max = (int) Math.max(0L, TimeUnit.SECONDS.toMinutes((dgawVar == null ? dgaw.g : dgawVar).b - TimeUnit.MILLISECONDS.toSeconds(cqatVar.b())));
                if (max <= 0) {
                    h = application.getString(R.string.DA_WAIT_TIME_RIGHT_NOW);
                } else if (max <= 59) {
                    h = bvtb.e(application.getResources(), (int) TimeUnit.MINUTES.toSeconds(max), bvsz.ABBREVIATED).toString();
                } else {
                    dgaw dgawVar2 = dooaVar.c;
                    h = bvtb.h(application, dgawVar2 == null ? dgaw.g : dgawVar2);
                }
            } else {
                str4 = str5;
                dgaw dgawVar3 = dooaVar.c;
                h = bvtb.h(application, dgawVar3 == null ? dgaw.g : dgawVar3);
            }
            if ((dooaVar.a & 1) != 0) {
                bvsv a2 = new bvsx(application.getResources()).a(h);
                a2.l(ire.k().b(application));
                a2.i();
                h = a2.c();
            }
            this.j = h;
            this.H = l == null ? null : new eapd(TimeUnit.SECONDS.toMillis(l.longValue()));
            this.I = wskVar;
            Boolean valueOf = Boolean.valueOf(dooaVar.g);
            this.B = valueOf;
            dgaw dgawVar4 = dooaVar.c;
            eaol a3 = vxs.a(dgawVar4 == null ? dgaw.g : dgawVar4);
            if (!valueOf.booleanValue() || z2) {
                this.y = a3;
            } else {
                this.y = null;
            }
            dgaw dgawVar5 = dooaVar.d;
            if (((dgawVar5 == null ? dgaw.g : dgawVar5).a & 1) != 0) {
                dgaw dgawVar6 = dooaVar.d;
                this.x = vxs.a(dgawVar6 == null ? dgaw.g : dgawVar6);
            } else {
                this.x = this.y;
            }
            eaol eaolVar2 = this.y;
            this.z = eaolVar2 != null ? eaolVar2.o().b() : null;
            eaol eaolVar3 = new eaol(cqatVar.b());
            eaol eaolVar4 = this.y;
            boolean z5 = eaolVar4 != null && eaolVar3.w(eaolVar4.l(1));
            this.i = z5;
            donz i3 = xkg.i(dooaVar);
            this.e = i3;
            donz i4 = xkg.i(dooaVar);
            if (i4 != null) {
                int ordinal2 = i4.ordinal();
                if (ordinal2 == 0) {
                    application.getString(R.string.TRANSIT_REALTIME_INFORMATION_ON_TIME);
                } else if (ordinal2 == 1) {
                    application.getString(R.string.TRANSIT_REALTIME_INFORMATION_CHANGED);
                } else if (ordinal2 == 2) {
                    application.getString(R.string.TRANSIT_REALTIME_INFORMATION_CANCELED);
                }
            }
            this.f = xkg.x(application, dooaVar, z5);
            if (zuzVar != null) {
                if (i3 != null) {
                    if (doojVar == dooj.TIMETABLE) {
                        int ordinal3 = i3.ordinal();
                        if (ordinal3 == 0) {
                            vxzVar = vxz.ON_TIME;
                        } else if (ordinal3 == 1) {
                            vxzVar = vxz.CHANGED;
                        }
                        cqtdVar = zuzVar.a(vxzVar);
                    } else if (i3 != donz.CANCELED) {
                        vxzVar = vxz.REALTIME_DATA_AVAILABLE;
                        cqtdVar = zuzVar.a(vxzVar);
                    }
                }
                vxzVar = null;
                cqtdVar = zuzVar.a(vxzVar);
            } else {
                cqtdVar = null;
            }
            this.F = cqtdVar;
            this.v = xkg.g(application, dooaVar);
            this.w = (btvoVar.getDirectionsPageParameters() == null || !btvoVar.getDirectionsPageParameters().l) ? null : wmb.g(doodVar2.g, application.getResources());
            boolean z6 = btvoVar.getTransitPagesParameters().H;
            dsrj<dozz> dsrjVar = (doodVar2.b == 1 ? (dooa) doodVar2.c : dooa.m).j;
            dozz u = z6 ? alca.u(dsrjVar) : alca.x(dsrjVar);
            if (u != null) {
                dozaVar = doza.b(u.e);
                if (dozaVar == null) {
                    dozaVar = doza.INFORMATION;
                }
            } else {
                dozaVar = null;
            }
            this.C = dozaVar;
            this.D = xkg.n(dozaVar);
            if (ddhoVar2 == null || u == null) {
                cjtdVar = null;
            } else {
                cjta b = cjtd.b();
                b.d = ddhoVar2;
                b.g(u.d);
                cjtdVar = b.a();
            }
            this.E = cjtdVar;
            dpjb dpjbVar = dooaVar.k;
            dpjbVar = dpjbVar == null ? dpjb.e : dpjbVar;
            dpyy g = xkn.g(xkn.f(dpjbVar));
            this.J = g;
            this.g = btvoVar.getTransitPagesParameters().i;
            drhn i5 = xazVar.i(str4, dpjbVar);
            drhh b2 = i5 != null ? xazVar.b(i5) : null;
            if (b2 != null) {
                boolean z7 = xaz.h(i5) && xazVar.f();
                this.a = xazVar.c(b2, z7, false, new vtk(this) { // from class: wsh
                    private final wsl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.vtk
                    public final void a(cqtd cqtdVar3) {
                        wsl wslVar2 = this.a;
                        wslVar2.a = cqtdVar3;
                        cqkx.p(wslVar2);
                    }
                });
                this.K = b2.d;
                xmwVar2 = xmwVar;
                cqtdVar2 = xazVar.d(b2, z7, false, null, true);
            } else {
                this.a = null;
                this.K = null;
                xmwVar2 = xmwVar;
                cqtdVar2 = null;
            }
            this.r = xmwVar2;
            dwnv transitPagesParameters = btvoVar.getTransitPagesParameters();
            if (transitPagesParameters.j || transitPagesParameters.g) {
                zvb e = zefVar != null ? zefVar.e() : new zvb();
                Iterable<dpce> p = alcf.p(dooaVar.l);
                String num = Integer.toString(A());
                dpce dpceVar = (dpce) dcft.r(p, null);
                eaol eaolVar5 = this.y;
                eaol eaolVar6 = eaolVar5 == null ? a3 : eaolVar5;
                jhkVar = null;
                wslVar = this;
                wslVar.G = new xmy(application, cqatVar, num, e, dpceVar, str2, dnohVar, eaolVar6, i3, g, xke.a(dooaVar), this.C, p(), q(), new Runnable(this) { // from class: wsi
                    private final wsl a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wsl wslVar2 = this.a;
                        wslVar2.a(wslVar2, null);
                    }
                }, xmwVar, cqtdVar2);
                application2 = application;
            } else {
                this.G = null;
                wslVar = this;
                application2 = application;
                jhkVar = null;
            }
        }
        zbd zbdVar = new zbd(application2);
        zbdVar.b(f());
        jhk h2 = zefVar == null ? jhkVar : zefVar.h();
        if (h2 != null && h2.c.a()) {
            zbdVar.b(h2.c.b());
        }
        zbdVar.c(B());
        zbdVar.e();
        if (doojVar == dooj.LOCAL) {
            zbdVar.c(E());
        } else if (doojVar == dooj.TIMETABLE && (eaolVar = wslVar.x) != null) {
            zbdVar.c(zbc.a(application2, eaolVar));
        }
        zbdVar.toString();
    }

    public static int X(@dzsi String str, @dzsi String str2, @dzsi akqi akqiVar, dooa dooaVar) {
        dgaw dgawVar;
        dgaw dgawVar2 = dooaVar.d;
        if (dgawVar2 == null) {
            dgawVar2 = dgaw.g;
        }
        if ((dgawVar2.a & 1) != 0) {
            dgawVar = dooaVar.d;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = dooaVar.c;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        }
        return Y(str, str2, akqiVar, vxs.a(dgawVar));
    }

    public static int Y(@dzsi String str, @dzsi String str2, @dzsi akqi akqiVar, @dzsi eaol eaolVar) {
        return Arrays.hashCode(new Object[]{str, str2, akqiVar, eaolVar});
    }

    private final boolean au() {
        return this.a != null;
    }

    @Override // defpackage.wpv
    public int A() {
        return Y(f(), this.t, this.p, this.x);
    }

    @Override // defpackage.wpv
    @dzsi
    public String B() {
        return this.u;
    }

    @Override // defpackage.wpv
    @dzsi
    public String C() {
        if (this.l) {
            return b();
        }
        return null;
    }

    @Override // defpackage.wpv
    @dzsi
    public CharSequence D() {
        return this.n;
    }

    @Override // defpackage.wpv
    @dzsi
    public CharSequence E() {
        return this.j;
    }

    @Override // defpackage.wpv
    @dzsi
    public String F() {
        return null;
    }

    @Override // defpackage.wpv
    @dzsi
    public eapg G() {
        return this.z;
    }

    @Override // defpackage.wpv
    @dzsi
    public cqkn<wpv> I() {
        return this;
    }

    @Override // defpackage.wpv
    @dzsi
    public cqtd J() {
        return this.D;
    }

    @Override // defpackage.wpv
    @dzsi
    public cjtd K() {
        return this.E;
    }

    @Override // defpackage.wpv
    @dzsi
    public cqtd L() {
        return this.F;
    }

    @Override // defpackage.wpv
    public cqtv M() {
        return this.m;
    }

    @Override // defpackage.wpv
    @dzsi
    public wpr N() {
        return this.P;
    }

    @Override // defpackage.wpv
    @dzsi
    public xmx O() {
        return this.G;
    }

    @Override // defpackage.wpv
    @dzsi
    public xmw P() {
        return this.r;
    }

    @Override // defpackage.wpv
    public void Q(int i) {
        this.M = i;
    }

    @Override // defpackage.wpv
    @dzsi
    public cqfd R() {
        return this.X;
    }

    @Override // defpackage.wpv
    @dzsi
    public cqkn<wpv> S() {
        wpr wprVar = this.P;
        return null;
    }

    @Override // defpackage.wpv
    @dzsi
    public cjtd U() {
        int i;
        ddho ddhoVar;
        eaol eaolVar;
        cjta b = cjtd.b();
        if (Z(donz.CHANGED).booleanValue()) {
            wsk wskVar = wsk.ALWAYS_RELEVANT;
            dool doolVar = dool.SHORT;
            dbsk.m(aa().booleanValue(), "Departure was expected to have realtime status");
            eaol eaolVar2 = this.y;
            if (eaolVar2 == null || (eaolVar = this.x) == null) {
                i = 1;
            } else if (eaolVar2.w(eaolVar.m(180))) {
                i = 3;
            } else {
                eaol eaolVar3 = this.y;
                eaol eaolVar4 = this.x;
                i = eaolVar3.x(eaolVar4.e(eaolVar4.b.o().g(eaolVar4.a, 60))) ? 2 : 4;
            }
            int i2 = i - 1;
            if (i2 == 1) {
                ddhoVar = dtyc.ed;
            } else if (i2 == 2) {
                ddhoVar = dtyc.ee;
            } else if (i2 != 3) {
                b.d = dtyc.ec;
            } else {
                ddhoVar = dtyc.ef;
            }
            b.d = ddhoVar;
        } else if (Z(donz.CANCELED).booleanValue()) {
            b.d = dtyc.eb;
        } else if (!Z(donz.ON_TIME).booleanValue()) {
            return null;
        } else {
            b.d = dtyc.ef;
        }
        return b.a();
    }

    public int W() {
        return this.M;
    }

    @Override // defpackage.xkd
    public Boolean Z(donz donzVar) {
        return Boolean.valueOf(this.e == donzVar);
    }

    @Override // defpackage.xkd
    public Boolean aa() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.xka
    @dzsi
    public eapr ab() {
        return this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    @Override // defpackage.cqkn
    /* renamed from: ac */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.wpv r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsl.a(wpv, android.view.View):void");
    }

    @Override // defpackage.xkc
    public Boolean ad() {
        eaol eaolVar;
        wsk wskVar = wsk.ALWAYS_RELEVANT;
        donz donzVar = donz.ON_TIME;
        dool doolVar = dool.SHORT;
        int ordinal = this.I.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return true;
            }
            if (ordinal == 2) {
                eapd eapdVar = this.H;
                if (eapdVar != null && (eaolVar = this.y) != null && eapdVar.w(eaolVar)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (ordinal == 3) {
                eaol eaolVar2 = this.y;
                if (eaolVar2 == null) {
                    eaolVar2 = this.x;
                }
                eaow c = eaolVar2 == null ? null : eapj.b(new eaol(this.d.b()), eaolVar2).c();
                if (c == null) {
                    return false;
                }
                if (c.f() <= -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else {
                String valueOf = String.valueOf(this.I);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unexpected relevancy: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }

    @dzsi
    public String ae() {
        return this.S;
    }

    @Override // defpackage.xka
    @dzsi
    public eapq af() {
        cqat cqatVar = this.d;
        eaol eaolVar = this.y;
        eapd eapdVar = null;
        eapd Ti = eaolVar == null ? null : eaolVar.Ti();
        eaol eaolVar2 = this.x;
        if (eaolVar2 != null) {
            eapdVar = eaolVar2.Ti();
        }
        return xkb.c(cqatVar, Ti, eapdVar);
    }

    @Override // defpackage.xkc
    public Boolean ag() {
        eapq af = af();
        boolean z = true;
        if (af == null || (af.h().f() > 0 && !this.L)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public zef ah() {
        return this.k;
    }

    public void ai(@dzsi wpr wprVar) {
        this.P = wprVar;
    }

    public void aj(@dzsi String str) {
        this.S = str;
    }

    public void ak(@dzsi String str) {
        this.U = str;
    }

    public void al(@dzsi dphe dpheVar) {
        this.V = dpheVar;
    }

    public void am(@dzsi doza dozaVar) {
        this.C = dozaVar;
        this.D = xkg.n(dozaVar);
        xmy xmyVar = this.G;
        if (xmyVar != null) {
            xmyVar.a = dozaVar;
        }
    }

    public void an(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    @dzsi
    public doza ao() {
        return this.C;
    }

    public void ap(@dzsi cqfd cqfdVar) {
        this.X = cqfdVar;
    }

    @Override // defpackage.wpv
    @dzsi
    /* renamed from: aq */
    public wqd T() {
        return this.Q;
    }

    public void ar(@dzsi wqd wqdVar) {
        eapr y;
        wqd wqdVar2;
        this.Q = wqdVar;
        if (wqdVar != null) {
            wqdVar.j(this);
            this.Q.b(new Runnable(this) { // from class: wsj
                private final wsl a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.ar(null);
                }
            });
        }
        if (this.Q == null) {
            return;
        }
        if (ab() != null) {
            y = ab();
        } else {
            y = y() != null ? y() : null;
        }
        if (y == null || (wqdVar2 = this.Q) == null) {
            return;
        }
        eapd Ti = y.Ti();
        if (wqdVar2.g.L(Ti)) {
            return;
        }
        wqdVar2.g = Ti;
        wqdVar2.a.a(wqdVar2.b.intValue(), wqdVar2.g, wqdVar2.f, wqdVar2.c);
    }

    @dzsi
    public qco as() {
        return this.Y;
    }

    public void at(@dzsi qco qcoVar) {
        this.Y = qcoVar;
    }

    @Override // defpackage.wpl
    @dzsi
    public String b() {
        return this.o;
    }

    @Override // defpackage.wpl
    @dzsi
    public akqi c() {
        return this.p;
    }

    @Override // defpackage.wpl
    @dzsi
    public String d() {
        return this.v;
    }

    @Override // defpackage.zef
    @dzsi
    public zvb e() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.e();
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsl)) {
            return false;
        }
        wsl wslVar = (wsl) obj;
        return dbsd.a(this.y, wslVar.y) && dbsd.a(this.k, wslVar.k) && dbsd.a(this.t, wslVar.t) && dbsd.a(bvpb.b(this.n).toString(), bvpb.b(wslVar.n).toString()) && dbsd.a(this.v, wslVar.v) && dbsd.a(bvpb.b(this.w).toString(), bvpb.b(wslVar.w).toString()) && dbsd.a(this.N, wslVar.N) && dbsd.a(this.O, wslVar.O);
    }

    @Override // defpackage.zef
    @dzsi
    public String f() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.f();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk g() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.g();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk h() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.h();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.y, this.k, this.t, bvpb.b(this.n).toString(), this.v, bvpb.b(this.w).toString(), this.N, this.O});
    }

    @Override // defpackage.zef
    @dzsi
    public akqi i() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.i();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk j() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.j();
    }

    @Override // defpackage.zef
    @dzsi
    public String k() {
        return this.t;
    }

    @Override // defpackage.zef
    @dzsi
    public zvb l() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.l();
    }

    @Override // defpackage.zef
    @dzsi
    public View.OnClickListener m() {
        return null;
    }

    @Override // defpackage.wpl, defpackage.zef
    @dzsi
    public cjtd n() {
        if (this.N == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = this.N;
        b.i(this.M);
        b.g(this.O);
        return b.a();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk o() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.o();
    }

    @Override // defpackage.zef
    @dzsi
    public jhk p() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.p();
    }

    @Override // defpackage.zef
    @dzsi
    public Integer q() {
        zef zefVar = this.k;
        if (zefVar == null) {
            return null;
        }
        return zefVar.q();
    }

    @Override // defpackage.wpl
    @dzsi
    public CharSequence r() {
        return this.w;
    }

    @Override // defpackage.wpl
    public Boolean s() {
        return this.A;
    }

    @Override // defpackage.wpl
    @dzsi
    public cqtd t() {
        return this.a;
    }

    @Override // defpackage.wpl
    public Boolean u() {
        boolean z = false;
        if (au() && this.g) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.wpl
    public cjtd v() {
        cjta b = cjtd.b();
        b.d = dtyc.eS;
        if (au() && !this.g) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }

    @Override // defpackage.wpl
    @dzsi
    public String w() {
        return this.K;
    }

    @Override // defpackage.wpl
    @dzsi
    public String x() {
        return this.f;
    }

    @Override // defpackage.wpl
    @dzsi
    public eapr y() {
        return this.x;
    }

    @Override // defpackage.wpl
    public Boolean z() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.wpv
    public Boolean H() {
        wpr wprVar = this.P;
        if (wprVar == null || wprVar.b() == null) {
            zef zefVar = this.k;
            boolean z = false;
            if (zefVar != null && zefVar.i() != null && this.p != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        wpp b = this.P.b();
        dbsk.s(b);
        return b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    @Override // defpackage.wpv
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.xas V() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsl.V():xas");
    }
}
