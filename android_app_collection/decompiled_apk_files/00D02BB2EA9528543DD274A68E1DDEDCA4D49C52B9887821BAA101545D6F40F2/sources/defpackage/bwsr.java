package defpackage;
/* compiled from: PG */
/* renamed from: bwsr  reason: default package */
/* loaded from: classes4.dex */
public final class bwsr {
    public static double a(double d) {
        return d > 180.0d ? d - 360.0d : d;
    }

    public static double b(double d) {
        return ((d % 360.0d) + 360.0d) % 360.0d;
    }
}
