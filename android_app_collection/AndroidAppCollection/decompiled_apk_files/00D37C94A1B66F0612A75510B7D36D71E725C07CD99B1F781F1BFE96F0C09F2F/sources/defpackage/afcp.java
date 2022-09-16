package defpackage;
/* compiled from: PG */
/* renamed from: afcp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afcp implements Runnable {
    public final /* synthetic */ afcq a;
    private final /* synthetic */ int b;

    public /* synthetic */ afcp(afcq afcqVar, int i) {
        this.b = i;
        this.a = afcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            afcq afcqVar = this.a;
            afcqVar.rF(new afcr(afcqVar.h));
            return;
        }
        afcq afcqVar2 = this.a;
        afcqVar2.g.aK();
        afcn afcnVar = afcqVar2.i;
        if (afcnVar != null) {
            afcnVar.c();
        }
        afcqVar2.g.aJ();
    }
}
