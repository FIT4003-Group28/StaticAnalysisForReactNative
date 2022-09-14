package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwt  reason: default package */
/* loaded from: classes7.dex */
public final class nwt implements nxe {
    private final dxio<ache> a;

    public nwt(dxio<ache> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 16777216) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        ache a = this.a.a();
        achc achcVar = achc.CARD_UI_ACTION;
        dtpt dtptVar = nviVar.a.u;
        if (dtptVar == null) {
            dtptVar = dtpt.b;
        }
        acgz b = achb.b();
        for (dtps dtpsVar : dtptVar.a) {
            b.c(dtpsVar.a, dtpsVar.b);
        }
        a.k(false, false, achcVar, b.b());
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.START_FEEDBACK_FLOW);
    }
}
