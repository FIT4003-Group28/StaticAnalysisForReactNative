package defpackage;
/* compiled from: PG */
/* renamed from: scm  reason: default package */
/* loaded from: classes7.dex */
final class scm implements degu<CharSequence> {
    final /* synthetic */ sco a;

    public scm(sco scoVar) {
        this.a = scoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        sco scoVar = this.a;
        sca scaVar = scoVar.s;
        dbsk.s(scaVar);
        scoVar.u(scaVar, sco.z(th));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(CharSequence charSequence) {
        sco scoVar = this.a;
        sca scaVar = scoVar.s;
        dbsk.s(scaVar);
        scoVar.k(scaVar, charSequence.toString(), dndr.WORK);
    }
}
