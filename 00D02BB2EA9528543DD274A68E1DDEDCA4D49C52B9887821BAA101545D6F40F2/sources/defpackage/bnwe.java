package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnwe  reason: default package */
/* loaded from: classes3.dex */
public final class bnwe {
    public Location a;
    public double b;
    private final amub c;
    private final float d;
    private long e;
    private long f;
    private boolean g;

    public bnwe(amub amubVar, float f, cqat cqatVar) {
        this.c = amubVar;
        dbsk.a(f > 0.0f);
        this.d = f;
        this.e = cqatVar.b();
        this.f = cqatVar.e();
        this.b = dcyn.a;
        dbsk.l(a(0L));
        dbsk.s(this.a);
    }

    public final boolean a(long j) {
        dbsk.a(j >= 0);
        if (this.g) {
            return false;
        }
        this.e += j;
        this.f += j;
        amtm au = this.c.au();
        dbsk.s(au);
        double d = au.d(this.b);
        double d2 = ((float) j) * this.d;
        Double.isNaN(d2);
        double max = Math.max((double) dcyn.a, d - (d2 / 1000.0d));
        if (max == dcyn.a) {
            this.g = true;
        }
        if (max != d) {
            this.b = bnwf.a(au, max);
        }
        double d3 = this.c.D;
        akra X = this.c.X(Math.max((double) dcyn.a, Math.min(d3, bnwf.a(au, max + 1.0d))));
        dbsk.s(X);
        akra X2 = this.c.X(Math.max((double) dcyn.a, Math.min(d3, bnwf.a(au, max - 1.0d))));
        dbsk.s(X2);
        float G = (float) akra.G(X, X2);
        float z = (this.d * X.z(X2)) / 2.0f;
        akra I = X.I(X2, 0.5f);
        double r = I.r();
        double d4 = this.f;
        Double.isNaN(d4);
        double d5 = (d4 * 6.283185307179586d) / 60000.0d;
        double sin = Math.sin(d5);
        double cos = Math.cos(d5);
        I.a += (int) (sin * r * dcyn.a);
        I.b += (int) (cos * r * dcyn.a);
        double d6 = this.f;
        Double.isNaN(d6);
        double sin2 = Math.sin((d6 * 6.283185307179586d) / 137000.0d);
        Location location = new Location("gps");
        location.setLatitude(I.k());
        location.setLongitude(I.o());
        location.setAccuracy((sin2 > 1.0d ? 500 : 0) + 5.99f);
        location.setTime(this.e);
        Bundle bundle = new Bundle();
        bundle.putInt("signal_possible_in_tunnels", 1);
        location.setExtras(bundle);
        location.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(this.f));
        location.setSpeed(z);
        location.setBearing(G);
        this.a = location;
        return true;
    }
}
