package defpackage;

import java.util.EnumMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afhu  reason: default package */
/* loaded from: classes2.dex */
public abstract class afhu {
    private final boolean m() {
        return !l().isEmpty();
    }

    @dzsi
    private final amvh n() {
        return (amvh) dcft.t(l(), null);
    }

    public abstract afia a();

    public final ddjr b() {
        ddjr ddjrVar = a().x;
        return ddjrVar == null ? ddjr.NONE : ddjrVar;
    }

    public final boolean c() {
        return b() == ddjr.WEB_SEARCH_VOICE;
    }

    public final boolean d() {
        if (m()) {
            amvh n = n();
            dbsk.s(n);
            return n.b.equals(dpjs.ENTITY_TYPE_HOME);
        }
        return false;
    }

    public final boolean e() {
        if (m()) {
            amvh n = n();
            dbsk.s(n);
            return n.b.equals(dpjs.ENTITY_TYPE_WORK);
        }
        return false;
    }

    @dzsi
    public final amvh f() {
        return m() ? n() : a().i;
    }

    public final int g() {
        return l().size();
    }

    @dzsi
    public final vup h() {
        afht afhtVar = a().m;
        if (afhtVar == null) {
            return null;
        }
        Set<afhq> set = afhtVar.b;
        if (set.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(vux.class);
        enumMap.put((EnumMap) vux.AVOID_HIGHWAYS, (vux) Integer.valueOf(set.contains(afhq.AVOID_HIGHWAYS) ? 1 : 0));
        enumMap.put((EnumMap) vux.AVOID_TOLLS, (vux) Integer.valueOf(set.contains(afhq.AVOID_TOLLS) ? 1 : 0));
        enumMap.put((EnumMap) vux.AVOID_FERRIES, (vux) Integer.valueOf(set.contains(afhq.AVOID_FERRIES) ? 1 : 0));
        return new vup(enumMap);
    }

    @dzsi
    public final dpjs i() {
        return a().z;
    }

    public final boolean j() {
        return a().c();
    }

    @dzsi
    public final dspd k() {
        return a().k;
    }

    public final dcdc<amvh> l() {
        return a().j;
    }
}
