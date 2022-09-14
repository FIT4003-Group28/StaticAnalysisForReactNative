package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azhj  reason: default package */
/* loaded from: classes3.dex */
public final class azhj {
    private static final long g = TimeUnit.MINUTES.toMillis(5);
    private static final long h = TimeUnit.MINUTES.toMillis(1);
    private static final long i = TimeUnit.MINUTES.toMillis(20);
    public boolean a;
    public boolean b;
    public long d;
    public long e;
    public long f;
    private final btvo k;
    private final Object l = new Object();
    private final Object m = new Object();
    private boolean j = false;
    public long c = g;

    public azhj(btvo btvoVar) {
        this.k = btvoVar;
        long j = h;
        this.d = j;
        this.e = j;
        this.f = i;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.l) {
            this.c = TimeUnit.SECONDS.toMillis(this.k.getUgcParameters().m());
            this.d = TimeUnit.SECONDS.toMillis(this.k.getUgcParameters().o());
            this.f = TimeUnit.SECONDS.toMillis(this.k.getUgcParameters().n());
            long j = this.c;
            boolean z = true;
            this.a = j > 0;
            long j2 = this.d;
            if (j2 <= -1) {
                z = false;
            }
            this.b = z;
            if (j <= 0) {
                j = Long.MAX_VALUE;
            }
            if (j2 <= -1) {
                j2 = Long.MAX_VALUE;
            }
            this.e = Math.min(j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        synchronized (this.m) {
            this.j = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        boolean z;
        synchronized (this.m) {
            z = this.j;
        }
        return z;
    }
}
