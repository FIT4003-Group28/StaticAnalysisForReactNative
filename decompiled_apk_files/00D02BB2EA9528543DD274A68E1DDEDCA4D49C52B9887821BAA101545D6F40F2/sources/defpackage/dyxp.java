package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: dyxp  reason: default package */
/* loaded from: classes6.dex */
final class dyxp extends dyxs {
    private final Method d;
    private final Method e;

    public dyxp(Provider provider, Method method, Method method2) {
        super(provider);
        this.d = method;
        this.e = method2;
    }

    @Override // defpackage.dyxs
    public final void a(SSLSocket sSLSocket, String str, List<dyxt> list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        for (dyxt dyxtVar : list) {
            if (dyxtVar != dyxt.HTTP_1_0) {
                arrayList.add(dyxtVar.e);
            }
        }
        try {
            this.d.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.dyxs
    public final String b(SSLSocket sSLSocket) {
        try {
            return (String) this.e.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.dyxs
    public final int c() {
        return 1;
    }
}
