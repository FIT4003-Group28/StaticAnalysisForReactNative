package defpackage;

import com.google.android.apps.gmm.location.mapinfo.GpsStatusEvent;
import com.google.android.apps.gmm.location.mapinfo.NetworkLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahpe  reason: default package */
/* loaded from: classes2.dex */
public final class ahpe implements ahkb {
    public static final /* synthetic */ int q = 0;
    private static final long r = TimeUnit.SECONDS.toMillis(30);
    private static final long s = TimeUnit.MINUTES.toMillis(2);
    private static final long t = TimeUnit.MINUTES.toMillis(1);
    private static final long u = TimeUnit.SECONDS.toMillis(10);
    private static final long v = TimeUnit.SECONDS.toMillis(30);
    private final btrm A;
    @dzsi
    private final ahjw B;
    private final List<GmmLocation> C;
    private final List<GmmLocation> D;
    private boolean E;
    private boolean F;
    private boolean G;
    private final int H;
    private boolean I;
    private long J;
    @dzsi
    private Long K;
    public final cqat a;
    public final ahoz b;
    public final List<GmmLocation> c;
    public final List<GmmLocation> d;
    public final List<GmmLocation> e;
    public final List<GmmLocation> f;
    boolean g;
    boolean h;
    @dzsi
    GmmLocation i;
    @dzsi
    GmmLocation j;
    @dzsi
    Collection<altt> k;
    @dzsi
    altt l;
    final List<dbsi<altt, Long>> m;
    public float n;
    public float o;
    final List<dbsi<ardn, Long>> p;
    private final ahpd w;
    private final ahpb x;
    private final ahpc y;
    private final ahpa z;

    public ahpe(btvo btvoVar, btrm btrmVar, ckcw ckcwVar, @dzsi ahjw ahjwVar, cqat cqatVar) {
        ahpd ahpdVar = new ahpd(this);
        this.w = ahpdVar;
        ahpb ahpbVar = new ahpb(this);
        this.x = ahpbVar;
        ahpc ahpcVar = new ahpc(this);
        this.y = ahpcVar;
        ahpa ahpaVar = new ahpa(this);
        this.z = ahpaVar;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = false;
        this.F = false;
        this.G = false;
        this.I = false;
        this.g = false;
        this.h = false;
        this.J = 0L;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = new ArrayList();
        this.K = null;
        this.n = 25.0f;
        this.o = -1.0f;
        this.p = new ArrayList();
        this.A = btrmVar;
        this.B = ahjwVar;
        this.a = cqatVar;
        duwx duwxVar = btvoVar.getLocationParameters().f;
        duwxVar = duwxVar == null ? duwx.i : duwxVar;
        this.E = duwxVar.a;
        this.F = duwxVar.c;
        this.G = duwxVar.f;
        duwx duwxVar2 = btvoVar.getLocationParameters().f;
        this.H = (duwxVar2 == null ? duwx.i : duwxVar2).g;
        this.I = duwxVar.d;
        float f = duwxVar.b;
        if (f != 0.0f) {
            this.n = f;
        }
        dceq a = dcet.a();
        a.b(alsr.class, new ahpj(alsr.class, ahpdVar, bvrj.LOCATION_DISPATCHER));
        btrmVar.g(ahpdVar, a.a());
        dceq a2 = dcet.a();
        a2.b(GpsStatusEvent.class, new ahph(GpsStatusEvent.class, ahpbVar, bvrj.LOCATION_DISPATCHER));
        btrmVar.g(ahpbVar, a2.a());
        dceq a3 = dcet.a();
        a3.b(NetworkLocationEvent.class, new ahpi(NetworkLocationEvent.class, ahpcVar, bvrj.LOCATION_DISPATCHER));
        btrmVar.g(ahpcVar, a3.a());
        dceq a4 = dcet.a();
        a4.b(gdx.class, new ahpg(0, gdx.class, ahpaVar, bvrj.LOCATION_DISPATCHER));
        a4.b(ardm.class, new ahpg(1, ardm.class, ahpaVar, bvrj.LOCATION_DISPATCHER));
        btrmVar.g(ahpaVar, a4.a());
        this.b = new ahoz(ckcwVar);
    }

    @dzsi
    private static altt d(GmmLocation gmmLocation, @dzsi Collection<altt> collection) {
        if (collection == null) {
            return null;
        }
        for (altt alttVar : collection) {
            if (e(gmmLocation, alttVar)) {
                return alttVar;
            }
        }
        return null;
    }

    private static boolean e(GmmLocation gmmLocation, altt alttVar) {
        return alttVar.b.j(akra.e(gmmLocation.getLatitude(), gmmLocation.getLongitude()));
    }

