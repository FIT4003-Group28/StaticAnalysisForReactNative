package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpck  reason: default package */
/* loaded from: classes5.dex */
public final class cpck<TResult> implements cpcr<TResult> {
    public final Object a = new Object();
    @dzsi
    public final cpcl<? super TResult> b;
    private final Executor c;

    public cpck(Executor executor, cpcl<? super TResult> cpclVar) {
        this.c = executor;
        this.b = cpclVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        if (cpcqVar.b()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new cpcj(this, cpcqVar));
            }
        }
    }
}
