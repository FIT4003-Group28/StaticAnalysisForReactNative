package org.spongycastle.pqc.crypto.newhope;

import com.baidu.mapapi.UIMsg;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
class ErrorCorrection {
    static int abs(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    ErrorCorrection() {
    }

    static int f(int[] iArr, int i, int i2, int i3) {
        int i4 = (i3 * 2730) >> 25;
        int i5 = i4 - ((12288 - (i3 - (i4 * UIMsg.k_event.MV_MAP_CACHEMANAGE))) >> 31);
        iArr[i] = (i5 >> 1) + (i5 & 1);
        int i6 = i5 - 1;
        iArr[i2] = (i6 >> 1) + (i6 & 1);
        return abs(i3 - ((iArr[i] * 2) * UIMsg.k_event.MV_MAP_CACHEMANAGE));
    }

    static int g(int i) {
        int i2 = (i * 2730) >> 27;
        int i3 = i2 - ((CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA - (i - (CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA * i2))) >> 31);
        return abs((((i3 >> 1) + (i3 & 1)) * 98312) - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b2;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, bArr3.length);
        int[] iArr = new int[8];
        int i = 4;
        int[] iArr2 = new int[4];
        int i2 = 0;
        while (i2 < 256) {
            int i3 = i2 + 0;
            int i4 = ((bArr3[i2 >>> 3] >>> (i2 & 7)) & 1) * 4;
            int i5 = i2 + 256;
            int i6 = i2 + 512;
            int i7 = i2 + 768;
            int f = (24577 - (((f(iArr, 0, i, (sArr2[i3] * 8) + i4) + f(iArr, 1, 5, (sArr2[i5] * 8) + i4)) + f(iArr, 2, 6, (sArr2[i6] * 8) + i4)) + f(iArr, 3, 7, i4 + (sArr2[i7] * 8)))) >> 31;
            int i8 = ~f;
            iArr2[0] = (iArr[0] & i8) ^ (f & iArr[4]);
            iArr2[1] = (i8 & iArr[1]) ^ (iArr[5] & f);
            iArr2[2] = (iArr[2] & i8) ^ (iArr[6] & f);
            iArr2[3] = (iArr[7] & f) ^ (i8 & iArr[3]);
            sArr[i3] = (short) ((iArr2[0] - iArr2[3]) & 3);
            sArr[i5] = (short) ((iArr2[1] - iArr2[3]) & 3);
            sArr[i6] = (short) ((iArr2[2] - iArr2[3]) & 3);
            sArr[i7] = (short) (((-f) + (iArr2[3] * 2)) & 3);
            i2++;
            i = 4;
        }
    }

    static short LDDecode(int i, int i2, int i3, int i4) {
        return (short) (((((g(i) + g(i2)) + g(i3)) + g(i4)) - 98312) >>> 31);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        int[] iArr = new int[4];
        for (int i = 0; i < 256; i++) {
            int i2 = i + 0;
            int i3 = i + 768;
            iArr[0] = ((sArr[i2] * 8) + 196624) - (((sArr2[i2] * 2) + sArr2[i3]) * UIMsg.k_event.MV_MAP_CACHEMANAGE);
            int i4 = i + 256;
            iArr[1] = ((sArr[i4] * 8) + 196624) - (((sArr2[i4] * 2) + sArr2[i3]) * UIMsg.k_event.MV_MAP_CACHEMANAGE);
            int i5 = i + 512;
            iArr[2] = ((sArr[i5] * 8) + 196624) - (((sArr2[i5] * 2) + sArr2[i3]) * UIMsg.k_event.MV_MAP_CACHEMANAGE);
            iArr[3] = ((sArr[i3] * 8) + 196624) - (sArr2[i3] * 12289);
            int i6 = i >>> 3;
            bArr[i6] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i & 7)) | bArr[i6]);
        }
    }
}
