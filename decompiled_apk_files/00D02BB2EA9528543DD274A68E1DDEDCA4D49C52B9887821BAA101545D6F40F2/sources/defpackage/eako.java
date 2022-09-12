package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: eako  reason: default package */
/* loaded from: classes6.dex */
final class eako implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private eako(InputStream inputStream) {
        this.a = inputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ReadableByteChannel a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new eako(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.a.read(bArr);
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.put(bArr, 0, read2);
        return read2;
    }
}
