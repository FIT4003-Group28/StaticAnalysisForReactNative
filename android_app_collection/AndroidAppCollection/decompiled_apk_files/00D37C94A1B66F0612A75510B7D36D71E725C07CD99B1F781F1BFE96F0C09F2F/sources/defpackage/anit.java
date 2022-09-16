package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anit  reason: default package */
/* loaded from: classes.dex */
public final class anit implements Runnable {
    final /* synthetic */ Closeable a;

    public anit(Closeable closeable) {
        this.a = closeable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.close();
        } catch (IOException | RuntimeException e) {
            anjd.a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$11", "run", "thrown by close()", e);
        }
    }
}
