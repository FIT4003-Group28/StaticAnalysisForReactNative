package defpackage;

import java.util.EnumMap;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: vxi  reason: default package */
/* loaded from: classes7.dex */
public final class vxi {
    public static dwao a(dwao dwaoVar) {
        dphq dphqVar = dwaoVar.e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        if (dphqVar.l) {
            dphq dphqVar2 = dwaoVar.e;
            if (dphqVar2 == null) {
                dphqVar2 = dphq.m;
            }
            dphm ca = dphq.m.ca(dphqVar2);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dphq dphqVar3 = (dphq) ca.b;
            dphqVar3.a |= 1024;
            dphqVar3.l = false;
            dwal ca2 = dwao.R.ca(dwaoVar);
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            dwao dwaoVar2 = (dwao) ca2.b;
            dphq bK = ca.bK();
            bK.getClass();
            dwaoVar2.e = bK;
            dwaoVar2.a |= 1;
            return ca2.bK();
        }
        return dwaoVar;
    }

    public static boolean b(dwao dwaoVar) {
        dwbk dwbkVar = dwaoVar.f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        if ((dwbkVar.a & 4) != 0) {
            return false;
        }
        dosz doszVar = dwaoVar.B;
        if (doszVar == null) {
            doszVar = dosz.e;
        }
        return (doszVar.a & 4) == 0;
    }

    public static EnumSet<vux> c(dwao dwaoVar) {
        EnumSet<vux> noneOf = EnumSet.noneOf(vux.class);
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        if (dowrVar.c) {
            noneOf.add(vux.AVOID_TOLLS);
        }
        dowr dowrVar2 = dwaoVar.g;
        if (dowrVar2 == null) {
            dowrVar2 = dowr.m;
        }
        if (dowrVar2.b) {
            noneOf.add(vux.AVOID_HIGHWAYS);
        }
        if (dwaoVar.o) {
            noneOf.add(vux.AVOID_FERRIES);
        }
        return noneOf;
    }

    public static vup d(dwao dwaoVar) {
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        EnumMap enumMap = new EnumMap(vux.class);
        enumMap.put((EnumMap) vux.AVOID_HIGHWAYS, (vux) Integer.valueOf(dowrVar.b ? 1 : 0));
        enumMap.put((EnumMap) vux.AVOID_TOLLS, (vux) Integer.valueOf(dowrVar.c ? 1 : 0));
        enumMap.put((EnumMap) vux.AVOID_FERRIES, (vux) Integer.valueOf(dwaoVar.o ? 1 : 0));
        return new vup(enumMap);
    }

    public static boolean e(dwao dwaoVar) {
        if (!dwaoVar.o) {
            dowr dowrVar = dwaoVar.g;
            if (dowrVar == null) {
                dowrVar = dowr.m;
            }
            if (dowrVar.b) {
                return true;
            }
            dowr dowrVar2 = dwaoVar.g;
            if (dowrVar2 == null) {
                dowrVar2 = dowr.m;
            }
            return dowrVar2.c;
        }
        return true;
    }

    public static int f(dwao dwaoVar, dwao dwaoVar2) {
        if (dwaoVar.o == dwaoVar2.o) {
            dosz doszVar = dwaoVar.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            dosz doszVar2 = dwaoVar2.B;
            if (doszVar2 == null) {
                doszVar2 = dosz.e;
            }
            return !dbsd.a(doszVar, doszVar2) ? 6 : 5;
        }
        return 6;
    }

    public static boolean g(dqvj dqvjVar, int i) {
        if (dqvjVar == dqvj.TRANSIT || dqvjVar == dqvj.TAXI || dqvjVar == dqvj.TWO_WHEELER) {
            vux vuxVar = vux.GOOD_TO_GO;
            vxr vxrVar = vxr.DEPARTURE_TIME;
            int i2 = i - 1;
            return i2 == 6 || i2 == 7;
        }
        return false;
    }
}
