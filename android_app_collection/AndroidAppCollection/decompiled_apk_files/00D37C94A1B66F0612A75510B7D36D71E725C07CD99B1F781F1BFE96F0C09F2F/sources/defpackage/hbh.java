package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: hbh  reason: default package */
/* loaded from: classes3.dex */
public final class hbh extends pls {
    public int a;
    public int b;
    public int c;
    public int d;
    pmm e;
    private final hbg j;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private hbf t;
    private int s = 0;
    private ByteBuffer k = pky.f;

    public hbh(hbg hbgVar) {
        this.j = hbgVar;
    }

    private final void r() {
        this.q = false;
        this.r = false;
        this.k = pky.f;
        this.o = false;
        this.p = false;
        this.s = 0;
    }

    @Override // defpackage.pls
    public final pkw a(pkw pkwVar) {
        if (pkwVar.d != 2) {
            throw new pkx(pkwVar);
        }
        if (pkwVar.b != this.d) {
            zep.b("Primary input source sample rate does not equal output sample rate");
            return pkw.a;
        }
        this.l = pkwVar.c;
        c();
        return this.b >= 2 ? new pkw(this.d, this.a, pkwVar.d) : pkw.a;
    }

    public final synchronized void b() {
        this.r = true;
        if (this.q) {
            r();
        }
    }

    public final void c() {
        if (this.l <= 0 || this.c <= 0) {
            return;
        }
        int i = this.a;
        if (i > 2 || i <= 0) {
            throw new UnsupportedOperationException("StereoChannelMapper should have no more than 2 output audio tracks");
        }
        hbf hbfVar = new hbf(i);
        this.t = hbfVar;
        this.m = hbfVar.a(this.l);
        this.n = this.t.a(this.c);
    }

    @Override // defpackage.pls
    protected final synchronized void d() {
        this.q = true;
        if (this.r) {
            r();
        }
    }

    @Override // defpackage.pls
    protected final synchronized void e() {
        this.o = true;
    }

    @Override // defpackage.pls
    protected final void f() {
        this.k = pky.f;
        this.o = false;
        this.p = false;
        this.e = null;
        this.s = 0;
    }

    public final synchronized void g() {
        this.p = true;
    }

    @Override // defpackage.pky
    public final synchronized void h(ByteBuffer byteBuffer) {
        int i;
        this.s = 0;
        if (!this.o && this.t != null) {
            int i2 = this.l;
            int i3 = i2 + i2;
            int i4 = this.c;
            int i5 = i4 + i4;
            int remaining = byteBuffer.remaining() / i3;
            int remaining2 = this.k.remaining() / i5;
            if (this.p) {
                i = byteBuffer.remaining();
            } else {
                int max = Math.max(remaining, remaining2) * this.a;
                i = max + max;
            }
            ByteBuffer q = q(i);
            hbf hbfVar = this.t;
            hbe hbeVar = hbfVar.c;
            if (hbeVar == null) {
                hbfVar.c = new hbe(hbfVar);
                hbeVar = hbfVar.c;
            }
            while (byteBuffer.remaining() >= i3 && (this.k.remaining() >= i5 || this.p)) {
                for (int i6 = 0; i6 < this.a; i6++) {
                    q.putShort((short) (((short) Math.round(s(i6, this.m, byteBuffer, hbeVar, i3) * this.j.a)) + ((short) Math.round(s(i6, this.n, this.k, hbeVar, i5) * (1.0f - this.j.a)))));
                }
                byteBuffer.position(byteBuffer.position() + i3);
                if (this.k.remaining() >= i5) {
                    ByteBuffer byteBuffer2 = this.k;
                    byteBuffer2.position(byteBuffer2.position() + i5);
                }
            }
            this.k.compact();
            this.k.flip();
            q.flip();
        }
    }

    public final synchronized void i(ByteBuffer byteBuffer) {
        if (this.c > 0 && !this.p) {
            int remaining = this.k.remaining();
            int i = this.c;
            if (remaining > i + i) {
                if (this.o) {
                    byteBuffer.position(byteBuffer.limit());
                    this.s = 0;
                    return;
                }
                int i2 = this.s;
                if (i2 < 50) {
                    this.s = i2 + 1;
                    return;
                }
                zep.b("Too many calls to queueSecondaryBuffer were not accepted, forcing a flush");
                r();
                return;
            }
            this.k.flip();
            pmm pmmVar = this.e;
            if (pmmVar != null) {
                pmmVar.h(byteBuffer);
                byteBuffer = this.e.k();
            }
            int remaining2 = byteBuffer.remaining() - this.k.remaining();
            if (remaining2 > 0) {
                ByteBuffer order = ByteBuffer.allocateDirect(remaining2 + this.k.capacity()).order(ByteOrder.nativeOrder());
                order.put(this.k);
                this.k = order;
            }
            this.k.put(byteBuffer);
            this.k.flip();
            this.s = 0;
        }
    }

    private static short s(int i, int i2, ByteBuffer byteBuffer, hbe hbeVar, int i3) {
        hbf hbfVar = hbeVar.a;
        int[] iArr = null;
        if (i2 >= 0 && i2 <= 1 && i >= 0 && i <= 1) {
            iArr = new int[1];
            if (((Integer) hbfVar.b.get(i2)).intValue() == 1) {
                iArr[0] = 0;
            } else {
                iArr[0] = i;
            }
        }
        if (byteBuffer.remaining() < i3 || iArr == null) {
            return (short) 0;
        }
        short s = 0;
        for (int i4 = 0; i4 <= 0; i4++) {
            int i5 = iArr[i4];
            s = (short) (s + byteBuffer.getShort(byteBuffer.position() + i5 + i5));
        }
        return s;
    }
}
