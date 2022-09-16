package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
/* compiled from: PG */
/* renamed from: bvt  reason: default package */
/* loaded from: classes2.dex */
public final class bvt implements Runnable {
    public static final /* synthetic */ int g = 0;
    final Context a;
    final bum b;
    final ListenableWorker c;
    final bqa d;
    final bwn e;
    public final bwk f = bwk.h();

    static {
        bqf.b("WorkForegroundRunnable");
    }

    public bvt(Context context, bum bumVar, ListenableWorker listenableWorker, bqa bqaVar, bwn bwnVar) {
        this.a = context;
        this.b = bumVar;
        this.c = listenableWorker;
        this.d = bqaVar;
        this.e = bwnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.q || akg.e()) {
            this.f.e(null);
            return;
        }
        bwk h = bwk.h();
        this.e.c.execute(new bvr(h));
        h.qY(new bvs(this, h), this.e.c);
    }
}
