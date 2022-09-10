package defpackage;
/* compiled from: PG */
/* renamed from: adwx  reason: default package */
/* loaded from: classes2.dex */
final class adwx implements btzi<dizr, dizt> {
    final /* synthetic */ dqjh a;
    final /* synthetic */ dqjc b;
    final /* synthetic */ adwy c;

    public adwx(adwy adwyVar, dqjh dqjhVar, dqjc dqjcVar) {
        this.c = adwyVar;
        this.a = dqjhVar;
        this.b = dqjcVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dizr> btzrVar, btzy btzyVar) {
        adwy adwyVar = this.c;
        adwyVar.h = this.b;
        cqkx.p(adwyVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dizr> btzrVar, dizt diztVar) {
        adwy adwyVar = this.c;
        bnoq bnoqVar = adwyVar.b;
        btlu btluVar = adwyVar.d;
        long j = adwyVar.g;
        dggg dgggVar = adwyVar.e;
        bnoqVar.a.Pz(bnop.d(btluVar, j, dgggVar), this.a);
    }
}
