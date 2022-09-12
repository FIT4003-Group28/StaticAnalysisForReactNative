package defpackage;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsz  reason: default package */
/* loaded from: classes5.dex */
public final class clsz extends clsc {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = cmny.f;
    private int k;

    @Override // defpackage.clrh
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.i);
        this.g += min / this.b.e;
        this.i -= min;
        byteBuffer.position(position + min);
        if (this.i > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.k + i2) - this.j.length;
        ByteBuffer i3 = i(length);
        int B = cmny.B(length, 0, this.k);
        i3.put(this.j, 0, B);
        int B2 = cmny.B(length - B, 0, i2);
        byteBuffer.limit(byteBuffer.position() + B2);
        i3.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i2 - B2;
        int i5 = this.k - B;
        this.k = i5;
        byte[] bArr = this.j;
        System.arraycopy(bArr, B, bArr, 0, i5);
        byteBuffer.get(this.j, this.k, i4);
        this.k += i4;
        i3.flip();
    }

    @Override // defpackage.clsc, defpackage.clrh
    public final ByteBuffer e() {
        int i;
        if (super.f() && (i = this.k) > 0) {
            i(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.e();
    }

    @Override // defpackage.clsc, defpackage.clrh
    public final boolean f() {
        return super.f() && this.k == 0;
    }

    @Override // defpackage.clsc
    public final clrf j(clrf clrfVar) {
        if (clrfVar.d == 2) {
            this.h = true;
            return (this.e == 0 && this.f == 0) ? clrf.a : clrfVar;
        }
        throw new clrg(clrfVar);
    }

    @Override // defpackage.clsc
    protected final void k() {
        int i;
        if (this.h) {
            if (this.k > 0) {
                this.g += i / this.b.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.clsc
    protected final void l() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.clsc
    protected final void m() {
        this.j = cmny.f;
    }
}
