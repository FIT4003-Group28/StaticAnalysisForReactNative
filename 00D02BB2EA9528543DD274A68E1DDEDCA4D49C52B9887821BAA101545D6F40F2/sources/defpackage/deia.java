package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: deia  reason: default package */
/* loaded from: classes6.dex */
public abstract class deia {
    private final dehz a;
    private volatile Object b;

    public deia(dehz dehzVar) {
        this.a = dehzVar;
    }

    public static deia a(double d) {
        deih deihVar = new deih(new dehy());
        boolean z = false;
        if (d > dcyn.a && !Double.isNaN(d)) {
            z = true;
        }
        dbsk.b(z, "rate must be positive");
        synchronized (deihVar.f()) {
            deihVar.i(((deia) deihVar).a.a());
            double micros = TimeUnit.SECONDS.toMicros(1L);
            Double.isNaN(micros);
            deihVar.c = micros / d;
            deihVar.g(d);
        }
        return deihVar;
    }

    private final Object f() {
        Object obj = this.b;
        if (obj == null) {
            synchronized (this) {
                obj = this.b;
                if (obj == null) {
                    obj = new Object();
                    this.b = obj;
                }
            }
        }
        return obj;
    }

    public abstract double b();

    public final boolean c() {
        long max = Math.max(TimeUnit.MICROSECONDS.toMicros(0L), 0L);
        dbsk.e(true, "Requested permits (%s) must be positive", 1);
        synchronized (f()) {
            long a = this.a.a();
            if (d() - max <= a) {
                long max2 = Math.max(e(a) - a, 0L);
                if (max2 <= 0) {
                    return true;
                }
                deix.c(max2, TimeUnit.MICROSECONDS);
                return true;
            }
            return false;
        }
    }

    public abstract long d();

    public abstract long e(long j);

    public final String toString() {
        double b;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        synchronized (f()) {
            b = b();
        }
        objArr[0] = Double.valueOf(b);
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", objArr);
    }
}
