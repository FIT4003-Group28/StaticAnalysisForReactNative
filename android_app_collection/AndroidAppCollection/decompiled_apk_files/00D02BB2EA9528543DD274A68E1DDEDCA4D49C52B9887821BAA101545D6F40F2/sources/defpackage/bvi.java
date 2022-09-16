package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: bvi  reason: default package */
/* loaded from: classes.dex */
final class bvi implements Runnable {
    final /* synthetic */ Runnable a;

    public bvi(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
