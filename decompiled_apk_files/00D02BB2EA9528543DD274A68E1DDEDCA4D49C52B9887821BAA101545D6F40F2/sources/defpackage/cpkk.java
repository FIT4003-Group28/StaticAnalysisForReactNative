package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: cpkk  reason: default package */
/* loaded from: classes5.dex */
public final class cpkk extends UploadDataProvider {
    final byte[] a;
    int b = 0;

    public cpkk(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = this.a;
        int i = this.b;
        if (remaining < bArr.length - i) {
            byteBuffer.put(bArr, i, remaining);
            this.b += remaining;
        } else {
            byteBuffer.put(bArr);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
