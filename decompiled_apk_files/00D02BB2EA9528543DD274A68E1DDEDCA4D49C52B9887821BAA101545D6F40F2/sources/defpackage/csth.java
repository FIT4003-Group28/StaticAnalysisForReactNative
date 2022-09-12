package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* renamed from: csth  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class csth implements ThreadFactory {
    static final ThreadFactory a = new csth();

    private csth() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable(runnable) { // from class: csti
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = this.a;
                Process.setThreadPriority(10);
                runnable2.run();
            }
        });
    }
}
