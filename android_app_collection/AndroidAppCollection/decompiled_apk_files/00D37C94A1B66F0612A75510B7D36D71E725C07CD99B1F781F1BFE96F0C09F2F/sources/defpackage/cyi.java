package defpackage;

import android.graphics.PathEffect;
import com.facebook.yoga.YogaEdge;
/* compiled from: PG */
/* renamed from: cyi  reason: default package */
/* loaded from: classes3.dex */
public final class cyi {
    public final float[] a = new float[4];
    public final int[] b = new int[4];
    final int[] c = new int[4];
    public PathEffect d;

    public static void b(int[] iArr, YogaEdge yogaEdge, int i) {
        YogaEdge yogaEdge2 = YogaEdge.LEFT;
        switch (yogaEdge.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                iArr[c(yogaEdge)] = i;
                return;
            case 6:
                iArr[0] = i;
                iArr[2] = i;
                return;
            case 7:
                iArr[1] = i;
                iArr[3] = i;
                return;
            case 8:
                break;
            default:
                return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = i;
        }
    }

    private static int c(YogaEdge yogaEdge) {
        YogaEdge yogaEdge2 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 3;
                    }
                    if (ordinal == 4) {
                        return 0;
                    }
                    if (ordinal != 5) {
                        String valueOf = String.valueOf(yogaEdge.name());
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Given unsupported edge ".concat(valueOf) : new String("Given unsupported edge "));
                    }
                }
            }
            return i;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int[] iArr, YogaEdge yogaEdge) {
        if (iArr.length != 4) {
            throw new IllegalArgumentException("Given wrongly sized array");
        }
        return iArr[c(yogaEdge)];
    }
}
