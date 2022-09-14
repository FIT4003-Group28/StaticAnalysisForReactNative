package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eaka  reason: default package */
/* loaded from: classes6.dex */
public class eaka {
    public static final eaka f = new eajz();
    private long a;
    public boolean g;
    public long h;

    public final void i(Object obj) {
        try {
            boolean s = s();
            long m = m();
            long j = 0;
            if (!s && m == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (s && m != 0) {
                m = Math.min(m, n() - nanoTime);
            } else if (s) {
                m = n() - nanoTime;
            }
            if (m > 0) {
                long j2 = m / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (m - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= m) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long m() {
        return this.h;
    }

    public long n() {
        if (this.g) {
            return this.a;
        }
        throw new IllegalStateException("No deadline");
    }

    public eaka o(long j) {
        this.g = true;
        this.a = j;
        return this;
    }

    public eaka p() {
        this.h = 0L;
        return this;
    }

    public eaka q() {
        this.g = false;
        return this;
    }

    public void r() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.g && this.a - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean s() {
        return this.g;
    }

    public eaka l(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.h = timeUnit.toNanos(j);
            return this;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("timeout < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
