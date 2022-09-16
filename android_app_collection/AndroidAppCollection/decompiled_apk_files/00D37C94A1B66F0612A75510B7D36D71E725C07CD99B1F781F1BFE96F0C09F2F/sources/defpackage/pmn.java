package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pmn  reason: default package */
/* loaded from: classes4.dex */
final class pmn extends pls {
    public int a;
    public int b;
    public long c;
    private boolean d;
    private int e;
    private byte[] j = pxi.f;
    private int k;

    @Override // defpackage.pls
    public final pkw a(pkw pkwVar) {
        if (pkwVar.d == 2) {
            this.d = true;
            return (this.a == 0 && this.b == 0) ? pkw.a : pkwVar;
        }
        throw new pkx(pkwVar);
    }

    @Override // defpackage.pls
    protected final void d() {
        if (this.d) {
            this.d = false;
            int i = this.b;
            int i2 = this.g.e;
            this.j = new byte[i * i2];
            this.e = this.a * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.pls
    protected final void e() {
        int i;
        if (this.d) {
            if (this.k > 0) {
                this.c += i / this.g.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.pls
    protected final void f() {
        this.j = pxi.f;
    }

    @Override // defpackage.pky
    public final void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.e);
        this.c += min / this.g.e;
        this.e -= min;
        byteBuffer.position(position + min);
        if (this.e > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.k + i2) - this.j.length;
        ByteBuffer q = q(length);
        int c = pxi.c(length, 0, this.k);
        q.put(this.j, 0, c);
        int c2 = pxi.c(length - c, 0, i2);
        byteBuffer.limit(byteBuffer.position() + c2);
        q.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - c2;
        int i4 = this.k - c;
        this.k = i4;
        byte[] bArr = this.j;
        System.arraycopy(bArr, c, bArr, 0, i4);
        byteBuffer.get(this.j, this.k, i3);
        this.k += i3;
        q.flip();
    }

    @Override // defpackage.pls, defpackage.pky
    public final ByteBuffer k() {
        int i;
        if (super.p() && (i = this.k) > 0) {
            q(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.k();
    }

    @Override // defpackage.pls, defpackage.pky
    public final boolean p() {
        return super.p() && this.k == 0;
    }
}
