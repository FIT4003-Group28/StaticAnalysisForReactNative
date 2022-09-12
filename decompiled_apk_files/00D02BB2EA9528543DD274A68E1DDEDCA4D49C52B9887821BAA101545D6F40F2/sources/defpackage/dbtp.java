package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbtp  reason: default package */
/* loaded from: classes5.dex */
public final class dbtp {
    public boolean a;
    private final dbug b;
    private long c;
    private long d;

    public dbtp() {
        this.b = dbug.b;
    }

    public dbtp(dbug dbugVar) {
        dbsk.t(dbugVar, "ticker");
        this.b = dbugVar;
    }

    public static dbtp a() {
        return new dbtp();
    }

    public static dbtp b() {
        dbtp dbtpVar = new dbtp();
        dbtpVar.f();
        return dbtpVar;
    }

    public static dbtp c(dbug dbugVar) {
        dbtp dbtpVar = new dbtp(dbugVar);
        dbtpVar.f();
        return dbtpVar;
    }

    private final long h() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long d(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final void e() {
        this.c = 0L;
        this.a = false;
    }

    public final void f() {
        dbsk.m(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void g() {
        long a = this.b.a();
        dbsk.m(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += a - this.d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long h = h();
        if (TimeUnit.DAYS.convert(h, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(h, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(h, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(h, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(h, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = TimeUnit.MICROSECONDS.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        }
        double d = h;
        double convert = TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        Double.isNaN(d);
        Double.isNaN(convert);
        String c = dbsj.c(d / convert);
        switch (dbto.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1 + str.length());
        sb.append(c);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }
}
