package defpackage;

import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: csdy  reason: default package */
/* loaded from: classes5.dex */
final class csdy implements Runnable {
    final /* synthetic */ csdz a;

    public csdy(csdz csdzVar) {
        this.a = csdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getStatus() != AsyncTask.Status.FINISHED) {
            this.a.cancel(true);
            this.a.a(15, 15);
        }
    }
}
