package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: aexl  reason: default package */
/* loaded from: classes.dex */
public final class aexl implements piv {
    protected final aevy a;
    public boolean e;
    protected final yrd f;
    protected final afjz g;
    private axf h;
    private int l;
    private final boolean m;
    private volatile long n;
    private long o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final afex s;
    protected aeub b = aeub.a;
    protected aeuc c = new aeuc(this.b);
    protected aeuc d = new aeuc(this.b);
    private volatile long j = 2500000;
    private volatile long k = 5000000;
    private long t = -9223372036854775807L;
    private long u = 0;
    private long v = -9223372036854775807L;
    private long w = -9223372036854775807L;
    private volatile long i = SystemClock.elapsedRealtime();

    public aexl(aevy aevyVar, afjz afjzVar, yrd yrdVar, afex afexVar) {
        this.a = aevyVar;
        this.g = afjzVar;
        this.f = yrdVar;
        this.m = afjzVar.n().o;
        this.s = afexVar;
        afexVar.e();
    }

    private static long n(PlayerConfigModel playerConfigModel) {
        if (playerConfigModel.Q() == null || (playerConfigModel.Q().b & 2) == 0) {
            return 60000L;
        }
        return playerConfigModel.Q().c;
    }

    private final synchronized void o(boolean z) {
        this.i = SystemClock.elapsedRealtime();
        this.s.e();
        this.l = 0;
        if (z) {
            synchronized (this) {
                this.h = null;
            }
        }
        this.t = -9223372036854775807L;
        this.u = 0L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.s.f(null);
    }

    private final synchronized boolean p(PlayerConfigModel playerConfigModel, long j) {
        if (this.t == -9223372036854775807L) {
            this.t = phk.c(n(playerConfigModel));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.w;
        if (j2 != -9223372036854775807L && elapsedRealtime > j2) {
            this.w = -9223372036854775807L;
            return true;
        }
        long j3 = this.v;
        if (j3 == -9223372036854775807L || elapsedRealtime >= j3) {
            if (j > this.t) {
                return false;
            }
            long j4 = this.u;
            if (j4 > 0 && j >= j4) {
                if (playerConfigModel.aO()) {
                    return this.f.b();
                }
                return this.p;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.piv
    public final long a() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0186, code lost:
        if (r20 > r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x018b, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01a6, code lost:
        if (r17.q != r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    @Override // defpackage.piv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18, long r20, float r22) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexl.b(long, long, float):boolean");
    }

    @Override // defpackage.piv
    public final void d() {
        PlayerConfigModel a = this.a.a();
        this.j = a.t() * 1000;
        this.k = a.x() * 1000;
        this.o = this.g.o().I * 1000;
        o(false);
    }

    @Override // defpackage.piv
    public final void e() {
        o(true);
    }

    @Override // defpackage.piv
    public final void f() {
        o(true);
    }

    @Override // defpackage.piv
    public final void g(pkd[] pkdVarArr, TrackGroupArray trackGroupArray, pvf[] pvfVarArr) {
        PlayerConfigModel a;
        if (pvfVarArr.length == 0) {
            a = this.a.a();
        } else {
            pvf pvfVar = pvfVarArr[0];
            if (pvfVar == null) {
                a = this.a.a();
            } else {
                Object d = pvfVar.d();
                if (d instanceof afbl) {
                    a = ((afbl) d).a.a();
                } else {
                    a = this.a.a();
                }
            }
        }
        this.l = (a.D() + a.g()) * a.h() * 1024;
        i().c(this.l);
    }

    @Override // defpackage.piv
    public final boolean h() {
        return this.o > 0;
    }

    @Override // defpackage.piv
    /* renamed from: j */
    public final synchronized axf i() {
        if (this.h == null) {
            aevy aevyVar = this.a;
            aexi aexiVar = aevyVar.a;
            this.h = new axf(false, aevyVar.a().h() * 1024);
        }
        return this.h;
    }

    public final void k(PlayerConfigModel playerConfigModel, aeub aeubVar, String str) {
        this.j = playerConfigModel.t() * 1000;
        this.k = playerConfigModel.x() * 1000;
        this.b = aeubVar;
        this.c = new aeuc(aeubVar);
        this.d = new aeuc(aeubVar);
        afex afexVar = this.s;
        afgt afgtVar = afexVar.a;
        if (str != null) {
            synchronized (afgtVar.c) {
                if (afgtVar.b.c(str) == null) {
                    afgtVar.b.d(str, Long.valueOf(afgtVar.a.d()));
                }
            }
        }
        afexVar.b = aeubVar;
        if (this.m) {
            this.n = SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void l(atoi atoiVar) {
        this.t = phk.c((atoiVar.b & 2) != 0 ? atoiVar.c : n(this.a.a()));
        this.u = phk.c(atoiVar.f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = atoiVar.b;
        long j = (i & 4) != 0 ? atoiVar.d + elapsedRealtime : -9223372036854775807L;
        this.w = j;
        long j2 = (i & 8) != 0 ? elapsedRealtime + atoiVar.e : -9223372036854775807L;
        this.v = j2;
        if (j != -9223372036854775807L && j2 > j) {
            this.v = j;
        }
        if ((i & 64) == 0) {
            this.s.f(null);
        } else {
            this.s.f(atoiVar.g);
        }
    }

    public final synchronized void m() {
        this.i = SystemClock.elapsedRealtime();
        this.s.e();
        this.v = -9223372036854775807L;
    }

    @Override // defpackage.piv
    public final boolean c(long j, float f, boolean z, long j2) {
        long j3 = z ? this.k : this.j;
        boolean z2 = true;
        if (j3 > 0 && j < j3) {
            z2 = false;
        }
        if (this.m) {
            aeuc aeucVar = this.c;
            Boolean valueOf = Boolean.valueOf(z2);
            StringBuilder sb = new StringBuilder(57);
            sb.append("ssp.");
            sb.append(j);
            sb.append(".");
            sb.append(z);
            sb.append(".");
            sb.append(j3);
            sb.append(".");
            sb.append(z2);
            aeucVar.a(valueOf, sb.toString());
        }
        return z2;
    }
}
