package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: udv  reason: default package */
/* loaded from: classes7.dex */
public final class udv implements udw {
    static final long a = TimeUnit.MINUTES.toMillis(20);
    public final cqat b;
    public final xlu c;
    public final tgo d;
    public final Executor e;
    @dzsi
    public udt f;
    public long g = 0;
    public long h = 0;
    public boolean i = false;
    @dzsi
    public cryz<Boolean> j;
    private final Activity k;
    private final btvo l;
    private final cpv m;
    @dzsi
    private udu n;
    private long o;

    public udv(Activity activity, cqat cqatVar, btvo btvoVar, Executor executor, xlu xluVar, cpv cpvVar, tgo tgoVar) {
        this.k = activity;
        this.b = cqatVar;
        this.l = btvoVar;
        this.c = xluVar;
        this.d = tgoVar;
        this.m = cpvVar;
        this.o = i(xluVar, btvoVar);
        this.e = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (((defpackage.udq) r0).d == ((defpackage.udq) r7).d) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0010, B:10:0x0014, B:11:0x0022, B:13:0x0028, B:16:0x0039, B:20:0x0048, B:23:0x0054, B:25:0x0058, B:30:0x0073, B:38:0x00b6, B:39:0x00d9, B:34:0x008b, B:36:0x00a2, B:37:0x00ab), top: B:45:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[Catch: all -> 0x00dd, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0010, B:10:0x0014, B:11:0x0022, B:13:0x0028, B:16:0x0039, B:20:0x0048, B:23:0x0054, B:25:0x0058, B:30:0x0073, B:38:0x00b6, B:39:0x00d9, B:34:0x008b, B:36:0x00a2, B:37:0x00ab), top: B:45:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x00dd, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0010, B:10:0x0014, B:11:0x0022, B:13:0x0028, B:16:0x0039, B:20:0x0048, B:23:0x0054, B:25:0x0058, B:30:0x0073, B:38:0x00b6, B:39:0x00d9, B:34:0x008b, B:36:0x00a2, B:37:0x00ab), top: B:45:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void g(defpackage.udt r7) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udv.g(udt):void");
    }

    private static long h(cqat cqatVar, xlu xluVar, btvo btvoVar, amsy amsyVar) {
        dbsg i;
        amtr[] amtrVarArr;
        long i2 = i(xluVar, btvoVar);
        if (!xluVar.c()) {
            amve[] amveVarArr = amsyVar.d;
            int length = amveVarArr.length;
            int i3 = 0;
            long j = 0;
            loop0: while (true) {
                if (i3 < length) {
                    amve amveVar = amveVarArr[i3];
                    dqvj c = dqvj.c(amveVar.b().b);
                    if (c == null) {
                        c = dqvj.DRIVE;
                    }
                    if (c == dqvj.TRANSIT) {
                        for (amtr amtrVar : amveVar.b) {
                            int i4 = 0;
                            while (i4 < amtrVar.e()) {
                                amuq d = amtrVar.d(i4);
                                dpgw dpgwVar = d.g().c;
                                if (dpgwVar == null) {
                                    dpgwVar = dpgw.r;
                                }
                                dpbw b = dpbw.b(dpgwVar.p);
                                if (b == null) {
                                    b = dpbw.UNKNOWN;
                                }
                                if (b != dpbw.UNKNOWN) {
                                    i = dbpy.a;
                                    break loop0;
                                }
                                long j2 = 0;
                                for (doyp doypVar : d.h().b) {
                                    amve[] amveVarArr2 = amveVarArr;
                                    dpbw b2 = dpbw.b(doypVar.c);
                                    if (b2 == null) {
                                        b2 = dpbw.UNKNOWN;
                                    }
                                    int i5 = length;
                                    if (b2 != dpbw.UNKNOWN) {
                                        i = dbpy.a;
                                        break loop0;
                                    }
                                    dgaw dgawVar = doypVar.b;
                                    if (dgawVar == null) {
                                        dgawVar = dgaw.g;
                                    }
                                    j2 = Math.max(j2, dgawVar.b);
                                    amveVarArr = amveVarArr2;
                                    length = i5;
                                }
                                amve[] amveVarArr3 = amveVarArr;
                                int i6 = length;
                                if (j == 0 || j2 < j) {
                                    j = j2;
                                }
                                i4++;
                                amveVarArr = amveVarArr3;
                                length = i6;
                            }
                        }
                    }
                    i3++;
                    amveVarArr = amveVarArr;
                    length = length;
                } else {
                    i = dbsg.i(Long.valueOf(j));
                    break;
                }
            }
            if (!i.a()) {
                return i2;
            }
            if (((Long) i.b()).longValue() != 0) {
                return Math.max(TimeUnit.SECONDS.toMillis(((Long) i.b()).longValue() - 60) - cqatVar.b(), i2);
            }
            return 0L;
        }
        return i2;
    }

    private static long i(xlu xluVar, btvo btvoVar) {
        if (xluVar.c()) {
            return btvoVar.getTransitPagesParameters().s;
        }
        return TimeUnit.SECONDS.toMillis(btvoVar.getDirectionsPageParameters().a);
    }

    @Override // defpackage.udw
    public final void a(btlu btluVar, tmd tmdVar) {
        if (tmdVar.g().isEmpty()) {
            return;
        }
        g(udt.e(btluVar, tmdVar.c().e(), tmdVar.g().get(0).a(), false));
    }

    @Override // defpackage.udw
    public final void b(btlu btluVar, tlv tlvVar) {
        g(udt.e(btluVar, tlvVar.t(), tlvVar.a(), true));
    }

    @Override // defpackage.udw
    public final void c(btlu btluVar, tlv tlvVar, int i) {
        g(udt.e(btluVar, tlvVar.t(), i, true));
    }

    @Override // defpackage.udw
    public final void d() {
        udu uduVar = this.n;
        if (uduVar != null) {
            uduVar.b();
            this.n = null;
        }
        this.f = null;
        this.d.b();
        cryz<Boolean> cryzVar = this.j;
        if (cryzVar != null && !cryzVar.d()) {
            this.j.c();
        }
        long j = this.h;
        if (j < this.g) {
            this.g = j;
        }
    }

    public final void e() {
        if (this.n == null) {
            return;
        }
        long j = a;
        long j2 = this.o;
        this.o = Math.min(j, j2 + j2);
        udu uduVar = this.n;
        dbsk.s(uduVar);
        uduVar.c(this.o);
    }
}
