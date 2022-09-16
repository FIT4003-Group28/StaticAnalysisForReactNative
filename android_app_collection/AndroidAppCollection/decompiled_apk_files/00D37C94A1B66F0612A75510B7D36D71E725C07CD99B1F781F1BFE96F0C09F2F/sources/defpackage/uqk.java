package defpackage;
/* compiled from: PG */
/* renamed from: uqk  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uqk implements Runnable {
    public final /* synthetic */ uqn a;
    public final /* synthetic */ ukz b;
    private final /* synthetic */ int c;

    public /* synthetic */ uqk(uqn uqnVar, ukz ukzVar) {
        this.a = uqnVar;
        this.b = ukzVar;
    }

    public /* synthetic */ uqk(uqn uqnVar, ukz ukzVar, int i) {
        this.c = i;
        this.a = uqnVar;
        this.b = ukzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            uqn uqnVar = this.a;
            ((uqe) uqnVar.b.get()).d(this.b);
            return;
        }
        uqn uqnVar2 = this.a;
        ((uqe) uqnVar2.b.get()).c(this.b);
    }
}
