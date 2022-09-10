package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vyn  reason: default package */
/* loaded from: classes7.dex */
public final class vyn implements vyp {
    @dzsi
    public brln a;
    private final String b;
    private final dxio<broq> c;
    private final akpm d;
    private final dxio<bvjj> e;

    public vyn(Resources resources, dxio<broq> dxioVar, akpm akpmVar, dxio<bvjj> dxioVar2) {
        this.b = resources.getString(R.string.PARKING_SEARCH_QUERY);
        this.c = dxioVar;
        this.d = akpmVar;
        this.e = dxioVar2;
    }

    @Override // defpackage.vyp
    public final void a(dcdc<amvh> dcdcVar, long j, vyo vyoVar) {
        boolean z = false;
        dbsk.b(dcdcVar.size() >= 2, "Not enough waypoints");
        int size = dcdcVar.size() - 1;
        amvh amvhVar = dcdcVar.get(size);
        akqq akqqVar = amvhVar.e;
        dbsk.t(akqqVar, "Waypoint must have a position.");
        b();
        dhjw bZ = dhjx.f.bZ();
        dhjy bZ2 = dhjz.e.bZ();
        double d = akqqVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = d;
        double d2 = akqqVar.b;
        dhjzVar.a = i | 1;
        dhjzVar.b = d2;
        dhjz dhjzVar2 = this.d.Z().b;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        double d3 = dhjzVar2.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar3 = (dhjz) bZ2.b;
        dhjzVar3.a |= 4;
        dhjzVar3.d = d3;
        dhjz bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ.b;
        bK.getClass();
        dhjxVar.b = bK;
        dhjxVar.a |= 1;
        dhkb dhkbVar = this.d.Z().c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ.b;
        dhkbVar.getClass();
        dhjxVar2.c = dhkbVar;
        dhjxVar2.a |= 2;
        dhkd dhkdVar = this.d.Z().d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ.b;
        dhkdVar.getClass();
        dhjxVar3.d = dhkdVar;
        dhjxVar3.a |= 4;
        float f = this.d.Z().e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar4 = (dhjx) bZ.b;
        dhjxVar4.a |= 8;
        dhjxVar4.e = f;
        dhjx bK2 = bZ.bK();
        diyk bZ3 = diyl.e.bZ();
        dpum h = akqqVar.h();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        diyl diylVar = (diyl) bZ3.b;
        h.getClass();
        diylVar.b = h;
        int i2 = diylVar.a | 1;
        diylVar.a = i2;
        diylVar.a = i2 | 8;
        diylVar.d = j;
        if (amvhVar.m()) {
            String o = amvhVar.d.o();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            diyl diylVar2 = (diyl) bZ3.b;
            o.getClass();
            diylVar2.a |= 2;
            diylVar2.c = o;
        }
        dwim bZ4 = dwir.R.bZ();
        String str = this.b;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwir dwirVar = (dwir) bZ4.b;
        str.getClass();
        dwirVar.a |= 1;
        dwirVar.c = str;
        diyl bK3 = bZ3.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwir dwirVar2 = (dwir) bZ4.b;
        bK3.getClass();
        dwirVar2.L = bK3;
        dwirVar2.b |= 262144;
        bK2.getClass();
        dwirVar2.d = bK2;
        dwirVar2.a |= 2;
        dwhq bZ5 = dwhv.H.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwhv.c((dwhv) bZ5.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwhv.e((dwhv) bZ5.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwhv dwhvVar = (dwhv) bZ5.b;
        dwhvVar.a |= 8192;
        dwhvVar.n = true;
        dwhv bK4 = bZ5.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwir dwirVar3 = (dwir) bZ4.b;
        bK4.getClass();
        dwirVar3.B = bK4;
        dwirVar3.b |= 8;
        amvh[] amvhVarArr = (amvh[]) dcdcVar.toArray(new amvh[0]);
        if (size >= 0 && size < amvhVarArr.length) {
            z = true;
        }
        dbsk.b(z, "Search target waypoint index is out of bounds");
        brln brlnVar = new brln(bZ4.bK(), new iqy(), new amsz(null, -1, size, amvi.ATTACH_PARKING, amvhVarArr, dqvj.DRIVE, vyq.a), (amvq) null);
        brlnVar.f = new vym(this, vyoVar);
        brlnVar.g = 2;
        this.a = brlnVar;
        this.c.a().a(brlnVar);
        this.e.a().S(bvjk.hp, true);
        vyoVar.a();
    }

    @Override // defpackage.vyp
    public final void b() {
        brln brlnVar = this.a;
        if (brlnVar != null) {
            this.c.a().b(brlnVar);
            this.a = null;
        }
    }
}
