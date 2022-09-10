package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anlm  reason: default package */
/* loaded from: classes2.dex */
public final class anlm {
    public static final dcqe a = dcqe.c("anlm");

    public static dbsg<dcdc<anlp>> a(dbsg<anlp> dbsgVar) {
        return !dbsgVar.a() ? dbpy.a : dbsg.i(dcdc.f(dbsgVar.b()));
    }

    public static boolean b(dbsg<anll> dbsgVar, dbsg<anll> dbsgVar2, dbsg<dvyw> dbsgVar3) {
        return dbsgVar3.a() && (dbsgVar3.b().a & 4) != 0 && dbsgVar.a() && dbsgVar2.a();
    }

    public static dbsg<dniu> c(dnsc dnscVar) {
        return dnscVar.b == 1 ? dbsg.i((dniu) dnscVar.c) : dbpy.a;
    }

    public static anlp d(dpop dpopVar, dbsg<dniu> dbsgVar, dvyw dvywVar, eaou eaouVar, eaou eaouVar2, boolean z, dbsg<dvay> dbsgVar2) {
        boolean z2;
        int a2;
        long j = dpopVar.b;
        long j2 = dpopVar.c;
        long f = f();
        if (dbsgVar.a()) {
            dniu b = dbsgVar.b();
            if ((b.a & 128) == 0 || (a2 = dnir.a(b.h)) == 0 || a2 != 2) {
                z2 = false;
                return new anmu(dbsgVar2, dvywVar, j, j2, eaouVar, eaouVar2, f, z2, z);
            }
        }
        z2 = true;
        return new anmu(dbsgVar2, dvywVar, j, j2, eaouVar, eaouVar2, f, z2, z);
    }

    public static anlp e(long j, long j2, eaou eaouVar, eaou eaouVar2, boolean z) {
        return new anli(j, j2, eaouVar, eaouVar2, z, f());
    }

    public static long f() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static dbsg<eaou> g(dvay dvayVar, boolean z) {
        int i;
        if (z) {
            dwyn dwynVar = dvayVar.f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            if ((dwynVar.a & 2) == 0) {
                return dbpy.a;
            }
            dwyn dwynVar2 = dvayVar.f;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            i = dwynVar2.c;
        } else {
            dwyn dwynVar3 = dvayVar.g;
            if (dwynVar3 == null) {
                dwynVar3 = dwyn.d;
            }
            if ((dwynVar3.a & 2) == 0) {
                return dbpy.a;
            }
            dwyn dwynVar4 = dvayVar.g;
            if (dwynVar4 == null) {
                dwynVar4 = dwyn.d;
            }
            i = dwynVar4.c;
        }
        return dbsg.i(eaou.k((int) TimeUnit.MINUTES.toMillis(i)));
    }
}
