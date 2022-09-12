package defpackage;

import java.net.URL;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: bucc  reason: default package */
/* loaded from: classes4.dex */
public final class bucc implements btve {
    private final CronetEngine a;
    private final boolean b;
    private final URL c;

    public bucc(CronetEngine cronetEngine, boolean z, URL url) {
        this.a = cronetEngine;
        this.b = z;
        this.c = url;
        btvi.a(url);
    }

    @Override // defpackage.btve
    public final dyhi a() {
        dbsk.b(this.b, "cannot call createGrpcChannel when Cronet is not enabled");
        dbsk.b(true, "cannot call createGrpcChannel when gRPC is not enabled");
        dbsk.b(false, "cannot use LocalGrpcServerChannel with this dev options configuration");
        dbsk.b(this.c.getHost().equals("localhost"), "Cannot use LocalGrpcServerChannel if the server URL is not pointing to localhost");
        return dyjw.a("test_cert_2", this.c.getPort(), this.a).c();
    }
}
