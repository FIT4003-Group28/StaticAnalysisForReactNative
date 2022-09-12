package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.dssj;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cvob  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvob<I extends dssj, O extends dssj> implements cvle {
    public Map<String, cvnq> a;

    protected abstract String a();

    public abstract cvmr<I, O> b(Bundle bundle);

    @Override // defpackage.cvle
    public final cviw d(Bundle bundle) {
        String a = a();
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        cvmr<I, O> b = b(bundle);
        if (!b.e() || !b.d()) {
            if (TextUtils.isEmpty(a) || !this.a.containsKey(a)) {
                cvlw.b("ScheduledRpcHandler", "Scheduled RPC callback not found. Callback key: [%s]", a);
            } else {
                cvlw.b("ScheduledRpcHandler", "Calling scheduled RPC callback. Callback key: [%s]", a);
                cvnq cvnqVar = this.a.get(a);
                if (b.e()) {
                    I a2 = b.a();
                    b.c();
                    cvnqVar.b(string, a2);
                } else {
                    cvnqVar.a(string, b.a(), b.b());
                }
            }
            if (b.e()) {
                return cviw.c(b.c());
            }
            return cviw.a;
        }
        return cviw.d(b.c());
    }
}
