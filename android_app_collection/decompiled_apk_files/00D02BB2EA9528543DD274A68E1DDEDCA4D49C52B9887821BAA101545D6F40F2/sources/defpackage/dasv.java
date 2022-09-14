package defpackage;

import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: PG */
/* renamed from: dasv  reason: default package */
/* loaded from: classes5.dex */
public final class dasv extends dasj {
    private static final String[] b;
    private final dasr c;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        b = strArr;
        Arrays.sort(strArr);
    }

    public dasv() {
        dasr dasrVar;
        if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
            dasrVar = new dasr(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort")))));
        } else {
            dasrVar = new dasr(null);
        }
        this.c = dasrVar;
    }

    @Override // defpackage.dasj
    public final boolean b(String str) {
        return Arrays.binarySearch(b, str) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dasj
    public final /* bridge */ /* synthetic */ dasl c(String str, String str2) {
        dbsk.c(b(str), "HTTP method %s not supported", str);
        URL url = new URL(str2);
        Proxy proxy = this.c.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        httpURLConnection.setRequestMethod(str);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        }
        return new dass(httpURLConnection);
    }
}
