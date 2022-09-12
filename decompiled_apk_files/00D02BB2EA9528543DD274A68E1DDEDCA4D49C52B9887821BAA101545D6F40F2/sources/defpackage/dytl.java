package defpackage;
/* compiled from: PG */
/* renamed from: dytl  reason: default package */
/* loaded from: classes6.dex */
final class dytl extends dykm {
    int a;
    final int b;
    final byte[] c;

    public dytl(byte[] bArr, int i, int i2) {
        boolean z = false;
        dbsk.b(i >= 0, "offset must be >= 0");
        dbsk.b(true, "length must be >= 0");
        int i3 = i2 + i;
        dbsk.b(i3 <= bArr.length ? true : z, "offset + length exceeds array boundary");
        this.c = (byte[]) dbsk.t(bArr, "bytes");
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.dytj
    public final int c() {
        return this.b - this.a;
    }

    @Override // defpackage.dytj
    public final int d() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.dytj
    public final void e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.dytj
    public final /* bridge */ /* synthetic */ dytj g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new dytl(this.c, i2, i);
    }
}
