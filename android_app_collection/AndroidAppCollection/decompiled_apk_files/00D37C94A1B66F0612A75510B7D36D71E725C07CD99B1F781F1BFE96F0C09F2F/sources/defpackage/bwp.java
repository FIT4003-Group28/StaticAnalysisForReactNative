package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: PG */
/* renamed from: bwp  reason: default package */
/* loaded from: classes2.dex */
final class bwp implements Runnable {
    final /* synthetic */ ankt a;
    final /* synthetic */ ConstraintTrackingWorker b;

    public bwp(ConstraintTrackingWorker constraintTrackingWorker, ankt anktVar) {
        this.b = constraintTrackingWorker;
        this.a = anktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.h) {
            if (this.b.i) {
                this.b.j();
            } else {
                this.b.k.g(this.a);
            }
        }
    }
}
