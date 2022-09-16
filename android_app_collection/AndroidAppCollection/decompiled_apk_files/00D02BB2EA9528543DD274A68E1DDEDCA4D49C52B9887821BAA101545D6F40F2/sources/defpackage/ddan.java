package defpackage;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ddan  reason: default package */
/* loaded from: classes5.dex */
final class ddan implements ddap {
    static final ddan a = new ddan();

    @Override // defpackage.ddap
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = ddam.a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("Suppressing exception thrown when closing ");
        sb.append(valueOf);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", sb.toString(), th2);
    }
}
