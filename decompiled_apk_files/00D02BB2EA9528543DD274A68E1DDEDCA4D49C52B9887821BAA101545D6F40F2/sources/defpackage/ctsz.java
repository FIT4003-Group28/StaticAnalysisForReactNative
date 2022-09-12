package defpackage;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: ctsz  reason: default package */
/* loaded from: classes5.dex */
public final class ctsz implements cuim {
    private static final void b(dywh dywhVar) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            dbsk.m(true, "Cannot change security when using ChannelCredentials");
            dywhVar.f = socketFactory;
            dywhVar.m = 1;
        } catch (KeyManagementException | NoSuchAlgorithmException unused) {
            cstl.a("OkHttpChannelBuilder");
        }
    }

    @Override // defpackage.cuim
    public final dyeu a(Context context, aqan aqanVar, String str, int i) {
        dywh a = dywh.a(str, i);
        b(a);
        if (aqanVar != null) {
            cstl.a("OkHttpChannelBuilder");
            a.p(csvl.b(aqanVar, context));
        } else {
            cstl.a("OkHttpChannelBuilder");
            a.p(csvl.a(context));
        }
        return a.c();
    }
}
