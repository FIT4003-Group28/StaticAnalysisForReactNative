package defpackage;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: dyxn  reason: default package */
/* loaded from: classes6.dex */
final class dyxn implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Method run() {
        return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
