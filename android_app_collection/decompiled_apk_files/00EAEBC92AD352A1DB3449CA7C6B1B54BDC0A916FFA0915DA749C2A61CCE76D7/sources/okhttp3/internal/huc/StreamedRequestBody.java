package okhttp3.internal.huc;

import h.c;
import h.d;
import h.l;
import h.n;
import okhttp3.internal.http.UnrepeatableRequestBody;
/* loaded from: classes.dex */
final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final n pipe = new n(8192);

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamedRequestBody(long j) {
        initOutputStream(l.a(this.pipe.a()), j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) {
        c cVar = new c();
        while (this.pipe.b().read(cVar, 8192L) != -1) {
            dVar.write(cVar, cVar.e());
        }
    }
}
