package defpackage;
/* compiled from: PG */
/* renamed from: clwn  reason: default package */
/* loaded from: classes5.dex */
final class clwn {
    private static final long[] b = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    private final byte[] c = new byte[8];
    private int d;

    public static int b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((b[i2] & i) > 0L ? 1 : ((b[i2] & i) == 0L ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= b[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final void a() {
        this.d = 0;
        this.a = 0;
    }

    public final long d(cluk clukVar, boolean z, boolean z2, int i) {
        if (this.d == 0) {
            if (!clukVar.b(this.c, 0, 1, z)) {
                return -1L;
            }
            int b2 = b(this.c[0] & 255);
            this.a = b2;
            if (b2 != -1) {
                this.d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.a;
        if (i2 > i) {
            this.d = 0;
            return -2L;
        }
        if (i2 != 1) {
            clukVar.c(this.c, 1, i2 - 1);
        }
        this.d = 0;
        return c(this.c, this.a, z2);
    }
}
