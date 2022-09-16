package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: balw  reason: default package */
/* loaded from: classes2.dex */
public final class balw extends baht {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final balu i;

    private balw(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, balu baluVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = baluVar;
    }

    public static balw o(DataInput dataInput, String str) {
        int readUnsignedByte;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = banl.e(dataInput);
            iArr[i2] = (int) banl.e(dataInput);
            iArr2[i2] = (int) banl.e(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                readUnsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i2] = strArr[readUnsignedByte];
        }
        return new balw(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new balu(str, (int) banl.e(dataInput), balx.c(dataInput), balx.c(dataInput)) : null);
    }

    @Override // defpackage.baht
    public final int a(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            if (i <= 0) {
                return 0;
            }
            return this.f[i - 1];
        }
        balu baluVar = this.i;
        if (baluVar == null) {
            return this.f[i - 1];
        }
        return baluVar.a(j);
    }

    @Override // defpackage.baht
    public final int c(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i >= jArr.length) {
            balu baluVar = this.i;
            return baluVar == null ? this.g[i - 1] : baluVar.e;
        } else if (i <= 0) {
            return 0;
        } else {
            return this.g[i - 1];
        }
    }

    @Override // defpackage.baht
    public final long e(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ (-1);
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        balu baluVar = this.i;
        if (baluVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return baluVar.e(j);
    }

    @Override // defpackage.baht
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof balw) {
            balw balwVar = (balw) obj;
            if (this.c.equals(balwVar.c) && Arrays.equals(this.e, balwVar.e) && Arrays.equals(this.h, balwVar.h) && Arrays.equals(this.f, balwVar.f) && Arrays.equals(this.g, balwVar.g)) {
                balu baluVar = this.i;
                balu baluVar2 = balwVar.i;
                if (baluVar != null ? baluVar.equals(baluVar2) : baluVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.baht
    public final long f(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return j > Long.MIN_VALUE ? j - 1 : j;
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            if (i > 0) {
                long j2 = jArr[i - 1];
                if (j2 > Long.MIN_VALUE) {
                    return j2 - 1;
                }
            }
            return j;
        }
        balu baluVar = this.i;
        if (baluVar != null) {
            long f = baluVar.f(j);
            if (f < j) {
                return f;
            }
        }
        long j3 = jArr[i - 1];
        return j3 > Long.MIN_VALUE ? j3 - 1 : j;
    }

    @Override // defpackage.baht
    public final String g(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            return i > 0 ? this.h[i - 1] : "UTC";
        }
        balu baluVar = this.i;
        if (baluVar == null) {
            return this.h[i - 1];
        }
        return baluVar.g(j);
    }

    @Override // defpackage.baht
    public final boolean l() {
        return false;
    }
}
