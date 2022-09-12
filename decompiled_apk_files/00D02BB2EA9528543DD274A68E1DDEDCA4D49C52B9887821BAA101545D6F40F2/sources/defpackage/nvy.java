package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvy  reason: default package */
/* loaded from: classes7.dex */
public final class nvy implements nxe {
    private static final dcqe a = dcqe.c("nvy");
    private final dxio<qbt> b;

    public nvy(dxio<qbt> dxioVar) {
        this.b = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 16) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtmd dtmdVar = nviVar.a.z;
        if (dtmdVar == null) {
            dtmdVar = dtmd.c;
        }
        if ((dtmdVar.a & 2) == 0) {
            bvoo.h("Missing action data", new Object[0]);
            return;
        }
        qbt a2 = this.b.a();
        djyo djyoVar = dtmdVar.b;
        if (djyoVar == null) {
            djyoVar = djyo.h;
        }
        a2.F(djyoVar);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_TRANSIT_SCHEMATIC_MAP);
    }
}
