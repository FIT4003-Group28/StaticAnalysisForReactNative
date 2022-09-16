package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: anju  reason: default package */
/* loaded from: classes.dex */
public final class anju {
    private final AtomicReference b = new AtomicReference(ankq.a);
    public anjt a = new anjt();

    private anju() {
    }

    public static anju a() {
        return new anju();
    }

    public final ankt b(aniq aniqVar, Executor executor) {
        aniqVar.getClass();
        executor.getClass();
        anjs anjsVar = new anjs(executor, this);
        anjp anjpVar = new anjp(anjsVar, aniqVar);
        SettableFuture f = SettableFuture.f();
        ankt anktVar = (ankt) this.b.getAndSet(f);
        anlq f2 = anlq.f(anjpVar);
        anktVar.qY(f2, anjsVar);
        ankt r = anlz.r(f2);
        anjq anjqVar = new anjq(f2, f, anktVar, r, anjsVar);
        r.qY(anjqVar, anjk.a);
        f2.qY(anjqVar, anjk.a);
        return r;
    }
}
