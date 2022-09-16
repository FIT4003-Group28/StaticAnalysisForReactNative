package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: axyy  reason: default package */
/* loaded from: classes2.dex */
public final class axyy implements Comparable {
    private static final long a;
    private static final long b;
    private static final long c;
    private static final azos g = new azos();
    private final long d;
    private volatile boolean e;
    private final azos f;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        a = nanos;
        b = -nanos;
        c = TimeUnit.SECONDS.toNanos(1L);
    }

    private axyy(azos azosVar, long j, long j2, byte[] bArr, byte[] bArr2) {
        this.f = azosVar;
        long min = Math.min(a, Math.max(b, j2));
        this.d = j + min;
        this.e = min <= 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(axyy axyyVar) {
        azos azosVar = this.f;
        if (azosVar == axyyVar.f) {
            long j = this.d - axyyVar.d;
            if (j < 0) {
                return -1;
            }
            return j > 0 ? 1 : 0;
        }
        String valueOf = String.valueOf(azosVar);
        String valueOf2 = String.valueOf(axyyVar.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("Tickers (");
        sb.append(valueOf);
        sb.append(" and ");
        sb.append(valueOf2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.e && this.d - nanoTime <= 0) {
            this.e = true;
        }
        return timeUnit.convert(this.d - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean d() {
        if (!this.e) {
            if (this.d - System.nanoTime() > 0) {
                return false;
            }
            this.e = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axyy)) {
            return false;
        }
        axyy axyyVar = (axyy) obj;
        return this.f == axyyVar.f && this.d == axyyVar.d;
    }

    public final int hashCode() {
        return Arrays.asList(this.f, Long.valueOf(this.d)).hashCode();
    }

    public final String toString() {
        long b2 = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b2);
        long j = c;
        long j2 = abs / j;
        long abs2 = Math.abs(b2) % j;
        StringBuilder sb = new StringBuilder();
        if (b2 < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        azos azosVar = this.f;
        if (azosVar != g) {
            String valueOf = String.valueOf(azosVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb2.append(" (ticker=");
            sb2.append(valueOf);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public static axyy c(long j, TimeUnit timeUnit) {
        azos azosVar = g;
        if (timeUnit != null) {
            return new axyy(azosVar, System.nanoTime(), timeUnit.toNanos(j), null, null);
        }
        throw new NullPointerException("units");
    }
}
