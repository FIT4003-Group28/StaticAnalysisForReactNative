package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: degn  reason: default package */
/* loaded from: classes6.dex */
public final class degn {
    private final AtomicReference<dehn<Void>> b = new AtomicReference<>(dehk.a);
    public degm a = new degm();

    private degn() {
    }

    public static degn a() {
        return new degn();
    }

    public final <T> dehn<T> b(deff<T> deffVar, Executor executor) {
        dbsk.s(deffVar);
        dbsk.s(executor);
        degl deglVar = new degl(executor, this);
        degi degiVar = new degi(deglVar, deffVar);
        deig d = deig.d();
        dehn<Void> andSet = this.b.getAndSet(d);
        deiv d2 = deiv.d(degiVar);
        andSet.Pk(d2, deglVar);
        dehn<T> o = deha.o(d2);
        degj degjVar = new degj(d2, d, andSet, o, deglVar);
        o.Pk(degjVar, dege.a);
        d2.Pk(degjVar, dege.a);
        return o;
    }
}
