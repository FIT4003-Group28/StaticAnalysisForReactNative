package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: bwo  reason: default package */
/* loaded from: classes2.dex */
public final class bwo implements Runnable {
    final /* synthetic */ ConstraintTrackingWorker a;

    public bwo(ConstraintTrackingWorker constraintTrackingWorker) {
        this.a = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.a;
        String b = constraintTrackingWorker.a().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (!TextUtils.isEmpty(b)) {
            constraintTrackingWorker.j = constraintTrackingWorker.b.f.b(constraintTrackingWorker.a, b, constraintTrackingWorker.g);
            if (constraintTrackingWorker.j != null) {
                bum a = brq.h(constraintTrackingWorker.a).d.n().a(constraintTrackingWorker.d().toString());
                if (a == null) {
                    constraintTrackingWorker.i();
                    return;
                }
                Context context = constraintTrackingWorker.a;
                bsp bspVar = new bsp(context, brq.h(context).j, constraintTrackingWorker);
                bspVar.a(Collections.singletonList(a));
                if (bspVar.c(constraintTrackingWorker.d().toString())) {
                    bqf a2 = bqf.a();
                    String.format("Constraints met for delegate %s", b);
                    a2.d(new Throwable[0]);
                    try {
                        ankt b2 = constraintTrackingWorker.j.b();
                        b2.qY(new bwp(constraintTrackingWorker, b2), constraintTrackingWorker.jV());
                        return;
                    } catch (Throwable th) {
                        bqf a3 = bqf.a();
                        String.format("Delegated worker %s threw exception in startWork.", b);
                        a3.d(th);
                        synchronized (constraintTrackingWorker.h) {
                            if (constraintTrackingWorker.i) {
                                bqf.a().d(new Throwable[0]);
                                constraintTrackingWorker.j();
                            } else {
                                constraintTrackingWorker.i();
                            }
                            return;
                        }
                    }
                }
                bqf a4 = bqf.a();
                String.format("Constraints not met for delegate %s. Requesting retry.", b);
                a4.d(new Throwable[0]);
                constraintTrackingWorker.j();
                return;
            }
            bqf.a().d(new Throwable[0]);
            constraintTrackingWorker.i();
            return;
        }
        bqf.a();
        bqf.e(ConstraintTrackingWorker.f, "No worker to delegate to.", new Throwable[0]);
        constraintTrackingWorker.i();
    }
}
