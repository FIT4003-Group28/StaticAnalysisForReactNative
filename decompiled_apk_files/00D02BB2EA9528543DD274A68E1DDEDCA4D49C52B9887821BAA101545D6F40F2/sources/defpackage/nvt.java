package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvt  reason: default package */
/* loaded from: classes7.dex */
public final class nvt implements nxe {
    private final dxio<qbt> a;

    public nvt(dxio<qbt> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 8388608) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtlr dtlrVar = nviVar.a.t;
        if (dtlrVar == null) {
            dtlrVar = dtlr.c;
        }
        qbt a = this.a.a();
        qdf o = qdg.o();
        qaw qawVar = (qaw) o;
        qawVar.a = dtlrVar.b;
        dvzj dvzjVar = dtlrVar.a;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        qawVar.b = dvzjVar.b;
        a.t(o.h());
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_NEARBY_STATION);
    }
}
