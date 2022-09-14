package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzacc implements Cloneable {
    private static final zzacd zzbxk = new zzacd();
    private int mSize;
    private boolean zzbxl;
    private int[] zzbxm;
    private zzacd[] zzbxn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacc() {
        this(10);
    }

    private zzacc(int i) {
        this.zzbxl = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzbxm = new int[idealIntArraySize];
        this.zzbxn = new zzacd[idealIntArraySize];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    private final int zzav(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzbxm[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public final /* synthetic */ Object clone() {
        int i = this.mSize;
        zzacc zzaccVar = new zzacc(i);
        System.arraycopy(this.zzbxm, 0, zzaccVar.zzbxm, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzbxn[i2] != null) {
                zzaccVar.zzbxn[i2] = (zzacd) this.zzbxn[i2].clone();
            }
        }
        zzaccVar.mSize = i;
        return zzaccVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacc)) {
            return false;
        }
        zzacc zzaccVar = (zzacc) obj;
        if (this.mSize != zzaccVar.mSize) {
            return false;
        }
        int[] iArr = this.zzbxm;
        int[] iArr2 = zzaccVar.zzbxm;
        int i = this.mSize;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            zzacd[] zzacdVarArr = this.zzbxn;
            zzacd[] zzacdVarArr2 = zzaccVar.zzbxn;
            int i3 = this.mSize;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!zzacdVarArr[i4].equals(zzacdVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzbxm[i2]) * 31) + this.zzbxn[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.mSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, zzacd zzacdVar) {
        int zzav = zzav(i);
        if (zzav >= 0) {
            this.zzbxn[zzav] = zzacdVar;
            return;
        }
        int i2 = ~zzav;
        if (i2 < this.mSize && this.zzbxn[i2] == zzbxk) {
            this.zzbxm[i2] = i;
            this.zzbxn[i2] = zzacdVar;
            return;
        }
        if (this.mSize >= this.zzbxm.length) {
            int idealIntArraySize = idealIntArraySize(this.mSize + 1);
            int[] iArr = new int[idealIntArraySize];
            zzacd[] zzacdVarArr = new zzacd[idealIntArraySize];
            System.arraycopy(this.zzbxm, 0, iArr, 0, this.zzbxm.length);
            System.arraycopy(this.zzbxn, 0, zzacdVarArr, 0, this.zzbxn.length);
            this.zzbxm = iArr;
            this.zzbxn = zzacdVarArr;
        }
        if (this.mSize - i2 != 0) {
            int i3 = i2 + 1;
            System.arraycopy(this.zzbxm, i2, this.zzbxm, i3, this.mSize - i2);
            System.arraycopy(this.zzbxn, i2, this.zzbxn, i3, this.mSize - i2);
        }
        this.zzbxm[i2] = i;
        this.zzbxn[i2] = zzacdVar;
        this.mSize++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzacd zzat(int i) {
        int zzav = zzav(i);
        if (zzav < 0 || this.zzbxn[zzav] == zzbxk) {
            return null;
        }
        return this.zzbxn[zzav];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzacd zzau(int i) {
        return this.zzbxn[i];
    }
}
