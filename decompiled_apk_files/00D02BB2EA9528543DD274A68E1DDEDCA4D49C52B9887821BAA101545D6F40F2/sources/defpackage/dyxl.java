package defpackage;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
/* compiled from: PG */
/* renamed from: dyxl  reason: default package */
/* loaded from: classes6.dex */
final class dyxl implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Method run() {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
