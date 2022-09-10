package defpackage;
/* compiled from: PG */
/* renamed from: bccp  reason: default package */
/* loaded from: classes3.dex */
final class bccp implements bwrr<ilo> {
    public boolean a = false;
    final /* synthetic */ bccs b;

    public bccp(bccs bccsVar) {
        this.b = bccsVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        bccs bccsVar = this.b;
        if (!bccsVar.ad || iloVar2 == null || !this.a) {
            return;
        }
        bccsVar.d.e(iloVar2);
        cqkx.p(this.b.d);
    }
}
