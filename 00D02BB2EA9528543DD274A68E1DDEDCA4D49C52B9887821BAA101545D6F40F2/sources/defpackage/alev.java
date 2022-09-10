package defpackage;
/* compiled from: PG */
/* renamed from: alev  reason: default package */
/* loaded from: classes2.dex */
public final class alev {
    public static final dbtm a = dbtm.c(",").f().e();

    public static dcdc<dpeo> a(dcdc<amvb> dcdcVar, dcdc<Integer> dcdcVar2) {
        dccx dccxVar = new dccx();
        dcdc<dbsi<Integer, Integer>> b = b(dcdcVar, dcdcVar2);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            dbsi<Integer, Integer> dbsiVar = b.get(i);
            Integer num = dbsiVar.a;
            double d = dcdcVar.get(dbsiVar.b.intValue()).c - dcdcVar.get(num.intValue()).c;
            dpel bZ = dpeo.e.bZ();
            dpen dpenVar = dpen.TRAFFIC_JAM;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpeo dpeoVar = (dpeo) bZ.b;
            dpeoVar.b = dpenVar.d;
            dpeoVar.a |= 1;
            int round = (int) Math.round(d);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpeo dpeoVar2 = (dpeo) bZ.b;
            dpeoVar2.a |= 4;
            dpeoVar2.d = round;
            int round2 = (int) Math.round(dcdcVar.get(num.intValue()).c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpeo dpeoVar3 = (dpeo) bZ.b;
            dpeoVar3.a |= 2;
            dpeoVar3.c = round2;
            dccxVar.g(bZ.bK());
        }
        return dccxVar.f();
    }

    public static dcdc<dbsi<Integer, Integer>> b(dcdc<amvb> dcdcVar, dcdc<Integer> dcdcVar2) {
        int a2;
        dccx F = dcdc.F();
        int i = 1;
        int i2 = 0;
        while (i < dcdcVar.size()) {
            while (i < dcdcVar.size()) {
                amvb amvbVar = dcdcVar.get(i);
                if (!dcdcVar2.contains(Integer.valueOf(amvbVar.a)) && (!dcdcVar2.isEmpty() || (a2 = dpgv.a(amvbVar.e.q)) == 0 || a2 != 3)) {
                    break;
                }
                i++;
            }
            int i3 = i - 1;
            if (i2 < i3) {
                F.g(dbsi.a(Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            i2 = i;
            i++;
        }
        return F.f();
    }

    public static boolean c(dphe dpheVar, dcdc<Integer> dcdcVar, btvo btvoVar) {
        if (btvoVar.getTransitPagesParameters().A && btvoVar.getTransitPagesParameters().B) {
            if (!dcdcVar.isEmpty() && bzlx.a(2, dpheVar.h)) {
                return true;
            }
            dphd dphdVar = dpheVar.r;
            if (dphdVar == null) {
                dphdVar = dphd.f;
            }
            int a2 = dpbu.a(dphdVar.d);
            return a2 != 0 && a2 == 3;
        }
        return false;
    }

    public static boolean d(int i, int i2) {
        return i == -1 || i == i2;
    }

    public static dcdc<Integer> e(@dzsi bvjj bvjjVar) {
        String str = "";
        if (bvjjVar != null) {
            str = bvjjVar.z(bvjk.dl, str);
        }
        dccx F = dcdc.F();
        for (String str2 : a.g(str)) {
            F.g(Integer.valueOf(str2));
        }
        return F.f();
    }
}
