package defpackage;
/* compiled from: PG */
/* renamed from: bnsm  reason: default package */
/* loaded from: classes.dex */
public final class bnsm {
    @dzsi
    private bnsl a;
    @dzsi
    private bnsl b;
    private Runnable c;

    @dzsi
    public final synchronized bnsl a() {
        bnsl bnslVar = this.a;
        if (bnslVar != null) {
            bnsl bnslVar2 = bnslVar.c;
            this.a = bnslVar2;
            if (bnslVar2 == null) {
                this.b = null;
                return bnslVar;
            }
        }
        return bnslVar;
    }

    public final synchronized void b(bnsl bnslVar) {
        bnsl bnslVar2 = this.b;
        this.b = bnslVar;
        if (bnslVar2 == null) {
            this.a = bnslVar;
        } else {
            bnslVar2.c = bnslVar;
        }
        bnslVar.c = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized void c(Runnable runnable) {
        this.c = runnable;
    }
}
