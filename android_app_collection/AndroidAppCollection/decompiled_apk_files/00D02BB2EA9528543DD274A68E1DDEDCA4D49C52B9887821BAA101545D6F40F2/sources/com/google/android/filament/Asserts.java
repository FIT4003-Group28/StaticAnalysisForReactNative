package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
final class Asserts {
    private Asserts() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] assertFloat3(float[] fArr) {
        if (fArr == null) {
            return new float[3];
        }
        if (fArr.length < 3) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] assertFloat4(float[] fArr) {
        if (fArr == null) {
            return new float[4];
        }
        if (fArr.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] assertMat3f(float[] fArr) {
        if (fArr == null) {
            return new float[9];
        }
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void assertMat3fIn(float[] fArr) {
        if (fArr.length >= 9) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double[] assertMat4d(double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void assertMat4dIn(double[] dArr) {
        if (dArr.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] assertMat4f(float[] fArr) {
        if (fArr == null) {
            return new float[16];
        }
        if (fArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void assertMat4fIn(float[] fArr) {
        if (fArr.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }
}
