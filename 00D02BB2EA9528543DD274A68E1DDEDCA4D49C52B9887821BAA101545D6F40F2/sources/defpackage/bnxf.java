package defpackage;
/* compiled from: PG */
/* renamed from: bnxf  reason: default package */
/* loaded from: classes3.dex */
final class bnxf implements begr {
    final /* synthetic */ bnxi a;

    public bnxf(bnxi bnxiVar) {
        this.a = bnxiVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        bnxi bnxiVar = this.a;
        dnjb dnjbVar = iloVar.cd().j;
        if (dnjbVar == null) {
            dnjbVar = dnjb.h;
        }
        dodk dodkVar = dnjbVar.g;
        if (dodkVar == null) {
            dodkVar = dodk.c;
        }
        bnxiVar.g = dodkVar;
        dodk dodkVar2 = this.a.g;
        if (dodkVar2 == null || dodkVar2.a.size() <= 0) {
            this.a.aS();
            return;
        }
        this.a.aR();
        cqkx.p(this.a.ae);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        gga ggaVar = this.a.ag;
        dbsk.s(ggaVar);
        ppw.b(ggaVar, new bnxd(this), new bnxe(this));
    }
}
