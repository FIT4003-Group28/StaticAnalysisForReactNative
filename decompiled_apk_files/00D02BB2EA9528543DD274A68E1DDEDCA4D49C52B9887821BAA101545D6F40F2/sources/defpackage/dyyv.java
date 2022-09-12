package defpackage;

import defpackage.dyyv;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyyv  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyyv<S extends dyyv<S>> {
    public final dyeu a;
    public final dyet b;

    /* JADX INFO: Access modifiers changed from: protected */
    public dyyv(dyeu dyeuVar, dyet dyetVar) {
        dbsk.t(dyeuVar, "channel");
        this.a = dyeuVar;
        this.b = dyetVar;
    }

    protected abstract S a(dyeu dyeuVar, dyet dyetVar);

    public final S f(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.b(dyfr.a(j, timeUnit)));
    }

    public final <T> S g(dyes<T> dyesVar, T t) {
        return a(this.a, this.b.d(dyesVar, t));
    }

    public final S h(dyer dyerVar) {
        return a(this.a, this.b.a(dyerVar));
    }
}
