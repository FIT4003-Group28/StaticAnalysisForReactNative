package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyfr  reason: default package */
/* loaded from: classes6.dex */
public final class dyfr implements Comparable<dyfr> {
    private static final dyfp b = new dyfp();
    private static final long c;
    private static final long d;
    private static final long e;
    public final long a;
    private final dyfq f;
    private volatile boolean g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        c = nanos;
        d = -nanos;
        e = TimeUnit.SECONDS.toNanos(1L);
    }

    private dyfr(dyfq dyfqVar, long j, long j2) {
        this.f = dyfqVar;
        long min = Math.min(c, Math.max(d, j2));
        this.a = j + min;
        this.g = min <= 0;
    }

    public final boolean b() {
        if (!this.g) {
            if (this.a - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final long c(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.g && this.a - nanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public final int compareTo(dyfr dyfrVar) {
        e(dyfrVar);
        long j = this.a - dyfrVar.a;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final void e(dyfr dyfrVar) {
        dyfq dyfqVar = this.f;
        if (dyfqVar == dyfrVar.f) {
            return;
        }
        String valueOf = String.valueOf(dyfqVar);
        String valueOf2 = String.valueOf(dyfrVar.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("Tickers (");
        sb.append(valueOf);
        sb.append(" and ");
        sb.append(valueOf2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dyfr)) {
            return false;
        }
        dyfr dyfrVar = (dyfr) obj;
        dyfq dyfqVar = this.f;
        if (dyfqVar != null ? dyfqVar != dyfrVar.f : dyfrVar.f != null) {
            return false;
        }
        return this.a == dyfrVar.a;
    }

    public final int hashCode() {
        return Arrays.asList(this.f, Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        long c2 = c(TimeUnit.NANOSECONDS);
        long abs = Math.abs(c2);
        long j = e;
        long j2 = abs / j;
        long abs2 = Math.abs(c2) % j;
        StringBuilder sb = new StringBuilder();
        if (c2 < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        dyfq dyfqVar = this.f;
        if (dyfqVar != b) {
            String valueOf = String.valueOf(dyfqVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb2.append(" (ticker=");
            sb2.append(valueOf);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public static dyfr a(long j, TimeUnit timeUnit) {
        dyfp dyfpVar = b;
        if (timeUnit != null) {
            return new dyfr(dyfpVar, System.nanoTime(), timeUnit.toNanos(j));
        }
        throw new NullPointerException("units");
    }
}
