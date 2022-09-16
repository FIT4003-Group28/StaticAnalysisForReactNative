package android.support.v7.b.a;

import java.lang.reflect.Array;
/* compiled from: GrowingArrayUtils.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f707a = true;

    public static int a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.Object] */
    public static <T> T[] a(T[] tArr, int i, T t) {
        if (f707a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a(i));
                System.arraycopy(tArr, 0, r0, 0, i);
                tArr = r0;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }

    public static int[] a(int[] iArr, int i, int i2) {
        if (f707a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    private c() {
    }
}
