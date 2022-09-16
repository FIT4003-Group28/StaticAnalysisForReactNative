package defpackage;

import android.util.Range;
/* compiled from: PG */
/* renamed from: ahow  reason: default package */
/* loaded from: classes.dex */
public interface ahow {
    public static final Range a;
    public static final Range b;

    static {
        Double valueOf = Double.valueOf(0.0d);
        a = new Range(valueOf, Double.valueOf(1.0d));
        b = new Range(valueOf, Double.valueOf(Double.MAX_VALUE));
    }

    double a(double d);

    double b();

    double c(double d);

    boolean d();
}
