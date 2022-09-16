package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nwr  reason: default package */
/* loaded from: classes7.dex */
public final class nwr implements nxe {
    private final dxio<nut> a;
    private final dxio<begg> b;

    public nwr(dxio<nut> dxioVar, dxio<begg> dxioVar2) {
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & ImageMetadata.LENS_APERTURE) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dndr dndrVar;
        if (this.a.a().w()) {
            dtpn dtpnVar = nviVar.a.q;
            if (dtpnVar == null) {
                dtpnVar = dtpn.i;
            }
            begj begjVar = new begj();
            akqi f = akqi.f(dtpnVar.c);
            ily ilyVar = new ily();
            dhjz dhjzVar = dtpnVar.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            ilyVar.r(dhjzVar);
            ilyVar.j(f);
            ilyVar.f = false;
            dvya bZ = dvyw.bv.bZ();
            if ((dtpnVar.a & 16) == 0) {
                ilyVar.F(dtpnVar.d);
            } else {
                dndm bZ2 = dndn.c.bZ();
                dndi bZ3 = dndj.e.bZ();
                dndk bZ4 = dndl.d.bZ();
                int a = dtnx.a(dtpnVar.e);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 2;
                if (i == 0) {
                    dndrVar = dndr.HOME;
                } else if (i == 1) {
                    dndrVar = dndr.WORK;
                } else {
                    dndrVar = dndr.NICKNAME;
                }
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dndl dndlVar = (dndl) bZ4.b;
                dndlVar.b = dndrVar.h;
                dndlVar.a |= 1;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dndj dndjVar = (dndj) bZ3.b;
                dndl bK = bZ4.bK();
                bK.getClass();
                dndjVar.b = bK;
                dndjVar.a |= 1;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dndn dndnVar = (dndn) bZ2.b;
                dndj bK2 = bZ3.bK();
                bK2.getClass();
                dndnVar.b = bK2;
                dndnVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvyw dvywVar = (dvyw) bZ.b;
                dndn bK3 = bZ2.bK();
                bK3.getClass();
                dvywVar.ah = bK3;
                dvywVar.b |= 4194304;
                ilyVar.t = dtpnVar.d;
            }
            if (!dbsj.d(dtpnVar.f)) {
                ilyVar.u = dtpnVar.f;
            }
            int a2 = dtpm.a(dtpnVar.g);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                ilyVar.f = true;
            } else if (i2 == 2) {
                ilyVar.f = true;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvyw dvywVar2 = (dvyw) bZ.b;
                dvywVar2.b |= 1073741824;
                dvywVar2.an = true;
            } else if (i2 == 3) {
                ilyVar.g = true;
            }
            ilyVar.E(bZ.bK());
            begjVar.b(ilyVar.d());
            int a3 = dtoc.a(dtpnVar.h);
            if (a3 != 0 && a3 == 2) {
                begjVar.c = jjn.EXPANDED;
                begjVar.n = true;
            }
            this.b.a().o(begjVar, false, null);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SHOW_PLACE);
        set.add(dthd.SHOW_PLACE_WITH_ALIAS_AND_QUERY);
        set.add(dthd.SHOW_PLACE_WITH_OMNIBOX_TITLE);
    }
}
