package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwq  reason: default package */
/* loaded from: classes7.dex */
public final class nwq implements nxe {
    private final dxio<avik> a;

    public nwq(dxio<avik> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 262144) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        alad aladVar;
        dtpj dtpjVar = nviVar.a.p;
        if (dtpjVar == null) {
            dtpjVar = dtpj.d;
        }
        String str = null;
        if ((dtpjVar.a & 1) != 0) {
            dhjx dhjxVar = dtpjVar.b;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            aladVar = alad.c(dhjxVar);
        } else {
            aladVar = null;
        }
        if ((dtpjVar.a & 2) != 0) {
            str = dtpjVar.c;
        }
        this.a.a().i(aladVar, str);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SHOW_OFFLINE_MAP_SELECTION);
    }
}
