package defpackage;
/* compiled from: PG */
/* renamed from: anjk  reason: default package */
/* loaded from: classes2.dex */
final class anjk implements bqh {
    final /* synthetic */ anjl a;

    public anjk(anjl anjlVar) {
        this.a = anjlVar;
    }

    @Override // defpackage.bqh
    public final void a(bqa bqaVar) {
        ddho ddhoVar;
        eapg eapgVar = new eapg(bqaVar.a, bqaVar.b + 1, bqaVar.c);
        if (eapgVar.B(aogc.j(this.a.e))) {
            return;
        }
        angs<aogo> b = this.a.c.b();
        if (b.e()) {
            aogo f = b.f();
            f.d(eapgVar);
            if (f.b().contains(Integer.valueOf(eapgVar.t()))) {
                ddhoVar = dtyi.be;
            } else {
                f.d(eapgVar);
                ddhoVar = f.a().contains(Integer.valueOf(eapgVar.t())) ? dtyi.bg : dtyi.bf;
            }
            this.a.g.i(cjtd.a(ddhoVar));
        }
        anjl anjlVar = this.a;
        anjlVar.d.a(anjlVar.b, eapgVar);
    }
}
