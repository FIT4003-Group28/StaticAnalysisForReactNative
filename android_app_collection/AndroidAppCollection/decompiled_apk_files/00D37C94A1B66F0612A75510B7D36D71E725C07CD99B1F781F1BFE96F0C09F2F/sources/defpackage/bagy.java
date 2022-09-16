package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: bagy  reason: default package */
/* loaded from: classes2.dex */
final class bagy extends UploadDataProvider {
    final /* synthetic */ bagz a;

    public bagy(bagz bagzVar) {
        this.a = bagzVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        bagz bagzVar = this.a;
        int i = bagzVar.a;
        if (i == -1) {
            return bagzVar.c ? bagzVar.b.limit() : bagzVar.b.position();
        }
        return i;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.a.b.remaining()) {
            byteBuffer.put(this.a.b.array(), this.a.b.position(), remaining);
            ByteBuffer byteBuffer2 = this.a.b;
            byteBuffer2.position(byteBuffer2.position() + remaining);
        } else {
            byteBuffer.put(this.a.b);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
