package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
/* compiled from: PG */
/* renamed from: eaef  reason: default package */
/* loaded from: classes6.dex */
final class eaef extends URLStreamHandler {
    final /* synthetic */ String a;
    final /* synthetic */ eaeg b;

    public eaef(eaeg eaegVar, String str) {
        this.b = eaegVar;
        this.a = str;
    }

    @Override // java.net.URLStreamHandler
    protected final int getDefaultPort() {
        if (this.a.equals("http")) {
            return 80;
        }
        if (!this.a.equals("https")) {
            throw new AssertionError();
        }
        return 443;
    }

    @Override // java.net.URLStreamHandler
    protected final URLConnection openConnection(URL url) {
        return this.b.a(url);
    }

    @Override // java.net.URLStreamHandler
    protected final URLConnection openConnection(URL url, Proxy proxy) {
        return this.b.b(url, proxy);
    }
}
