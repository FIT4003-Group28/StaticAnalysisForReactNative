package defpackage;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
/* compiled from: PG */
/* renamed from: eaeg  reason: default package */
/* loaded from: classes6.dex */
public final class eaeg implements URLStreamHandlerFactory, Cloneable {
    private final eaee a;

    public eaeg(eaee eaeeVar) {
        this.a = eaeeVar;
    }

    public final HttpURLConnection a(URL url) {
        return b(url, this.a.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final HttpURLConnection b(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        eaed a = this.a.a();
        a.b = proxy;
        eaee a2 = a.a();
        if (protocol.equals("http")) {
            return new eahy(url, a2);
        }
        if (protocol.equals("https")) {
            return new eahz(url, a2);
        }
        throw new IllegalArgumentException("Unexpected protocol: " + protocol);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new eaeg(this.a);
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (str.equals("http") || str.equals("https")) {
            return new eaef(this, str);
        }
        return null;
    }
}
