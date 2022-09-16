package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aluu  reason: default package */
/* loaded from: classes.dex */
public final class aluu implements alve {
    public final Object a = new Object();
    public final aluv b;
    private final Executor c;

    public aluu(Executor executor, aluv aluvVar) {
        this.c = executor;
        this.b = aluvVar;
    }

    @Override // defpackage.alve
    public final void a(alvd alvdVar) {
        synchronized (this.a) {
        }
        this.c.execute(new alut(this));
    }
}
