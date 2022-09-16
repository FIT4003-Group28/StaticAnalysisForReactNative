package defpackage;

import java.nio.ShortBuffer;
/* compiled from: PG */
/* renamed from: vrg  reason: default package */
/* loaded from: classes4.dex */
final class vrg {
    public int a;
    public int b;
    private ShortBuffer c = ShortBuffer.allocate(4096);
    private long d = 0;

    private final synchronized ShortBuffer i(int i) {
        ShortBuffer shortBuffer;
        shortBuffer = this.c;
        if (shortBuffer.capacity() < i) {
            int capacity = this.c.capacity();
            while (true) {
                capacity += capacity;
                if (capacity >= i) {
                    break;
                }
            }
            int capacity2 = this.c.capacity();
            StringBuilder sb = new StringBuilder(51);
            sb.append("Buffer grown from ");
            sb.append(capacity2);
            sb.append(" to ");
            sb.append(capacity);
            sb.append(" shorts");
            vqy.a(sb.toString());
            shortBuffer = ShortBuffer.allocate(capacity);
            this.c.flip();
            shortBuffer.put(this.c);
        }
        return shortBuffer;
    }

    public final synchronized float a() {
        if (this.d < 0) {
            return 0.0f;
        }
        int b = b();
        if (vsc.f(this.b)) {
            return (this.c.get(b) + this.c.get(b + 1)) * 0.5f;
        }
        return this.c.get(b);
    }

    final synchronized int b() {
        return (((int) this.d) / this.a) * this.b;
    }

    public final int c() {
        return 7056000 / this.a;
    }

    public final synchronized long d() {
        return Math.max(0L, ((this.a <= 0 || this.b == 0) ? 0L : (this.c.position() / this.b) * this.a) - this.d);
    }

    public final synchronized void e(ShortBuffer shortBuffer) {
        int i = this.a;
        viu.f(i > 0, "Invalid ticksPerSample (%s)", Integer.valueOf(i));
        if (this.b == 0) {
            throw null;
        }
        viu.c(shortBuffer.remaining() % this.b == 0, "samplesBuffer does not have an even number remaining (%s)", Integer.valueOf(shortBuffer.remaining()));
        long position = (this.d / this.a) - (this.c.position() / this.b);
        if (position > 0) {
            long min = Math.min(position, shortBuffer.remaining() / this.b);
            shortBuffer.position(shortBuffer.position() + (((int) min) * this.b));
            this.d -= min * this.a;
        }
        if (this.c.remaining() < shortBuffer.remaining()) {
            g();
            this.c = i(this.c.position() + shortBuffer.remaining());
        }
        this.c.put(shortBuffer);
    }

    public final synchronized void f(long j) {
        this.d += j;
    }

    final synchronized void g() {
        int b = b();
        if (b > 0) {
            ShortBuffer shortBuffer = this.c;
            shortBuffer.limit(shortBuffer.position());
            this.c.position(b);
            this.c.compact();
            this.d -= (b / this.b) * this.a;
        }
    }

    public final synchronized float h(int i) {
        if (this.d < 0) {
            return 0.0f;
        }
        int b = b();
        if (vsc.f(this.b)) {
            b += i - 1;
        }
        return this.c.get(b);
    }
}
