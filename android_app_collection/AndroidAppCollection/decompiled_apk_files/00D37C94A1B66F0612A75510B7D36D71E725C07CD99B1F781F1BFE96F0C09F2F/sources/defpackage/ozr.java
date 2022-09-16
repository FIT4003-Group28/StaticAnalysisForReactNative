package defpackage;

import java.io.EOFException;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ozr  reason: default package */
/* loaded from: classes4.dex */
final class ozr {
    private static final int a = pcx.c("OggS");

    public static void a(ozq ozqVar, int i, ozp ozpVar) {
        int i2;
        ozpVar.b = 0;
        ozpVar.a = 0;
        do {
            int i3 = ozpVar.b;
            int i4 = i + i3;
            if (i4 >= ozqVar.c) {
                return;
            }
            int[] iArr = ozqVar.f;
            ozpVar.b = i3 + 1;
            i2 = iArr[i4];
            ozpVar.a += i2;
        } while (i2 == 255);
    }

    public static boolean c(oxn oxnVar, ozq ozqVar, pct pctVar, boolean z) {
        pctVar.v();
        ozqVar.a();
        long j = oxnVar.b;
        if ((j != -1 && j - oxnVar.d() < 27) || !oxnVar.l(pctVar.a, 0, 27, true)) {
            if (!z) {
                throw new EOFException();
            }
            return false;
        } else if (pctVar.n() != a) {
            if (!z) {
                throw new ouf("expected OggS capture pattern at begin of page");
            }
            return false;
        } else if (pctVar.h() != 0) {
            if (!z) {
                throw new ouf("unsupported bit stream revision");
            }
            return false;
        } else {
            ozqVar.a = pctVar.h();
            byte[] bArr = pctVar.a;
            int i = pctVar.b;
            int i2 = i + 1;
            pctVar.b = i2;
            byte b = bArr[i];
            int i3 = i2 + 1;
            pctVar.b = i3;
            byte b2 = bArr[i2];
            int i4 = i3 + 1;
            pctVar.b = i4;
            byte b3 = bArr[i3];
            int i5 = i4 + 1;
            pctVar.b = i5;
            byte b4 = bArr[i4];
            int i6 = i5 + 1;
            pctVar.b = i6;
            byte b5 = bArr[i5];
            int i7 = i6 + 1;
            pctVar.b = i7;
            byte b6 = bArr[i6];
            int i8 = i7 + 1;
            pctVar.b = i8;
            byte b7 = bArr[i7];
            pctVar.b = i8 + 1;
            ozqVar.b = ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i8] & 255) << 56);
            pctVar.l();
            pctVar.l();
            pctVar.l();
            ozqVar.c = pctVar.h();
            pctVar.v();
            int i9 = ozqVar.c;
            ozqVar.d = i9 + 27;
            oxnVar.g(pctVar.a, 0, i9);
            for (int i10 = 0; i10 < ozqVar.c; i10++) {
                ozqVar.f[i10] = pctVar.h();
                ozqVar.e += ozqVar.f[i10];
            }
            return true;
        }
    }

    public static int d(byte b, int i) {
        return (b >> 1) & (PrivateKeyType.INVALID >>> (8 - i));
    }

    public static void b(oxn oxnVar) {
        int i;
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j = oxnVar.b;
            if (j != -1) {
                long j2 = oxnVar.c;
                if (i2 + j2 > j && (i2 = (int) (j - j2)) < 4) {
                    throw new EOFException();
                }
            }
            int i3 = 0;
            oxnVar.l(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        oxnVar.j(i3);
                        return;
                    }
                    i3++;
                }
            }
            oxnVar.j(i);
        }
    }
}
