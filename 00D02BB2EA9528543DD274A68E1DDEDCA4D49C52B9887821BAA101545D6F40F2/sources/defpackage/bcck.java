package defpackage;
/* compiled from: PG */
/* renamed from: bcck  reason: default package */
/* loaded from: classes3.dex */
final class bcck implements bwrr<ilo> {
    public boolean a = false;
    final /* synthetic */ bccn b;

    public bcck(bccn bccnVar) {
        this.b = bccnVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        bccn bccnVar = this.b;
        if (!bccnVar.f || iloVar2 == null || !this.a) {
            return;
        }
        bccnVar.al.e(iloVar2);
        cqkx.p(this.b.al);
    }
}
