package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iom  reason: default package */
/* loaded from: classes3.dex */
public final class iom implements ajxb {
    final /* synthetic */ iou a;

    public iom(iou iouVar) {
        this.a = iouVar;
    }

    @Override // defpackage.ajxb
    public final void a(cff cffVar, ajfz ajfzVar) {
        fyv.g(this.a.oi(), this.a.aI.a(cffVar).b);
        if (cffVar instanceof cev) {
            this.a.bj.b();
        }
        lwm lwmVar = this.a.bP;
        if (lwmVar != null && lwmVar.l()) {
            this.a.bP.i();
        }
        this.a.bR.g(false);
        zex zexVar = this.a.ce;
        String valueOf = String.valueOf(cffVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Continuation request failed. Error: ");
        sb.append(valueOf);
        zexVar.b(sb.toString());
    }
}
