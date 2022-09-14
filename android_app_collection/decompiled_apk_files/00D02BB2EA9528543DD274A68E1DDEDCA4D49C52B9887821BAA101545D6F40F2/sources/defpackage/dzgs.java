package defpackage;
/* compiled from: PG */
/* renamed from: dzgs  reason: default package */
/* loaded from: classes6.dex */
public final class dzgs {
    public static void a(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index (" + i2 + ") is negative");
        } else if (i2 > i3) {
            throw new IllegalArgumentException("Start index (" + i2 + ") is greater than end index (" + i3 + ")");
        } else if (i3 <= i) {
        } else {
            throw new ArrayIndexOutOfBoundsException("End index (" + i3 + ") is greater than array length (" + i + ")");
        }
    }
}
