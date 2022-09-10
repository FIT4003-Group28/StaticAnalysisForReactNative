package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: spt  reason: default package */
/* loaded from: classes7.dex */
public final class spt {
    public static final cqix<?> a = cqgr.fT(ict.o(cqrp.d(20.0d), cqgr.bG(cqrp.d(20.0d))), cqkp.T);
    public final sql b;
    public final sqf c;
    public final vtn d;
    private final ahjq e;

    public spt(sql sqlVar, sqf sqfVar, ahjq ahjqVar, vtn vtnVar) {
        this.b = sqlVar;
        this.c = sqfVar;
        this.e = ahjqVar;
        this.d = vtnVar;
    }

    public static String a(Context context, sph sphVar, amvh amvhVar) {
        if (amvhVar.b == dpjs.ENTITY_TYPE_NICKNAME) {
            return sphVar.a().b().b().p();
        }
        return amvhVar.s(context.getResources());
    }

    @dzsi
    public static dnuq c(@dzsi spv spvVar, final sph sphVar) {
        if (spvVar == null || spvVar.b() == null) {
            return null;
        }
        return (dnuq) dcbg.b(spvVar.b().c).t(spp.a).r(new dbsl(sphVar) { // from class: spq
            private final sph a;

            {
                this.a = sphVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                sph sphVar2 = this.a;
                cqix<?> cqixVar = spt.a;
                return ((dnuq) obj).c.equals(sphVar2.a().a());
            }
        }).f();
    }

    public final sps b(@dzsi spv spvVar, sph sphVar, @dzsi dnuq dnuqVar) {
        dnui dnuiVar;
        dnvk dnvkVar;
        if (spvVar == null) {
            return sps.DIRECTIONS_LOADING;
        }
        if (!this.e.s()) {
            return sps.DIRECTIONS_LOCATION_DISABLED;
        }
        if (spvVar.b() == null) {
            return sps.DIRECTIONS_ERROR;
        }
        if (dnuqVar == null) {
            return sps.DIRECTIONS_LOADING;
        }
        if (!spvVar.a()) {
            return sps.DIRECTIONS_CACHED_LOADED;
        }
        if (sphVar.a().b().c() == dqvj.TRANSIT) {
            if (dnuqVar.a == 3) {
                dnvkVar = (dnvk) dnuqVar.b;
            } else {
                dnvkVar = dnvk.e;
            }
            dnvj dnvjVar = dnvkVar.d;
            if (dnvjVar == null) {
                dnvjVar = dnvj.c;
            }
            if (dnvjVar.b.isEmpty()) {
                return sps.DIRECTIONS_ERROR;
            }
        } else {
            if (dnuqVar.a == 2) {
                dnuiVar = (dnui) dnuqVar.b;
            } else {
                dnuiVar = dnui.g;
            }
            if ((dnuiVar.a & 32) == 0) {
                return sps.DIRECTIONS_ERROR;
            }
        }
        return sps.DIRECTIONS_COMPLETELY_LOADED;
    }
}
