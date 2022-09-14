package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: ald  reason: default package */
/* loaded from: classes2.dex */
final class ald implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int length = bArr3.length;
        int length2 = bArr4.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i = 0; i < bArr3.length; i++) {
            byte b = bArr3[i];
            byte b2 = bArr4[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}
