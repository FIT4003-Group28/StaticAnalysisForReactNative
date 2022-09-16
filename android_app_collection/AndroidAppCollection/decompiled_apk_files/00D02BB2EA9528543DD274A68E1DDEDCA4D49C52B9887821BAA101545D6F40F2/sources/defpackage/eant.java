package defpackage;
/* compiled from: PG */
/* renamed from: eant  reason: default package */
/* loaded from: classes6.dex */
public final class eant {
    public final eant a;
    public final boolean b;
    public int c;
    public int d;
    public int[] e;
    public eanz[] f;
    public eans[] g;
    public int h;
    public int i;
    public transient boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public eant() {
        this.a = null;
        this.b = true;
        g();
    }

    private eant(eant eantVar, boolean z) {
        this.a = eantVar;
        this.b = z;
        this.c = eantVar.c;
        this.d = eantVar.d;
        this.e = eantVar.e;
        this.f = eantVar.f;
        this.g = eantVar.g;
        this.h = eantVar.h;
        this.i = eantVar.i;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = true;
    }

    public static final int c(int[] iArr, int i) {
        int i2 = iArr[0];
        for (int i3 = 1; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (i2 >>> 16) ^ i2;
        return i4 ^ (i4 >>> 8);
    }

    private final void g() {
        this.c = 0;
        this.e = new int[64];
        this.f = new eanz[64];
        this.k = false;
        this.l = false;
        this.d = 63;
        this.m = true;
        this.g = null;
        this.i = 0;
        this.j = false;
    }

    public final synchronized void a(eant eantVar) {
        int i = eantVar.c;
        if (i > this.c) {
            if (i > 6000) {
                g();
                return;
            }
            this.c = i;
            this.e = eantVar.e;
            this.f = eantVar.f;
            this.k = true;
            this.l = true;
            this.d = eantVar.d;
            this.g = eantVar.g;
            this.h = eantVar.h;
            this.i = eantVar.i;
        }
    }

    public final eanz b(int[] iArr, int i) {
        eans eansVar;
        int c = c(iArr, i);
        int i2 = this.d & c;
        int i3 = this.e[i2];
        if ((((i3 >> 8) ^ c) << 8) == 0) {
            eanz eanzVar = this.f[i2];
            if (eanzVar == null || eanzVar.c(iArr, i)) {
                return eanzVar;
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = i3 & 255;
        if (i4 <= 0 || (eansVar = this.g[i4 - 1]) == null) {
            return null;
        }
        eanz eanzVar2 = eansVar.a;
        if (eanzVar2.e == c && eanzVar2.c(iArr, i)) {
            return eansVar.a;
        }
        for (eans eansVar2 = eansVar.b; eansVar2 != null; eansVar2 = eansVar2.b) {
            eanz eanzVar3 = eansVar2.a;
            if (eanzVar3.e == c && eanzVar3.c(iArr, i)) {
                return eanzVar3;
            }
        }
        return null;
    }

    public final int d() {
        eans[] eansVarArr = this.g;
        int i = this.i;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = 1;
            for (eans eansVar = eansVarArr[i4].b; eansVar != null; eansVar = eansVar.b) {
                i5++;
            }
            if (i5 < i2) {
                if (i5 == 1) {
                    return i4;
                }
                i3 = i4;
                i2 = i5;
            }
        }
        return i3;
    }

    public final void e() {
        eans[] eansVarArr = this.g;
        int length = eansVarArr.length;
        eans[] eansVarArr2 = new eans[length + length];
        this.g = eansVarArr2;
        System.arraycopy(eansVarArr, 0, eansVarArr2, 0, length);
    }

    public final synchronized eant f(boolean z) {
        return new eant(this, z);
    }
}
