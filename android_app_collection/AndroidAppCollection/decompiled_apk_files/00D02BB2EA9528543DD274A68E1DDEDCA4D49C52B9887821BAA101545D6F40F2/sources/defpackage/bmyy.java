package defpackage;
/* compiled from: PG */
/* renamed from: bmyy  reason: default package */
/* loaded from: classes3.dex */
final class bmyy extends bnab {
    final /* synthetic */ boolean a;
    final /* synthetic */ bmza b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmyy(bmza bmzaVar, ff ffVar, cqkj cqkjVar, cjqy cjqyVar, dxio dxioVar, akfc akfcVar, bvrb bvrbVar, boolean z) {
        super(ffVar, cqkjVar, cjqyVar, dxioVar, akfcVar, bvrbVar);
        this.b = bmzaVar;
        this.a = z;
    }

    @Override // defpackage.bnab
    public final void a() {
        bmza bmzaVar = this.b;
        bmyz bmyzVar = new bmyz(bmzaVar, bmzaVar.a, bmzaVar.d, bmzaVar.e, bmzaVar.i, bmzaVar.j, bmzaVar.k.a(), bmzaVar.q, bmzaVar.r, this.a);
        bwrs<ilo> bwrsVar = bmyzVar.b.s;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        if ((c == null || !c.bi()) && !bmyzVar.b.h.a()) {
            bwrs<ilo> bwrsVar2 = bmyzVar.b.s;
            dbsk.s(bwrsVar2);
            fd K = bmyzVar.b.a.K();
            bmza bmzaVar2 = bmyzVar.b;
            bmzr bmzrVar = new bmzr(bwrsVar2, K, bmzaVar2.a, bmzaVar2.b, bmzaVar2.c, bmzaVar2.l.a());
            bmza bmzaVar3 = bmyzVar.b;
            gga ggaVar = bmzaVar3.a;
            dxio<akfa> dxioVar = bmzaVar3.e;
            cjxd cjxdVar = bmzaVar3.i;
            awnm awnmVar = bmzaVar3.j;
            axwy a = bmzaVar3.k.a();
            bmza bmzaVar4 = bmyzVar.b;
            new bzpr(bmyzVar.c, bmyzVar.e, bmyzVar.f, bmyzVar.g, bmyzVar.h, bmyzVar.i, bmyzVar.j).a(new bmzu(bmyzVar, new bmzs(bmzrVar, ggaVar, dxioVar, cjxdVar, awnmVar, a, bmzaVar4.q, bmzaVar4.r, bmyzVar.a))).a("geo_personal_place_label_or_contact");
            return;
        }
        bmyzVar.a();
    }
}
