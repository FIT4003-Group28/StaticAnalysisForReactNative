package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwb  reason: default package */
/* loaded from: classes7.dex */
public final class nwb implements nxe {
    private final dxio<ccif> a;

    public nwb(dxio<ccif> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 134217728) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.a().f();
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.OPEN_CITY_EXPERT_DIALOG);
    }
}
