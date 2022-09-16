package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: agtj  reason: default package */
/* loaded from: classes.dex */
public final class agtj {
    public static ankt a(ankt anktVar, final Set set, final anir anirVar, Executor executor) {
        return anhq.i(anktVar, Exception.class, new anir() { // from class: agtf
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                Set<Class> set2 = set;
                anir anirVar2 = anirVar;
                Exception exc = (Exception) obj;
                exc.getClass();
                for (Class cls : set2) {
                    if (cls.isInstance(exc)) {
                        return anirVar2.a(exc);
                    }
                }
                afus.c(1, 28, "Encountered unexpected exception during fallback", exc);
                throw exc;
            }
        }, executor);
    }

    public static ankt b(ankt anktVar, int i, ScheduledExecutorService scheduledExecutorService) {
        return anii.h(anktVar, new fgn(i, 8), scheduledExecutorService);
    }

    public static final ankt c(String str, ankt anktVar, ankt anktVar2, long j, amvn amvnVar, ScheduledExecutorService scheduledExecutorService, agpt agptVar, ampt amptVar, int i) {
        amuk i2 = anlz.i(amuk.s(anktVar, anktVar2));
        ankt x = anlz.x(anlz.r(b(anktVar, 0, scheduledExecutorService)), j, TimeUnit.MILLISECONDS, scheduledExecutorService);
        amvl amvlVar = new amvl();
        amvlVar.j(amvnVar);
        amvlVar.c(TimeoutException.class);
        ankt a = a(x, amvlVar.g(), new agtd(i2, scheduledExecutorService, amvnVar, anktVar), scheduledExecutorService);
        anlz.A(a, new agtg(amptVar, agptVar, str, i, anktVar2, anjk.a), anjk.a);
        return anii.h(a, agix.h, anjk.a);
    }
}
