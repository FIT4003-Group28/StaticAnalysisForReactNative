package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: damx  reason: default package */
/* loaded from: classes5.dex */
final class damx<ResultT> implements danc<ResultT> {
    public final Object a = new Object();
    public final btcu b;
    private final Executor c;

    public damx(Executor executor, btcu btcuVar) {
        this.c = executor;
        this.b = btcuVar;
    }

    @Override // defpackage.danc
    public final void a(danb<ResultT> danbVar) {
        if (!danbVar.a()) {
            synchronized (this.a) {
            }
            this.c.execute(new damw(this, danbVar));
        }
    }
}
