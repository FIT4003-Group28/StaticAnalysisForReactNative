package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: damz  reason: default package */
/* loaded from: classes5.dex */
final class damz<ResultT> implements danc<ResultT> {
    public final Object a = new Object();
    public final btcv b;
    private final Executor c;

    public damz(Executor executor, btcv btcvVar) {
        this.c = executor;
        this.b = btcvVar;
    }

    @Override // defpackage.danc
    public final void a(danb<ResultT> danbVar) {
        if (danbVar.a()) {
            synchronized (this.a) {
            }
            this.c.execute(new damy(this, danbVar));
        }
    }
}
