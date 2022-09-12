package defpackage;

import java.io.Closeable;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: ddao  reason: default package */
/* loaded from: classes5.dex */
final class ddao implements ddap {
    static final ddao a = new ddao();
    static final Method b;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (Throwable unused) {
            method = null;
        }
        b = method;
    }

    @Override // defpackage.ddap
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            b.invoke(th, th2);
        } catch (Throwable unused) {
            ddan.a.a(closeable, th, th2);
        }
    }
}
