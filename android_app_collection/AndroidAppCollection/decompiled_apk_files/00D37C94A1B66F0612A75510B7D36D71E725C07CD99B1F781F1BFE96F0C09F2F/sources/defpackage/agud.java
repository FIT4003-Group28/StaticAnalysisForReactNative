package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
/* compiled from: PG */
/* renamed from: agud  reason: default package */
/* loaded from: classes.dex */
public final class agud extends aipc {
    private final snc a;
    private final afjm b;

    public agud(snc sncVar, afjm afjmVar) {
        sncVar.getClass();
        this.a = sncVar;
        afjmVar.getClass();
        this.b = afjmVar;
    }

    @Override // defpackage.aipc
    protected final void a(Uri uri, Header header, HttpResponse httpResponse) {
        aipa a = aipa.a(uri);
        if (a == null || uri.getQueryParameter("e") == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        String queryParameter = uri.getQueryParameter("e");
        if ((TextUtils.isEmpty(queryParameter) ? 0L : Long.parseLong(queryParameter)) < this.a.d()) {
            zep.l("Offline URL has expired. Not allowed to access content.");
            httpResponse.setStatusCode(403);
            return;
        }
        aipb a2 = aipb.a(header, a.d);
        String c = aear.c(a.a, a.b, a.c, a.e);
        asv a3 = this.b.a();
        Uri uri2 = Uri.EMPTY;
        long j = a2.a;
        asy asyVar = new asy(uri2, j, (a2.b - j) + 1, c);
        try {
            try {
                a3.h(asyVar);
                try {
                    a3.j();
                } catch (IOException e) {
                    zep.n("IOException trying to close offline data source", e);
                }
                if (!a2.b(httpResponse)) {
                    return;
                }
                httpResponse.setEntity(new aipe(a3, asyVar));
            } catch (IOException unused) {
                zep.l("Offlined video not found on disk.");
                httpResponse.setStatusCode(404);
                try {
                    a3.j();
                } catch (IOException e2) {
                    zep.n("IOException trying to close offline data source", e2);
                }
            }
        } catch (Throwable th) {
            try {
                a3.j();
            } catch (IOException e3) {
                zep.n("IOException trying to close offline data source", e3);
            }
            throw th;
        }
    }
}
