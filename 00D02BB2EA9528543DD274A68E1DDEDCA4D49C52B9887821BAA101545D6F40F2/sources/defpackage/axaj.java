package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axaj  reason: default package */
/* loaded from: classes.dex */
public final class axaj implements awyu {
    private final awyy a;
    private final awyz b;
    private final awza c;
    private final awyx d;
    private final axcg e;
    private final axby f;
    private final btvo g;
    private final axbw h;

    public axaj(awyy awyyVar, awyz awyzVar, awza awzaVar, awyx awyxVar, axcg axcgVar, axby axbyVar, btvo btvoVar, axbw axbwVar) {
        this.a = awyyVar;
        this.b = awyzVar;
        this.c = awzaVar;
        this.d = awyxVar;
        this.e = axcgVar;
        this.f = axbyVar;
        this.g = btvoVar;
        this.h = axbwVar;
    }

    static dmlb e(dmla dmlaVar, long j) {
        dmlaVar.e((int) j);
        dmkx dmkxVar = (dmkx) dmlaVar;
        String str = dmkxVar.e == null ? " currentTimestampSec" : "";
        if (dmkxVar.f == null) {
            str = str.concat(" receivedTimestampSec");
        }
        if (dmkxVar.g == null) {
            str = String.valueOf(str).concat(" personalPlacesLastUpdateTimestampSec");
        }
        if (dmkxVar.h == null) {
            str = String.valueOf(str).concat(" placeAliasesLastUpdateTimestampSec");
        }
        if (dmkxVar.i == null) {
            str = String.valueOf(str).concat(" locationHistoryLastUpdateTimestampSec");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        dmky dmkyVar = new dmky(dmkxVar.a, dmkxVar.b, dmkxVar.c, dmkxVar.d, dmkxVar.e.intValue(), dmkxVar.f.intValue(), dmkxVar.g.longValue(), dmkxVar.h.longValue(), dmkxVar.i.longValue());
        dbsk.m(dmla.f(dmkyVar.a(), dmkyVar.b()), "currentLocation and userLocationAccuracy must either be both null or both non-null");
        dbsk.m(dmla.f(dmkyVar.c(), dmkyVar.d()), "currentViewport and viewportZoom must either be both null or both non-null");
        return dmkyVar;
    }

    private static dmla f(awyv awyvVar) {
        Double d;
        dpuq dpuqVar;
        awyt awytVar = (awyt) awyvVar;
        GmmLocation gmmLocation = awytVar.b;
        dhjx dhjxVar = awytVar.c;
        Float f = null;
        if (dhjxVar != null) {
            dpuqVar = akyx.m(dhjxVar).l();
            dhjz dhjzVar = dhjxVar.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            double d2 = dhjzVar.d;
            dhjz dhjzVar2 = dhjxVar.b;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            double d3 = dhjzVar2.c;
            double d4 = dhjxVar.e;
            dhkd dhkdVar = dhjxVar.d;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            d = Double.valueOf(akqo.n(d2, d3, d4, dhkdVar.c));
        } else {
            d = null;
            dpuqVar = null;
        }
        axev axevVar = awytVar.d;
        dmkx dmkxVar = new dmkx();
        dmkxVar.a = null;
        dmkxVar.b = null;
        dmkxVar.c = null;
        dmkxVar.d = null;
        dmkxVar.a(0);
        dmkxVar.e(0);
        dmkxVar.c(0L);
        dmkxVar.d(0L);
        dmkxVar.b(0L);
        dmkxVar.a = gmmLocation == null ? null : gmmLocation.B().h();
        if (gmmLocation != null) {
            f = Float.valueOf(gmmLocation.getAccuracy());
        }
        dmkxVar.b = f;
        dmkxVar.c = dpuqVar;
        dmkxVar.d = d;
        dmkxVar.a(awytVar.a);
        dmkxVar.c(axevVar.b);
        dmkxVar.d(axevVar.c);
        dmkxVar.b(axevVar.d);
        return dmkxVar;
    }

    @dzsi
    private final axdr g(axds axdsVar, dmla dmlaVar, Set<awvv<?>> set, @dzsi dviq dviqVar, awyw awywVar, boolean z, boolean z2) {
        Iterator<awvv<?>> it;
        boolean z3;
        dssj dssjVar;
        int i;
        Iterator<awvv<?>> it2 = set.iterator();
        axdr axdrVar = null;
        while (it2.hasNext()) {
            awvv<?> next = it2.next();
            awwx a = awwy.a(next);
            awze a2 = awzf.a(next);
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            while (true) {
                if (i2 >= a.a(axdsVar)) {
                    it = it2;
                    z3 = false;
                    break;
                }
                dssj j = a.j(axdsVar, i2);
                axdr axdrVar2 = axdrVar;
                long c = a.c(axdsVar, i2);
                dmlb e = e(dmlaVar, c);
                it = it2;
                if (z) {
                    awyx awyxVar = this.d;
                    a2.getClass();
                    awyxVar.b(e);
                }
                if (z2) {
                    dssjVar = a2.a(j, awywVar, e);
                } else {
                    dqpe h = a.h(j);
                    next.b();
                    dssjVar = true != awywVar.a(h, e) ? null : j;
                }
                boolean h2 = h(next, a.d(axdsVar, i2), dviqVar);
                if (dssjVar == null) {
                    i = i2;
                    axdrVar = axdrVar2;
                    if (h2) {
                    }
                    z5 = true;
                } else if (h2) {
                    axdr bZ = axdrVar2 == null ? axds.ac.bZ() : axdrVar2;
                    dssj dssjVar2 = dssjVar;
                    i = i2;
                    z3 = false;
                    a.k(bZ, dssjVar2, this.f.a(dviqVar, next.O), c);
                    if (z) {
                        axdrVar = bZ;
                        z4 = true;
                        break;
                    }
                    axdrVar = bZ;
                    z4 = true;
                } else {
                    i = i2;
                    axdrVar = axdrVar2;
                    z5 = true;
                }
                i2 = i + 1;
                it2 = it;
            }
            if (axdrVar != null && (axdsVar.a & 4) != 0) {
                String str = axdsVar.d;
                if (axdrVar.c) {
                    axdrVar.bF();
                    axdrVar.c = z3;
                }
                axds axdsVar2 = (axds) axdrVar.b;
                str.getClass();
                axdsVar2.a |= 4;
                axdsVar2.d = str;
            }
            if (z5 && !z4) {
                this.h.b(next);
            }
            it2 = it;
        }
        return axdrVar;
    }

    private final <P extends dssj> boolean h(awvv<P> awvvVar, @dzsi dviq dviqVar, @dzsi dviq dviqVar2) {
        dviq a;
        if (this.g.getPassiveAssistParameters().n() && dviqVar2 != null && dviqVar != null && !dviq.D.equals(dviqVar) && (a = this.f.a(dviqVar2, awvvVar.O)) != null && !a.equals(dviqVar)) {
            drbk drbkVar = awvvVar.O;
            return false;
        }
        return true;
    }

    @Override // defpackage.awyu
    @dzsi
    public final synchronized axds a(@dzsi axds axdsVar, int i, Set<awvv<?>> set) {
        if (axdsVar == null) {
            return null;
        }
        axdr g = g(axdsVar, f(awyv.e(i, null, null, axev.e)), set, null, this.b, false, false);
        if (g == null) {
            return null;
        }
        return g.bK();
    }

    @Override // defpackage.awyu
    public final axds b(@dzsi axds axdsVar, awyv awyvVar, awvx awvxVar, Set<awvv<?>> set) {
        if (axdsVar == null) {
            return axds.ac;
        }
        axdr g = g(axdsVar, f(awyvVar), set, this.e.a(awvxVar, set), this.a, true, false);
        return g == null ? axds.ac : g.bK();
    }

    @Override // defpackage.awyu
    public final synchronized axds c(@dzsi axds axdsVar, awyv awyvVar, awvx awvxVar, Set<awvv<?>> set) {
        if (axdsVar == null) {
            return axds.ac;
        }
        axdr g = g(axdsVar, f(awyvVar), set, this.e.a(awvxVar, set), this.a, false, true);
        return g == null ? axds.ac : g.bK();
    }

    @Override // defpackage.awyu
    public final synchronized Set<awvv<?>> d(@dzsi axds axdsVar, awyv awyvVar, awvx awvxVar, Set<awvv<?>> set) {
        dcen N;
        dviq a = this.e.a(awvxVar, set);
        dmla f = f(awyvVar);
        N = dcep.N();
        for (awvv<?> awvvVar : set) {
            awwx a2 = awwy.a(awvvVar);
            awze a3 = awzf.a(awvvVar);
            if (axdsVar != null && a2.a(axdsVar) != 0) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i < a2.a(axdsVar)) {
                        dmlb e = e(f, a2.c(axdsVar, i));
                        if (!h(awvvVar, a2.d(axdsVar, i), a)) {
                            i2++;
                        }
                        awyx awyxVar = this.d;
                        a3.getClass();
                        awyxVar.b(e);
                        if (a3.b(a2.j(axdsVar, i), this.c, e)) {
                            break;
                        }
                        i++;
                    } else if (i2 == a2.a(axdsVar)) {
                        this.h.b(awvvVar);
                    }
                }
            }
            N.b(awvvVar);
        }
        return N.f();
    }
}
