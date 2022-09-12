package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amgb  reason: default package */
/* loaded from: classes.dex */
public final class amgb implements amgh {
    private final int[] a;
    @dzsi
    private final int[] b;
    @dzsi
    private final int[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    public amgb(int[] iArr, int i, int i2, int i3, int i4, boolean z, @dzsi int[] iArr2, @dzsi int[] iArr3) {
        this.a = iArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.b = iArr2;
        this.c = iArr3;
    }

    private final int f(int i) {
        int i2 = i - this.f;
        return this.h ? akra.N(i2) : i2;
    }

    @Override // defpackage.amgh
    public final int a() {
        return this.d;
    }

    @Override // defpackage.amgh
    public final void b(int i, akse akseVar) {
        akseVar.r(f(this.a[this.e + i]), this.a[(this.e + i) + 1] - this.g);
    }

    @Override // defpackage.amgh
    public final boolean c(int i, int i2) {
        int[] iArr = this.a;
        int i3 = this.e;
        return iArr[i + i3] == iArr[i3 + i2];
    }

    @Override // defpackage.amgh
    @dzsi
    public final akse d() {
        int[] iArr = this.b;
        if (iArr == null) {
            return null;
        }
        return new akse(f(iArr[0]), this.b[1] - this.g);
    }

    @Override // defpackage.amgh
    @dzsi
    public final akse e() {
        int[] iArr = this.c;
        if (iArr == null) {
            return null;
        }
        return new akse(f(iArr[0]), this.c[1] - this.g);
    }
}
