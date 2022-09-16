package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anko  reason: default package */
/* loaded from: classes.dex */
public class anko extends anie {
    public static anko q(ankt anktVar) {
        if (anktVar instanceof anko) {
            return (anko) anktVar;
        }
        return new anjx(anktVar);
    }

    public final anko r(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (anko) anlz.x(this, j, timeUnit, scheduledExecutorService);
    }
}
