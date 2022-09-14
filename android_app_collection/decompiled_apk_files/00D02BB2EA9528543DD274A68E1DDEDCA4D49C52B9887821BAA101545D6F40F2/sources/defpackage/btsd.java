package defpackage;
/* compiled from: PG */
/* renamed from: btsd  reason: default package */
/* loaded from: classes4.dex */
final class btsd implements cpcf<Void> {
    final /* synthetic */ btsf a;

    public btsd(btsf btsfVar) {
        this.a = btsfVar;
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<Void> cpcqVar) {
        if (cpcqVar.b()) {
            cjqq cjqqVar = this.a.c;
            if (cjqqVar == null) {
                return;
            }
            cjqqVar.g().d(cjtd.a(dtyb.cD));
            return;
        }
        Exception e = cpcqVar.e();
        if (e != null) {
            bvoo.j(e);
        }
        acfu acfuVar = this.a.e;
        if (acfuVar == null) {
            return;
        }
        acfuVar.a.j(cpcqVar.e());
    }
}
