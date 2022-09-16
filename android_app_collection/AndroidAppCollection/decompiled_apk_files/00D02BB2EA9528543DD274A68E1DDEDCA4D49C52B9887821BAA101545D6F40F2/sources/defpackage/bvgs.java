package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: PG */
/* renamed from: bvgs  reason: default package */
/* loaded from: classes4.dex */
public class bvgs extends UploadDataProvider {
    public final byte[] a;
    private final btzu b;
    private final cqat c;
    private int d = 0;

    public bvgs(ByteArrayOutputStream byteArrayOutputStream, btzu btzuVar, cqat cqatVar) {
        this.a = byteArrayOutputStream.toByteArray();
        this.b = btzuVar;
        this.c = cqatVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.a.length - this.d);
        if (this.d == 0) {
            this.b.c(this.c.e());
        }
        byteBuffer.put(this.a, this.d, min);
        int i = this.d + min;
        this.d = i;
        if (i == this.a.length) {
            this.b.e(this.c.e());
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.d = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
