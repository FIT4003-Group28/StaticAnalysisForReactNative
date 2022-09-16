package defpackage;

import com.google.android.libraries.stitch.sslguard.SslGuardContextImpl;
import java.security.Provider;
/* compiled from: PG */
/* renamed from: viq  reason: default package */
/* loaded from: classes4.dex */
public final class viq extends Provider {
    public viq() {
        super("Ssl_Guard", 1.01d, "Makes SSL Connections wait for security patches.");
        String name = SslGuardContextImpl.class.getName();
        put("SSLContext.SSL", name);
        put("SSLContext.SSLv3", name);
        put("SSLContext.TLS", name);
        put("SSLContext.TLSv1", name);
        put("SSLContext.TLSv1.1", name);
        put("SSLContext.TLSv1.2", name);
        put("SSLContext.Default", name);
    }
}
