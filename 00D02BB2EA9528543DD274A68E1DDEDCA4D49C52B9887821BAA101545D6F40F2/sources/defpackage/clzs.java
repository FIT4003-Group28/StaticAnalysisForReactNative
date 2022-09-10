package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clzs  reason: default package */
/* loaded from: classes5.dex */
public final class clzs {
    public boolean c;
    public boolean d;
    public boolean e;
    public final cmnv a = new cmnv(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final cmnk b = new cmnk();

    public static long a(cmnk cmnkVar) {
        int i = cmnkVar.b;
        if (cmnkVar.d() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        cmnkVar.j(bArr, 0, 9);
        cmnkVar.f(i);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = bArr[0];
        byte b = bArr[1];
        long j2 = bArr[2];
        return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
    }

    public static final int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void b(cluk clukVar) {
        this.b.b(cmny.f);
        this.c = true;
        clukVar.i();
    }
}
