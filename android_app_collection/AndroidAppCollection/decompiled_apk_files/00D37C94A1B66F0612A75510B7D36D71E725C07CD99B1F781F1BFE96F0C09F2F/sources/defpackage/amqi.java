package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amqi  reason: default package */
/* loaded from: classes.dex */
public final class amqi {
    public boolean a;
    private final amqu b;
    private long c;
    private long d;

    public amqi() {
        this.b = amqu.b;
    }

    public amqi(amqu amquVar) {
        amquVar.getClass();
        this.b = amquVar;
    }

    public static amqi b(amqu amquVar) {
        amqi amqiVar = new amqi(amquVar);
        amqiVar.f();
        return amqiVar;
    }

    public static amqi c() {
        return new amqi();
    }

    public static amqi d(amqu amquVar) {
        return new amqi(amquVar);
    }

    private final long h() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final void e() {
        this.c = 0L;
        this.a = false;
    }

    public final void f() {
        aqxo.z(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void g() {
        long a = this.b.a();
        aqxo.z(this.a, "This stopwatch is already stopped.");
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
        String c = amps.c(d / convert);
        switch (amqh.a[timeUnit.ordinal()]) {
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
