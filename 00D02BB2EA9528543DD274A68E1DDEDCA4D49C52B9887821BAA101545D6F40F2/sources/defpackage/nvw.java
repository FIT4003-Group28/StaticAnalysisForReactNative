package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvw  reason: default package */
/* loaded from: classes7.dex */
public final class nvw implements nxe {
    private final dxio<bbut> a;

    public nvw(dxio<bbut> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 32) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtlz dtlzVar = nviVar.a.A;
        if (dtlzVar == null) {
            dtlzVar = dtlz.c;
        }
        ily ilyVar = new ily();
        dvya bZ = dvyw.bv.bZ();
        bZ.a(dtlzVar.b);
        ilyVar.E(bZ.bK());
        ilo d = ilyVar.d();
        bbut a = this.a.a();
        dwge dwgeVar = dtlzVar.a;
        if (dwgeVar == null) {
            dwgeVar = dwge.m;
        }
        a.F(new cknz(d, new nvv(dwgeVar)));
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_PHOTOS);
    }
}
