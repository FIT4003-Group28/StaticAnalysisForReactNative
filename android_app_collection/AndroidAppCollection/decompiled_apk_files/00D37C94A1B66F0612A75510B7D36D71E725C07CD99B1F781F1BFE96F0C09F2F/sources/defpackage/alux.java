package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alux  reason: default package */
/* loaded from: classes.dex */
public final class alux implements alve {
    public final Object a = new Object();
    public final aluy b;
    private final Executor c;

    public alux(Executor executor, aluy aluyVar) {
        this.c = executor;
        this.b = aluyVar;
    }

    @Override // defpackage.alve
    public final void a(alvd alvdVar) {
        if (!alvdVar.c()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new aluw(this, alvdVar));
            }
        }
    }
}
