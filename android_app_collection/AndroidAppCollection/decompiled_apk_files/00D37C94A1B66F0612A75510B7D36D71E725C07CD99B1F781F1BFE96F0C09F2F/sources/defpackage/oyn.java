package defpackage;

import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: oyn  reason: default package */
/* loaded from: classes4.dex */
final class oyn {
    private static final int a = pcx.c("ID3");
    private static final Charset[] b = {Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName("UTF-8")};

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
        if (r14.a() < r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oxy a(defpackage.oxn r17) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyn.a(oxn):oxy");
    }

    private static void b(pct pctVar, boolean z) {
        int i;
        pctVar.z(0);
        byte[] bArr = pctVar.a;
        while (pctVar.a() >= 10 && pctVar.c() != 0) {
            int j = z ? pctVar.j() : pctVar.g();
            int k = pctVar.k();
            if ((k & 1) != 0) {
                int i2 = pctVar.b;
                System.arraycopy(bArr, i2 + 4, bArr, i2, pctVar.a() - 4);
                j -= 4;
                i = k & (-2);
                pctVar.y(pctVar.c - 4);
            } else {
                i = k;
            }
            if ((i & 2) != 0) {
                int i3 = pctVar.b + 1;
                int i4 = i3;
                int i5 = 0;
                while (true) {
                    i5++;
                    if (i5 >= j) {
                        break;
                    }
                    if ((bArr[i3 - 1] & 255) == 255 && bArr[i3] == 0) {
                        i3++;
                        j--;
                    }
                    bArr[i4] = bArr[i3];
                    i4++;
                    i3++;
                }
                pctVar.y(pctVar.c - (i3 - i4));
                System.arraycopy(bArr, i3, bArr, i4, pctVar.a() - i3);
                i &= -3;
            }
            if (i != k || z) {
                int i6 = pctVar.b - 6;
                bArr[i6] = (byte) ((j >> 21) & 127);
                bArr[i6 + 1] = (byte) ((j >> 14) & 127);
                bArr[i6 + 2] = (byte) ((j >> 7) & 127);
                bArr[i6 + 3] = (byte) (j & 127);
                bArr[i6 + 4] = (byte) (i >> 8);
                bArr[i6 + 5] = (byte) (i & PrivateKeyType.INVALID);
            }
            pctVar.A(j);
        }
    }

    private static boolean c(pct pctVar, boolean z) {
        pctVar.z(0);
        while (pctVar.a() >= 10 && pctVar.c() != 0) {
            long n = pctVar.n();
            if (!z) {
                if ((8421504 & n) != 0) {
                    return false;
                }
                n = (((n >> 24) & 127) << 21) | (n & 127) | (((n >> 8) & 127) << 7) | (((n >> 16) & 127) << 14);
            }
            if (n > pctVar.a() - 2) {
                return false;
            }
            if ((1 & pctVar.k()) != 0 && pctVar.a() < 4) {
                return false;
            }
            pctVar.A((int) n);
        }
        return true;
    }
}
