package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cltg  reason: default package */
/* loaded from: classes5.dex */
public class cltg extends clta {
    public final cltc a = new cltc();
    public ByteBuffer b;
    public boolean c;
    public long d;
    public ByteBuffer e;
    private final int f;

    public cltg(int i) {
        this.f = i;
    }

    private final ByteBuffer e(int i) {
        int i2 = this.f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.b;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void a(int i) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.b = byteBuffer;
            return;
        }
        ByteBuffer e = e(i2);
        e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e.put(byteBuffer);
        }
        this.b = e;
    }

    public final boolean b() {
        return this.b == null && this.f == 0;
    }

    public final boolean c() {
        return getFlag(1073741824);
    }

    @Override // defpackage.clta
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.c = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
