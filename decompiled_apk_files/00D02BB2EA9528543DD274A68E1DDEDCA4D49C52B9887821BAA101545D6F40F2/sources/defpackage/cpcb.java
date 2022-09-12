package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpcb  reason: default package */
/* loaded from: classes5.dex */
public final class cpcb<TResult> implements cpcr<TResult> {
    public final Object a = new Object();
    @dzsi
    public final cpcc b;
    private final Executor c;

    public cpcb(Executor executor, cpcc cpccVar) {
        this.c = executor;
        this.b = cpccVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        if (((cpcx) cpcqVar).d) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new cpca(this));
            }
        }
    }
}
