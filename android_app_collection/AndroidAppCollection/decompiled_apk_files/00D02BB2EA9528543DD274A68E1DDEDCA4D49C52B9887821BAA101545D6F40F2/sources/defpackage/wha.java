package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: wha  reason: default package */
/* loaded from: classes7.dex */
public final class wha {
    public static dbsg<SavedTrip.Data> a(amub amubVar, int i) {
        dcdc e;
        if (amubVar != null && ((amubVar.h == dqvj.TRANSIT || amubVar.h == dqvj.DRIVE) && amubVar.ai() == 2 && (amubVar.h != dqvj.TRANSIT || !amubVar.d.a.g.u()))) {
            dpie dpieVar = amubVar.d.a;
            if (!dpieVar.e.isEmpty()) {
                e = dcbg.b(dpieVar.e.get(0).c).o(wgy.a).s(wgz.a).z();
            } else {
                e = dcdc.e();
            }
            dspd dspdVar = null;
            amvh j = amubVar.h == dqvj.TRANSIT ? amubVar.j() : null;
            amvh k = amubVar.k();
            dqvj dqvjVar = amubVar.h;
            dpie dpieVar2 = amubVar.d.a;
            if ((dpieVar2.a & 64) != 0) {
                dspdVar = dpieVar2.g;
            }
            return dbsg.i(SavedTrip.Data.j(j, k, dqvjVar, 1, dspdVar, !e.isEmpty() ? dbsg.i(e) : dbpy.a, 2));
        }
        return dbpy.a;
    }
}
