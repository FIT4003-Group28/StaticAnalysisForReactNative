package defpackage;
/* compiled from: PG */
/* renamed from: babn  reason: default package */
/* loaded from: classes2.dex */
public final class babn {
    public int a = 0;

    public final void a(Object obj, Object obj2) {
        if (this.a == 0 && obj != obj2) {
            int i = -1;
            if (obj == null) {
                this.a = -1;
            } else if (obj2 == null) {
                this.a = 1;
            } else if (obj.getClass().isArray()) {
                int i2 = 0;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.a != 0 || jArr == jArr2) {
                        return;
                    }
                    int length = jArr.length;
                    int length2 = jArr2.length;
                    if (length != length2) {
                        if (length >= length2) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < jArr.length && this.a == 0) {
                        this.a = (jArr[i2] > jArr2[i2] ? 1 : (jArr[i2] == jArr2[i2] ? 0 : -1));
                        i2++;
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (this.a != 0 || iArr == iArr2) {
                        return;
                    }
                    int length3 = iArr.length;
                    int length4 = iArr2.length;
                    if (length3 != length4) {
                        if (length3 >= length4) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    for (int i3 = 0; i3 < iArr.length && this.a == 0; i3++) {
                        int i4 = iArr[i3];
                        int i5 = iArr2[i3];
                        this.a = i4 == i5 ? 0 : i4 < i5 ? -1 : 1;
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (this.a != 0 || sArr == sArr2) {
                        return;
                    }
                    int length5 = sArr.length;
                    int length6 = sArr2.length;
                    if (length5 != length6) {
                        if (length5 >= length6) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < sArr.length && this.a == 0) {
                        this.a = sArr[i2] - sArr2[i2];
                        i2++;
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (this.a != 0 || cArr == cArr2) {
                        return;
                    }
                    int length7 = cArr.length;
                    int length8 = cArr2.length;
                    if (length7 != length8) {
                        if (length7 >= length8) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < cArr.length && this.a == 0) {
                        this.a = cArr[i2] - cArr2[i2];
                        i2++;
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (this.a != 0 || bArr == bArr2) {
                        return;
                    }
                    int length9 = bArr.length;
                    int length10 = bArr2.length;
                    if (length9 != length10) {
                        if (length9 >= length10) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < bArr.length && this.a == 0) {
                        this.a = bArr[i2] - bArr2[i2];
                        i2++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (this.a != 0 || dArr == dArr2) {
                        return;
                    }
                    int length11 = dArr.length;
                    int length12 = dArr2.length;
                    if (length11 != length12) {
                        if (length11 >= length12) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < dArr.length && this.a == 0) {
                        this.a = Double.compare(dArr[i2], dArr2[i2]);
                        i2++;
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (this.a != 0 || fArr == fArr2) {
                        return;
                    }
                    int length13 = fArr.length;
                    int length14 = fArr2.length;
                    if (length13 != length14) {
                        if (length13 >= length14) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < fArr.length && this.a == 0) {
                        this.a = Float.compare(fArr[i2], fArr2[i2]);
                        i2++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (this.a != 0 || zArr == zArr2) {
                        return;
                    }
                    int length15 = zArr.length;
                    int length16 = zArr2.length;
                    if (length15 != length16) {
                        if (length15 >= length16) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < zArr.length && this.a == 0) {
                        boolean z = zArr[i2];
                        if (z != zArr2[i2]) {
                            if (z) {
                                this.a = 1;
                            } else {
                                this.a = -1;
                            }
                        }
                        i2++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    if (this.a != 0 || objArr == objArr2) {
                        return;
                    }
                    int length17 = objArr.length;
                    int length18 = objArr2.length;
                    if (length17 != length18) {
                        if (length17 >= length18) {
                            i = 1;
                        }
                        this.a = i;
                        return;
                    }
                    while (i2 < objArr.length && this.a == 0) {
                        a(objArr[i2], objArr2[i2]);
                        i2++;
                    }
                }
            } else {
                this.a = ((Comparable) obj).compareTo(obj2);
            }
        }
    }
}
