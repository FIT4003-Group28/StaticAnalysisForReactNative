package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vun  reason: default package */
/* loaded from: classes7.dex */
public final class vun {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public final dwao b;
    public final duqc c;
    @dzsi
    public final dowa d;
    @dzsi
    public final String e;
    @dzsi
    public final dspd f;
    @dzsi
    public final dvzx g;
    @dzsi
    public final dquz h;
    @dzsi
    public final String i;
    @dzsi
    public final dspd j;
    public final boolean k;
    public final dcdc<amvh> l;
    public final dcdc<amvf> m;
    @dzsi
    public final dhjx n;
    @dzsi
    public final dtaq o;
    @dzsi
    public final dnqh p;
    public final boolean q;
    @dzsi
    public final Long r;
    public final boolean s;
    public final boolean t;
    @dzsi
    public final dpaz u;

    public vun(dwao dwaoVar, dcdc<amvh> dcdcVar, dcdc<amvf> dcdcVar2, duqc duqcVar, @dzsi dhjx dhjxVar, @dzsi dtaq dtaqVar, @dzsi dowa dowaVar, @dzsi String str, @dzsi dspd dspdVar, @dzsi dvzx dvzxVar, @dzsi dquz dquzVar, @dzsi String str2, @dzsi dspd dspdVar2, boolean z, @dzsi dnqh dnqhVar, boolean z2, @dzsi Long l, boolean z3, @dzsi dpaz dpazVar) {
        if (!dcdcVar.isEmpty()) {
            amvj.k(dcdcVar.size());
        }
        this.b = dwaoVar;
        this.l = dcdcVar;
        this.m = dcdcVar2;
        this.c = duqcVar;
        this.n = dhjxVar;
        this.o = dtaqVar;
        this.d = dowaVar;
        this.e = str;
        this.f = dspdVar;
        this.g = dvzxVar;
        this.h = dquzVar;
        this.i = str2;
        this.j = dspdVar2;
        this.k = z;
        this.p = dnqhVar;
        this.q = z2;
        this.r = l;
        this.s = z3;
        this.t = false;
        this.u = dpazVar;
    }

    public static vun c(dwaw dwawVar, Context context) {
        vum vumVar = new vum();
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        if ((dvzyVar.a & 4) != 0) {
            dwao dwaoVar = dvzyVar.g;
            if (dwaoVar == null) {
                dwaoVar = dwao.R;
            }
            vumVar.a = dwaoVar;
        }
        for (dpjx dpjxVar : dvzyVar.d) {
            vumVar.b(amvh.M(dpjxVar, context));
        }
        if ((dvzyVar.a & 1) != 0) {
            dhjx dhjxVar = dvzyVar.e;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            vumVar.e = dhjxVar;
        }
        if ((dvzyVar.a & 16) != 0) {
            dowa b = dowa.b(dvzyVar.h);
            if (b == null) {
                b = dowa.REGIONAL;
            }
            vumVar.g = dowa.b(b.e);
        }
        int i = dvzyVar.b;
        int i2 = 13;
        if (i == 13) {
            vumVar.h = (String) dvzyVar.c;
        } else {
            i2 = i;
        }
        if (i2 == 26) {
            vumVar.i = (dspd) dvzyVar.c;
        }
        if (i == 28) {
            dvzx b2 = dvzx.b(((Integer) dvzyVar.c).intValue());
            if (b2 == null) {
                b2 = dvzx.UNKNOWN_TRANSIT_PATTERN;
            }
            vumVar.j = b2;
        }
        if ((dvzyVar.a & 256) != 0) {
            dquz b3 = dquz.b(dvzyVar.j);
            if (b3 == null) {
                b3 = dquz.UNKNOWN_TRANSIT_PATTERN_MATCHING_MODE;
            }
            vumVar.k = b3;
        }
        int i3 = dvzyVar.a;
        if ((i3 & 512) != 0) {
            vumVar.l = dvzyVar.k;
        }
        if ((i3 & 1024) != 0) {
            vumVar.m = dvzyVar.l;
        }
        if ((i3 & 2048) != 0) {
            vumVar.n = dvzyVar.m;
        }
        if ((i3 & 8192) != 0) {
            dnqh dnqhVar = dvzyVar.o;
            if (dnqhVar == null) {
                dnqhVar = dnqh.p;
            }
            vumVar.o = dnqhVar;
        }
        if ((dwawVar.a & 2) != 0) {
            dtaq dtaqVar = dwawVar.e;
            if (dtaqVar == null) {
                dtaqVar = dtaq.m;
            }
            vumVar.f = dtaqVar;
        }
        if ((dvzyVar.a & 262144) != 0) {
            vumVar.p = dvzyVar.s;
        }
        return vumVar.a();
    }

