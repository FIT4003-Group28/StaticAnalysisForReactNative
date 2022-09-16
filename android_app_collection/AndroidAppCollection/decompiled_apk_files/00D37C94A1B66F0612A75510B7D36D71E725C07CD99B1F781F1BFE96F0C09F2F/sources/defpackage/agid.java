package defpackage;
/* compiled from: PG */
/* renamed from: agid  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agid implements Runnable {
    public final /* synthetic */ agio a;
    public final /* synthetic */ Runnable b;
    private final /* synthetic */ int c;

    public /* synthetic */ agid(agio agioVar, Runnable runnable) {
        this.a = agioVar;
        this.b = runnable;
    }

    public /* synthetic */ agid(agio agioVar, Runnable runnable, int i) {
        this.c = i;
        this.a = agioVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            agio agioVar = this.a;
            Runnable runnable = this.b;
            if (!agioVar.y()) {
                return;
            }
            runnable.run();
            return;
        }
        agio agioVar2 = this.a;
        Runnable runnable2 = this.b;
        if (!agioVar2.y()) {
            return;
        }
        runnable2.run();
    }
}
