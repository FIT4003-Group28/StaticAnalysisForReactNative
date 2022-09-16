package defpackage;
/* compiled from: PG */
/* renamed from: ahts  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahts implements Runnable {
    public final /* synthetic */ ahtv a;
    public final /* synthetic */ acum b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahts(ahtv ahtvVar, acum acumVar) {
        this.a = ahtvVar;
        this.b = acumVar;
    }

    public /* synthetic */ ahts(ahtv ahtvVar, acum acumVar, int i) {
        this.c = i;
        this.a = ahtvVar;
        this.b = acumVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ahtv ahtvVar = this.a;
            ahtvVar.a.n(this.b);
            return;
        }
        ahtv ahtvVar2 = this.a;
        ahtvVar2.a.D(this.b);
    }
}
