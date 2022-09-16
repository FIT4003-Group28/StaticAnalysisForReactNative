package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: PG */
/* renamed from: oyc  reason: default package */
/* loaded from: classes4.dex */
public final class oyc {
    public final int a;
    public final oya b;
    public final LinkedBlockingDeque c;
    public final oyb d;
    public final pct e;
    public long f;
    public long g;
    public int h;
    public final pbo i;
    public anuf j;

    public oyc(pbo pboVar) {
        this.i = pboVar;
        int i = pboVar.a;
        this.a = i;
        this.b = new oya();
        this.c = new LinkedBlockingDeque();
        this.d = new oyb();
        this.e = new pct(32);
        this.h = i;
    }

    public final int a(int i) {
        if (this.h == this.a) {
            this.h = 0;
            anuf d = this.i.d();
            this.j = d;
            this.c.add(d);
        }
        return Math.min(i, this.a - this.h);
    }

    public final void b(long j) {
        int i = ((int) (j - this.f)) / this.a;
        for (int i2 = 0; i2 < i; i2++) {
            this.i.e((anuf) this.c.remove());
            this.f += this.a;
        }
    }

    public final void c(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            b(j);
            int i3 = (int) (j - this.f);
            int min = Math.min(i - i2, this.a - i3);
            System.arraycopy(((anuf) this.c.peek()).a, i3, bArr, i2, min);
            j += min;
            i2 += min;
        }
    }

    public final void d() {
        b(this.b.b());
    }

    public final boolean e(oug ougVar) {
        return this.b.e(ougVar, this.d);
    }
}
