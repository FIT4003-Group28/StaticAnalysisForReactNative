package defpackage;
/* compiled from: PG */
/* renamed from: eagi  reason: default package */
/* loaded from: classes6.dex */
public final class eagi {
    public static int a(int i) {
        int[] iArr = {1, 2, 3, 4, 8, 9, 10, 11, 12, 13, 14};
        for (int i2 = 0; i2 < 11; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 0;
    }
}
