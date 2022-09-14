package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cnka  reason: default package */
/* loaded from: classes.dex */
final class cnka implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int min = Math.min(bArr3.length, bArr4.length);
        for (int i = 0; i < min; i++) {
            byte b = bArr3[i];
            byte b2 = bArr4[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return bArr3.length - bArr4.length;
    }
}
