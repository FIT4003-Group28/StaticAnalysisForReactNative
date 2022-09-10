package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: defj  reason: default package */
/* loaded from: classes6.dex */
public final class defj implements Runnable {
    final /* synthetic */ Closeable a;

    public defj(Closeable closeable) {
        this.a = closeable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.close();
        } catch (IOException | RuntimeException e) {
            defw.a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$11", "run", "thrown by close()", e);
        }
    }
}
