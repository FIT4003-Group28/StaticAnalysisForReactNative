package defpackage;

import android.os.Looper;
import android.os.Process;
/* compiled from: PG */
/* renamed from: dbs  reason: default package */
/* loaded from: classes3.dex */
final class dbs implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dbt b;

    public dbs(dbt dbtVar, Runnable runnable) {
        this.b = dbtVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        try {
            Process.setThreadPriority(this.b.a);
        } catch (SecurityException unused) {
            Process.setThreadPriority(this.b.a + 1);
        }
        this.a.run();
    }
}
