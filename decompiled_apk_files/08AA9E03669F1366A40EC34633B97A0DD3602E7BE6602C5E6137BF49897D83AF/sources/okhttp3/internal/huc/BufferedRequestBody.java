package okhttp3.internal.huc;

import c.c;
import c.d;
import okhttp3.Request;
/* loaded from: classes.dex */
final class BufferedRequestBody extends OutputStreamRequestBody {
    final c buffer = new c();
    long contentLength = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BufferedRequestBody(long j) {
        initOutputStream(this.buffer, j);
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody, okhttp3.RequestBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody
    public Request prepareToSendRequest(Request request) {
        if (request.header("Content-Length") != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.a();
        return request.newBuilder().removeHeader("Transfer-Encoding").header("Content-Length", Long.toString(this.buffer.a())).build();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) {
        this.buffer.a(dVar.b(), 0L, this.buffer.a());
    }
}
