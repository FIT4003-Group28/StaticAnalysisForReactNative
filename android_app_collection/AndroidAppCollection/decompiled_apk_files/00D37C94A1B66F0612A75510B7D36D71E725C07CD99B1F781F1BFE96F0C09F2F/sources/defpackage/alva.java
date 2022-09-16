package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alva  reason: default package */
/* loaded from: classes.dex */
public final class alva implements alve {
    public final Object a = new Object();
    public final alvb b;
    private final Executor c;

    public alva(Executor executor, alvb alvbVar) {
        this.c = executor;
        this.b = alvbVar;
    }

    @Override // defpackage.alve
    public final void a(alvd alvdVar) {
        if (alvdVar.c()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new aluz(this, alvdVar));
            }
        }
    }
}
