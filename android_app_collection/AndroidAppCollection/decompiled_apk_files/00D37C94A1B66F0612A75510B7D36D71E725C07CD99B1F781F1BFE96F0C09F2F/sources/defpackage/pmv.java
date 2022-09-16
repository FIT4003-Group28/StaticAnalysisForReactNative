package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pmv  reason: default package */
/* loaded from: classes4.dex */
public class pmv extends pmo {
    private final int a;
    public final pmq c = new pmq();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;

    public pmv(int i) {
        this.a = i;
    }

    private final ByteBuffer a(int i) {
        int i2 = this.a;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new pmu(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public static pmv d() {
        return new pmv(0);
    }

    @Override // defpackage.pmo
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final void e(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = a(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer a = a(i2);
        a.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a.put(byteBuffer);
        }
        this.d = a;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean g() {
        return getFlag(1073741824);
    }
}
