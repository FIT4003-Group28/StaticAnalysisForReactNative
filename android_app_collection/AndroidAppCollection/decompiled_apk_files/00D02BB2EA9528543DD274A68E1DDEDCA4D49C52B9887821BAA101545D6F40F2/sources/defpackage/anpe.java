package defpackage;
/* compiled from: PG */
/* renamed from: anpe  reason: default package */
/* loaded from: classes2.dex */
final class anpe implements btzi<dwcw, dwcy> {
    final /* synthetic */ anpg a;

    public anpe(anpg anpgVar) {
        this.a = anpgVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwcw> btzrVar, btzy btzyVar) {
        if (!this.a.aD || btzy.d.equals(btzyVar)) {
            return;
        }
        this.a.by(false);
        this.a.bD();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwcw> btzrVar, dwcy dwcyVar) {
        dwcy dwcyVar2 = dwcyVar;
        anpg anpgVar = this.a;
        if (!anpgVar.aD) {
            return;
        }
        anpgVar.by(false);
        if ((dwcyVar2.a & 1) != 0) {
            anpg anpgVar2 = this.a;
            ily ilyVar = new ily();
            dvyw dvywVar = dwcyVar2.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            anpgVar2.ag = ilyVar.d();
            anpg anpgVar3 = this.a;
            if (anpgVar3.ag != null) {
                anpgVar3.bs();
                this.a.bz(true);
                return;
            }
        }
        this.a.bD();
    }
}
