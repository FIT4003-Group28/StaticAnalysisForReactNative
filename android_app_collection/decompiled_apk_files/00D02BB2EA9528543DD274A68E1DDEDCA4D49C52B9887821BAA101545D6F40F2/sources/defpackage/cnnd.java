package defpackage;
/* compiled from: PG */
/* renamed from: cnnd  reason: default package */
/* loaded from: classes5.dex */
public final class cnnd {
    public static int a(int i) {
        int[] iArr = {1, 2, 3, 4, 5};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
