package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: clsd  reason: default package */
/* loaded from: classes5.dex */
final class clsd extends clsc {
    public int[] e;
    private int[] f;

    @Override // defpackage.clrh
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) cmmn.f(this.f);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i = i(((limit - position) / this.b.e) * this.c.e);
        while (position < limit) {
            for (int i2 : iArr) {
                i.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.b.e;
        }
        byteBuffer.position(limit);
        i.flip();
    }

    @Override // defpackage.clsc
    public final clrf j(clrf clrfVar) {
        int[] iArr = this.e;
        if (iArr == null) {
            return clrf.a;
        }
        if (clrfVar.d != 2) {
            throw new clrg(clrfVar);
        }
        boolean z = clrfVar.c != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new clrf(clrfVar.b, length, 2) : clrf.a;
            }
            int i2 = iArr[i];
            if (i2 >= clrfVar.c) {
                throw new clrg(clrfVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // defpackage.clsc
    protected final void l() {
        this.f = this.e;
    }

    @Override // defpackage.clsc
    protected final void m() {
        this.f = null;
        this.e = null;
    }
}
