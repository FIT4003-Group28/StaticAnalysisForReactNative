package defpackage;
/* compiled from: PG */
/* renamed from: cmnv  reason: default package */
/* loaded from: classes5.dex */
public final class cmnv {
    public long a;
    public long b;
    public volatile long c = -9223372036854775807L;

    public cmnv(long j) {
        a(j);
    }

    public final synchronized void a(long j) {
        cmmn.c(this.c == -9223372036854775807L);
        this.a = j;
    }

    public final long b() {
        if (this.a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.c != -9223372036854775807L) {
            return this.b;
        }
        return -9223372036854775807L;
    }

    public final void c() {
        this.c = -9223372036854775807L;
    }

    public final long d(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            long j2 = (this.c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = (((-1) + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return e((j * 1000000) / 90000);
    }

    public final long e(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            this.c = j;
        } else {
            long j2 = this.a;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - j;
            }
            synchronized (this) {
                this.c = j;
                notifyAll();
            }
        }
        return j + this.b;
    }
}