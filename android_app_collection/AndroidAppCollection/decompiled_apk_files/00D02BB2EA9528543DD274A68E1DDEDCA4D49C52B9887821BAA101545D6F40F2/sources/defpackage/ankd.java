package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ankd  reason: default package */
/* loaded from: classes2.dex */
public final class ankd implements angy {
    public final List<angx> a = dchl.a();
    public final anhk b;
    private final cqat c;
    private final buly d;

    public ankd(buly bulyVar, cqat cqatVar, anhk anhkVar) {
        this.d = bulyVar;
        this.c = cqatVar;
        this.b = anhkVar;
    }

    private final void e(duxy duxyVar) {
        this.d.a(duxyVar, new ankc(this, duxyVar), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.angy
    public final void a(angx angxVar) {
        this.a.add(angxVar);
    }

    @Override // defpackage.angy
    public final void b(angx angxVar) {
        this.a.remove(angxVar);
    }

    @Override // defpackage.angy
    public final void c() {
        duxx bZ = duxy.f.bZ();
        dnwb a = this.b.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duxy duxyVar = (duxy) bZ.b;
        a.getClass();
        duxyVar.e = a;
        duxyVar.a |= 8;
        duxyVar.b = 5;
        duxyVar.c = true;
        e(bZ.bK());
    }

    @Override // defpackage.angy
    public final void d(dpop dpopVar, dngq dngqVar) {
        long b = this.c.b();
        if (dpopVar.c > b) {
            dsqp dsqpVar = (dsqp) dpopVar.cu(5);
            dsqpVar.bC(dpopVar);
            dpoo dpooVar = (dpoo) dsqpVar;
            if (dpooVar.c) {
                dpooVar.bF();
                dpooVar.c = false;
            }
            dpop dpopVar2 = (dpop) dpooVar.b;
            dpopVar2.a |= 2;
            dpopVar2.c = b;
            dpopVar = dpooVar.bK();
        }
        duxx bZ = duxy.f.bZ();
        dnwb a = this.b.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duxy duxyVar = (duxy) bZ.b;
        a.getClass();
        duxyVar.e = a;
        int i = duxyVar.a | 8;
        duxyVar.a = i;
        dpopVar.getClass();
        duxyVar.c = dpopVar;
        duxyVar.b = 3;
        dngqVar.getClass();
        duxyVar.d = dngqVar;
        duxyVar.a = i | 4;
        e(bZ.bK());
    }
}
