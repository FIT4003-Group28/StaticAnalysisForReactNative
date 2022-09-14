package defpackage;

import java.net.URL;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: btux  reason: default package */
/* loaded from: classes4.dex */
public final class btux implements btve {
    @dzsi
    private final dbty<dyhi> a;

    public btux(CronetEngine cronetEngine, URL url) {
        int port = url.getPort();
        this.a = dbud.a(dbud.b(dyjw.a(url.getHost(), port == -1 ? 80 : port, cronetEngine).c()));
        btvi.a(url);
    }

    @Override // defpackage.btve
    public final dyhi a() {
        dbsk.b(true, "cannot call createGrpcChannel when gRPC is not enabled");
        dbsk.s(this.a);
        return this.a.a();
    }
}