    @dzsi
    public static vun d(dwaw dwawVar, amsy amsyVar, duqc duqcVar, Context context, long j) {
        if (amsyVar == null) {
            return null;
        }
        if (!amsyVar.t()) {
            amsyVar.s();
            return null;
        } else if (amsyVar.i() < 2) {
            amsyVar.i();
            return null;
        } else {
            dccx dccxVar = new dccx();
            for (int i = 0; i < amsyVar.i(); i++) {
                amvh c = amvj.c(amsyVar.c(), amsyVar.h(i), context);
                if (c == null) {
                    return null;
                }
                dccxVar.g(c);
            }
            vum vumVar = new vum(c(dwawVar, context));
            vumVar.c(dccxVar.f());
            vumVar.d = duqcVar;
            vumVar.q = Long.valueOf(j);
            return vumVar.a();
        }
    }

    public static vun e(amte amteVar) {
        vum vumVar = new vum();
        vumVar.c(dcdc.t(amteVar.c));
        vumVar.a = amteVar.i();
        vumVar.q = Long.valueOf(amteVar.g);
        return vumVar.a();
    }

    public final dqvj a() {
        dphq dphqVar = this.b.e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        dqvj c = dqvj.c(dphqVar.b);
        return c == null ? dqvj.MIXED : c;
    }

    public final boolean b(@dzsi dtaq dtaqVar, int i) {
        if (this.o == null && dtaqVar == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2).k()) {
                dtaq dtaqVar2 = this.o;
                if (dtaqVar2 == null || dtaqVar == null) {
                    return true;
                }
                dtak dtakVar = dtaqVar2.e;
                if (dtakVar == null) {
                    dtakVar = dtak.d;
                }
                int i3 = dtakVar.b;
                dtak dtakVar2 = this.o.e;
                if (dtakVar2 == null) {
                    dtakVar2 = dtak.d;
                }
                akqq d = akqq.d(i3, dtakVar2.c);
                dtak dtakVar3 = dtaqVar.e;
                if (dtakVar3 == null) {
                    dtakVar3 = dtak.d;
                }
                int i4 = dtakVar3.b;
                dtak dtakVar4 = dtaqVar.e;
                if (dtakVar4 == null) {
                    dtakVar4 = dtak.d;
                }
                return !akqq.v(d, akqq.d(i4, dtakVar4.c), (double) i);
            }
        }
        return false;
    }

    public final String toString() {
        return "options=" + this.b + "\nwaypoints=" + this.l + "\nviapoints=" + this.m + "\ninputCamera=" + this.n + "\nuserLocation=" + this.o + "\npreferredTransitPattern=" + this.e + "\npreferredTransitPatternToken=" + this.f + "\nunspecifiedTransitPattern=" + this.g + "\ntransitPatternMatchingMode=" + this.h + "\nsavedTripId" + this.i + "\ntransitRouteStartSpecifier=" + this.j + "\nrouteShouldSkipInitialNonTransitLeg=" + this.k + "\nloggingParams=" + this.p + "\nrestrictToIndashIncidents=" + this.q + "\ndisableTraffic=" + this.s + "\nskipAdditionalDirectionsData=false\ndetailLevel=" + this.u + "\n";
    }
}
