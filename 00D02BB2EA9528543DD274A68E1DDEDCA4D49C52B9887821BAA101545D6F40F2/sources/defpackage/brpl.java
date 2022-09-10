package defpackage;
/* compiled from: PG */
/* renamed from: brpl  reason: default package */
/* loaded from: classes4.dex */
public final class brpl implements bwrr<ilo> {
    final /* synthetic */ brpm a;
    private final bwrs<ilo> b;
    private final dnqh c;
    private final brlt d;
    private boolean e = true;

    public brpl(brpm brpmVar, bwrs<ilo> bwrsVar, dnqh dnqhVar, brlt brltVar) {
        this.a = brpmVar;
        this.b = bwrsVar;
        this.c = dnqhVar;
        this.d = brltVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        if (iloVar2 != null && iloVar2.f && !iloVar2.j()) {
            if (this.d == brlt.FIRST_RESULT) {
                ((ckco) this.a.a.a(ckix.d)).a(ckiw.a(true != this.e ? 3 : 2));
            }
            cjqy cjqyVar = this.a.d;
            dvnp dvnpVar = dvnp.PLACE_DETAILS;
            dvxb dvxbVar = iloVar2.h().V;
            if (dvxbVar == null) {
                dvxbVar = dvxb.d;
            }
            cjqyVar.p(dvnpVar, dvxbVar.b, this.c);
            bwqv.t(this.b, this);
        }
        this.e = false;
    }
}
