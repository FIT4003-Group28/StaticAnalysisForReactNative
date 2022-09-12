package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: dcyo  reason: default package */
/* loaded from: classes5.dex */
abstract class dcyo extends dcyq {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    private final void l(int i) {
        try {
            e(this.a.array(), i);
        } finally {
            this.a.clear();
        }
    }

    protected abstract void a(byte b);

    protected void b(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.dcyq
    public final dczb c(byte[] bArr) {
        dbsk.s(bArr);
        e(bArr, bArr.length);
        return this;
    }

    @Override // defpackage.dczb
    public final void d(byte b) {
        a(b);
    }

    protected void e(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void f(ByteBuffer byteBuffer) {
        b(byteBuffer);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void g(byte[] bArr, int i) {
        dbsk.u(0, i, bArr.length);
        e(bArr, i);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void h(int i) {
        this.a.putInt(i);
        l(4);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void i(long j) {
        this.a.putLong(j);
        l(8);
    }
}
