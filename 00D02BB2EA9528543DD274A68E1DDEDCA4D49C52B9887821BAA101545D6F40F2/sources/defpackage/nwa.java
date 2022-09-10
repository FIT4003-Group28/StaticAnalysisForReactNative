package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwa  reason: default package */
/* loaded from: classes7.dex */
public final class nwa implements nxe {
    private static final dcqe a = dcqe.c("nwa");
    private final dxio<bsvm> b;
    private final dxio<bvjj> c;

    public nwa(dxio<bsvm> dxioVar, dxio<bvjj> dxioVar2) {
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 2) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtmn dtmnVar = nviVar.a.y;
        if (dtmnVar == null) {
            dtmnVar = dtmn.b;
        }
        dtml dtmlVar = dtml.UNKNOWN_ACTION_TYPE;
        dtml b = dtml.b(dtmnVar.a);
        if (b == null) {
            b = dtml.UNKNOWN_ACTION_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            this.b.a().j();
        } else if (ordinal == 2) {
            this.c.a().S(bvjk.dG, true);
        } else {
            Object[] objArr = new Object[1];
            dtml b2 = dtml.b(dtmnVar.a);
            if (b2 == null) {
                b2 = dtml.UNKNOWN_ACTION_TYPE;
            }
            objArr[0] = b2;
            bvoo.h("Unexpected settings type '%s'", objArr);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOCATION_HISTORY_SETTINGS);
    }
}
