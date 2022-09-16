package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwm  reason: default package */
/* loaded from: classes7.dex */
public final class nwm implements nxe {
    public final dxio<axwq> a;
    private final bunc b;

    public nwm(bunc buncVar, dxio<axwq> dxioVar) {
        this.b = buncVar;
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 131072) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        bunc buncVar = this.b;
        dtpb dtpbVar = nviVar.a.o;
        if (dtpbVar == null) {
            dtpbVar = dtpb.b;
        }
        dwco dwcoVar = dtpbVar.a;
        if (dwcoVar == null) {
            dwcoVar = dwco.f;
        }
        buncVar.a(dwcoVar, new nwl(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SEND_DISMISS_TODO);
    }
}
