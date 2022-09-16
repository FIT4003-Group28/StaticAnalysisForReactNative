package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
/* compiled from: PG */
/* renamed from: aipg  reason: default package */
/* loaded from: classes.dex */
public final class aipg extends aipc {
    public static final /* synthetic */ int a = 0;
    private final afjm b;

    public aipg(afjm afjmVar) {
        this.b = afjmVar;
    }

    @Override // defpackage.aipc
    protected final void a(Uri uri, Header header, HttpResponse httpResponse) {
        asy asyVar;
        aipa a2 = aipa.a(uri);
        if (a2 == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        String queryParameter = uri.getQueryParameter("s");
        if (queryParameter == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        Uri parse = Uri.parse(queryParameter);
        aipb a3 = aipb.a(header, a2.d);
        String c = a3.c != -1 ? aear.c(a2.a, a2.b, a2.c, a2.e) : null;
        if (a3.c == -1) {
            asyVar = new asy(parse, a3.a, -1L, c, null);
        } else {
            long j = a3.a;
            asyVar = new asy(parse, j, 1 + (a3.b - j), c, null);
        }
        asv a4 = this.b.a();
        if (!a3.b(httpResponse)) {
            return;
        }
        httpResponse.setEntity(new aipe(a4, asyVar));
    }
}
