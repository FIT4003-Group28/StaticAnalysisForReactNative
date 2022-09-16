package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpce  reason: default package */
/* loaded from: classes.dex */
public final class cpce<TResult> implements cpcr<TResult> {
    public final Object a = new Object();
    @dzsi
    public final cpcf<TResult> b;
    private final Executor c;

    public cpce(Executor executor, cpcf<TResult> cpcfVar) {
        this.c = executor;
        this.b = cpcfVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new cpcd(this, cpcqVar));
        }
    }
}
