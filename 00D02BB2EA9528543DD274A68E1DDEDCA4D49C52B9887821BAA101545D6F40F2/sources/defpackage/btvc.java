package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: btvc  reason: default package */
/* loaded from: classes4.dex */
public final class btvc implements btve {
    private final dbty<dyhi> a;

    public btvc(final URL url) {
        this.a = dbud.a(new dbty(url) { // from class: btvb
            private final URL a;

            {
                this.a = url;
            }

            @Override // defpackage.dbty
            public final Object a() {
                URL url2 = this.a;
                return dywh.a(url2.getHost(), url2.getPort()).c();
            }
        });
        btvi.a(url);
    }

    @Override // defpackage.btve
    public final dyhi a() {
        dbsk.b(true, "cannot call createGrpcChannel when gRPC is not enabled");
        return this.a.a();
    }
}
