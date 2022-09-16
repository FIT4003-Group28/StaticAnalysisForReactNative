package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: atl  reason: default package */
/* loaded from: classes2.dex */
final class atl extends UploadDataProvider {
    private final byte[] a;
    private int b;

    public atl(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.a.length - this.b);
        byteBuffer.put(this.a, this.b, min);
        this.b += min;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
