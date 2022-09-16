package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rup  reason: default package */
/* loaded from: classes4.dex */
public final class rup implements rvf {
    public final Object a = new Object();
    public final ruq b;
    private final Executor c;

    public rup(Executor executor, ruq ruqVar) {
        this.c = executor;
        this.b = ruqVar;
    }

    @Override // defpackage.rvf
    public final void a(rve rveVar) {
        if (((rvj) rveVar).d) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new ruo(this));
            }
        }
    }
}
