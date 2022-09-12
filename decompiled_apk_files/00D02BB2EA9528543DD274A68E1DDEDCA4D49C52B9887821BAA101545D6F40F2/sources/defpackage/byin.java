package defpackage;
/* compiled from: PG */
/* renamed from: byin  reason: default package */
/* loaded from: classes4.dex */
final class byin implements btzi<dhlj, dhll> {
    final /* synthetic */ byip a;

    public byin(byip byipVar) {
        this.a = byipVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhlj> btzrVar, btzy btzyVar) {
        if (btzy.k.equals(btzyVar) || btzy.b.equals(btzyVar)) {
            this.a.d = byjw.ERROR_OFFLINE;
        } else {
            this.a.d = byjw.ERROR_GENERIC;
        }
        this.a.a();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhlj> btzrVar, dhll dhllVar) {
        byip byipVar;
        byjw byjwVar;
        dhll dhllVar2 = dhllVar;
        byip byipVar2 = this.a;
        byipVar2.c = dhllVar2;
        byipVar2.a = byipVar2.b.b();
        if (dhllVar2.b) {
            byipVar = this.a;
            byjwVar = byjw.SUCCESS;
        } else {
            byipVar = this.a;
            byjwVar = byjw.ERROR_GENERIC;
        }
        byipVar.d = byjwVar;
        this.a.a();
    }
}
