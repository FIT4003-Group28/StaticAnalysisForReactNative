package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: kyp  reason: default package */
/* loaded from: classes7.dex */
final class kyp {
    private static final long a = TimeUnit.SECONDS.toMillis(1);
    private final akqa b;

    public kyp() {
        dbsk.g(true, "initialVelocity must be positive but was %s", Double.valueOf(100.0d));
        dbsk.g(true, "finalVelocity must be positive but was %s", Double.valueOf(700.0d));
        dbsk.f(true, "timeToFinalVelocityMs must be positive but was %s", 1500L);
        akqa akqaVar = new akqa(dcyn.a);
        this.b = akqaVar;
        double d = 1500 / a;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d);
        akqaVar.g(dcyn.a, d * 100.0d, d * 400.0d, d * 700.0d);
    }

    public final double a(long j) {
        akqa akqaVar = this.b;
        double d = j;
        Double.isNaN(d);
        return akqaVar.d(d / 1500.0d);
    }
}
