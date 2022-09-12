package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: cmaq  reason: default package */
/* loaded from: classes5.dex */
final class cmaq implements cmap {
    private final clup a;
    private final clvk b;
    private final cmas c;
    private final Format d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public cmaq(clup clupVar, clvk clvkVar, cmas cmasVar, String str, int i) {
        this.a = clupVar;
        this.b = clvkVar;
        this.c = cmasVar;
        int i2 = (cmasVar.b * cmasVar.e) / 8;
        int i3 = cmasVar.d;
        if (i3 == i2) {
            int i4 = cmasVar.c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.e = max;
            clnf clnfVar = new clnf();
            clnfVar.k = str;
            clnfVar.f = i5;
            clnfVar.g = i5;
            clnfVar.l = max;
            clnfVar.x = cmasVar.b;
            clnfVar.y = cmasVar.c;
            clnfVar.z = i;
            this.d = clnfVar.a();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw new clob(sb.toString());
    }

    @Override // defpackage.cmap
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.cmap
    public final void b(int i, long j) {
        this.a.b(new cmav(this.c, 1, i, j));
        this.b.a(this.d);
    }

    @Override // defpackage.cmap
    public final boolean c(cluk clukVar, long j) {
        cmas cmasVar;
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.g) < (i2 = this.e)) {
            int c = this.b.c(clukVar, (int) Math.min(i2 - i, j3), true);
            if (c == -1) {
                j3 = 0;
            } else {
                this.g += c;
                j3 -= c;
            }
        }
        int i3 = this.c.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j4 = this.f;
            long E = cmny.E(this.h, 1000000L, cmasVar.c);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.b(j4 + E, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
