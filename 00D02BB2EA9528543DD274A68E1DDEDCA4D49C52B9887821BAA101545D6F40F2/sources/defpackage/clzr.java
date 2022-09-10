package defpackage;
/* compiled from: PG */
/* renamed from: clzr  reason: default package */
/* loaded from: classes5.dex */
final class clzr extends clug {
    public clzr(cmnv cmnvVar, long j, long j2) {
        super(new club(), new clzq(cmnvVar), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
