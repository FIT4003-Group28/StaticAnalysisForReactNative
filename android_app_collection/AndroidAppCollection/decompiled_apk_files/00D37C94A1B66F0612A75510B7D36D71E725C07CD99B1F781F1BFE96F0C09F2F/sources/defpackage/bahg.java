package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: bahg  reason: default package */
/* loaded from: classes2.dex */
final class bahg extends URLStreamHandler {
    private final ExperimentalCronetEngine a;

    public bahg(ExperimentalCronetEngine experimentalCronetEngine) {
        this.a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        return this.a.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.a.openConnection(url, proxy);
    }
}
