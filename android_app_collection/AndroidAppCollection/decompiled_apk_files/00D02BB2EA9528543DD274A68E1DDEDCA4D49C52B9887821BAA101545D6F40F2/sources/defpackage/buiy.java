package defpackage;

import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: buiy  reason: default package */
/* loaded from: classes4.dex */
final class buiy implements degu {
    final /* synthetic */ UrlRequest a;

    public buiy(UrlRequest urlRequest) {
        this.a = urlRequest;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            this.a.cancel();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dssj dssjVar = (dssj) obj;
    }
}
