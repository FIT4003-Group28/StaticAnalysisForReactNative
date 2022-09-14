package defpackage;
/* compiled from: PG */
/* renamed from: dekb  reason: default package */
/* loaded from: classes6.dex */
public final class dekb {
    public static int a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
