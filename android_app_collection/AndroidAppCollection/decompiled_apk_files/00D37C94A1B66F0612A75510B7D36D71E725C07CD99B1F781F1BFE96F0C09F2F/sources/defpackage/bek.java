package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bek  reason: default package */
/* loaded from: classes2.dex */
final class bek implements bej {
    private final azh a;
    private final bab b;
    private final bem c;
    private final Format d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public bek(azh azhVar, bab babVar, bem bemVar, String str, int i) {
        this.a = azhVar;
        this.b = babVar;
        this.c = bemVar;
        int i2 = (bemVar.b * bemVar.e) / 8;
        int i3 = bemVar.d;
        if (i3 == i2) {
            int i4 = bemVar.c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.e = max;
            pis pisVar = new pis();
            pisVar.k = str;
            pisVar.f = i5;
            pisVar.g = i5;
            pisVar.l = max;
            pisVar.x = bemVar.b;
            pisVar.y = bemVar.c;
            pisVar.z = i;
            this.d = pisVar.a();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw pjq.a(sb.toString(), null);
    }

    @Override // defpackage.bej
    public final void a(int i, long j) {
        this.a.ry(new ben(this.c, 1, i, j));
        this.b.rx(this.d);
    }

    @Override // defpackage.bej
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.bej
    public final boolean c(azf azfVar, long j) {
        bem bemVar;
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.g) < (i2 = this.e)) {
            int a = this.b.a(azfVar, (int) Math.min(i2 - i, j3), true);
            if (a == -1) {
                j3 = 0;
            } else {
                this.g += a;
                j3 -= a;
            }
        }
        int i3 = this.c.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j4 = this.f;
            long n = pxi.n(this.h, 1000000L, bemVar.c);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.e(j4 + n, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
