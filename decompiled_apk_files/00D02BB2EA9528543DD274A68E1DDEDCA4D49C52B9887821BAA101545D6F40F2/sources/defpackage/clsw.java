package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: clsw  reason: default package */
/* loaded from: classes5.dex */
public final class clsw extends clsc {
    public boolean e;
    public long f;
    private int g;
    private byte[] h;
    private byte[] i;
    private int j;
    private int k;
    private int l;
    private boolean m;

    public clsw() {
        cmmn.a(true);
        this.h = cmny.f;
        this.i = cmny.f;
    }

    private final void n(byte[] bArr, int i) {
        i(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.m = true;
        }
    }

    private final void o(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.l);
        int i2 = this.l - min;
        System.arraycopy(bArr, i - i2, this.i, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.i, i2, min);
    }

    private final int p(long j) {
        return (int) ((j * this.b.b) / 1000000);
    }

    private final int q(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.g;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    @Override // defpackage.clsc, defpackage.clrh
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.clrh
    public final void c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            int i = this.j;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.h.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.g;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.j = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    i(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.m = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int q = q(byteBuffer);
                int position2 = q - byteBuffer.position();
                byte[] bArr = this.h;
                int length = bArr.length;
                int i3 = this.k;
                int i4 = length - i3;
                if (q >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.h, this.k, min);
                    int i5 = this.k + min;
                    this.k = i5;
                    byte[] bArr2 = this.h;
                    if (i5 == bArr2.length) {
                        if (this.m) {
                            n(bArr2, this.l);
                            long j = this.f;
                            int i6 = this.k;
                            int i7 = this.l;
                            this.f = j + ((i6 - (i7 + i7)) / this.g);
                            i5 = i6;
                        } else {
                            this.f += (i5 - this.l) / this.g;
                        }
                        o(byteBuffer, this.h, i5);
                        this.k = 0;
                        this.j = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    n(bArr, i3);
                    this.k = 0;
                    this.j = 0;
                }
            } else {
                int limit4 = byteBuffer.limit();
                int q2 = q(byteBuffer);
                byteBuffer.limit(q2);
                this.f += byteBuffer.remaining() / this.g;
                o(byteBuffer, this.i, this.l);
                if (q2 < limit4) {
                    n(this.i, this.l);
                    this.j = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // defpackage.clsc
    public final clrf j(clrf clrfVar) {
        if (clrfVar.d == 2) {
            return this.e ? clrfVar : clrf.a;
        }
        throw new clrg(clrfVar);
    }

    @Override // defpackage.clsc
    protected final void k() {
        int i = this.k;
        if (i > 0) {
            n(this.h, i);
        }
        if (!this.m) {
            this.f += this.l / this.g;
        }
    }

    @Override // defpackage.clsc
    protected final void l() {
        if (this.e) {
            this.g = this.b.e;
            int p = p(150000L) * this.g;
            if (this.h.length != p) {
                this.h = new byte[p];
            }
            int p2 = p(20000L) * this.g;
            this.l = p2;
            if (this.i.length != p2) {
                this.i = new byte[p2];
            }
        }
        this.j = 0;
        this.f = 0L;
        this.k = 0;
        this.m = false;
    }

    @Override // defpackage.clsc
    protected final void m() {
        this.e = false;
        this.l = 0;
        this.h = cmny.f;
        this.i = cmny.f;
    }
}
