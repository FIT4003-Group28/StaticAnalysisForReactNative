package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwp  reason: default package */
/* loaded from: classes7.dex */
public final class nwp implements nxe {
    private final dxio<nut> a;
    private final dxio<aagc> b;

    public nwp(dxio<nut> dxioVar, dxio<aagc> dxioVar2) {
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 4096) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        if (this.a.a().w()) {
            dtpf dtpfVar = nviVar.a.E;
            if (dtpfVar == null) {
                dtpfVar = dtpf.b;
            }
            this.b.a().a(dtpfVar.a, 3);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SHOW_EVENT_SHEET_ACTION);
    }
}
