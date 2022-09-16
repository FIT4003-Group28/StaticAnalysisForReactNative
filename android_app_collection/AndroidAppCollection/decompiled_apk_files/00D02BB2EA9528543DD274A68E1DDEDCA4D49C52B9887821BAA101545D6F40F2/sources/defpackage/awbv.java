package defpackage;
/* compiled from: PG */
/* renamed from: awbv  reason: default package */
/* loaded from: classes.dex */
public final class awbv implements crzp<btvo> {
    final /* synthetic */ awbw a;

    public awbv(awbw awbwVar) {
        this.a = awbwVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btvo> crzmVar) {
        btvo l = crzmVar.l();
        if (l == null) {
            return;
        }
        avzg l2 = this.a.b.b().l();
        dbsk.s(l2);
        btlu a = l2.a().a();
        btly btlyVar = new btly(this.a.c.t(bvjk.ir, a, 0));
        btly btlyVar2 = new btly(0);
        dmxp dmxpVar = l.getPaintParameters().b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        dmxh dmxhVar = dmxpVar.a;
        if (dmxhVar == null) {
            dmxhVar = dmxh.j;
        }
        dmyw dmywVar = dmxhVar.f;
        if (dmywVar == null) {
            dmywVar = dmyw.d;
        }
        if (dmywVar.c) {
            btlyVar2.a(1);
        }
        try {
            synchronized (this.a) {
                if (!this.a.h().g() && this.a.h().f() < 3) {
                    btlyVar2.a(2);
                }
            }
            if (btlyVar2.equals(btlyVar)) {
                return;
            }
            this.a.c.X(bvjk.ir, a, btlyVar2.a);
        } catch (avoh unused) {
        }
    }
}
