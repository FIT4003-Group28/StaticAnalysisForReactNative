package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aigv  reason: default package */
/* loaded from: classes2.dex */
public final class aigv implements aiky {
    private static final dcqe a = dcqe.c("aigv");
    private final eaow b;
    private final dcdn<PersonId, dcdn<ailp, eapd>> c;

    public aigv(ailn ailnVar, long j) {
        HashMap d = dcjz.d();
        for (ailr ailrVar : ailnVar.a) {
            ajja ajjaVar = ailrVar.c;
            PersonId j2 = PersonId.j(ajjaVar == null ? ajja.d : ajjaVar);
            if (j2 == null) {
                bvoo.h("Unrecognizable person Id in LocationRequestsModelSnapshot.", new Object[0]);
            } else {
                if (!d.containsKey(j2)) {
                    d.put(j2, dcjz.d());
                }
                Map map = (Map) d.get(j2);
                ailp b = ailp.b(ailrVar.d);
                if (map.containsKey(b == null ? ailp.TYPE_UNSPECIFIED : b)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = j2;
                    ailp b2 = ailp.b(ailrVar.d);
                    objArr[1] = b2 == null ? ailp.TYPE_UNSPECIFIED : b2;
                    bvoo.h("LocationRequestsModelSnapshot contains duplicate entries for personId %s, %s", objArr);
                } else {
                    Map map2 = (Map) d.get(j2);
                    ailp b3 = ailp.b(ailrVar.d);
                    map2.put(b3 == null ? ailp.TYPE_UNSPECIFIED : b3, new eapd(ailrVar.b));
                }
            }
        }
        dcdg p = dcdn.p();
        for (PersonId personId : d.keySet()) {
            p.f(personId, dcdn.r((Map) d.get(personId)));
        }
        this.c = p.b();
        this.b = eaow.d(j);
    }

    @Override // defpackage.aiky
    public final boolean a(Profile profile) {
        if (!this.c.containsKey(profile.a())) {
            return false;
        }
        dcdn<ailp, eapd> dcdnVar = this.c.get(profile.a());
        dbsk.s(dcdnVar);
        if (!dcdnVar.containsKey(ailp.RPC_IN_FLIGHT)) {
            return false;
        }
        eapd eapdVar = dcdnVar.get(ailp.RPC_IN_FLIGHT);
        if (dcdnVar.containsKey(ailp.RPC_SUCCEEDED) && eapdVar.x(dcdnVar.get(ailp.RPC_SUCCEEDED))) {
            return false;
        }
        return !dcdnVar.containsKey(ailp.RPC_FAILED) || !eapdVar.x(dcdnVar.get(ailp.RPC_FAILED));
    }

    @Override // defpackage.aiky
    public final boolean b(cqat cqatVar, Profile profile) {
        dbsg j;
        if (!a(profile)) {
            if (!this.c.containsKey(profile.a())) {
                j = dbpy.a;
            } else {
                dcdn<ailp, eapd> dcdnVar = this.c.get(profile.a());
                dbsk.s(dcdnVar);
                if (!dcdnVar.containsKey(ailp.RPC_SUCCEEDED)) {
                    j = dbpy.a;
                } else {
                    eapd eapdVar = dcdnVar.get(ailp.RPC_SUCCEEDED);
                    j = (!dcdnVar.containsKey(ailp.RPC_IN_FLIGHT) || !eapdVar.x(dcdnVar.get(ailp.RPC_IN_FLIGHT))) ? dbsg.j(eapdVar) : dbpy.a;
                }
            }
            if (!j.a()) {
                return true;
            }
            return ((eapd) j.b()).e(this.b).x(new eapd(cqatVar.b()));
        }
        return false;
    }

    @Override // defpackage.aikz
    public final void c(String str, PrintWriter printWriter) {
    }
}
