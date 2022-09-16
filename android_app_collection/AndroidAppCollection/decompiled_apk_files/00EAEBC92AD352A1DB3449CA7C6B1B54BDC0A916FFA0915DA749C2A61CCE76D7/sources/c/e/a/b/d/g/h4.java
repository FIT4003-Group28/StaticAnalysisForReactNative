package c.e.a.b.d.g;
/* loaded from: classes.dex */
public abstract class h4 {
    private h4() {
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h4 a(byte[] bArr, int i, int i2, boolean z) {
        i4 i4Var = new i4(bArr, 0, i2, false);
        try {
            i4Var.b(i2);
            return i4Var;
        } catch (j5 e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
