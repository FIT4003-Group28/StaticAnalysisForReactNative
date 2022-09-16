package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: plt  reason: default package */
/* loaded from: classes4.dex */
final class plt extends pls {
    public int[] a;
    private int[] b;

    @Override // defpackage.pls
    public final pkw a(pkw pkwVar) {
        int[] iArr = this.a;
        if (iArr == null) {
            return pkw.a;
        }
        if (pkwVar.d != 2) {
            throw new pkx(pkwVar);
        }
        boolean z = pkwVar.c != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new pkw(pkwVar.b, length, 2) : pkw.a;
            }
            int i2 = iArr[i];
            if (i2 >= pkwVar.c) {
                throw new pkx(pkwVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // defpackage.pls
    protected final void d() {
        this.b = this.a;
    }

    @Override // defpackage.pls
    protected final void f() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.pky
    public final void h(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ptx.a(this.b);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer q = q(((limit - position) / this.g.e) * this.h.e);
        while (position < limit) {
            for (int i : iArr) {
                q.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.g.e;
        }
        byteBuffer.position(limit);
        q.flip();
    }
}
