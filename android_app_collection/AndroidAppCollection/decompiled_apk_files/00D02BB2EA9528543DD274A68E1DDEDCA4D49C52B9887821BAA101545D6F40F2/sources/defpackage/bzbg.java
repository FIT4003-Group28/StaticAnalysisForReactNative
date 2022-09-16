package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzbg  reason: default package */
/* loaded from: classes4.dex */
public final class bzbg extends fd implements cezu {
    public bzbb a;
    @dzsi
    public Executor b;
    @dzsi
    public bukm c;
    private final btzi<djwy, djxa> d = new bzbf();

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.cezu
    public final void d(cfgf cfgfVar) {
        dpyy dpyyVar;
        djwv bZ = djwy.k.bZ();
        cfgd cfgdVar = cfgfVar.c;
        if (cfgdVar == null) {
            cfgdVar = cfgd.h;
        }
        dspd dspdVar = cfgdVar.b;
        if (dspdVar.equals(bzbi.b)) {
            dpyyVar = dpyy.MANY_SEATS_AVAILABLE;
        } else if (dspdVar.equals(bzbi.c)) {
            dpyyVar = dpyy.FEW_SEATS_AVAILABLE;
        } else if (dspdVar.equals(bzbi.d)) {
            dpyyVar = dpyy.STANDING_ROOM_ONLY;
        } else {
            dpyyVar = dspdVar.equals(bzbi.e) ? dpyy.CRUSHED_STANDING_ROOM_ONLY : null;
        }
        int i = 1;
        if (dpyyVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djwy djwyVar = (djwy) bZ.b;
            djwyVar.c = Integer.valueOf(dpyyVar.j);
            djwyVar.b = 1;
        } else {
            cfgd cfgdVar2 = cfgfVar.c;
            if (cfgdVar2 == null) {
                cfgdVar2 = cfgd.h;
            }
            dspd dspdVar2 = cfgdVar2.b;
            if (dspdVar2.equals(bzbi.f)) {
                i = 3;
            } else if (dspdVar2.equals(bzbi.g)) {
                i = 2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djwy djwyVar2 = (djwy) bZ.b;
            djwyVar2.c = Integer.valueOf(i - 1);
            djwyVar2.b = 9;
        }
        Bundle bundle = this.o;
        dbsk.s(bundle);
        long j = bundle.getLong("stopTimeStampSeconds");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwy djwyVar3 = (djwy) bZ.b;
        djwyVar3.a |= 16;
        djwyVar3.f = j;
        String string = bundle.getString("departureTimeZone");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwy djwyVar4 = (djwy) bZ.b;
        string.getClass();
        djwyVar4.a |= 32;
        djwyVar4.g = string;
        djwy djwyVar5 = (djwy) bZ.b;
        djwyVar5.i = 61646;
        djwyVar5.a |= 128;
        String string2 = bundle.getString("stopFeatureId");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwy djwyVar6 = (djwy) bZ.b;
        string2.getClass();
        djwyVar6.a |= 8;
        djwyVar6.e = string2;
        String string3 = bundle.getString("transitTripToken");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwy djwyVar7 = (djwy) bZ.b;
        string3.getClass();
        djwyVar7.a |= 4;
        djwyVar7.d = string3;
        String string4 = bundle.getString("ved");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwy djwyVar8 = (djwy) bZ.b;
        string4.getClass();
        djwyVar8.a |= 64;
        djwyVar8.h = string4;
        String string5 = bundle.getString("vehicleToken");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwy djwyVar9 = (djwy) bZ.b;
        string5.getClass();
        djwyVar9.a |= 8192;
        djwyVar9.j = string5;
        bukm bukmVar = this.c;
        dbsk.s(bukmVar);
        btzi<djwy, djxa> btziVar = this.d;
        Executor executor = this.b;
        dbsk.s(executor);
        bukmVar.b(bZ.bK(), btziVar, executor);
    }

    @Override // defpackage.cezu
    public final cqmj<cqkp> e(dspd dspdVar) {
        Bundle bundle = this.o;
        dbsk.s(bundle);
        String string = bundle.getString("destination");
        dbsk.s(string);
        bzay bzayVar = new bzay();
        bzbb bzbbVar = this.a;
        gga a = bzbbVar.a.a();
        bzbb.a(a, 1);
        Resources a2 = bzbbVar.b.a();
        bzbb.a(a2, 2);
        bzbb.a(dspdVar, 3);
        bzbb.a(string, 4);
        return cqgr.fY(cqgr.fP(bzayVar, cqkz.a(new bzba(a, a2, dspdVar, string)), new cqmp[0]));
    }

    @Override // defpackage.cezu
    public final cqtd f(String str) {
        if (str.equals(bzbi.b.J())) {
            return vyu.a;
        }
        if (str.equals(bzbi.c.J())) {
            return vyu.b;
        }
        if (str.equals(bzbi.d.J())) {
            return vyu.c;
        }
        if (str.equals(bzbi.e.J())) {
            return vyu.d;
        }
        if (str.equals(bzbi.f.J())) {
            return cqtt.e(cqrt.f(2131232708), cqrp.d(5.0d), cqrp.d(dcyn.a), cqrp.d(5.0d), cqrp.d(dcyn.a));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "No icon found for ".concat(valueOf) : new String("No icon found for "));
    }
}
