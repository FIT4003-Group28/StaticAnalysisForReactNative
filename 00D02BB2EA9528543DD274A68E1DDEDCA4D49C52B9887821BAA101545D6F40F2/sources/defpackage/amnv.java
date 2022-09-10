package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amnv  reason: default package */
/* loaded from: classes.dex */
public final class amnv {
    final byte[] a;
    int b;
    final int c;
    final bvok d = new bvok(4);
    int e = 0;
    final /* synthetic */ amoa f;

    public amnv(amoa amoaVar, byte[] bArr, int i) {
        this.f = amoaVar;
        this.a = bArr;
        this.c = i;
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr[i2] = (byte) ((i >> 24) & 255);
        int i4 = i3 + 1;
        this.b = i4;
        bArr[i3] = (byte) ((i >> 16) & 255);
        int i5 = i4 + 1;
        this.b = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        this.b = i5 + 1;
        bArr[i5] = (byte) (i & 255);
    }
}
