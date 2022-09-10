package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dys  reason: default package */
/* loaded from: classes6.dex */
public final class dys {
    private final dmt a;
    private Set<dmv> b = new HashSet();

    public dys(dmt dmtVar, v<dyf> vVar, m mVar) {
        this.a = dmtVar;
        vVar.b(mVar, new aa(this) { // from class: dyr
            private final dys a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dys dysVar = this.a;
                dyf dyfVar = (dyf) obj;
                if (dyfVar.c() == dye.UP || dyfVar.c() == dye.DOWN) {
                    dcep<dfmg> d = dyfVar.d();
                    if (d.isEmpty()) {
                        return;
                    }
                    dysVar.a(d);
                    return;
                }
                dysVar.a(dcmr.a);
            }
        });
    }

    public final void a(dcep<dfmg> dcepVar) {
        HashSet hashSet = new HashSet();
        dcpd<dfmg> it = dcepVar.iterator();
        while (it.hasNext()) {
            dfmg next = it.next();
            dfmz dfmzVar = next.a;
            if (dfmzVar == null) {
                dfmzVar = dfmz.d;
            }
            dsyz bZ = dsza.e.bZ();
            double d = dfmzVar.a;
            boolean z = false;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsza dszaVar = (dsza) bZ.b;
            int i = dszaVar.a | 1;
            dszaVar.a = i;
            dszaVar.b = d;
            double d2 = dfmzVar.b;
            int i2 = i | 2;
            dszaVar.a = i2;
            dszaVar.c = d2;
            double d3 = dfmzVar.c;
            dszaVar.a = i2 | 4;
            dszaVar.d = d3;
            dsza bK = bZ.bK();
            dmq dmqVar = dmq.VENUE_LEVEL_CHANGE;
            if (dmqVar == dmq.VENUE_LEVEL_CHANGE) {
                z = true;
            }
            dbsk.l(z);
            dmw dmwVar = new dmw(dmqVar, dbpy.a, dbsg.i(bK));
            dmx dmxVar = new dmx();
            dmxVar.a = dmwVar;
            dmxVar.c = dbsg.i(next);
            dmv a = dmxVar.a();
            hashSet.add(a);
            if (!this.b.remove(a)) {
                this.a.b(a);
            }
        }
        for (dmv dmvVar : this.b) {
            dmt dmtVar = this.a;
            dmr a2 = dmvVar.a();
            dmo dmoVar = (dmo) dmtVar;
            if (!dmoVar.b.remove(a2)) {
                for (dms dmsVar : ((dbys) dmoVar.a).f(a2.a())) {
                    dmsVar.b(a2);
                }
            }
        }
        this.b = hashSet;
    }
}
