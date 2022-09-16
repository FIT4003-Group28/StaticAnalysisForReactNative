package defpackage;
/* compiled from: PG */
/* renamed from: ahto  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahto implements Runnable {
    public final /* synthetic */ ahtv a;
    public final /* synthetic */ Runnable b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahto(ahtv ahtvVar, Runnable runnable) {
        this.a = ahtvVar;
        this.b = runnable;
    }

    public /* synthetic */ ahto(ahtv ahtvVar, Runnable runnable, int i) {
        this.c = i;
        this.a = ahtvVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ahtv ahtvVar = this.a;
            ahtvVar.c.add(this.b);
            return;
        }
        ahtv ahtvVar2 = this.a;
        ahtvVar2.b.add(this.b);
    }
}
