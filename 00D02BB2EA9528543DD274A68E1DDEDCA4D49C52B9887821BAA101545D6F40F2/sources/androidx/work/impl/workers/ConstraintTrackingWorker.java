package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements bel {
    public WorkerParameters d;
    public final Object e;
    public volatile boolean f;
    public bid<bbx> g;
    public ListenableWorker h;

    static {
        bbz.f("ConstraintTrkngWrkr");
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.d = workerParameters;
        this.e = new Object();
        this.f = false;
        this.g = bid.e();
    }

    @Override // defpackage.bel
    public final void Ni(List<String> list) {
    }

    @Override // defpackage.bel
    public final void Nj(List<String> list) {
        bbz.e().a(new Throwable[0]);
        synchronized (this.e) {
            this.f = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final dehn<bbx> c() {
        g().execute(new big(this));
        return this.g;
    }

    @Override // androidx.work.ListenableWorker
    public final void e() {
        ListenableWorker listenableWorker = this.h;
        if (listenableWorker != null) {
            listenableWorker.d();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean f() {
        ListenableWorker listenableWorker = this.h;
        return listenableWorker != null && listenableWorker.f();
    }

    public final void h() {
        this.g.f((bid<bbx>) bbx.c());
    }

    public final void i() {
        this.g.f((bid<bbx>) bbx.b());
    }
}
