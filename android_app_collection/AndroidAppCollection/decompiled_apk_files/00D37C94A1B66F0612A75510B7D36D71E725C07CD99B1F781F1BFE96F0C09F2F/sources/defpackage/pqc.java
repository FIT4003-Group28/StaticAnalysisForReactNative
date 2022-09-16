package defpackage;
/* compiled from: PG */
/* renamed from: pqc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pqc implements Runnable {
    public final /* synthetic */ pqh a;
    public final /* synthetic */ pqi b;
    public final /* synthetic */ ppr c;
    public final /* synthetic */ ppw d;
    private final /* synthetic */ int e;

    public /* synthetic */ pqc(pqh pqhVar, pqi pqiVar, ppr pprVar, ppw ppwVar) {
        this.a = pqhVar;
        this.b = pqiVar;
        this.c = pprVar;
        this.d = ppwVar;
    }

    public /* synthetic */ pqc(pqh pqhVar, pqi pqiVar, ppr pprVar, ppw ppwVar, int i) {
        this.e = i;
        this.a = pqhVar;
        this.b = pqiVar;
        this.c = pprVar;
        this.d = ppwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            pqh pqhVar = this.a;
            this.b.R(pqhVar.a, pqhVar.c, this.c, this.d);
        } else if (i == 1) {
            pqh pqhVar2 = this.a;
            this.b.Q(pqhVar2.a, pqhVar2.c, this.c, this.d);
        } else {
            pqh pqhVar3 = this.a;
            this.b.T(pqhVar3.a, pqhVar3.c, this.c, this.d);
        }
    }
}
