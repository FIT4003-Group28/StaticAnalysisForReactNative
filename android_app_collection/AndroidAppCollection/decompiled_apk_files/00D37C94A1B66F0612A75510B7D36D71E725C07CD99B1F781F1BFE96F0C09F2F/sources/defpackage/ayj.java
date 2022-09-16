package defpackage;
/* compiled from: PG */
/* renamed from: ayj  reason: default package */
/* loaded from: classes2.dex */
public final class ayj implements axd {
    private final axd a;
    private final byte[] b;
    private final byte[] c;
    private ayl d;

    public ayj(byte[] bArr, axd axdVar, byte[] bArr2) {
        this.a = axdVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.axd
    public final void a() {
        this.d = null;
        this.a.a();
    }

    @Override // defpackage.axd
    public final void b(asy asyVar) {
        this.a.b(asyVar);
        long b = ase.b(asyVar.i);
        this.d = new ayl(1, this.b, b, asyVar.g + asyVar.b);
    }

    @Override // defpackage.axd
    public final void c(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i2 - i3, 4096);
            ayl aylVar = this.d;
            int i4 = pxi.a;
            aylVar.a(bArr, i + i3, min, this.c, 0);
            this.a.c(this.c, 0, min);
            i3 += min;
        }
    }
}
