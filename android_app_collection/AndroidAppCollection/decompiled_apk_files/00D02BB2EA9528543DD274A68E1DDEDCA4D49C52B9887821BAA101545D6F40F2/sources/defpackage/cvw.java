package defpackage;
/* compiled from: PG */
/* renamed from: cvw  reason: default package */
/* loaded from: classes5.dex */
final class cvw implements btzi<buff, bufh> {
    private final dxio<ckcw> a;
    @dzsi
    private final btzi<buff, bufh> b;

    public cvw(dxio<ckcw> dxioVar, @dzsi btzi<buff, bufh> btziVar) {
        this.a = dxioVar;
        this.b = btziVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<buff> btzrVar, btzy btzyVar) {
        ((ckco) this.a.a().a(ckfc.a)).a(btzyVar.d().y);
        bttq bttqVar = btzyVar.p;
        btzi<buff, bufh> btziVar = this.b;
        if (btziVar != null) {
            btziVar.QY(btzrVar, btzyVar);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<buff> btzrVar, bufh bufhVar) {
        bufh bufhVar2 = bufhVar;
        ((ckco) this.a.a().a(ckfc.a)).a(ckjk.SUCCESS.y);
        btzi<buff, bufh> btziVar = this.b;
        if (btziVar != null) {
            btziVar.QZ(btzrVar, bufhVar2);
        }
    }
}
