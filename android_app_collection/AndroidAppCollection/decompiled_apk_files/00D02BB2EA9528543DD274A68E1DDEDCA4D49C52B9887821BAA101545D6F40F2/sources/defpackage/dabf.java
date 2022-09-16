package defpackage;
/* compiled from: PG */
/* renamed from: dabf  reason: default package */
/* loaded from: classes5.dex */
public final class dabf {
    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }
}
