package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: eakp  reason: default package */
/* loaded from: classes6.dex */
final class eakp implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ eakq b;

    public eakp(eakq eakqVar, Runnable runnable) {
        this.b = eakqVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
