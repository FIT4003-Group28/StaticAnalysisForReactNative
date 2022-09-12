package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwd  reason: default package */
/* loaded from: classes7.dex */
public final class nwd implements nxe {
    private final dxio<cafi> a;

    public nwd(dxio<cafi> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 1024) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtnp dtnpVar = nviVar.a.j;
        if (dtnpVar == null) {
            dtnpVar = dtnp.c;
        }
        if ((dtnpVar.a & 1) == 0) {
            this.a.a().k(null, null);
            return;
        }
        cafi a = this.a.a();
        dtnp dtnpVar2 = nviVar.a.j;
        if (dtnpVar2 == null) {
            dtnpVar2 = dtnp.c;
        }
        a.k(dtnpVar2.b, null);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.OPEN_PUBLIC_PROFILE);
    }
}
