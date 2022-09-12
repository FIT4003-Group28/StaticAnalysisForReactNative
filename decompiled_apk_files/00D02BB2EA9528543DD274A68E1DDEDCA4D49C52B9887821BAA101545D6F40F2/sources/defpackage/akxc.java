package defpackage;
/* compiled from: PG */
/* renamed from: akxc  reason: default package */
/* loaded from: classes2.dex */
public final class akxc {
    public static akxb a(int[] iArr) {
        int max;
        akxb akxbVar = new akxb();
        int i = iArr[1];
        akxbVar.c = i;
        akxbVar.d = i;
        for (int i2 = 1; i2 < iArr.length; i2 += 2) {
            akxbVar.c = Math.min(iArr[i2], akxbVar.c);
            akxbVar.d = Math.max(iArr[i2], akxbVar.d);
        }
        int i3 = iArr[0];
        int i4 = i3;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6 += 2) {
            int abs = Math.abs(iArr[0] - iArr[i6]);
            if (abs > 536870912) {
                abs = 1073741824 - abs;
            }
            if (abs > i5) {
                i4 = iArr[i6];
                i5 = abs;
            }
        }
        int i7 = i3;
        boolean z = false;
        for (int i8 = 0; i8 < iArr.length; i8 += 2) {
            int abs2 = Math.abs(iArr[i8] - i4);
            if (abs2 > 536870912) {
                abs2 = 1073741824 - abs2;
                z = true;
            }
            if (abs2 > i5) {
                i7 = iArr[i8];
                i5 = abs2;
            }
        }
        if (z) {
            akxbVar.a = Math.max(i4, i7);
            max = Math.min(i4, i7);
        } else {
            akxbVar.a = Math.min(i4, i7);
            max = Math.max(i4, i7);
        }
        akxbVar.b = max;
        return akxbVar;
    }

    public static double b(double d, double d2) {
        double abs = Math.abs(d2 - d);
        return abs < 180.0d ? abs : 360.0d - abs;
    }
}
