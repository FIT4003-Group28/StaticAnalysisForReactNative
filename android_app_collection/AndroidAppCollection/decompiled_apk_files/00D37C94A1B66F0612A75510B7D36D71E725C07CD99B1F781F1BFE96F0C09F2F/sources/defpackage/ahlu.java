package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ahlu  reason: default package */
/* loaded from: classes.dex */
final class ahlu implements Runnable {
    final /* synthetic */ ahlv a;

    public ahlu(ahlv ahlvVar) {
        this.a = ahlvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            if (!this.a.c) {
                return;
            }
            Looper.prepare();
            this.a.d = new Handler();
            Looper.loop();
        }
    }
}
