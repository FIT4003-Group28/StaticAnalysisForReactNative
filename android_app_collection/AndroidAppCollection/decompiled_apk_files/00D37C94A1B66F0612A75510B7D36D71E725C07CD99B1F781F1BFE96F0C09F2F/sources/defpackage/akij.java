package defpackage;
/* compiled from: PG */
/* renamed from: akij  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akij implements Runnable {
    public final /* synthetic */ akiq a;
    public final /* synthetic */ Throwable b;
    private final /* synthetic */ int c;

    public /* synthetic */ akij(akiq akiqVar, Throwable th) {
        this.a = akiqVar;
        this.b = th;
    }

    public /* synthetic */ akij(akiq akiqVar, Throwable th, int i) {
        this.c = i;
        this.a = akiqVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            akiq akiqVar = this.a;
            akiqVar.e.b(this.b);
            return;
        }
        akiq akiqVar2 = this.a;
        akiqVar2.e.b(this.b);
    }
}
