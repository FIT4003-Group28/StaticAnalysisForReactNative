package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: dcyu  reason: default package */
/* loaded from: classes5.dex */
abstract class dcyu extends dcyq {
    private final ByteBuffer a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcyu() {
        dbsk.a(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void m() {
        if (this.a.remaining() < 8) {
            n();
        }
    }

    private final void n() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            b(this.a);
        }
        this.a.compact();
    }

    private final void o(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.a.remaining()) {
            this.a.put(byteBuffer);
            m();
            return;
        }
        int position = 16 - this.a.position();
        for (int i = 0; i < position; i++) {
            this.a.put(byteBuffer.get());
        }
        n();
        while (byteBuffer.remaining() >= 16) {
            b(byteBuffer);
        }
        this.a.put(byteBuffer);
    }

    protected abstract void b(ByteBuffer byteBuffer);

    @Override // defpackage.dczb
    public final void d(byte b) {
        this.a.put(b);
        m();
    }

    protected void e(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            o(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void g(byte[] bArr, int i) {
        o(ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void h(int i) {
        this.a.putInt(i);
        m();
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void i(long j) {
        this.a.putLong(j);
        m();
    }

    protected abstract dcyz l();

    @Override // defpackage.dczb
    public final dcyz p() {
        n();
        this.a.flip();
        if (this.a.remaining() > 0) {
            e(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return l();
    }
}
