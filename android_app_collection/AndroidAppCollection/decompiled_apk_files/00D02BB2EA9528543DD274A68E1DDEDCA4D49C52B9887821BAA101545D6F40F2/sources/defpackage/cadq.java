package defpackage;
/* compiled from: PG */
/* renamed from: cadq  reason: default package */
/* loaded from: classes4.dex */
final class cadq implements bqlb {
    final /* synthetic */ cadx a;

    public cadq(cadx cadxVar) {
        this.a = cadxVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        cadx cadxVar = this.a;
        cadxVar.y(cadxVar.h.getString(bzqf.RATING_SUBMITTED_ACCESSIBILITY));
        this.a.t(bqlfVar.a());
        cadx cadxVar2 = this.a;
        cadxVar2.v = 3;
        cqkx.p(cadxVar2);
    }

    @Override // defpackage.bqlb
    public final void e() {
        cadx cadxVar = this.a;
        cadxVar.v = 3;
        cqkx.p(cadxVar);
    }
}
