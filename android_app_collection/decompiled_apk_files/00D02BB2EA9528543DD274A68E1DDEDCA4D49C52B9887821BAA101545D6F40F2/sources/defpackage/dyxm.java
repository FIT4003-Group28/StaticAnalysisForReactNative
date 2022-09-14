package defpackage;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;
/* compiled from: PG */
/* renamed from: dyxm  reason: default package */
/* loaded from: classes6.dex */
final class dyxm implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Method run() {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
