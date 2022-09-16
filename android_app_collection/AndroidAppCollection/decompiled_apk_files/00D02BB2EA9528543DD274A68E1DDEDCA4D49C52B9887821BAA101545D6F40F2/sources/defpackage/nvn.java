package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvn  reason: default package */
/* loaded from: classes7.dex */
public final class nvn implements nxe {
    private final dxio<axwy> a;

    public nvn(dxio<axwy> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 268435456) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtjl dtjlVar = nviVar.a.w;
        if (dtjlVar == null) {
            dtjlVar = dtjl.c;
        }
        dvvc dvvcVar = dtjlVar.a;
        if (dvvcVar == null) {
            dvvcVar = dvvc.d;
        }
        dndr b = dndr.b(dvvcVar.b);
        if (b == null) {
            b = dndr.UNKNOWN_ALIAS_TYPE;
        }
        dvvc dvvcVar2 = dtjlVar.a;
        if (dvvcVar2 == null) {
            dvvcVar2 = dvvc.d;
        }
        long j = dvvcVar2.c;
        axwy a = this.a.a();
        dvvi dvviVar = dtjlVar.b;
        if (dvviVar == null) {
            dvviVar = dvvi.k;
        }
        a.ab(b, j, dvviVar);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DELETE_PLACE_ALIAS);
    }
}
