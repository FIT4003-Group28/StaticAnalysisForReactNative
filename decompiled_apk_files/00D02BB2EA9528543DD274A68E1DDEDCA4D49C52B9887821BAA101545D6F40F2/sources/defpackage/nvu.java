package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvu  reason: default package */
/* loaded from: classes7.dex */
public final class nvu implements nxe {
    private final dxio<bwjz> a;

    public nvu(dxio<bwjz> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 4) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtlv dtlvVar = nviVar.a.e;
        if (dtlvVar == null) {
            dtlvVar = dtlv.f;
        }
        if (nviVar.d == null) {
            nxl nxlVar = nxl.TODO_LIST;
        }
        int i = dtlvVar.e;
        int i2 = dtlvVar.d;
        String str = dtlvVar.a;
        this.a.a().m(dtlvVar, (fd) nviVar.b);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_ODELAY);
        set.add(dthd.LOAD_ODELAY_IN_DIRECTIONS_START_PAGE);
        set.add(dthd.LOAD_ODELAY_FOR_NEW_ROVER_PAGE);
        set.add(dthd.LOAD_ODELAY_FOR_HYBRID_MAP_VIEW);
        set.add(dthd.LOAD_ODELAY_WITH_PARTIAL_ENCLOSING_CARD);
        set.add(dthd.LOAD_ODELAY_FOR_CORRIDOR);
    }
}
