package defpackage;
/* compiled from: PG */
/* renamed from: cvgt  reason: default package */
/* loaded from: classes5.dex */
public final class cvgt {
    public static cvgs a(int i, byte[] bArr, byte[] bArr2, boolean z) {
        boolean z2 = true;
        dbsk.b(i > 0 && i <= 62, "bitWidth must be >0 and <= SecAggVector.MAX_BIT_WIDTH.");
        int length = bArr.length;
        if (length > 32) {
            z2 = false;
        }
        dbsk.h(z2, "The prfKey must be at most %s bytes long, but the supplied one was %s bytes.", 32, length);
        if (z) {
            return new cvgr(i, bArr, bArr2);
        }
        return new cvgq(i, bArr, bArr2);
    }
}
