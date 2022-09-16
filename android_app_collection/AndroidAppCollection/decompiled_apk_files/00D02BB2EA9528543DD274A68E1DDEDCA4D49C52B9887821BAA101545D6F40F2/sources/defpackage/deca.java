package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: deca  reason: default package */
/* loaded from: classes6.dex */
public final class deca {
    public static int a(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] b(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length);
            i2 += length;
        }
        return bArr3;
    }

    public static byte[] c(Collection<? extends Number> collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            dbsk.s(obj);
            bArr[i] = ((Number) obj).byteValue();
        }
        return bArr;
    }
}
