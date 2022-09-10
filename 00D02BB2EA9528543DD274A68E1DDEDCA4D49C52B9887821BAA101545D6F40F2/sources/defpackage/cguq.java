package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cguq  reason: default package */
/* loaded from: classes4.dex */
public final class cguq {
    @dzsi
    public static dspd a(dwsr dwsrVar) {
        dwsq dwsqVar = dwsrVar.f;
        if (dwsqVar == null) {
            dwsqVar = dwsq.d;
        }
        if ((dwsqVar.a & 1) != 0) {
            dwsq dwsqVar2 = dwsrVar.f;
            if (dwsqVar2 == null) {
                dwsqVar2 = dwsq.d;
            }
            dspd dspdVar = dwsqVar2.b;
            if (f(dwsrVar, dspdVar) != null) {
                return dspdVar;
            }
        }
        if (dwsrVar.b.isEmpty()) {
            return null;
        }
        return dwsrVar.b.get(0).b;
    }

    @dzsi
    public static dwpc b(@dzsi dwsr dwsrVar) {
        int a;
        if (dwsrVar == null) {
            return null;
        }
        dwsq dwsqVar = dwsrVar.f;
        if (dwsqVar == null) {
            dwsqVar = dwsq.d;
        }
        for (dwrg dwrgVar : dwsqVar.c) {
            int a2 = dwrf.a(dwrgVar.c);
            if ((a2 != 0 && a2 == 2) || ((a = dwrf.a(dwrgVar.c)) != 0 && a == 3)) {
                dwpc dwpcVar = dwrgVar.b;
                return dwpcVar == null ? dwpc.e : dwpcVar;
            }
        }
        return null;
    }

    @dzsi
    public static dhjx c(@dzsi dwsr dwsrVar, @dzsi dspd dspdVar) {
        dwrc f = f(dwsrVar, dspdVar);
        if (f != null) {
            dwrv dwrvVar = f.i;
            if (dwrvVar == null) {
                dwrvVar = dwrv.c;
            }
            dwrx b = dwrx.b(dwrvVar.b);
            if (b == null) {
                b = dwrx.UNKNOWN_UGC_TASKS_VIEWPORT_CAMERA_TYPE;
            }
            if (b == dwrx.UNKNOWN_UGC_TASKS_VIEWPORT_CAMERA_TYPE) {
                return null;
            }
            dwrv dwrvVar2 = f.i;
            if (dwrvVar2 == null) {
                dwrvVar2 = dwrv.c;
            }
            dhjx dhjxVar = dwrvVar2.a;
            return dhjxVar == null ? dhjx.f : dhjxVar;
        }
        return null;
    }

    public static Set<dspd> d(List<dwqt> list) {
        HashSet hashSet = new HashSet();
        for (dwqt dwqtVar : list) {
            hashSet.add(dwqtVar.a);
        }
        return hashSet;
    }

    public static dcdc<cgsk> e(Iterable<dwqg> iterable) {
        final HashMap hashMap = new HashMap();
        for (dwqg dwqgVar : iterable) {
            dwqf dwqfVar = dwqgVar.c;
            if (dwqfVar == null) {
                dwqfVar = dwqf.g;
            }
            if ((dwqfVar.a & 8) != 0) {
                dwpc dwpcVar = dwqgVar.b;
                if (dwpcVar == null) {
                    dwpcVar = dwpc.e;
                }
                String str = dwpcVar.b;
                dwqf dwqfVar2 = dwqgVar.c;
                if (dwqfVar2 == null) {
                    dwqfVar2 = dwqf.g;
                }
                dwqc dwqcVar = dwqfVar2.e;
                if (dwqcVar == null) {
                    dwqcVar = dwqc.g;
                }
                hashMap.put(str, dwqcVar);
            }
        }
        final HashMap hashMap2 = new HashMap();
        for (dwqg dwqgVar2 : iterable) {
            dwqf dwqfVar3 = dwqgVar2.c;
            if (dwqfVar3 == null) {
                dwqfVar3 = dwqf.g;
            }
            if ((dwqfVar3.a & 2) != 0) {
                dwpc dwpcVar2 = dwqgVar2.b;
                if (dwpcVar2 == null) {
                    dwpcVar2 = dwpc.e;
                }
                String str2 = dwpcVar2.b;
                dwqf dwqfVar4 = dwqgVar2.c;
                if (dwqfVar4 == null) {
                    dwqfVar4 = dwqf.g;
                }
                dvyw dvywVar = dwqfVar4.c;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                hashMap2.put(str2, dvywVar);
            }
        }
        return dcbg.b(iterable).s(new dbrn(hashMap, hashMap2) { // from class: cgup
            private final Map a;
            private final Map b;

            {
                this.a = hashMap;
                this.b = hashMap2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map map = this.a;
                Map map2 = this.b;
                dwqg dwqgVar3 = (dwqg) obj;
                dwpc dwpcVar3 = dwqgVar3.b;
                if (dwpcVar3 == null) {
                    dwpcVar3 = dwpc.e;
                }
                String str3 = dwpcVar3.b;
                dwqc dwqcVar2 = (dwqc) map.get(str3);
                if (dwqcVar2 == null) {
                    dwqcVar2 = dwqc.g;
                }
                dvyw dvywVar2 = (dvyw) map2.get(str3);
                if (dvywVar2 == null) {
                    dvywVar2 = dvyw.bv;
                }
                return new cgsj(dwqgVar3, dwqcVar2, dvywVar2);
            }
        }).z();
    }

    @dzsi
    public static dwrc f(@dzsi dwsr dwsrVar, @dzsi dspd dspdVar) {
        if (dwsrVar != null && dspdVar != null) {
            for (dwrc dwrcVar : dwsrVar.b) {
                if (dspdVar.equals(dwrcVar.b)) {
                    return dwrcVar;
                }
            }
        }
        return null;
    }

    public static void g(cgsk cgskVar, dcka<dwpc, cgsk> dckaVar, dccx<cgsk> dccxVar) {
        dccxVar.g(cgskVar);
        dwpc dwpcVar = cgskVar.a().b;
        if (dwpcVar == null) {
            dwpcVar = dwpc.e;
        }
        for (cgsk cgskVar2 : ((dbxj) dckaVar).f(dwpcVar)) {
            g(cgskVar2, dckaVar, dccxVar);
        }
    }
}
