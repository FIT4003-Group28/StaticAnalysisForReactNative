package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwo  reason: default package */
/* loaded from: classes7.dex */
public final class nwo implements nxe {
    private final dxio<axwy> a;

    public nwo(dxio<axwy> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 2048) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dndr dndrVar;
        dtpd dtpdVar = nviVar.a.k;
        if (dtpdVar == null) {
            dtpdVar = dtpd.c;
        }
        int a = dtnx.a(dtpdVar.a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 0) {
            dndrVar = dndr.HOME;
        } else if (i != 1) {
            int i2 = dtpdVar.a;
            return;
        } else {
            dndrVar = dndr.WORK;
        }
        axwv n = axww.n();
        n.b(dndrVar);
        n.c(dtpdVar.b);
        n.d(false);
        this.a.a().L(n.h());
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SET_PLACE_ALIAS);
    }
}
