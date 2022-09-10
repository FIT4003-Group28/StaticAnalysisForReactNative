package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ssb  reason: default package */
/* loaded from: classes7.dex */
public final class ssb implements qcc {
    private final btzp<djxc, djxk> a;
    private final Executor b;
    @dzsi
    private btzc c;

    public ssb(bumr bumrVar, vly vlyVar, Executor executor) {
        this.a = vlyVar.a(bumrVar);
        this.b = executor;
    }

    @Override // defpackage.qcc
    public final void a(qca qcaVar, degu<drih> deguVar) {
        btzc btzcVar = this.c;
        if (btzcVar != null) {
            btzcVar.a();
        }
        djxb bZ = djxc.c.bZ();
        dspd dspdVar = ((qae) qcaVar).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djxc djxcVar = (djxc) bZ.b;
        dspdVar.getClass();
        djxcVar.a |= 1;
        djxcVar.b = dspdVar;
        this.c = this.a.b(bZ.bK(), new ssa(deguVar), this.b);
    }
}
