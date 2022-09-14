package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acrn  reason: default package */
/* loaded from: classes2.dex */
public final class acrn extends bbf {
    final /* synthetic */ acrp a;

    public acrn(acrp acrpVar) {
        this.a = acrpVar;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void b(int i) {
        dead deadVar;
        if (!this.a.j(i)) {
            return;
        }
        if (i < this.a.b || i == 0) {
            deadVar = dead.LEFT;
        } else {
            deadVar = dead.RIGHT;
        }
        this.a.a.Q(cjtd.a(dtxk.U), deadVar);
        acrk acrkVar = this.a.d;
        if (acrkVar == null) {
            return;
        }
        acrkVar.d(i);
        cqkx.p(this.a.d);
    }
}
