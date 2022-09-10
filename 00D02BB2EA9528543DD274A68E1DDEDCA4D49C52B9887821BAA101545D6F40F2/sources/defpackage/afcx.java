package defpackage;
/* compiled from: PG */
/* renamed from: afcx  reason: default package */
/* loaded from: classes2.dex */
final class afcx implements cpcf<Void> {
    final /* synthetic */ boolean a;
    final /* synthetic */ afdd b;

    public afcx(afdd afddVar, boolean z) {
        this.b = afddVar;
        this.a = z;
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<Void> cpcqVar) {
        if (cpcqVar.b()) {
            ((ckco) this.b.q.a().a(ckfn.r)).a(this.a ? afez.a(5) : afez.a(7));
            return;
        }
        ((ckco) this.b.q.a().a(ckfn.r)).a(this.a ? afez.a(6) : afez.a(8));
        cpcqVar.e();
        cpcqVar.e();
    }
}
