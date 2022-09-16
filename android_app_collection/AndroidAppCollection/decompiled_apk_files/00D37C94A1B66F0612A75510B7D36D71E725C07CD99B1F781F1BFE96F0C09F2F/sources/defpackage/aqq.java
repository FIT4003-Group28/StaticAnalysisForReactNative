package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aqq  reason: default package */
/* loaded from: classes2.dex */
final class aqq implements Callable {
    final /* synthetic */ aqt a;

    public aqq(aqt aqtVar) {
        this.a = aqtVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        Object obj;
        this.a.e.set(true);
        try {
            Process.setThreadPriority(10);
            obj = this.a.a();
            try {
                Binder.flushPendingCommands();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.a.d.set(true);
                    throw th;
                } finally {
                    this.a.d(obj);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }
}
