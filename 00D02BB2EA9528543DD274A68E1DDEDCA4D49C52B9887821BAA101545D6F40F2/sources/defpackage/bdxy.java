package defpackage;
/* compiled from: PG */
/* renamed from: bdxy  reason: default package */
/* loaded from: classes3.dex */
final class bdxy implements jkh {
    final /* synthetic */ bdyb a;

    public bdxy(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (!this.a.bS() || jjnVar2.b() || !this.a.aJ()) {
            bdyb bdybVar = this.a;
            if (!bdybVar.bH.z && bdybVar.bT() && jjnVar2 == jjn.HIDDEN) {
                this.a.aR(jjn.COLLAPSED);
            }
            if (!this.a.bH.z) {
                return;
            }
            if (jjnVar2 != jjn.COLLAPSED && (!this.a.bT() || jjnVar2 != jjn.HIDDEN)) {
                return;
            }
            this.a.bw.b(new Runnable(this) { // from class: bdxx
                private final bdxy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bdxy bdxyVar = this.a;
                    gn gnVar = bdxyVar.a.A;
                    if (gnVar == null || gnVar.J()) {
                        return;
                    }
                    gfq.m(bdxyVar.a);
                }
            }, bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }
}
