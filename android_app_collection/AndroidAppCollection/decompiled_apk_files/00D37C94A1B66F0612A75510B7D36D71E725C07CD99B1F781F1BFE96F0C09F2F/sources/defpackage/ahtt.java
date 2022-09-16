package defpackage;
/* compiled from: PG */
/* renamed from: ahtt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahtt implements Runnable {
    public final /* synthetic */ ahtv a;
    public final /* synthetic */ acum b;
    public final /* synthetic */ acum c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahtt(ahtv ahtvVar, acum acumVar, acum acumVar2) {
        this.a = ahtvVar;
        this.b = acumVar;
        this.c = acumVar2;
    }

    public /* synthetic */ ahtt(ahtv ahtvVar, acum acumVar, acum acumVar2, int i) {
        this.d = i;
        this.a = ahtvVar;
        this.b = acumVar;
        this.c = acumVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ahtv ahtvVar = this.a;
            ahtvVar.a.o(this.b, this.c);
            return;
        }
        ahtv ahtvVar2 = this.a;
        ahtvVar2.a.E(this.b, this.c);
    }
}
