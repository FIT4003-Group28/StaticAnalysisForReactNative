package defpackage;
/* compiled from: PG */
/* renamed from: akga  reason: default package */
/* loaded from: classes.dex */
public final class akga {
    public static final int a;

    static {
        int[] iArr = {2, 3};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            i |= i4;
        }
        a = i;
    }
}
