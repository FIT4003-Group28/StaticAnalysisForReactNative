package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: agzx  reason: default package */
/* loaded from: classes.dex */
public final class agzx implements agxp {
    private final Object a = new Object();

    @Override // defpackage.agxp
    public final void a(int i) {
        synchronized (this.a) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.a) {
        }
    }
}
