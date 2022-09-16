package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pmk  reason: default package */
/* loaded from: classes4.dex */
public final class pmk extends pls {
    public boolean a;
    public long b;
    private int c;
    private byte[] d;
    private byte[] e;
    private int j;
    private int k;
    private int l;
    private boolean m;

    public pmk() {
        ptx.c(true);
        this.d = pxi.f;
        this.e = pxi.f;
    }

    private final int b(long j) {
        return (int) ((j * this.g.b) / 1000000);
    }

    private final int c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.c;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private final void g(byte[] bArr, int i) {
        q(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.m = true;
        }
    }

    private final void i(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.l);
        int i2 = this.l - min;
        System.arraycopy(bArr, i - i2, this.e, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.e, i2, min);
    }

    @Override // defpackage.pls
    public final pkw a(pkw pkwVar) {
        if (pkwVar.d == 2) {
            return this.a ? pkwVar : pkw.a;
        }
        throw new pkx(pkwVar);
    }

    @Override // defpackage.pls
    protected final void d() {
        if (this.a) {
            this.c = this.g.e;
            int b = b(150000L) * this.c;
            if (this.d.length != b) {
                this.d = new byte[b];
            }
            int b2 = b(20000L) * this.c;
            this.l = b2;
            if (this.e.length != b2) {
                this.e = new byte[b2];
            }
        }
        this.j = 0;
        this.b = 0L;
        this.k = 0;
        this.m = false;
    }

    @Override // defpackage.pls
    protected final void e() {
        int i = this.k;
        if (i > 0) {
            g(this.d, i);
        }
        if (!this.m) {
            this.b += this.l / this.c;
        }
    }

    @Override // defpackage.pls
    protected final void f() {
        this.a = false;
        this.l = 0;
        this.d = pxi.f;
        this.e = pxi.f;
    }

    @Override // defpackage.pky
    public final void h(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.i.hasRemaining()) {
            int i = this.j;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.d.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.c;
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
                    q(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.m = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int c = c(byteBuffer);
                int position2 = c - byteBuffer.position();
                byte[] bArr = this.d;
                int length = bArr.length;
                int i3 = this.k;
                int i4 = length - i3;
                if (c >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.d, this.k, min);
                    int i5 = this.k + min;
                    this.k = i5;
                    byte[] bArr2 = this.d;
                    if (i5 == bArr2.length) {
                        if (this.m) {
                            g(bArr2, this.l);
                            long j = this.b;
                            int i6 = this.k;
                            int i7 = this.l;
                            this.b = j + ((i6 - (i7 + i7)) / this.c);
                            i5 = i6;
                        } else {
                            this.b += (i5 - this.l) / this.c;
                        }
                        i(byteBuffer, this.d, i5);
                        this.k = 0;
                        this.j = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    g(bArr, i3);
                    this.k = 0;
                    this.j = 0;
                }
            } else {
                int limit4 = byteBuffer.limit();
                int c2 = c(byteBuffer);
                byteBuffer.limit(c2);
                this.b += byteBuffer.remaining() / this.c;
                i(byteBuffer, this.e, this.l);
                if (c2 < limit4) {
                    g(this.e, this.l);
                    this.j = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // defpackage.pls, defpackage.pky
    public final boolean o() {
        return this.a;
    }
}
