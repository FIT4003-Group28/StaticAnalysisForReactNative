package defpackage;
/* compiled from: PG */
/* renamed from: fqy  reason: default package */
/* loaded from: classes6.dex */
final class fqy<T> implements dzsj<T> {
    final /* synthetic */ fqz a;
    private final int b;

    public fqy(fqz fqzVar, int i) {
        this.a = fqzVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fqz fqzVar = this.a;
            ftt fttVar = fqzVar.b;
            return (T) aqrm.b(fttVar.eV, fttVar.eW.cn(), fqzVar.b.eW.ip(), fqzVar.b.eW.iG(), dxjh.c(fqzVar.b.eW.ax()), dxjh.c(fqzVar.b.m()));
        }
        fqz fqzVar2 = this.a;
        ftt fttVar2 = fqzVar2.b;
        dzsj<rb> dzsjVar = fttVar2.eV;
        dzsj<cqhn> il = fttVar2.eW.il();
        dzsj<aufl> ax = fqzVar2.b.eW.ax();
        dzsj<apyx> cn = fqzVar2.b.eW.cn();
        dzsj<auur> mm = fqzVar2.b.eW.mm();
        dzsj dzsjVar2 = fqzVar2.a;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fqy(fqzVar2, 1);
            fqzVar2.a = dzsjVar2;
        }
        return (T) new aqsj(dzsjVar, il, ax, cn, mm, dzsjVar2, fqzVar2.b.lR(), fqzVar2.b.eW.iG());
    }
}
