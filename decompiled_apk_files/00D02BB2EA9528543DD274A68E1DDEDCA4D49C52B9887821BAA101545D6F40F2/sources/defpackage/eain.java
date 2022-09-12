package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: eain  reason: default package */
/* loaded from: classes6.dex */
public final class eain extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null");
        }
        return Collections.singletonList(Proxy.NO_PROXY);
    }
}
