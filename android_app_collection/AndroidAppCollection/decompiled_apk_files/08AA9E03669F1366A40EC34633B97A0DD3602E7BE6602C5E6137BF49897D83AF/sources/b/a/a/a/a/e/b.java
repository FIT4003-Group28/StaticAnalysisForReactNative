package b.a.a.a.a.e;

import b.a.a.a.l;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: DefaultHttpRequestFactory.java */
/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final l f1162a;

    /* renamed from: b  reason: collision with root package name */
    private g f1163b;

    /* renamed from: c  reason: collision with root package name */
    private SSLSocketFactory f1164c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1165d;

    public b() {
        this(new b.a.a.a.b());
    }

    public b(l lVar) {
        this.f1162a = lVar;
    }

    @Override // b.a.a.a.a.e.e
    public void a(g gVar) {
        if (this.f1163b != gVar) {
            this.f1163b = gVar;
            a();
        }
    }

    private synchronized void a() {
        this.f1165d = false;
        this.f1164c = null;
    }

    @Override // b.a.a.a.a.e.e
    public d a(c cVar, String str) {
        return a(cVar, str, Collections.emptyMap());
    }

    @Override // b.a.a.a.a.e.e
    public d a(c cVar, String str, Map<String, String> map) {
        d a2;
        SSLSocketFactory b2;
        switch (cVar) {
            case GET:
                a2 = d.a((CharSequence) str, (Map<?, ?>) map, true);
                break;
            case POST:
                a2 = d.b((CharSequence) str, (Map<?, ?>) map, true);
                break;
            case PUT:
                a2 = d.d((CharSequence) str);
                break;
            case DELETE:
                a2 = d.e((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (a(str) && this.f1163b != null && (b2 = b()) != null) {
            ((HttpsURLConnection) a2.a()).setSSLSocketFactory(b2);
        }
        return a2;
    }

    private boolean a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    private synchronized SSLSocketFactory b() {
        if (this.f1164c == null && !this.f1165d) {
            this.f1164c = c();
        }
        return this.f1164c;
    }

    private synchronized SSLSocketFactory c() {
        SSLSocketFactory a2;
        this.f1165d = true;
        try {
            a2 = f.a(this.f1163b);
            this.f1162a.a("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f1162a.e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a2;
    }
}
