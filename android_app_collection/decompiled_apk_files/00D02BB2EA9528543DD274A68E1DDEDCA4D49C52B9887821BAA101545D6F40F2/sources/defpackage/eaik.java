package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: eaik  reason: default package */
/* loaded from: classes6.dex */
final class eaik extends eaim {
    private final Method a;
    private final Method b;
    private final Method d;
    private final Class<?> e;
    private final Class<?> f;

    public eaik(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.a = method;
        this.b = method2;
        this.d = method3;
        this.e = cls;
        this.f = cls2;
    }

    @Override // defpackage.eaim
    public final void c(SSLSocket sSLSocket, String str, List<eaeh> list) {
        try {
            this.a.invoke(null, sSLSocket, Proxy.newProxyInstance(eaim.class.getClassLoader(), new Class[]{this.e, this.f}, new eaij(n(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw eafa.w("unable to set alpn", e);
        }
    }

    @Override // defpackage.eaim
    @dzsi
    public final String d(SSLSocket sSLSocket) {
        try {
            eaij eaijVar = (eaij) Proxy.getInvocationHandler(this.b.invoke(null, sSLSocket));
            if (eaijVar.a) {
                return null;
            }
            String str = eaijVar.b;
            if (str != null) {
                return str;
            }
            eaim.c.e(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw eafa.w("unable to get selected protocol", e);
        }
    }

    @Override // defpackage.eaim
    public final void q(SSLSocket sSLSocket) {
        try {
            this.d.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw eafa.w("unable to remove alpn", e);
        }
    }
}
