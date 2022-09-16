package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rus  reason: default package */
/* loaded from: classes4.dex */
public final class rus implements rvf {
    public final Object a = new Object();
    public final rut b;
    private final Executor c;

    public rus(Executor executor, rut rutVar) {
        this.c = executor;
        this.b = rutVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new rur(this, rveVar));
        }
    }
}
