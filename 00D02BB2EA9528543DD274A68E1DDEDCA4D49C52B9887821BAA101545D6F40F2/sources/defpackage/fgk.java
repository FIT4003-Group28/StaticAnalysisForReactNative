package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fgk  reason: default package */
/* loaded from: classes6.dex */
final class fgk implements dxis {
    final /* synthetic */ ftt a;

    public fgk(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdnm cdnmVar = (cdnm) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cdnmVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cdnmVar.aI = tr;
        cdnmVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cdnmVar.aK = sU;
        cdnmVar.aL = new cpv();
        cdnmVar.aM = dxjc.c(this.a.eW.ie());
        cdnmVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        cdnmVar.a = sU2;
        cdnmVar.b = new cebd(this.a.eW.al(), this.a.uv());
        cdnmVar.c = this.a.eW.fc();
    }
}
