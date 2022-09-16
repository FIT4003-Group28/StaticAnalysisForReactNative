package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: big  reason: default package */
/* loaded from: classes3.dex */
public final class big implements Runnable {
    final /* synthetic */ ConstraintTrackingWorker a;

    public big(ConstraintTrackingWorker constraintTrackingWorker) {
        this.a = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.a;
        String c = constraintTrackingWorker.b().c("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (!TextUtils.isEmpty(c)) {
            constraintTrackingWorker.h = constraintTrackingWorker.b.e.b(constraintTrackingWorker.a, c, constraintTrackingWorker.d);
            if (constraintTrackingWorker.h != null) {
                bgh c2 = bdn.g(constraintTrackingWorker.a).c.t().c(constraintTrackingWorker.a().toString());
                if (c2 == null) {
                    constraintTrackingWorker.h();
                    return;
                }
                Context context = constraintTrackingWorker.a;
                bem bemVar = new bem(context, bdn.g(context).k, constraintTrackingWorker);
                bemVar.a(Collections.singletonList(c2));
                if (bemVar.c(constraintTrackingWorker.a().toString())) {
                    bbz.e().a(new Throwable[0]);
                    try {
                        dehn<bbx> c3 = constraintTrackingWorker.h.c();
                        c3.Pk(new bih(constraintTrackingWorker, c3), constraintTrackingWorker.g());
                        return;
                    } catch (Throwable th) {
                        bbz.e().a(th);
                        synchronized (constraintTrackingWorker.e) {
                            if (constraintTrackingWorker.f) {
                                bbz.e().a(new Throwable[0]);
                                constraintTrackingWorker.i();
                            } else {
                                constraintTrackingWorker.h();
                            }
                            return;
                        }
                    }
                }
                bbz.e().a(new Throwable[0]);
                constraintTrackingWorker.i();
                return;
            }
            bbz.e().a(new Throwable[0]);
            constraintTrackingWorker.h();
            return;
        }
        bbz.e().b(new Throwable[0]);
        constraintTrackingWorker.h();
    }
}
