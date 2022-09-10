package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: twe  reason: default package */
/* loaded from: classes7.dex */
public class twe implements tvy {
    private final dcdc<tvx> a;
    private final zfo b;

    public twe(Activity activity, twt twtVar, twv twvVar, twr twrVar, tlv tlvVar, amve amveVar, boolean z) {
        dbsg i;
        dbsg dbsgVar;
        dbsg dbsgVar2;
        dbsg dbsgVar3;
        dbsg dbsgVar4;
        this.b = new zqx(activity, amveVar);
        dccx F = dcdc.F();
        amvh i2 = tlvVar.d().i();
        dntm dntmVar = i2.m;
        dntm dntmVar2 = dntm.UNKNOWN_PARKING_DIFFICULTY;
        dpbl x = i2.x();
        boolean z2 = false;
        if (x != null) {
            dpzi dpziVar = x.c;
            dpzh b = dpzh.b((dpziVar == null ? dpzi.e : dpziVar).b);
            if ((b == null ? dpzh.UNKNOWN_PARKING_PRESENCE : b) == dpzh.HAS_PARKING) {
                z2 = true;
            }
        }
        if (dntmVar != dntmVar2 || z2) {
            dbsg j = dbsg.j(vyr.h(i2));
            dntm dntmVar3 = i2.m;
            Activity activity2 = (Activity) ((dxjd) twtVar.a).a;
            twt.a(activity2, 1);
            twt.a(dntmVar3, 2);
            twt.a(j, 3);
            i = dbsg.i(new tws(activity2, dntmVar3, j));
        } else {
            i = dbpy.a;
        }
        if (i.a()) {
            F.g((tvx) i.b());
        }
        Iterator<doxk> it = amveVar.u().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                dbsgVar = dbpy.a;
                break;
            }
            doxk next = it.next();
            int a = doxj.a(next.b);
            if (a != 0 && a == 2 && next.a.size() > 0) {
                dbsgVar = dbsg.i(next);
                break;
            }
        }
        Iterator<dozz> it2 = amveVar.b().j.iterator();
        while (true) {
            if (!it2.hasNext()) {
                dbsgVar2 = dbpy.a;
                break;
            }
            dozz next2 = it2.next();
            dozy b2 = dozy.b(next2.f);
            if ((b2 == null ? dozy.UNKNOWN : b2) == dozy.TOLL) {
                dbsgVar2 = dbsg.i(next2);
                break;
            }
        }
        if (!dbsgVar.a() || !dbsgVar2.a()) {
            dbsgVar3 = dbpy.a;
        } else {
            doxk doxkVar = (doxk) dbsgVar.b();
            dozz dozzVar = (dozz) dbsgVar2.b();
            vtn a2 = twvVar.a.a();
            twv.a(a2, 1);
            twv.a(doxkVar, 2);
            twv.a(dozzVar, 3);
            dbsgVar3 = dbsg.i(new twu(a2, doxkVar, dozzVar));
        }
        if (dbsgVar3.a()) {
            F.g((tvx) dbsgVar3.b());
        }
        if (twq.g(amveVar, z).booleanValue()) {
            Activity activity3 = (Activity) ((dxjd) twrVar.a).a;
            twr.a(activity3, 1);
            vpd a3 = twrVar.b.a();
            twr.a(a3, 2);
            vtn a4 = twrVar.c.a();
            twr.a(a4, 3);
            twr.a(tlvVar, 4);
            twr.a(amveVar, 5);
            dbsgVar4 = dbsg.i(new twq(activity3, a3, a4, tlvVar, amveVar, z));
        } else {
            dbsgVar4 = dbpy.a;
        }
        if (dbsgVar4.a()) {
            F.g((tvx) dbsgVar4.b());
        }
        this.a = F.f();
    }

    @Override // defpackage.tvy
    @dzsi
    public String a() {
        return this.b.d();
    }

    @Override // defpackage.tvy
    public List<tvx> b() {
        return this.a;
    }

    @Override // defpackage.tvy
    public List<Integer> c() {
        Integer valueOf = Integer.valueOf(twq.b);
        Integer valueOf2 = Integer.valueOf((int) R.id.trip_card_parking_notice);
        return dcdc.h(valueOf, valueOf2, valueOf2);
    }
}
