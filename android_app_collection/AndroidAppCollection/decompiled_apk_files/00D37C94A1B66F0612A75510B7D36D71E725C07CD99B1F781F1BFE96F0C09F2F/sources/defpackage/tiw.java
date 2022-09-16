package defpackage;

import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: tiw  reason: default package */
/* loaded from: classes4.dex */
final class tiw implements Runnable {
    final /* synthetic */ tix a;

    public tiw(tix tixVar) {
        this.a = tixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getStatus() != AsyncTask.Status.FINISHED) {
            this.a.cancel(true);
            this.a.a(15, 15);
        }
    }
}
