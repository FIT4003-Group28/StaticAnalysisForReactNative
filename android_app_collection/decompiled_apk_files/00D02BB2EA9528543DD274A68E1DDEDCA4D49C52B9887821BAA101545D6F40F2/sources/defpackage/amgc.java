package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amgc  reason: default package */
/* loaded from: classes.dex */
public final class amgc {
    final int[] a;
    final int[] b;
    final float[] c;
    final amgf d;
    final boolean e;
    final int f;
    final int g;
    final boolean h;
    int i;
    int j;
    int k;
    boolean l;
    final boolean m;
    final int n;
    final amgh o;

    public amgc(amgh amghVar, int i, int i2, int i3, float[] fArr, int[] iArr, int[] iArr2, float[] fArr2) {
        this.o = amghVar;
        this.f = i2;
        this.a = iArr;
        this.b = iArr2;
        this.c = fArr2;
        boolean z = false;
        this.e = (i & 64) != 0;
        this.g = ((i2 << 8) & 65280) | ((i3 << 16) & 16711680);
        if (fArr == null) {
            this.d = null;
        } else {
            this.d = amgi.k(fArr);
        }
        this.m = 1 == (i & 1);
        this.n = amghVar.a() / 2;
        if (amghVar.c(0, amghVar.a() - 2) && amghVar.c(1, amghVar.a() - 1)) {
            z = true;
        }
        this.h = z;
    }
}
