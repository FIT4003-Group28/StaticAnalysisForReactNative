package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwc  reason: default package */
/* loaded from: classes7.dex */
public final class nwc implements nxe {
    private final dxio<arfm> a;

    public nwc(dxio<arfm> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 67108864) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        if ((nviVar.a.a & 67108864) != 0) {
            this.a.a().q();
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.OPEN_MY_MAPS_LIST);
    }
}
