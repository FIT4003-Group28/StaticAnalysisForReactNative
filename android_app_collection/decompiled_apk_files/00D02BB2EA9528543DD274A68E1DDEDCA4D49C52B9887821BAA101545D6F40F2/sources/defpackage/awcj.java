package defpackage;
/* compiled from: PG */
/* renamed from: awcj  reason: default package */
/* loaded from: classes3.dex */
public final class awcj {
    public static final byte[] a;

    static {
        dwaz dwazVar = (dwaz) dwbc.g.bZ();
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar = (dwbc) dwazVar.b;
        dwbcVar.d = 2;
        dwbcVar.a = 2 | dwbcVar.a;
        dvzz bZ = dwaa.g.bZ();
        dvzo bZ2 = dvzu.F.bZ();
        dovb dovbVar = dovb.NO_ROUTES_FOUND;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvzu dvzuVar = (dvzu) bZ2.b;
        dvzuVar.j = dovbVar.i;
        dvzuVar.a |= 32;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwaa dwaaVar = (dwaa) bZ.b;
        dvzu bK = bZ2.bK();
        bK.getClass();
        dwaaVar.b = bK;
        dwaaVar.a |= 1;
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        dwaa bK2 = bZ.bK();
        bK2.getClass();
        dwbcVar2.b = bK2;
        dwbcVar2.a |= 1;
        a = ((dwbc) dwazVar.bK()).bS();
    }

    @dzsi
    public static <T> T a(awci awciVar, long j, dbty<T> dbtyVar) {
        T t;
        anam anamVar = null;
        try {
            awciVar.nativeBeginRoadGraphTileWork(j);
            try {
                t = dbtyVar.a();
                try {
                    awciVar.nativeEndRoadGraphTileWork(j);
                    e = null;
                } catch (anam e) {
                    e = e;
                    t = null;
                }
            } catch (anam e2) {
                try {
                    awciVar.nativeEndRoadGraphTileWork(j);
                    e = null;
                    anamVar = e2;
                    t = null;
                } catch (anam e3) {
                    e = e3;
                    anamVar = e2;
                    t = null;
                }
            } catch (Throwable th) {
                try {
                    awciVar.nativeEndRoadGraphTileWork(j);
                } catch (anam unused) {
                }
                throw th;
            }
            c(anamVar);
            c(e);
            return t;
        } catch (anam e4) {
            c(e4);
            return null;
        }
    }

    public static void b(awci awciVar, long j) {
        try {
            awciVar.nativePerformExpensiveInitialization(j);
        } catch (anam e) {
            c(e);
        }
    }

    private static void c(@dzsi anam anamVar) {
        if (anamVar == null) {
            return;
        }
        if (anamVar.a.equals(drtc.RESOURCE_EXHAUSTED)) {
            bvoo.j(anamVar);
        } else {
            bvoo.f(anamVar);
        }
    }
}
