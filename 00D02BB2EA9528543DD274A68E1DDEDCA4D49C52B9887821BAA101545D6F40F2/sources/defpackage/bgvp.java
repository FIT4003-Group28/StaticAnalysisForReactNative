package defpackage;
/* compiled from: PG */
/* renamed from: bgvp  reason: default package */
/* loaded from: classes3.dex */
public class bgvp implements bgvl {
    private final dgcm a;
    private final bgvo b;
    private final bwrs<ilo> c;

    public bgvp(dgcm dgcmVar, bwrs<ilo> bwrsVar, bgvo bgvoVar) {
        dbsk.l(true);
        this.a = dgcmVar;
        this.c = bwrsVar;
        this.b = bgvoVar;
    }

    @Override // defpackage.bgvl
    public dcdc<bgvk> a() {
        dccx F = dcdc.F();
        for (dgck dgckVar : this.a.b) {
            bgvo bgvoVar = this.b;
            bwrs<ilo> bwrsVar = this.c;
            bgvf a = bgvoVar.a.a();
            bgvo.a(a, 1);
            bgvo.a(dgckVar, 2);
            bgvo.a(bwrsVar, 3);
            F.g(new bgvn(a, dgckVar, bwrsVar));
        }
        return F.f();
    }
}
