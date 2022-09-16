package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wrx  reason: default package */
/* loaded from: classes7.dex */
public final class wrx implements begr {
    final /* synthetic */ akqq a;
    final /* synthetic */ wsc b;

    public wrx(wsc wscVar, akqq akqqVar) {
        this.b = wscVar;
        this.a = akqqVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        wsc wscVar;
        akqq akqqVar;
        this.b.f.b(pfp.a(iloVar));
        wsc wscVar2 = this.b;
        boolean z = true;
        wscVar2.p = true;
        bxbd bxbdVar = wscVar2.v;
        if (bxbdVar != null) {
            bxbdVar.l(iloVar);
        }
        dro droVar = this.b.w;
        if (droVar != null) {
            droVar.e(iloVar);
        }
        wsc wscVar3 = this.b;
        wscVar3.b.b(wscVar3.y);
        this.b.x = iloVar.aj();
        if (this.a != null || (akqqVar = (wscVar = this.b).x) == null) {
            z = false;
        } else {
            if (wscVar.r) {
                wscVar.k.e(wscVar.j, akqqVar);
            }
            this.b.y = iloVar;
        }
        wsc wscVar4 = this.b;
        dvvo dvvoVar = iloVar.h().w;
        if (dvvoVar == null) {
            dvvoVar = dvvo.e;
        }
        if (wscVar4.K(dvvoVar) || z) {
            cqkx.p(this.b);
        }
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        int i = wsc.z;
        bxbd bxbdVar = this.b.v;
        if (bxbdVar != null) {
            bxbdVar.l(null);
        }
    }
}
