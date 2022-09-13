package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: eakh  reason: default package */
/* loaded from: classes6.dex */
public final class eakh extends UploadDataProvider {
    private volatile FileChannel a;
    private final eakg b;
    private final Object c = new Object();

    public eakh(eakg eakgVar) {
        this.b = eakgVar;
    }

    private final FileChannel a() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = this.b.a();
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int read;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel a = a();
        do {
            read = a.read(byteBuffer);
            if (read != -1) {
                break;
                break;
            }
            break;
        } while (read == 0);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}