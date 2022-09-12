package defpackage;
/* compiled from: PG */
/* renamed from: cmal  reason: default package */
/* loaded from: classes5.dex */
public final class cmal {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(cmnk cmnkVar, int i, int i2) {
        cmnkVar.f(i);
        if (cmnkVar.d() < 5) {
            return -9223372036854775807L;
        }
        int r = cmnkVar.r();
        if ((8388608 & r) != 0 || ((r >> 8) & 8191) != i2 || (r & 32) == 0 || cmnkVar.l() < 7 || cmnkVar.d() < 7 || (cmnkVar.l() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        cmnkVar.j(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = bArr[3] & 255;
        return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
    }
}
