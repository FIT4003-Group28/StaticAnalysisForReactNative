package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements bso {
    public static final String f = bqf.b("ConstraintTrkngWrkr");
    public WorkerParameters g;
    public final Object h;
    public volatile boolean i;
    public ListenableWorker j;
    public bwk k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = new Object();
        this.i = false;
        this.k = bwk.h();
    }

    @Override // androidx.work.ListenableWorker
    public final ankt b() {
        jV().execute(new bwo(this));
        return this.k;
    }

    @Override // defpackage.bso
    public final void e(List list) {
    }

    @Override // defpackage.bso
    public final void f(List list) {
        bqf a = bqf.a();
        String.format("Constraints changed for %s", list);
        a.d(new Throwable[0]);
        synchronized (this.h) {
            this.i = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean h() {
        ListenableWorker listenableWorker = this.j;
        return listenableWorker != null && listenableWorker.h();
    }

    public final void i() {
        this.k.e(adz.g());
    }

    public final void j() {
        this.k.e(adz.h());
    }

    @Override // androidx.work.ListenableWorker
    public final void jU() {
        ListenableWorker listenableWorker = this.j;
        if (listenableWorker == null || listenableWorker.c) {
            return;
        }
        this.j.g();
    }
}
