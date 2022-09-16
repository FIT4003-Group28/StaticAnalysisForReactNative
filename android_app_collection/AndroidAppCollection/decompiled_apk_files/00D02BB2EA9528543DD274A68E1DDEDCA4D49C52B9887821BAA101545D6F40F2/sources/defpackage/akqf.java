package defpackage;
/* compiled from: PG */
/* renamed from: akqf  reason: default package */
/* loaded from: classes2.dex */
public final class akqf {
    public static int[] a(doud doudVar) {
        int min = Math.min(doudVar.a.size(), doudVar.b.size());
        int[] iArr = new int[min + min];
        akra akraVar = new akra();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            i += doudVar.a.f(i3);
            i2 = b(i2, doudVar.b.f(i3));
            akraVar.v(i, i2);
            int i4 = i3 + i3;
            iArr[i4] = akraVar.a;
            iArr[i4 + 1] = akraVar.b;
        }
        return iArr;
    }

    public static int b(int i, int i2) {
        long j;
        long j2 = i + i2;
        if (j2 > -1800000000) {
            if (j2 > 1800000000) {
                j = -3600000000L;
            }
            return (int) j2;
        }
        j = 3600000000L;
        j2 += j;
        return (int) j2;
    }
}
