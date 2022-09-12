package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eavc  reason: default package */
/* loaded from: classes6.dex */
public final class eavc extends eaou {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] a;
    private final int[] e;
    private final int[] f;
    private final String[] g;
    private final eava h;

    private eavc(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, eava eavaVar) {
        super(str);
        this.a = jArr;
        this.e = iArr;
        this.f = iArr2;
        this.g = strArr;
        this.h = eavaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eavc g(DataInput dataInput, String str) {
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
            jArr[i2] = eave.b(dataInput);
            iArr[i2] = (int) eave.b(dataInput);
            iArr2[i2] = (int) eave.b(dataInput);
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
        return new eavc(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new eava(str, (int) eave.b(dataInput), eavd.a(dataInput), eavd.a(dataInput)) : null);
    }

    @Override // defpackage.eaou
    public final String a(long j) {
        long[] jArr = this.a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            return i > 0 ? this.g[i - 1] : "UTC";
        }
        eava eavaVar = this.h;
        if (eavaVar == null) {
            return this.g[i - 1];
        }
        return eavaVar.a(j);
    }

    @Override // defpackage.eaou
    public final int b(long j) {
        long[] jArr = this.a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.e[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            if (i <= 0) {
                return 0;
            }
            return this.e[i - 1];
        }
        eava eavaVar = this.h;
        if (eavaVar == null) {
            return this.e[i - 1];
        }
        return eavaVar.b(j);
    }

    @Override // defpackage.eaou
    public final int c(long j) {
        long[] jArr = this.a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i >= jArr.length) {
            eava eavaVar = this.h;
            return eavaVar == null ? this.f[i - 1] : eavaVar.a;
        } else if (i <= 0) {
            return 0;
        } else {
            return this.f[i - 1];
        }
    }

    @Override // defpackage.eaou
    public final boolean d() {
        return false;
    }

    @Override // defpackage.eaou
    public final long e(long j) {
        long[] jArr = this.a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ (-1);
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        eava eavaVar = this.h;
        if (eavaVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return eavaVar.e(j);
    }

    @Override // defpackage.eaou
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eavc) {
            eavc eavcVar = (eavc) obj;
            if (this.d.equals(eavcVar.d) && Arrays.equals(this.a, eavcVar.a) && Arrays.equals(this.g, eavcVar.g) && Arrays.equals(this.e, eavcVar.e) && Arrays.equals(this.f, eavcVar.f)) {
                eava eavaVar = this.h;
                eava eavaVar2 = eavcVar.h;
                if (eavaVar != null ? eavaVar.equals(eavaVar2) : eavaVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.eaou
    public final long f(long j) {
        long[] jArr = this.a;
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
        eava eavaVar = this.h;
        if (eavaVar != null) {
            long f = eavaVar.f(j);
            if (f < j) {
                return f;
            }
        }
        long j3 = jArr[i - 1];
        return j3 > Long.MIN_VALUE ? j3 - 1 : j;
    }
}
