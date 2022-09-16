package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: acda  reason: default package */
/* loaded from: classes.dex */
final class acda implements Runnable {
    final /* synthetic */ Throwable a;
    final /* synthetic */ acdh b;

    public acda(acdh acdhVar, Throwable th) {
        this.b = acdhVar;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acdd acddVar = this.b.g;
        if (acddVar != null) {
            Log.e("RtmpConnection", "RTMP input stream experienced an error", this.a);
            accu accuVar = ((accv) acddVar).b;
            if (accuVar == null) {
                return;
            }
            accuVar.p();
        }
    }
}
