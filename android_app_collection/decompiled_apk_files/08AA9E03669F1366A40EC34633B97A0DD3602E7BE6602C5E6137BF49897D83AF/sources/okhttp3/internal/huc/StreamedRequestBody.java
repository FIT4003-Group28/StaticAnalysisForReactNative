package okhttp3.internal.huc;

import c.c;
import c.d;
import c.l;
import c.m;
import okhttp3.internal.http.UnrepeatableRequestBody;
/* loaded from: classes.dex */
final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final m pipe = new m(8192);

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamedRequestBody(long j) {
        initOutputStream(l.a(this.pipe.b()), j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) {
        c cVar = new c();
        while (this.pipe.a().read(cVar, 8192L) != -1) {
            dVar.write(cVar, cVar.a());
        }
    }
}
