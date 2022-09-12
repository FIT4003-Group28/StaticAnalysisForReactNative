package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpch  reason: default package */
/* loaded from: classes5.dex */
public final class cpch<TResult> implements cpcr<TResult> {
    public final Object a = new Object();
    @dzsi
    public final cpci b;
    private final Executor c;

    public cpch(Executor executor, cpci cpciVar) {
        this.c = executor;
        this.b = cpciVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        if (cpcqVar.b() || ((cpcx) cpcqVar).d) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new cpcg(this, cpcqVar));
        }
    }
}
