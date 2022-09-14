package defpackage;
/* compiled from: PG */
/* renamed from: eano  reason: default package */
/* loaded from: classes6.dex */
public final class eano {
    public static final String a = "9223372036854775808";

    public static final int a(char[] cArr, int i, int i2) {
        int i3;
        int i4 = cArr[i] - '0';
        int i5 = i2 + i;
        int i6 = i + 1;
        if (i6 < i5) {
            int i7 = (i4 * 10) + (cArr[i6] - '0');
            int i8 = i6 + 1;
            if (i8 >= i5) {
                return i7;
            }
            int i9 = (i7 * 10) + (cArr[i8] - '0');
            int i10 = i8 + 1;
            if (i10 >= i5) {
                return i9;
            }
            int i11 = (i9 * 10) + (cArr[i10] - '0');
            int i12 = i10 + 1;
            if (i12 >= i5) {
                return i11;
            }
            int i13 = (i11 * 10) + (cArr[i12] - '0');
            int i14 = i12 + 1;
            if (i14 >= i5) {
                return i13;
            }
            int i15 = (i13 * 10) + (cArr[i14] - '0');
            int i16 = i14 + 1;
            if (i16 >= i5) {
                return i15;
            }
            int i17 = (i15 * 10) + (cArr[i16] - '0');
            int i18 = i16 + 1;
            if (i18 >= i5) {
                return i17;
            }
            int i19 = (i17 * 10) + (cArr[i18] - '0');
            return i18 + 1 >= i5 ? i19 : (i19 * 10) + (cArr[i3] - '0');
        }
        return i4;
    }
}
