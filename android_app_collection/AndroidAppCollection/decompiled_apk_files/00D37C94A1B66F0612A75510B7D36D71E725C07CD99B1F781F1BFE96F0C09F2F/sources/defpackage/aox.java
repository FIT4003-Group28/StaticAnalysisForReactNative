package defpackage;

import android.system.Os;
import java.io.FileDescriptor;
/* compiled from: PG */
/* renamed from: aox  reason: default package */
/* loaded from: classes.dex */
final class aox {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, 0L, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 4; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
