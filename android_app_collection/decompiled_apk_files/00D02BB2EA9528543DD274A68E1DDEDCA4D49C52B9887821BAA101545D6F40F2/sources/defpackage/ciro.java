package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ciro  reason: default package */
/* loaded from: classes4.dex */
public class ciro implements cirn, crzp {
    private final dxio<cqhn> a;
    private final dxio<bzqn> b;
    private cqix<?> c;

    public ciro(Executor executor, dxio<cqhn> dxioVar, dxio<bzqn> dxioVar2, crzm<chua> crzmVar) {
        cqix<?> fT;
        this.a = dxioVar;
        this.b = dxioVar2;
        if (crzmVar.k()) {
            chua l = crzmVar.l();
            dbsk.s(l);
            if ((l.a & 1) != 0) {
                bzqk bzqkVar = new bzqk();
                bzqn a = dxioVar2.a();
                chua l2 = crzmVar.l();
                dbsk.s(l2);
                dqkf dqkfVar = l2.b;
                fT = cqgr.fT(bzqkVar, a.a(dqkfVar == null ? dqkf.f : dqkfVar));
                this.c = fT;
                crzmVar.e(this, executor);
            }
        }
        fT = cqgr.fT(new cqiu(), cqkp.T);
        this.c = fT;
        crzmVar.e(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<chua> crzmVar) {
        chua l = crzmVar.l();
        if (l == null || (l.a & 1) == 0) {
            this.c = cqgr.fT(new cqiu(), cqkp.T);
        } else {
            bzqk bzqkVar = new bzqk();
            bzqn a = this.b.a();
            dqkf dqkfVar = l.b;
            if (dqkfVar == null) {
                dqkfVar = dqkf.f;
            }
            this.c = cqgr.fT(bzqkVar, a.a(dqkfVar));
        }
        this.a.a();
        cqkx.p(this);
    }

    @Override // defpackage.cirn
    public cqix<?> b() {
        return this.c;
    }
}
