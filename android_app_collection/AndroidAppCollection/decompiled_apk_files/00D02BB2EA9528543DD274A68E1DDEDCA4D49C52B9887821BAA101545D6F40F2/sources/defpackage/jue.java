package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jue  reason: default package */
/* loaded from: classes7.dex */
public final class jue implements dbty<ncm> {
    final /* synthetic */ akox a;
    final /* synthetic */ cqkj b;
    final /* synthetic */ btvo c;
    final /* synthetic */ ckcw d;
    final /* synthetic */ bgdz e;
    final /* synthetic */ ncn f;
    final /* synthetic */ broq g;
    final /* synthetic */ koc h;
    final /* synthetic */ kos i;
    final /* synthetic */ jvh j;

    public jue(jvh jvhVar, akox akoxVar, cqkj cqkjVar, btvo btvoVar, ckcw ckcwVar, bgdz bgdzVar, ncn ncnVar, broq broqVar, koc kocVar, kos kosVar) {
        this.j = jvhVar;
        this.a = akoxVar;
        this.b = cqkjVar;
        this.c = btvoVar;
        this.d = ckcwVar;
        this.e = bgdzVar;
        this.f = ncnVar;
        this.g = broqVar;
        this.h = kocVar;
        this.i = kosVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ ncm a() {
        brcw brcwVar;
        akox akoxVar = this.a;
        bgea bgeaVar = new bgea(akoxVar, akoxVar.k(), this.b.d.getResources(), this.c);
        bgdt bgdtVar = new bgdt(this.c, this.d, this.e);
        ncn ncnVar = this.f;
        broq broqVar = this.g;
        akox akoxVar2 = this.a;
        befw a = this.j.U.a();
        koc kocVar = this.h;
        kos kosVar = this.i;
        if (kosVar == null) {
            brcwVar = juc.a;
        } else {
            kosVar.getClass();
            brcwVar = new brcw() { // from class: jud
                @Override // defpackage.brcw
                public final void a() {
                    throw null;
                }
            };
        }
        ncn.a(broqVar, 1);
        cqat a2 = ncnVar.a.a();
        ncn.a(a2, 2);
        buxk a3 = ncnVar.b.a();
        ncn.a(a3, 3);
        ahjq a4 = ncnVar.c.a();
        ncn.a(a4, 4);
        ncn.a(akoxVar2, 5);
        ncn.a(a, 6);
        ncn.a(bgdtVar, 7);
        ncn.a(bgeaVar, 8);
        ckcw a5 = ncnVar.d.a();
        ncn.a(a5, 9);
        ncn.a(kocVar, 10);
        ncn.a(brcwVar, 11);
        return new ncm(broqVar, a2, a3, a4, akoxVar2, a, bgdtVar, bgeaVar, a5, kocVar);
    }
}
