package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: oug  reason: default package */
/* loaded from: classes4.dex */
public final class oug {
    public final osu a = new osu();
    public ByteBuffer b;
    public int c;
    public int d;
    public long e;
    private final int f;

    public oug(int i) {
        this.f = i;
    }

    private final ByteBuffer f(int i) {
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

    public final void a() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void b(int i) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = f(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.b.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer f = f(i2);
        if (position > 0) {
            this.b.position(0);
            this.b.limit(position);
            f.put(this.b);
        }
        this.b = f;
    }

    public final boolean c() {
        return (this.d & 134217728) != 0;
    }

    public final boolean d() {
        return (this.d & 2) != 0;
    }

    public final boolean e() {
        return (this.d & 1) != 0;
    }
}
