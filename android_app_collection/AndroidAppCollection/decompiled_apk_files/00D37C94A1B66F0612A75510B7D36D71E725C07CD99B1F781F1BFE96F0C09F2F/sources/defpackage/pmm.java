package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* compiled from: PG */
/* renamed from: pmm  reason: default package */
/* loaded from: classes4.dex */
public final class pmm implements pky {
    public int a;
    public boolean g;
    public pml h;
    public long i;
    public long j;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;
    public float b = 1.0f;
    public float c = 1.0f;
    private pkw k = pkw.a;
    private pkw l = pkw.a;
    public pkw d = pkw.a;
    public pkw e = pkw.a;

    public pmm() {
        ByteBuffer byteBuffer = f;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = f;
        this.a = -1;
    }

    public final void a(float f) {
        if (this.b != f) {
            this.b = f;
            this.g = true;
        }
    }

    @Override // defpackage.pky
    public final void h(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        pml pmlVar = this.h;
        ptx.a(pmlVar);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.i += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = pmlVar.a;
        int i2 = remaining2 / i;
        int i3 = i * i2;
        pmlVar.f = pmlVar.c(pmlVar.f, pmlVar.g, i2);
        asShortBuffer.get(pmlVar.f, pmlVar.g * pmlVar.a, (i3 + i3) / 2);
        pmlVar.g += i2;
        pmlVar.b();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // defpackage.pky
    public final pkw j(pkw pkwVar) {
        if (pkwVar.d == 2) {
            int i = this.a;
            if (i == -1) {
                i = pkwVar.b;
            }
            this.k = pkwVar;
            pkw pkwVar2 = new pkw(i, pkwVar.c, 2);
            this.l = pkwVar2;
            this.g = true;
            return pkwVar2;
        }
        throw new pkx(pkwVar);
    }

    @Override // defpackage.pky
    public final ByteBuffer k() {
        int a;
        pml pmlVar = this.h;
        if (pmlVar != null && (a = pmlVar.a()) > 0) {
            if (this.m.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.m = order;
                this.n = order.asShortBuffer();
            } else {
                this.m.clear();
                this.n.clear();
            }
            ShortBuffer shortBuffer = this.n;
            int min = Math.min(shortBuffer.remaining() / pmlVar.a, pmlVar.i);
            shortBuffer.put(pmlVar.h, 0, pmlVar.a * min);
            int i = pmlVar.i - min;
            pmlVar.i = i;
            short[] sArr = pmlVar.h;
            int i2 = pmlVar.a;
            System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
            this.j += a;
            this.m.limit(a);
            this.o = this.m;
        }
        ByteBuffer byteBuffer = this.o;
        this.o = f;
        return byteBuffer;
    }

    @Override // defpackage.pky
    public final void l() {
        if (o()) {
            this.d = this.k;
            this.e = this.l;
            if (this.g) {
                pkw pkwVar = this.d;
                this.h = new pml(pkwVar.b, pkwVar.c, this.b, this.c, this.e.b);
            } else {
                pml pmlVar = this.h;
                if (pmlVar != null) {
                    pmlVar.g = 0;
                    pmlVar.i = 0;
                    pmlVar.j = 0;
                    pmlVar.k = 0;
                    pmlVar.l = 0;
                    pmlVar.m = 0;
                    pmlVar.n = 0;
                    pmlVar.o = 0;
                    pmlVar.p = 0;
                    pmlVar.q = 0;
                }
            }
        }
        this.o = f;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }

    @Override // defpackage.pky
    public final void m() {
        int i;
        pml pmlVar = this.h;
        if (pmlVar != null) {
            int i2 = pmlVar.g;
            float f = pmlVar.b;
            float f2 = pmlVar.c;
            int i3 = pmlVar.i + ((int) ((((i2 / (f / f2)) + pmlVar.j) / (pmlVar.d * f2)) + 0.5f));
            short[] sArr = pmlVar.f;
            int i4 = pmlVar.e;
            pmlVar.f = pmlVar.c(sArr, i2, i4 + i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = pmlVar.e;
                i = i6 + i6;
                int i7 = pmlVar.a;
                if (i5 >= i * i7) {
                    break;
                }
                pmlVar.f[(i7 * i2) + i5] = 0;
                i5++;
            }
            pmlVar.g += i;
            pmlVar.b();
            if (pmlVar.i > i3) {
                pmlVar.i = i3;
            }
            pmlVar.g = 0;
            pmlVar.m = 0;
            pmlVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.pky
    public final void n() {
        this.b = 1.0f;
        this.c = 1.0f;
        this.k = pkw.a;
        this.l = pkw.a;
        this.d = pkw.a;
        this.e = pkw.a;
        ByteBuffer byteBuffer = f;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = f;
        this.a = -1;
        this.g = false;
        this.h = null;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }

    @Override // defpackage.pky
    public final boolean o() {
        if (this.l.b != -1) {
            return Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b;
        }
        return false;
    }

    @Override // defpackage.pky
    public final boolean p() {
        pml pmlVar;
        return this.p && ((pmlVar = this.h) == null || pmlVar.a() == 0);
    }
}
