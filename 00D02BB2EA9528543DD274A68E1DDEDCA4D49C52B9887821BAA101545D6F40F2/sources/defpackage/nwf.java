package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwf  reason: default package */
/* loaded from: classes7.dex */
public final class nwf implements nxe {
    private final dxio<bvjj> a;
    private final cqat b;

    public nwf(dxio<bvjj> dxioVar, cqat cqatVar) {
        this.a = dxioVar;
        this.b = cqatVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 64) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.a().Z(bvjk.ad, this.b.b() / 1000);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.RECORD_ROVER_NOTIFICATION_OPT_IN_LAST_DISMISSED);
    }
}
