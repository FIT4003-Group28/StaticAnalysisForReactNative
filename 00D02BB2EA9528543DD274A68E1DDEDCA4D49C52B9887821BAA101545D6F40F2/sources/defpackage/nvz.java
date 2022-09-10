package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvz  reason: default package */
/* loaded from: classes7.dex */
public final class nvz implements nxe {
    private final dxio<cafi> a;

    public nvz(dxio<cafi> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & Integer.MIN_VALUE) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.a().k(null, dkcp.PHOTO);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_USER_PHOTOS);
    }
}
