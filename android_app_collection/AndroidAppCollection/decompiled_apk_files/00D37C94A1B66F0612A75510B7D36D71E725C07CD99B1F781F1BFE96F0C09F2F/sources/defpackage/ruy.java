package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ruy  reason: default package */
/* loaded from: classes4.dex */
public final class ruy implements rvf {
    public final Object a = new Object();
    public final ruz b;
    private final Executor c;

    public ruy(Executor executor, ruz ruzVar) {
        this.c = executor;
        this.b = ruzVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        if (rveVar.k()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new rux(this, rveVar));
            }
        }
    }
}
