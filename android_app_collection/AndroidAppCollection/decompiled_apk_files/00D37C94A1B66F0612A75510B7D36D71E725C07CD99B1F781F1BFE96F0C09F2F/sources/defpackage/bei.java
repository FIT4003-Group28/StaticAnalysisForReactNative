package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bei  reason: default package */
/* loaded from: classes2.dex */
final class bei implements bej {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final azh c;
    private final bab d;
    private final bem e;
    private final int f;
    private final byte[] g;
    private final pwu h;
    private final int i;
    private final Format j;
    private int k;
    private long l;
    private int m;
    private long n;

    public bei(azh azhVar, bab babVar, bem bemVar) {
        this.c = azhVar;
        this.d = babVar;
        this.e = bemVar;
        int max = Math.max(1, bemVar.c / 10);
        this.i = max;
        pwu pwuVar = new pwu(bemVar.f);
        pwuVar.g();
        int g = pwuVar.g();
        this.f = g;
        int i = bemVar.b;
        int i2 = (((bemVar.d - (i * 4)) * 8) / (bemVar.e * i)) + 1;
        if (g != i2) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(g);
            throw pjq.a(sb.toString(), null);
        }
        int b2 = pxi.b(max, g);
        this.g = new byte[bemVar.d * b2];
        this.h = new pwu(b2 * (g + g) * i);
        int i3 = ((bemVar.c * bemVar.d) * 8) / g;
        pis pisVar = new pis();
        pisVar.k = "audio/raw";
        pisVar.f = i3;
        pisVar.g = i3;
        pisVar.l = (max + max) * i;
        pisVar.x = bemVar.b;
        pisVar.y = bemVar.c;
        pisVar.z = 2;
        this.j = pisVar.a();
    }

    private final int d(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int e(int i) {
        return (i + i) * this.e.b;
    }

    private final void f(int i) {
        long j = this.l;
        long n = pxi.n(this.n, 1000000L, this.e.c);
        int e = e(i);
        this.d.e(j + n, 1, e, this.m - e, null);
        this.n += i;
        this.m -= e;
    }

    @Override // defpackage.bej
    public final void a(int i, long j) {
        this.c.ry(new ben(this.e, this.f, i, j));
        this.d.rx(this.j);
    }

    @Override // defpackage.bej
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // defpackage.bej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.azf r20, long r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bei.c(azf, long):boolean");
    }
}
