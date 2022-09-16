package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anms  reason: default package */
/* loaded from: classes2.dex */
public final class anms implements dmki<anms, anmq> {
    public static final dcqe a = dcqe.c("anms");
    private static final AtomicLong o = new AtomicLong(0);
    public final dbsg<dvay> b;
    public final eaou c;
    public final eaou d;
    public final long e;
    public final boolean f;
    public final long g;
    public final long h;
    public final dbsg<Long> i;
    public final dbsg<anmq> j;
    public final List<anmq> k;
    public final dbsg<dqjl> l;
    public final int m;
    public final int n;

    public anms(dbsg<dvay> dbsgVar, eaou eaouVar, eaou eaouVar2, long j, int i, boolean z, long j2, long j3, dbsg<Long> dbsgVar2, dbsg<anmq> dbsgVar3, List<anmq> list, int i2, dbsg<dqjl> dbsgVar4) {
        this.b = dbsgVar;
        this.c = eaouVar;
        this.d = eaouVar2;
        this.e = j;
        this.m = i;
        this.f = z;
        this.g = j2;
        this.h = j3;
        this.i = dbsgVar2;
        this.j = dbsgVar3;
        this.k = list;
        this.n = i2;
        this.l = dbsgVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anms a(dvay dvayVar, eaou eaouVar, eaou eaouVar2) {
        dvak dvakVar;
        dbsg dbsgVar;
        int i;
        int i2;
        dvak dvakVar2;
        dvat dvatVar;
        dbsg dbsgVar2;
        dvat dvatVar2;
        dvat dvatVar3;
        dvat dvatVar4;
        dvat dvatVar5;
        dbsg dbsgVar3 = dbpy.a;
        ArrayList arrayList = new ArrayList();
        dbsg dbsgVar4 = dbpy.a;
        int i3 = dvayVar.b;
        if (i3 != 7) {
            if (i3 == 9) {
                dvakVar = (dvak) dvayVar.c;
            } else {
                dvakVar = dvak.e;
            }
            if ((dvakVar.a & 1) != 0) {
                if (dvayVar.b == 9) {
                    dvakVar2 = (dvak) dvayVar.c;
                } else {
                    dvakVar2 = dvak.e;
                }
                dqjl b = dqjl.b(dvakVar2.b);
                if (b == null) {
                    b = dqjl.UNKNOWN_ACTIVITY_TYPE;
                }
                dbsgVar4 = dbsg.i(b);
            }
            dbsgVar = dbsgVar4;
            i = 2;
            i2 = 1;
        } else {
            if (((dvat) dvayVar.c).b.size() > 0) {
                if (dvayVar.b == 7) {
                    dvatVar5 = (dvat) dvayVar.c;
                } else {
                    dvatVar5 = dvat.g;
                }
                dbsgVar3 = dbsg.i(anmq.a(dvatVar5.b.get(0), 1.0f));
            } else {
                bvoo.h("Stop segment without location.", new Object[0]);
            }
            int i4 = 1;
            while (true) {
                if (dvayVar.b == 7) {
                    dvatVar3 = (dvat) dvayVar.c;
                } else {
                    dvatVar3 = dvat.g;
                }
                if (i4 >= dvatVar3.b.size()) {
                    break;
                }
                if (dvayVar.b == 7) {
                    dvatVar4 = (dvat) dvayVar.c;
                } else {
                    dvatVar4 = dvat.g;
                }
                int i5 = i4 + 1;
                arrayList.add(anmq.a(dvatVar4.b.get(i4), 1.0f / i5));
                i4 = i5;
            }
            int a2 = dqjn.a(dvayVar.n);
            if (a2 == 0) {
                a2 = 3;
            }
            dbsgVar = dbsgVar4;
            i2 = a2;
            i = 1;
        }
        dbsg i6 = dbsg.i(dvayVar);
        long o2 = o();
        boolean z = dvayVar.r;
        dwyn dwynVar = dvayVar.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        long n = n(dwynVar.b);
        dwyn dwynVar2 = dvayVar.g;
        if (dwynVar2 == null) {
            dwynVar2 = dwyn.d;
        }
        long n2 = n(dwynVar2.b);
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        duzt duztVar = dvatVar.c;
        if (duztVar == null) {
            duztVar = duzt.c;
        }
        if ((duztVar.a & 1) != 0) {
            if (dvayVar.b == 7) {
                dvatVar2 = (dvat) dvayVar.c;
            } else {
                dvatVar2 = dvat.g;
            }
            duzt duztVar2 = dvatVar2.c;
            if (duztVar2 == null) {
                duztVar2 = duzt.c;
            }
            dbsgVar2 = dbsg.i(Long.valueOf(duztVar2.b));
        } else {
            dbsgVar2 = dbpy.a;
        }
        return new anms(i6, eaouVar, eaouVar2, o2, i, z, n, n2, dbsgVar2, dbsgVar3, arrayList, i2, dbsgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anmr b(eaou eaouVar, eaou eaouVar2, boolean z) {
        return new anmr(new anms(dbpy.a, eaouVar, eaouVar2, o(), 1, z, -1L, -1L, dbpy.a, dbpy.a, new ArrayList(), 1, dbpy.a));
    }

    public static dwyn h(long j, eaou eaouVar) {
        dwym bZ = dwyn.d.bZ();
        long i = i(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyn dwynVar = (dwyn) bZ.b;
        dwynVar.a |= 1;
        dwynVar.b = i;
        int convert = (int) TimeUnit.MINUTES.convert(eaouVar.b(j), TimeUnit.MILLISECONDS);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyn dwynVar2 = (dwyn) bZ.b;
        dwynVar2.a |= 2;
        dwynVar2.c = convert;
        return bZ.bK();
    }

    public static long i(long j) {
        return TimeUnit.SECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    private static long n(long j) {
        return TimeUnit.MILLISECONDS.convert(j, TimeUnit.SECONDS);
    }

    private static long o() {
        return o.getAndIncrement();
    }

    @Override // defpackage.dmki
    public final long c() {
        return this.g;
    }

    @Override // defpackage.dmki
    public final long d() {
        return this.h;
    }

    @Override // defpackage.dmki
    public final dbsg<anmq> e() {
        return this.j;
    }

    @Override // defpackage.dmki
    public final List<anmq> f() {
        return this.k;
    }

    public final boolean g() {
        return this.n == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anmr j() {
        return new anmr(this);
    }

    @Override // defpackage.dmki
    public final /* bridge */ /* synthetic */ anms k(Iterable<anmq> iterable) {
        ArrayList arrayList = new ArrayList();
        for (anmq anmqVar : iterable) {
            arrayList.add(anmqVar);
        }
        anmr j = j();
        j.e = arrayList;
        return j.a();
    }

    @Override // defpackage.dmki
    public final /* bridge */ /* synthetic */ anms l(anmq anmqVar) {
        anmr j = j();
        j.b(anmqVar);
        return j.a();
    }

    @Override // defpackage.dmki
    public final /* bridge */ /* synthetic */ void m() {
    }
}
