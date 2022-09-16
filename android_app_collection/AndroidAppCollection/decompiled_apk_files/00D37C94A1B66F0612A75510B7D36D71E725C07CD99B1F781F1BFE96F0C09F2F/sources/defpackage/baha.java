package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: baha  reason: default package */
/* loaded from: classes2.dex */
final class baha extends UploadDataProvider {
    final /* synthetic */ bahb a;

    public baha(bahb bahbVar) {
        this.a = bahbVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return -1L;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.b.remaining()) {
            byteBuffer.put(this.a.b);
            this.a.b.clear();
            uploadDataSink.onReadSucceeded(this.a.c);
            bahb bahbVar = this.a;
            if (bahbVar.c) {
                return;
            }
            bahbVar.a.c();
            return;
        }
        int limit = this.a.b.limit();
        ByteBuffer byteBuffer2 = this.a.b;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.b);
        this.a.b.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
