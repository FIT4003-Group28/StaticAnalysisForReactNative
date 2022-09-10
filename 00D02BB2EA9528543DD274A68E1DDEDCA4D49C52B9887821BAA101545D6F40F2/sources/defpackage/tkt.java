package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tkt  reason: default package */
/* loaded from: classes7.dex */
public final class tkt {
    public static final dcco<tlx, tmo> a;
    private final tnv b;
    private final toh c;
    private final tlj d;

    static {
        dccm b = dcco.b();
        b.d(tlx.UNKNOWN_GROUP, tmo.UNKNOWN);
        b.d(tlx.TRAVEL_MODE, tmo.SAME_TRAVEL_MODE);
        a = b.b();
    }

    public tkt(tnv tnvVar, toh tohVar, tlj tljVar) {
        this.b = tnvVar;
        this.c = tohVar;
        this.d = tljVar;
    }

    public static dqvj c(String str) {
        if (str.equals("ONLINE-TAXI")) {
            return dqvj.TAXI;
        }
        if (str.equals("OFFLINE-TAXI")) {
            return dqvj.TAXI;
        }
        return dqvj.b(str);
    }

    private static boolean d(String str, amve amveVar, HashMap<String, dbsi<Integer, Integer>> hashMap) {
        if (!hashMap.containsKey(str)) {
            return true;
        }
        dbsi<Integer, Integer> dbsiVar = hashMap.get(str);
        dbsk.s(dbsiVar);
        return e(amveVar) < dbsiVar.a.intValue();
    }

    private static int e(amve amveVar) {
        dgas x = vyb.x(amveVar);
        if (x == null) {
            return Integer.MAX_VALUE;
        }
        return x.b;
    }

    private static String f(int i, amve amveVar, Map<Integer, String> map) {
        dqvj g = g(amveVar);
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return (g == dqvj.MIXED || !wuw.b(amveVar)) ? (g == dqvj.MIXED || !wuw.c(amveVar)) ? g.name() : "OFFLINE-TAXI" : "ONLINE-TAXI";
        }
        String str = map.get(valueOf);
        dbsk.s(str);
        return str;
    }

    private static dqvj g(amve amveVar) {
        if (new vxg(amveVar).a()) {
            return dqvj.MIXED;
        }
        dqvj c = dqvj.c(amveVar.b().b);
        return c == null ? dqvj.DRIVE : c;
    }

    public final dcdc<tlu> a(btlu btluVar, tme tmeVar, Map<Integer, String> map) {
        int i;
        Boolean bool;
        if (tmeVar.e().n() == 0) {
            return dcdc.e();
        }
        HashMap hashMap = new HashMap();
        dccx F = dcdc.F();
        HashMap hashMap2 = new HashMap();
        int i2 = 0;
        while (i2 < tmeVar.e().n()) {
            amve amveVar = tmeVar.e().d[i2];
            dqvj g = g(amveVar);
            String f = f(i2, amveVar, map);
            boolean z = !hashMap.containsKey(f);
            if (z) {
                dqvj c = c(f);
                tlu C = tlv.C();
                C.k(tmeVar);
                C.g(f);
                ((tlk) C).a = b(f);
                C.j(i2);
                C.h(i2);
                tlw c2 = C.c();
                c2.h(tlx.TRAVEL_MODE);
                c2.i(dbsg.i(c));
                tog l = this.c.a(btluVar).l();
                c2.b(l != null && l.f().contains(c));
                dbsg<dqvj> c3 = this.b.c(btluVar);
                c2.d(c3.a() && c3.b().equals(c));
                hashMap.put(f, C);
                F.g(f);
            }
            tlu tluVar = (tlu) hashMap.get(f);
            dbsk.s(tluVar);
            dccx<Integer> a2 = tluVar.a();
            Integer valueOf = Integer.valueOf(i2);
            a2.g(valueOf);
            tluVar.d().f(valueOf, amveVar);
            if (d(f, amveVar, hashMap2)) {
                hashMap2.put(f, dbsi.a(Integer.valueOf(e(amveVar)), valueOf));
            }
            int i3 = 1;
            while (true) {
                i = i2 + i3;
                if (i >= tmeVar.e().n()) {
                    break;
                }
                amve amveVar2 = tmeVar.e().d[i];
                if (!f(i, amveVar2, map).equals(f)) {
                    break;
                }
                dccx<Integer> a3 = tluVar.a();
                Integer valueOf2 = Integer.valueOf(i);
                a3.g(valueOf2);
                tluVar.d().f(valueOf2, amveVar2);
                i3++;
                if (d(f, amveVar2, hashMap2)) {
                    hashMap2.put(f, dbsi.a(Integer.valueOf(e(amveVar2)), valueOf2));
                }
            }
            if (z) {
                dqvj dqvjVar = dqvj.DRIVE;
                int ordinal = g.ordinal();
                tluVar.i(Math.min((ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 5) ? 1 : 2, i3));
                int ordinal2 = g.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 5) {
                    bool = false;
                } else {
                    bool = true;
                }
                tluVar.f(bool.booleanValue());
            }
            i2 = i;
        }
        int i4 = Integer.MAX_VALUE;
        boolean z2 = true;
        for (dbsi dbsiVar : hashMap2.values()) {
            z2 = z2 && i4 != ((Integer) dbsiVar.a).intValue();
            i4 = Math.min(i4, ((Integer) dbsiVar.a).intValue());
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            int intValue = ((Integer) ((dbsi) entry.getValue()).a).intValue();
            tlu tluVar2 = (tlu) hashMap.get(entry.getKey());
            dbsk.s(tluVar2);
            tluVar2.c().c(z2 && intValue == i4);
            tluVar2.c().e((Integer) ((dbsi) entry.getValue()).b);
        }
        dccx F2 = dcdc.F();
        dcdc f2 = F.f();
        int size = f2.size();
        for (int i5 = 0; i5 < size; i5++) {
            tlu tluVar3 = (tlu) hashMap.get((String) f2.get(i5));
            dbsk.s(tluVar3);
            F2.g(tluVar3);
        }
        return F2.f();
    }

    public final dbsg<tli> b(String str) {
        if (str.equals(dqvj.TAXI.name())) {
            wuw a2 = this.d.a.a();
            tlj.a(a2);
            return dbsg.i(new tli(a2));
        }
        return dbpy.a;
    }
}
