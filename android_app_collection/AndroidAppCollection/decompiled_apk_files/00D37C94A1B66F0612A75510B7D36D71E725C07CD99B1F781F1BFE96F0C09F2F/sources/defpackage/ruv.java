package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ruv  reason: default package */
/* loaded from: classes4.dex */
public final class ruv implements rvf {
    public final Object a = new Object();
    public final ruw b;
    private final Executor c;

    public ruv(Executor executor, ruw ruwVar) {
        this.c = executor;
        this.b = ruwVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        if (rveVar.k() || ((rvj) rveVar).d) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new ruu(this, rveVar));
        }
    }
}
