package defpackage;

import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
/* compiled from: PG */
/* renamed from: btxu  reason: default package */
/* loaded from: classes.dex */
final class btxu {
    @dzsi
    private SSLContext a;

    public final synchronized SSLContext a() {
        if (this.a == null) {
            bvrj.UI_THREAD.d();
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            this.a = sSLContext;
        }
        return this.a;
    }
}
