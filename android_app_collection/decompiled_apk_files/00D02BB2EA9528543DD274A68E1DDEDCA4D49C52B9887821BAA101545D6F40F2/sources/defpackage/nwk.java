package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwk  reason: default package */
/* loaded from: classes7.dex */
public final class nwk implements nxe {
    private final gga a;
    private final dxio<arfm> b;

    public nwk(gga ggaVar, dxio<arfm> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 33554432) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dthb dthbVar = nviVar.a;
        if ((dthbVar.a & 33554432) != 0) {
            this.a.w();
            arfm a = this.b.a();
            dtoz dtozVar = dthbVar.v;
            if (dtozVar == null) {
                dtozVar = dtoz.b;
            }
            a.f(dtozVar.a);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SELECT_MY_MAP);
    }
}
