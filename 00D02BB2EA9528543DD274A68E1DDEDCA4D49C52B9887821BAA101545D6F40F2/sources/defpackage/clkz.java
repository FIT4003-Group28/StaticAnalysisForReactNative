package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: clkz  reason: default package */
/* loaded from: classes5.dex */
final class clkz implements cllh {
    final /* synthetic */ clld a;
    private final String b;
    private final dced<String, String> c;

    public clkz(clld clldVar, String str, dced<String, String> dcedVar) {
        this.a = clldVar;
        this.b = str;
        this.c = dcedVar;
    }

    @Override // defpackage.cllh
    public final dehn<clli> a() {
        return this.a.a.c(new Callable(this) { // from class: clky
            private final clkz a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final /* synthetic */ clli b() {
        IOException e;
        URLConnection openConnection;
        int i;
        InputStream inputStream;
        try {
            URL url = new URL(this.b);
            clld.c();
            ?? r1 = 0;
            try {
                try {
                    openConnection = url.openConnection();
                } catch (Throwable th) {
                    r1 = url;
                    th = th;
                    clld.d(r1);
                    throw th;
                }
            } catch (clle e2) {
                throw e2;
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                clld.d(r1);
                throw th;
            }
            try {
                openConnection.setConnectTimeout(1000);
                openConnection.setReadTimeout(1000);
                dcpd<String> it = this.c.J().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    dcpd<String> it2 = this.c.h(next).iterator();
                    while (it2.hasNext()) {
                        openConnection.addRequestProperty(next, it2.next());
                    }
                }
                clld.c();
                openConnection.connect();
                clld.c();
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    try {
                        inputStream = httpURLConnection.getInputStream();
                    } catch (IOException unused) {
                        inputStream = null;
                    }
                    i = httpURLConnection.getResponseCode();
                    if (i >= 400) {
                        String responseMessage = httpURLConnection.getResponseMessage();
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw new clle(clku.g(i, headerFields, responseMessage));
                    }
                } else {
                    i = 200;
                }
                clld.c();
                cllc cllcVar = new cllc(this.a, openConnection, i);
                clld.d(null);
                return cllcVar;
            } catch (clle e4) {
                throw e4;
            } catch (IOException e5) {
                e = e5;
                throw new clle(e);
            }
        } catch (MalformedURLException e6) {
            throw new clle(e6);
        }
    }
}
