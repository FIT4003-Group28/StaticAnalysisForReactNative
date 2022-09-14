package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dcys  reason: default package */
/* loaded from: classes5.dex */
final class dcys extends ByteArrayOutputStream {
    public dcys(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (this.count + remaining > this.buf.length) {
            this.buf = Arrays.copyOf(this.buf, this.count + remaining);
        }
        byteBuffer.get(this.buf, this.count, remaining);
        this.count += remaining;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b() {
        return this.buf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return this.count;
    }
}
