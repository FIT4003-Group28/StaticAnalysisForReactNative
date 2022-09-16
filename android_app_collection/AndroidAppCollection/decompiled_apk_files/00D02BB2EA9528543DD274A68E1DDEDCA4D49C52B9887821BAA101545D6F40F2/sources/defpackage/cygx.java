package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cygx  reason: default package */
/* loaded from: classes5.dex */
public final class cygx<T> extends cygy<T> {
    private final Callable<T> e;
    private final Executor f;

    public cygx(Callable<T> callable, degu<T> deguVar, Executor executor) {
        super(deguVar);
        this.e = callable;
        this.f = executor;
    }

    @Override // defpackage.cygy
    public final dehn<T> f() {
        return deha.d(this.e, this.f);
    }
}
