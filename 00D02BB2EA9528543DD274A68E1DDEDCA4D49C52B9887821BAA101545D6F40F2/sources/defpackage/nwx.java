package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nwx  reason: default package */
/* loaded from: classes7.dex */
public final class nwx implements nxe {
    private final dxio<bbut> a;
    private final dxio<apni> b;
    private final btvo c;

    public nwx(dxio<bbut> dxioVar, dxio<apni> dxioVar2, btvo btvoVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = btvoVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 1073741824) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dcdc r;
        dbsg<bbtw> dbsgVar;
        nxi nxiVar = nviVar.d;
        dtri dtriVar = nviVar.a.x;
        if (dtriVar == null) {
            dtriVar = dtri.d;
        }
        String str = dtriVar.a;
        if (dtriVar.c) {
            dtid dtidVar = nviVar.c.a;
            dccx F = dcdc.F();
            for (dtkx dtkxVar : dtidVar.b) {
                dtku dtkuVar = dtkxVar.b;
                if (dtkuVar == null) {
                    dtkuVar = dtku.p;
                }
                if ((dtkuVar.a & 512) != 0) {
                    dtku dtkuVar2 = dtkxVar.b;
                    if (dtkuVar2 == null) {
                        dtkuVar2 = dtku.p;
                    }
                    dtlj dtljVar = dtkuVar2.j;
                    if (dtljVar == null) {
                        dtljVar = dtlj.b;
                    }
                    for (dtku dtkuVar3 : dtljVar.a) {
                        dtof dtofVar = dtkuVar3.d;
                        if (dtofVar == null) {
                            dtofVar = dtof.i;
                        }
                        dvyw dvywVar = dtofVar.b;
                        if (dvywVar == null) {
                            dvywVar = dvyw.bv;
                        }
                        dvxh dvxhVar = dvywVar.z;
                        if (dvxhVar == null) {
                            dvxhVar = dvxh.B;
                        }
                        if ((dvxhVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                            dvxh dvxhVar2 = dvywVar.z;
                            if (dvxhVar2 == null) {
                                dvxhVar2 = dvxh.B;
                            }
                            dwfl dwflVar = dvxhVar2.q;
                            if (dwflVar == null) {
                                dwflVar = dwfl.w;
                            }
                            F.g(dwflVar);
                        }
                    }
                }
            }
            r = F.f();
        } else {
            r = dcdc.r(nxiVar.l());
        }
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < r.size(); i2++) {
            if (true == str.equals(((dwfl) r.get(i2)).d)) {
                i = i2;
            }
        }
        if (r.isEmpty() || i >= r.size()) {
            return;
        }
        bbtv v = bbty.v();
        if (dtriVar.b) {
            dbsgVar = dbsg.i(bbtw.SEND_TO_SERVER_IMMEDIATELY);
        } else {
            dbsgVar = dbpy.a;
        }
        v.c(dbsgVar);
        v.d(dtriVar.b);
        v.e(false);
        v.k(!dtriVar.b);
        v.o(true);
        if (this.c.getUgcOfferingsParameters().i() && dtriVar.b) {
            z = true;
        }
        v.h(z);
        this.a.a().o(new ckni(r, nxiVar.n()), i, v.a(), null);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.VIEW_PHOTOS);
        set.add(dthd.VIEW_PHOTOS_SHOW_EDIT_DELETE_BUTTONS);
        if (this.b.a().b()) {
            set.add(dthd.VIEW_PHOTOS_PLAY_VIDEOS);
        }
    }
}