    private final void f() {
        this.i = null;
        this.l = null;
        this.K = null;
        this.m.clear();
    }

    private final void g(GmmLocation gmmLocation, GmmLocation gmmLocation2) {
        this.e.add(gmmLocation);
        this.f.add(gmmLocation2);
    }

    private final void h(GmmLocation gmmLocation, GmmLocation gmmLocation2) {
        this.C.add(gmmLocation);
        this.D.add(gmmLocation2);
    }

    private final void i() {
        this.C.clear();
        this.D.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
        if ((r7 / r5) < 0.7d) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if ((r2 - r19.J) < defpackage.ahpe.v) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    @Override // defpackage.ahkb
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.gmm.map.model.location.GmmLocation a(@defpackage.dzsi com.google.android.apps.gmm.map.model.location.GmmLocation r20) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpe.a(com.google.android.apps.gmm.map.model.location.GmmLocation):com.google.android.apps.gmm.map.model.location.GmmLocation");
    }

    final GmmLocation b(GmmLocation gmmLocation) {
        HashMap hashMap;
        HashMap hashMap2;
        altt alttVar = this.l;
        if (alttVar == null) {
            return gmmLocation;
        }
        GmmLocation gmmLocation2 = this.i;
        GmmLocation gmmLocation3 = this.j;
        if (gmmLocation3 != null && e(gmmLocation3, alttVar)) {
            gmmLocation2 = this.j;
        }
        if (gmmLocation2 == null) {
            return gmmLocation;
        }
        akra C = gmmLocation.C();
        akra C2 = gmmLocation2.C();
        int i = 0;
        int i2 = 1;
        if (this.F) {
            altt alttVar2 = this.l;
            if (alttVar2 != null) {
                akqd akqdVar = alttVar2.b;
                if (akqdVar.j(C2)) {
                    while (true) {
                        i++;
                        C = akra.e((C2.k() + C.k()) / 2.0d, (C2.o() + C.o()) / 2.0d);
                        if (i != 20) {
                            if (akqdVar.j(C)) {
                                C2 = C;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        } else {
            altt alttVar3 = this.l;
            if (alttVar3 != null && alttVar3.b.j(C2)) {
                akqd akqdVar2 = alttVar3.b;
                if (!(akqdVar2 instanceof akqe)) {
                    akrp akrpVar = (akrp) akqdVar2;
                    hashMap = new HashMap();
                    while (i < 4) {
                        int i3 = i + 1;
                        hashMap.put(new ahpf(akrpVar.x(i), akrpVar.x(i3 & 3)), 1);
                        i = i3;
                    }
                } else {
                    hashMap = new HashMap();
                    Iterator<akqd> it = ((akqe) akqdVar2).a.iterator();
                    while (it.hasNext()) {
                        akrq akrqVar = (akrq) it.next();
                        int w = akrqVar.w();
                        int i4 = 0;
                        while (i4 < w) {
                            int i5 = i4 + 1;
                            ahpf ahpfVar = new ahpf(akrqVar.x(i4), akrqVar.x(i5 % w));
                            Integer num = (Integer) hashMap.get(ahpfVar);
                            if (num == null) {
                                hashMap.put(ahpfVar, 1);
                            } else {
                                hashMap.put(ahpfVar, Integer.valueOf(num.intValue() + 1));
                            }
                            i4 = i5;
                        }
                    }
                }
                akra s2 = akra.s(C2);
                akra s3 = akra.s(s2);
                double d = Double.MAX_VALUE;
                for (ahpf ahpfVar2 : hashMap.keySet()) {
                    if (((Integer) hashMap.get(ahpfVar2)).intValue() <= i2) {
                        if (akrb.c(ahpfVar2.a, ahpfVar2.b, C2, C)) {
                            akrb.i(ahpfVar2.a, ahpfVar2.b, C2, C, s2);
                            int i6 = C.a;
                            int i7 = C.b;
                            double d2 = i6;
                            hashMap2 = hashMap;
                            double d3 = s2.a;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            double d4 = d2 - d3;
                            double d5 = i7;
                            double d6 = s2.b;
                            Double.isNaN(d5);
                            Double.isNaN(d6);
                            double hypot = Math.hypot(d4, d5 - d6);
                            if (hypot < d) {
                                s3 = s2;
                                d = hypot;
                            }
                        } else {
                            hashMap2 = hashMap;
                        }
                        hashMap = hashMap2;
                        i2 = 1;
                    }
                }
                C2 = s3;
            }
        }
        amvs amvsVar = new amvs();
        amvsVar.j(gmmLocation);
        amvsVar.v(C2.k(), C2.o());
        return amvsVar.d();
    }

    public final void c() {
        this.e.clear();
        this.f.clear();
    }
}
