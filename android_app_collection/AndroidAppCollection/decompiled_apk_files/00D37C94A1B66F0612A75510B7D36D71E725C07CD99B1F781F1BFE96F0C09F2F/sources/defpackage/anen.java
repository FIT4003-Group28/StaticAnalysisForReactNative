package defpackage;

import java.io.Closeable;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: anen  reason: default package */
/* loaded from: classes.dex */
final class anen implements aneo {
    private final Method a;

    public anen(Method method) {
        this.a = method;
    }

    @Override // defpackage.aneo
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            this.a.invoke(th, th2);
        } catch (Throwable unused) {
            anem.a.a(closeable, th, th2);
        }
    }
}
