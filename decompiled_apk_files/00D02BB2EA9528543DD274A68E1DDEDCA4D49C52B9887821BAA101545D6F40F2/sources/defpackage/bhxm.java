package defpackage;
/* compiled from: PG */
/* renamed from: bhxm  reason: default package */
/* loaded from: classes3.dex */
final class bhxm implements btzi<dvjl, dvjn> {
    final /* synthetic */ String a;
    final /* synthetic */ bhxy b;

    public bhxm(bhxy bhxyVar, String str) {
        this.b = bhxyVar;
        this.a = str;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvjl> btzrVar, btzy btzyVar) {
        bttq bttqVar = btzyVar.p;
        this.b.J(dcdc.e(), this.a);
        this.b.c.b(new bhxl(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvjl> btzrVar, dvjn dvjnVar) {
        this.b.J(dvjnVar.a, this.a);
    }
}
