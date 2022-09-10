package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqzw  reason: default package */
/* loaded from: classes5.dex */
public final class cqzw {
    private static final dcqe p = dcqe.c("cqzw");
    private int A;
    private boolean B;
    @dzsi
    private final craw C;
    public crap a;
    public double b;
    public amsx c;
    public amsx d;
    @dzsi
    public akrn e;
    public int f;
    public final amub g;
    public final crav h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public final boolean o;
    private final btrm q;
    private final btwd r;
    @dzsi
    private amvw s;
    @dzsi
    private crap t;
    private final List<amut> u;
    private boolean v;
    private double w;
    private boolean x;
    private double y;
    private boolean z;

    private cqzw(amub amubVar, btrm btrmVar, btwd btwdVar, @dzsi GmmLocation gmmLocation, @dzsi craw crawVar) {
        int i;
        double z;
        ArrayList arrayList = new ArrayList();
        this.u = arrayList;
        this.m = false;
        this.g = amubVar;
        this.C = crawVar;
        int u = amubVar.u();
        amuo[] amuoVarArr = amubVar.k;
        for (int i2 = 0; i2 < u && i2 < amuoVarArr.length; i2++) {
            arrayList.addAll(amuoVarArr[i2].D);
        }
        ArrayList arrayList2 = new ArrayList();
        int length = amuoVarArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String str = "";
            if (i3 < length) {
                amuo amuoVar = amuoVarArr[i3];
                amuo[] amuoVarArr2 = amuoVarArr;
                int i6 = amuoVar.E;
                i6 = i6 != -1 ? i6 + i4 : i6;
                crae craeVar = new crae();
                int i7 = length;
                craeVar.a = Integer.valueOf(i5);
                craeVar.b = Integer.valueOf(amuoVar.j);
                craeVar.c = Integer.valueOf(amuoVar.i);
                craeVar.d = Integer.valueOf(amuoVar.k);
                craeVar.e = Integer.valueOf(amuoVar.l);
                craeVar.g = amuoVar.d;
                craeVar.f = Integer.valueOf(amuoVar.m);
                craeVar.h = Integer.valueOf(i6);
                List<amut> list = amuoVar.D;
                ArrayList arrayList3 = new ArrayList();
                Iterator<amut> it = list.iterator();
                int i8 = i4;
                while (it.hasNext()) {
                    Iterator<amut> it2 = it;
                    amut next = it.next();
                    String str2 = str;
                    crag cragVar = new crag();
                    cragVar.a = Integer.valueOf(i5);
                    cragVar.b = Integer.valueOf(i8);
                    cragVar.c = Integer.valueOf(next.d);
                    cragVar.d = Integer.valueOf(next.c);
                    cragVar.e = Integer.valueOf(next.b);
                    doxu doxuVar = next.a;
                    if (doxuVar != null) {
                        cragVar.f = doxuVar;
                        String b = next.b();
                        if (b != null) {
                            cragVar.g = b;
                            cragVar.h = Boolean.valueOf(next.e);
                            String str3 = cragVar.a != null ? str2 : " stepIndex";
                            str3 = cragVar.b == null ? str3.concat(" stepGuidanceIndex") : str3;
                            str3 = cragVar.c == null ? String.valueOf(str3).concat(" minRelevanceDistanceMeters") : str3;
                            str3 = cragVar.d == null ? String.valueOf(str3).concat(" minRelevanceSeconds") : str3;
                            str3 = cragVar.e == null ? String.valueOf(str3).concat(" relevanceRangeEndMeters") : str3;
                            str3 = cragVar.f == null ? String.valueOf(str3).concat(" eventType") : str3;
                            str3 = cragVar.g == null ? String.valueOf(str3).concat(" spokenText") : str3;
                            str3 = cragVar.h == null ? String.valueOf(str3).concat(" isNextStepRelevant") : str3;
                            if (!str3.isEmpty()) {
                                String valueOf = String.valueOf(str3);
                                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                            }
                            arrayList3.add(new crah(cragVar.a.intValue(), cragVar.b.intValue(), cragVar.c.intValue(), cragVar.d.intValue(), cragVar.e.intValue(), cragVar.f, cragVar.g, cragVar.h.booleanValue()));
                            i8++;
                            str = str2;
                            it = it2;
                        } else {
                            throw new NullPointerException("Null spokenText");
                        }
                    } else {
                        throw new NullPointerException("Null eventType");
                    }
                }
                String str4 = str;
                craeVar.i = dcdc.r(arrayList3);
                String str5 = craeVar.a == null ? " stepIndex" : str4;
                str5 = craeVar.b == null ? str5.concat(" pointIndex") : str5;
                str5 = craeVar.c == null ? String.valueOf(str5).concat(" stepNumber") : str5;
                str5 = craeVar.d == null ? String.valueOf(str5).concat(" distanceFromPreviousStepMeters") : str5;
                str5 = craeVar.e == null ? String.valueOf(str5).concat(" distanceFromStartMeters") : str5;
                str5 = craeVar.f == null ? String.valueOf(str5).concat(" secondsFromPreviousStep") : str5;
                str5 = craeVar.g == null ? String.valueOf(str5).concat(" maneuverType") : str5;
                str5 = craeVar.h == null ? String.valueOf(str5).concat(" firstPrepareStepGuidanceIndex") : str5;
                str5 = craeVar.i == null ? String.valueOf(str5).concat(" stepGuidances") : str5;
                if (!str5.isEmpty()) {
                    String valueOf2 = String.valueOf(str5);
                    throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
                }
                arrayList2.add(new craf(craeVar.a.intValue(), craeVar.b.intValue(), craeVar.c.intValue(), craeVar.d.intValue(), craeVar.e.intValue(), craeVar.f.intValue(), craeVar.g, craeVar.h.intValue(), craeVar.i));
                i5++;
                i4 += amuoVar.D.size();
                i3++;
                amuoVarArr = amuoVarArr2;
                length = i7;
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (int i9 = 0; i9 < u && i9 < arrayList2.size(); i9++) {
                    arrayList4.addAll(((crar) arrayList2.get(i9)).i());
                }
                crai craiVar = new crai();
                craiVar.a = Long.valueOf(amubVar.W);
                dqvj dqvjVar = amubVar.h;
                if (dqvjVar != null) {
                    craiVar.b = dqvjVar;
                    akrk w = amubVar.w();
                    douc bZ = doud.c.bZ();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (i10 < w.l()) {
                        akra m = w.m(i10);
                        int j = m.j();
                        int n = m.n();
                        bZ.a(j - i11);
                        bZ.b(n - i12);
                        i10++;
                        i12 = n;
                        i11 = j;
                    }
                    doud bK = bZ.bK();
                    if (bK != null) {
                        craiVar.c = bK;
                        craiVar.d = Integer.valueOf(amubVar.n);
                        craiVar.e = dcdc.r(arrayList2);
                        craiVar.f = dcdc.r(arrayList4);
                        craiVar.g = Boolean.valueOf(amubVar.an());
                        craiVar.h = Boolean.valueOf(amubVar.i == null);
                        craiVar.i = Boolean.valueOf(amubVar.j);
                        craiVar.j = Integer.valueOf(amubVar.G());
                        String str6 = amubVar.p;
                        if (str6 != null) {
                            craiVar.k = str6;
                            akqq akqqVar = amubVar.j().e;
                            dbsk.s(akqqVar);
                            craiVar.l = p(akqqVar);
                            akqq akqqVar2 = amubVar.l().e;
                            if (akqqVar2 != null) {
                                craiVar.m = p(akqqVar2);
                            }
                            String str7 = craiVar.a == null ? " id" : str;
                            str7 = craiVar.b == null ? str7.concat(" travelMode") : str7;
                            str7 = craiVar.c == null ? String.valueOf(str7).concat(" compactPolyline") : str7;
                            str7 = craiVar.d == null ? String.valueOf(str7).concat(" simplificationWorldUnits") : str7;
                            str7 = craiVar.e == null ? String.valueOf(str7).concat(" steps") : str7;
                            str7 = craiVar.f == null ? String.valueOf(str7).concat(" stepGuidances") : str7;
                            str7 = craiVar.g == null ? String.valueOf(str7).concat(" isRoadVehicleRoute") : str7;
                            str7 = craiVar.h == null ? String.valueOf(str7).concat(" isInitialRequest") : str7;
                            str7 = craiVar.i == null ? String.valueOf(str7).concat(" hasUncertainFromPoint") : str7;
                            str7 = craiVar.j == null ? String.valueOf(str7).concat(" distanceToNextDestinationMeters") : str7;
                            str7 = craiVar.k == null ? String.valueOf(str7).concat(" tripSummary") : str7;
                            str7 = craiVar.l == null ? String.valueOf(str7).concat(" firstWaypoint") : str7;
                            if (!str7.isEmpty()) {
                                String valueOf3 = String.valueOf(str7);
                                throw new IllegalStateException(valueOf3.length() != 0 ? "Missing required properties:".concat(valueOf3) : new String("Missing required properties:"));
                            }
                            craj crajVar = new craj(craiVar.a.longValue(), craiVar.b, craiVar.c, craiVar.d.intValue(), craiVar.e, craiVar.f, craiVar.g.booleanValue(), craiVar.h.booleanValue(), craiVar.i.booleanValue(), craiVar.j.intValue(), craiVar.k, craiVar.l, craiVar.m);
                            this.h = crajVar;
                            this.q = btrmVar;
                            this.r = btwdVar;
                            this.t = gmmLocation != null ? c(gmmLocation, crajVar.a) : null;
                            this.b = dcyn.a;
                            this.n = -1;
                            this.c = amubVar.B;
                            this.d = amubVar.F();
                            this.i = 0;
                            this.j = 0;
                            this.o = btwdVar.a.bm;
                            cral cralVar = crajVar.j;
                            if (cralVar == null) {
                                z = Double.MAX_VALUE;
                                i = 0;
                            } else {
                                i = 0;
                                z = akra.e(cralVar.a(), cralVar.b()).z(amubVar.l.m(0));
                            }
                            this.w = z;
                            if (!crajVar.d.isEmpty()) {
                                return;
                            }
                            bvoo.h("Attempt to navigate a route without step guidances", new Object[i]);
                            return;
                        }
                        throw new NullPointerException("Null tripSummary");
                    }
                    throw new NullPointerException("Null compactPolyline");
                }
                throw new NullPointerException("Null travelMode");
            }
        }
    }

    public static cqzw a(amub amubVar, btrm btrmVar, btwd btwdVar, @dzsi GmmLocation gmmLocation, @dzsi craw crawVar) {
        return new cqzw(amubVar, btrmVar, btwdVar, gmmLocation, crawVar);
    }

    private static cral p(akqq akqqVar) {
        return cral.c(akqqVar.a, akqqVar.b);
    }

    private static boolean q(crap crapVar, crap crapVar2) {
        dcdc<Integer> dcdcVar = ((crad) crapVar).o;
        dcdc<Integer> dcdcVar2 = ((crad) crapVar2).o;
        if (dcdcVar.isEmpty()) {
            return false;
        }
        int intValue = dcdcVar.get(0).intValue();
        for (int i = 0; i < dcdcVar2.size(); i++) {
            if (intValue == dcdcVar2.get(i).intValue()) {
                return true;
            }
        }
        return false;
    }

    private static int r(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 100 : 10;
        }
        return 30;
    }

    private final void s(@dzsi amvw amvwVar) {
        int c;
        int i;
        if (amvwVar != null) {
            if (!amvwVar.a(((craj) this.h).a)) {
                long j = ((craj) this.h).a;
                i = this.i;
            } else {
                dcdc<crar> dcdcVar = ((craj) this.h).c;
                int i2 = 0;
                while (i2 < dcdcVar.size() - 1) {
                    crar crarVar = dcdcVar.get(i2);
                    double f = amvwVar.f(((craj) this.h).a, v(crarVar.a()));
                    long j2 = ((craj) this.h).a;
                    crarVar.b();
                    if (f < 0.98d) {
                        break;
                    }
                    i2++;
                }
                int size = dcdcVar.size() - 1;
                while (size > 0) {
                    crar crarVar2 = dcdcVar.get(size);
                    double d = amvwVar.d(((craj) this.h).a, Double.NEGATIVE_INFINITY, crarVar2.a() == 0 ? dcyn.a : v(crarVar2.a() - 1));
                    long j3 = ((craj) this.h).a;
                    crarVar2.b();
                    if (d < 0.98d) {
                        break;
                    }
                    size--;
                }
                int i3 = this.i;
                i = (i3 != -1 && (c = dcdcVar.get(i3).c()) >= i2) ? c > size ? size : this.i : i2;
            }
            this.i = i;
        }
        int i4 = this.i;
        int i5 = this.j;
        if (i4 != i5) {
            if (i5 != -1 && i4 == i5 + 1) {
                return;
            }
            g();
        }
    }

    private static double t(float f) {
        return Math.max(50.0d, f + f);
    }

    private final int u(int i, int i2) {
        dcdc<crar> dcdcVar = ((craj) this.h).c;
        if (i2 > 0 && i < dcdcVar.size() - 1) {
            dcdc<crat> i3 = dcdcVar.get(i).i();
            int size = i3.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (i3.get(i4).h()) {
                    int i5 = i + 1;
                    dcdc<crat> i6 = dcdcVar.get(i5).i();
                    int size2 = i6.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        int i8 = i7 + 1;
                        if (i6.get(i7).f() == doxu.ACT) {
                            return u(i5, i2 - 1);
                        }
                        i7 = i8;
                    }
                    continue;
                }
            }
        }
        return i;
    }

    private final double v(int i) {
        dcdc<crar> dcdcVar = ((craj) this.h).c;
        crar crarVar = dcdcVar.get(i);
        int b = crarVar.b();
        double d = 20.0d;
        double d2 = dcyn.a;
        if (b == 0) {
            dcdc<crar> dcdcVar2 = ((craj) this.h).c;
            if (crarVar.a() < dcdcVar2.size() - 1) {
                crar crarVar2 = dcdcVar2.get(crarVar.a() + 1);
                craj crajVar = (craj) this.h;
                if (crajVar.f || !this.x || !crajVar.e) {
                    double d3 = crarVar2.d();
                    Double.isNaN(d3);
                    d2 = Math.min(20.0d, d3 / 2.0d);
                }
            }
        }
        if (((craj) this.h).b == dqvj.TRANSIT && crarVar.a() < dcdcVar.size() - 1) {
            crar crarVar3 = dcdcVar.get(crarVar.a() + 1);
            if (crarVar.g() != dgau.DEPART) {
                if (crarVar3.g() == dgau.DEPART) {
                    d = -20.0d;
                }
            }
            return this.g.K(crarVar.b()) + d;
        }
        d = d2;
        return this.g.K(crarVar.b()) + d;
    }

    private final double w(crat cratVar, double d) {
        double x = x(cratVar);
        int c = cratVar.c();
        double d2 = cratVar.d();
        Double.isNaN(d2);
        return x - Math.max(d * d2, c);
    }

    private final double x(crat cratVar) {
        double v = v(cratVar.a());
        double e = cratVar.e();
        Double.isNaN(e);
        return v + e;
    }

    public final void b() {
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x026f, code lost:
        if ((r2 - defpackage.crak.a(r11.a, r9)) <= 50.0d) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.android.apps.gmm.map.model.location.GmmLocation r25) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqzw.d(com.google.android.apps.gmm.map.model.location.GmmLocation):void");
    }

    public final void e() {
        dpeq dpeqVar;
        this.y = dcyn.a;
        if (!this.g.Z() || !this.z || (dpeqVar = this.g.s) == null || dpeqVar.e.size() <= 0) {
            return;
        }
        double d = this.b;
        for (dozz dozzVar : dpeqVar.e) {
            if (dozzVar.b == 22) {
                dozs dozsVar = (dozs) dozzVar.c;
                int i = dozsVar.a;
                if ((i & 256) != 0 && (i & 4) != 0 && (i & 64) != 0) {
                    dozl dozlVar = dozsVar.j;
                    if (dozlVar == null) {
                        dozlVar = dozl.e;
                    }
                    int i2 = dozlVar.b;
                    double d2 = i2;
                    Double.isNaN(d2);
                    if (d >= d2 - 400.0d) {
                        double d3 = i2 + dozlVar.c;
                        if (d < d3) {
                            double d4 = this.b;
                            Double.isNaN(d3);
                            this.y = d3 - d4;
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void g() {
        int i = this.f;
        this.f = 0;
        if (i != 0) {
            this.v = false;
        }
    }

    public final double h(int i, double d, double d2) {
        if (i == 0) {
            return dcyn.a;
        }
        if (this.z && i >= 0 && i < ((craj) this.h).d.size()) {
            double w = w(((craj) this.h).d.get(i), d2) - d;
            if (w <= dcyn.a) {
                return dcyn.a;
            }
            if (d2 > dcyn.a) {
                return w / d2;
            }
        }
        return Double.MAX_VALUE;
    }

    public final double i() {
        double d = ((craj) this.h).h;
        double d2 = this.b;
        Double.isNaN(d);
        return d - d2;
    }

    public final double j() {
        return this.c.d();
    }

    public final double k() {
        return this.d.d();
    }

    public final boolean l(cram cramVar, double d, double d2) {
        boolean z;
        boolean z2;
        int i;
        crap crapVar = this.a;
        if (crapVar == null) {
            return false;
        }
        akrn akrnVar = this.e;
        crad cradVar = (crad) crapVar;
        if (!cradVar.l) {
            return akrnVar != null && akrnVar.a() <= d2;
        }
        double d3 = cradVar.m;
        if (akrnVar != null) {
            z = this.r.a.bj && cradVar.c && crak.a(cradVar.a, cral.c(akrnVar.a.S().a, akrnVar.a.S().b)) < d2;
            double a = akrnVar.a();
            amub amubVar = this.g;
            akra akraVar = akrnVar.a;
            double d4 = amubVar.n;
            double r = akraVar.r();
            Double.isNaN(d4);
            z2 = a <= (d4 / r) + 2.0d;
            if (z2 && !z && d3 < d && !((crad) this.a).n && (i = akrnVar.d) > 0 && i < this.g.l.l() - 1) {
                crad cradVar2 = (crad) this.a;
                double d5 = cradVar2.m;
                crak.a(cradVar2.a, cral.c(akrnVar.a.k(), akrnVar.a.o()));
                ((craa) cramVar).a = new crlw();
            }
        } else {
            z = false;
            z2 = false;
        }
        return d3 >= d || (z2 && !z);
    }

    public final boolean m() {
        return this.A == 0;
    }

    public final cray n() {
        double d = this.b;
        crax craxVar = new crax();
        craxVar.a = this.g;
        craxVar.l = this.z;
        craxVar.m = this.k;
        craxVar.k = (int) this.y;
        int i = this.i;
        int i2 = -1;
        if (i != -1) {
            crar crarVar = ((craj) this.h).c.get(i);
            int b = crarVar.b();
            int c = crarVar.c();
            craxVar.b = this.g.o(this.i);
            craxVar.c = this.f > crarVar.h();
            int round = (int) Math.round(this.g.K(b) - d);
            craxVar.e = round;
            double ab = this.g.ab(d);
            amub amubVar = this.g;
            double d2 = round;
            Double.isNaN(d2);
            craxVar.g = (int) Math.round(ab - amubVar.ab(d + d2));
            amuo r = this.g.r();
            if (r != null) {
                i2 = r.i;
            }
            int i3 = round;
            for (int i4 = c + 1; i4 < this.g.h(); i4++) {
                round += this.g.o(i4).k;
                if (i4 == i2) {
                    i3 = round;
                }
            }
            craxVar.h = round;
            craxVar.f = i3;
            craxVar.i = this.c;
            craxVar.j = this.d;
        }
        akrn akrnVar = this.e;
        if (akrnVar != null) {
            craxVar.d = akrnVar.d;
        }
        amvw amvwVar = this.s;
        if (amvwVar != null) {
            craxVar.n = amvwVar;
        }
        return craxVar.a();
    }

    public final void o(cran cranVar) {
        if (cranVar.a() != null) {
            this.q.b(cranVar.a());
        }
        if (cranVar.b() != null) {
            this.q.b(cranVar.b());
        }
        if (cranVar.c() != null) {
            this.q.b(cranVar.c());
        }
    }

    static crap c(GmmLocation gmmLocation, long j) {
        float bearing;
        float speed;
        akra u = gmmLocation.u();
        if (!gmmLocation.e() || gmmLocation.t() == null || u == null) {
            bearing = gmmLocation.getBearing();
            speed = gmmLocation.getSpeed();
        } else {
            bearing = gmmLocation.v();
            speed = gmmLocation.w();
        }
        cral c = cral.c(gmmLocation.B().a, gmmLocation.B().b);
        amvu amvuVar = gmmLocation.l;
        dzke dzkeVar = amvuVar == null ? null : amvuVar.y;
        ArrayList arrayList = new ArrayList();
        if (dzkeVar != null) {
            arrayList.addAll(dzkeVar);
        }
        crac cracVar = new crac();
        cracVar.a = c;
        cracVar.b = Boolean.valueOf(gmmLocation.i());
        cracVar.c = Boolean.valueOf(gmmLocation.e());
        cracVar.d = Boolean.valueOf(gmmLocation.hasAccuracy());
        cracVar.e = Float.valueOf(gmmLocation.getAccuracy());
        cracVar.f = Boolean.valueOf(gmmLocation.hasBearing());
        cracVar.g = Float.valueOf(bearing);
        cracVar.h = Boolean.valueOf(gmmLocation.hasSpeed());
        cracVar.i = Float.valueOf(speed);
        cracVar.j = Boolean.valueOf(gmmLocation.G(j));
        cracVar.k = Double.valueOf(gmmLocation.H(j));
        cracVar.l = Boolean.valueOf(gmmLocation.y(j));
        cracVar.m = Double.valueOf(gmmLocation.z(j));
        cracVar.n = Boolean.valueOf(gmmLocation.l());
        cracVar.o = dcdc.r(arrayList);
        String provider = gmmLocation.getProvider();
        if (provider != null) {
            cracVar.p = provider;
            String str = cracVar.a == null ? " latLng" : "";
            if (cracVar.b == null) {
                str = str.concat(" isGpsAccurate");
            }
            if (cracVar.c == null) {
                str = String.valueOf(str).concat(" onRoad");
            }
            if (cracVar.d == null) {
                str = String.valueOf(str).concat(" hasAccuracy");
            }
            if (cracVar.e == null) {
                str = String.valueOf(str).concat(" accuracy");
            }
            if (cracVar.f == null) {
                str = String.valueOf(str).concat(" hasBearing");
            }
            if (cracVar.g == null) {
                str = String.valueOf(str).concat(" bearing");
            }
            if (cracVar.h == null) {
                str = String.valueOf(str).concat(" hasSpeed");
            }
            if (cracVar.i == null) {
                str = String.valueOf(str).concat(" speed");
            }
            if (cracVar.j == null) {
                str = String.valueOf(str).concat(" hasModalDistanceAlongRouteMeters");
            }
            if (cracVar.k == null) {
                str = String.valueOf(str).concat(" modalDistanceAlongRouteMeters");
            }
            if (cracVar.l == null) {
                str = String.valueOf(str).concat(" hasOnRouteConfidence");
            }
            if (cracVar.m == null) {
                str = String.valueOf(str).concat(" onRouteConfidence");
            }
            if (cracVar.n == null) {
                str = String.valueOf(str).concat(" inStartupConfusion");
            }
            if (cracVar.o == null) {
                str = String.valueOf(str).concat(" connectedNonBranchingSegmentIds");
            }
            if (cracVar.p == null) {
                str = String.valueOf(str).concat(" provider");
            }
            if (str.isEmpty()) {
                return new crad(cracVar.a, cracVar.b.booleanValue(), cracVar.c.booleanValue(), cracVar.d.booleanValue(), cracVar.e.floatValue(), cracVar.f.booleanValue(), cracVar.g.floatValue(), cracVar.h.booleanValue(), cracVar.i.floatValue(), cracVar.j.booleanValue(), cracVar.k.doubleValue(), cracVar.l.booleanValue(), cracVar.m.doubleValue(), cracVar.n.booleanValue(), cracVar.o, cracVar.p);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null provider");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        ((defpackage.craj) r27.h).d.size();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.cram r28, @defpackage.dzsi defpackage.crap r29, double r30, @defpackage.dzsi defpackage.amvw r32, double r33) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqzw.f(cram, crap, double, amvw, double):void");
    }
}
