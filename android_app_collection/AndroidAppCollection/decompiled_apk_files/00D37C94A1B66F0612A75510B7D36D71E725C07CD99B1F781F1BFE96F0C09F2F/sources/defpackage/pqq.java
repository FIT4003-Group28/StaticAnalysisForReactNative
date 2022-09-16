package defpackage;
/* compiled from: PG */
/* renamed from: pqq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pqq implements Runnable {
    public final /* synthetic */ pqx a;
    private final /* synthetic */ int b;

    public /* synthetic */ pqq(pqx pqxVar, int i) {
        this.b = i;
        this.a = pqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.r();
            return;
        }
        pqx pqxVar = this.a;
        if (pqxVar.t) {
            return;
        }
        ppx ppxVar = pqxVar.j;
        ptx.a(ppxVar);
        ppxVar.b(pqxVar);
    }
}
