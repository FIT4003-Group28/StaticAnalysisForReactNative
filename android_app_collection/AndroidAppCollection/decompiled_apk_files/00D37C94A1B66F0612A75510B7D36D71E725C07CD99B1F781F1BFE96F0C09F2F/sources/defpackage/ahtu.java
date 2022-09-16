package defpackage;
/* compiled from: PG */
/* renamed from: ahtu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahtu implements Runnable {
    public final /* synthetic */ ahtv a;
    public final /* synthetic */ acum b;
    public final /* synthetic */ asjj c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahtu(ahtv ahtvVar, acum acumVar, asjj asjjVar) {
        this.a = ahtvVar;
        this.b = acumVar;
        this.c = asjjVar;
    }

    public /* synthetic */ ahtu(ahtv ahtvVar, acum acumVar, asjj asjjVar, int i) {
        this.d = i;
        this.a = ahtvVar;
        this.b = acumVar;
        this.c = asjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            ahtv ahtvVar = this.a;
            ahtvVar.a.u(this.b, this.c);
        } else if (i == 1) {
            ahtv ahtvVar2 = this.a;
            ahtvVar2.a.q(this.b, this.c);
        } else {
            ahtv ahtvVar3 = this.a;
            ahtvVar3.a.w(this.b, this.c);
        }
    }
}
