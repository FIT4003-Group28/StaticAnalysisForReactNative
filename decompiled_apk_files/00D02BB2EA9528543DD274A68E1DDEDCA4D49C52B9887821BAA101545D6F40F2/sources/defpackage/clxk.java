package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clxk  reason: default package */
/* loaded from: classes5.dex */
public final class clxk {
    public final clvk a;
    public clxx d;
    public clxg e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public final clxw b = new clxw();
    public final cmnk c = new cmnk();
    private final cmnk k = new cmnk(1);
    private final cmnk l = new cmnk();

    public clxk(clvk clvkVar, clxx clxxVar, clxg clxgVar) {
        this.a = clvkVar;
        this.d = clxxVar;
        this.e = clxgVar;
        a(clxxVar, clxgVar);
    }

    public final void a(clxx clxxVar, clxg clxgVar) {
        this.d = clxxVar;
        this.e = clxgVar;
        this.a.a(clxxVar.a.f);
        b();
    }

    public final void b() {
        clxw clxwVar = this.b;
        clxwVar.d = 0;
        clxwVar.q = 0L;
        clxwVar.r = false;
        clxwVar.l = false;
        clxwVar.p = false;
        clxwVar.n = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.j = false;
    }

    public final long c() {
        if (!this.j) {
            return this.d.c[this.f];
        }
        return this.b.f[this.h];
    }

    public final boolean d() {
        this.f++;
        if (!this.j) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int e(int i, int i2) {
        cmnk cmnkVar;
        clxv f = f();
        if (f == null) {
            return 0;
        }
        int i3 = f.d;
        if (i3 != 0) {
            cmnkVar = this.b.o;
        } else {
            byte[] bArr = (byte[]) cmny.c(f.e);
            cmnk cmnkVar2 = this.l;
            int length = bArr.length;
            cmnkVar2.c(bArr, length);
            cmnkVar = this.l;
            i3 = length;
        }
        boolean c = this.b.c(this.f);
        boolean z = c || i2 != 0;
        cmnk cmnkVar3 = this.k;
        cmnkVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        cmnkVar3.f(0);
        this.a.f(this.k, 1);
        this.a.f(cmnkVar, i3);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.c.a(8);
            cmnk cmnkVar4 = this.c;
            byte[] bArr2 = cmnkVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            this.a.f(cmnkVar4, 8);
            return i3 + 9;
        }
        cmnk cmnkVar5 = this.b.o;
        int m = cmnkVar5.m();
        cmnkVar5.h(-2);
        int i4 = (m * 6) + 2;
        if (i2 != 0) {
            this.c.a(i4);
            byte[] bArr3 = this.c.a;
            cmnkVar5.j(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
            cmnkVar5 = this.c;
        }
        this.a.f(cmnkVar5, i4);
        return i3 + 1 + i4;
    }

    public final clxv f() {
        if (!this.j) {
            return null;
        }
        clxw clxwVar = this.b;
        clxg clxgVar = clxwVar.a;
        int i = cmny.a;
        int i2 = clxgVar.a;
        clxv clxvVar = clxwVar.n;
        if (clxvVar == null) {
            clxvVar = this.d.a.a(i2);
        }
        if (clxvVar != null && clxvVar.a) {
            return clxvVar;
        }
        return null;
    }
}
