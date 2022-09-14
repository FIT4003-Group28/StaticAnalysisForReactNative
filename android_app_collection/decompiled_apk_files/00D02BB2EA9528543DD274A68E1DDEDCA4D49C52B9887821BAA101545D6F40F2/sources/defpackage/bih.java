package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: PG */
/* renamed from: bih  reason: default package */
/* loaded from: classes3.dex */
final class bih implements Runnable {
    final /* synthetic */ dehn a;
    final /* synthetic */ ConstraintTrackingWorker b;

    public bih(ConstraintTrackingWorker constraintTrackingWorker, dehn dehnVar) {
        this.b = constraintTrackingWorker;
        this.a = dehnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.e) {
            if (this.b.f) {
                this.b.i();
            } else {
                this.b.g.h(this.a);
            }
        }
    }
}
