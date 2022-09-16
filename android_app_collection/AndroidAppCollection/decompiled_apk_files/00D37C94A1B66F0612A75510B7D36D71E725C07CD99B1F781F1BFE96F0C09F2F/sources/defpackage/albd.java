package defpackage;
/* compiled from: PG */
/* renamed from: albd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class albd implements Runnable {
    public final /* synthetic */ albf a;
    public final /* synthetic */ arrh b;
    private final /* synthetic */ int c;

    public /* synthetic */ albd(albf albfVar, arrh arrhVar) {
        this.a = albfVar;
        this.b = arrhVar;
    }

    public /* synthetic */ albd(albf albfVar, arrh arrhVar, int i) {
        this.c = i;
        this.a = albfVar;
        this.b = arrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            albf albfVar = this.a;
            albfVar.b.c(this.b);
        } else if (i == 1) {
            albf albfVar2 = this.a;
            albfVar2.b.c(this.b);
        } else {
            albf albfVar3 = this.a;
            albfVar3.b.c(this.b);
        }
    }
}
