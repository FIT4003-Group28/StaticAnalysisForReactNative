package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bvs  reason: default package */
/* loaded from: classes2.dex */
final class bvs implements Runnable {
    final /* synthetic */ bvt a;
    final /* synthetic */ bwk b;

    public bvs(bvt bvtVar, bwk bwkVar) {
        this.a = bvtVar;
        this.b = bwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bpz bpzVar = (bpz) this.b.get();
            if (bpzVar != null) {
                bqf a = bqf.a();
                int i = bvt.g;
                String.format("Updating notification for %s", this.a.b.d);
                a.d(new Throwable[0]);
                bvt bvtVar = this.a;
                ListenableWorker listenableWorker = bvtVar.c;
                listenableWorker.e = true;
                bwk bwkVar = bvtVar.f;
                bqa bqaVar = bvtVar.d;
                Context context = bvtVar.a;
                UUID d = listenableWorker.d();
                bwk h = bwk.h();
                ((bvv) bqaVar).c.a(new bvu((bvv) bqaVar, h, d, bpzVar, context));
                bwkVar.g(h);
                return;
            }
            throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", this.a.b.d));
        } catch (Throwable th) {
            this.a.f.f(th);
        }
    }
}
