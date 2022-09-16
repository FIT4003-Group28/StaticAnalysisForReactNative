package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvj  reason: default package */
/* loaded from: classes2.dex */
public final class amvj {
    public static String a(Context context, dpkf dpkfVar) {
        dpjs dpjsVar;
        dbsk.s(dpkfVar);
        dpjn dpjnVar = dpkfVar.b;
        if (dpjnVar == null) {
            dpjnVar = dpjn.m;
        }
        dpjx dpjxVar = dpjnVar.b;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        if ((dpjxVar.a & 256) == 0) {
            dpjsVar = dpjs.ENTITY_TYPE_DEFAULT;
        } else {
            dpjn dpjnVar2 = dpkfVar.b;
            if (dpjnVar2 == null) {
                dpjnVar2 = dpjn.m;
            }
            dpjx dpjxVar2 = dpjnVar2.b;
            if (dpjxVar2 == null) {
                dpjxVar2 = dpjx.n;
            }
            dpjsVar = dpjs.b(dpjxVar2.f);
            if (dpjsVar == null) {
                dpjsVar = dpjs.ENTITY_TYPE_DEFAULT;
            }
        }
        if (dpjsVar == dpjs.ENTITY_TYPE_MY_LOCATION) {
            return context.getString(R.string.DIRECTIONS_YOUR_LOCATION);
        }
        if (dpjsVar == dpjs.ENTITY_TYPE_HOME) {
            return context.getString(R.string.HOME_LOCATION);
        }
        if (dpjsVar == dpjs.ENTITY_TYPE_WORK) {
            return context.getString(R.string.WORK_LOCATION);
        }
        dpjn dpjnVar3 = dpkfVar.b;
        if (dpjnVar3 == null) {
            dpjnVar3 = dpjn.m;
        }
        if ((dpjnVar3.a & 2) != 0) {
            dosw doswVar = dpjnVar3.c;
            if (doswVar == null) {
                doswVar = dosw.f;
            }
            if ((doswVar.a & 1) == 0) {
                if (doswVar.b.size() > 0) {
                    return doswVar.b.get(0);
                }
            } else {
                return doswVar.c;
            }
        } else {
            dpjx dpjxVar3 = dpjnVar3.b;
            if (dpjxVar3 == null) {
                dpjxVar3 = dpjx.n;
            }
            if ((dpjxVar3.a & 1) != 0) {
                dpjx dpjxVar4 = dpjnVar3.b;
                if (dpjxVar4 == null) {
                    dpjxVar4 = dpjx.n;
                }
                if (!dpjxVar4.b.isEmpty()) {
                    dpjx dpjxVar5 = dpjnVar3.b;
                    if (dpjxVar5 == null) {
                        dpjxVar5 = dpjx.n;
                    }
                    return dpjxVar5.b;
                }
            }
            if ((dpkfVar.a & 8) != 0 && !dpkfVar.e.isEmpty()) {
                return dpkfVar.e;
            }
        }
        return context.getString(R.string.DA_POINT_ON_MAP);
    }

    public static amvh[] d(List<dpjx> list, Context context) {
        amvh[] amvhVarArr = new amvh[list.size()];
        for (int i = 0; i < list.size(); i++) {
            amvhVarArr[i] = amvh.M(list.get(i), context);
        }
        return amvhVarArr;
    }

    public static amvh[] e(amsy amsyVar, Context context) {
        int i = amsyVar.i();
        amvh[] amvhVarArr = new amvh[i];
        for (int i2 = 0; i2 < i; i2++) {
            amvh c = c(amsyVar.c(), amsyVar.h(i2), context);
            dbsk.s(c);
            amvhVarArr[i2] = c;
        }
        return amvhVarArr;
    }

    @dzsi
    public static dndr f(@dzsi dpjs dpjsVar) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = dpjsVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return dndr.WORK;
            }
            if (ordinal == 5) {
                return dndr.NICKNAME;
            }
            if (ordinal == 6) {
                return dndr.CONTACT;
            }
            return null;
        }
        return dndr.HOME;
    }

    @dzsi
    public static dpjs g(@dzsi dndr dndrVar) {
        if (dndrVar == null) {
            return null;
        }
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = dndrVar.ordinal();
        if (ordinal == 1) {
            return dpjs.ENTITY_TYPE_HOME;
        }
        if (ordinal == 2) {
            return dpjs.ENTITY_TYPE_WORK;
        }
        if (ordinal == 3) {
            return dpjs.ENTITY_TYPE_CONTACT;
        }
        if (ordinal == 4) {
            return dpjs.ENTITY_TYPE_NICKNAME;
        }
        return null;
    }

    public static boolean h(@dzsi dpjs dpjsVar) {
        return dpjsVar == dpjs.ENTITY_TYPE_HOME || dpjsVar == dpjs.ENTITY_TYPE_WORK;
    }

    public static EnumMap<dpjs, azva> i(List<azva> list) {
        EnumMap<dpjs, azva> enumMap = new EnumMap<>(dpjs.class);
        for (azva azvaVar : list) {
            dpjs g = g(azvaVar.a);
            if (h(g)) {
                enumMap.put((EnumMap<dpjs, azva>) g, (dpjs) azvaVar);
            }
        }
        return enumMap;
    }

    public static String j(amvh amvhVar) {
        dosw F = amvhVar.F();
        if (F == null || F.b.size() <= 0) {
            return amvhVar.p();
        }
        return F.b.get(0);
    }

    public static void k(int i) {
        dbsk.e(i >= 2, "Need at least 2 waypoints, but actually %s", i);
    }

    private static amvh l(amvh amvhVar) {
        if (amvhVar.E() == null) {
            return amvhVar;
        }
        amvg amvgVar = new amvg(amvhVar);
        amvgVar.s = null;
        return amvgVar.a();
    }

    private static amvh m(amvh amvhVar) {
        if (amvhVar.b() == null) {
            return amvhVar;
        }
        amvg amvgVar = new amvg(amvhVar);
        amvgVar.x = null;
        return amvgVar.a();
    }

    private static void n(Context context, amvg amvgVar, dpkf dpkfVar) {
        String a = a(context, dpkfVar);
        if (!dbsj.d(a)) {
            amvgVar.j = a;
            amvgVar.k = true;
        }
    }

    @dzsi
    public static amvh c(String str, dpkf dpkfVar, Context context) {
        int a;
        int a2 = dpka.a(dpkfVar.d);
        dpbl dpblVar = null;
        if (a2 == 0 || a2 == 1 || ((a = dpka.a(dpkfVar.d)) != 0 && a == 2)) {
            dpjn dpjnVar = dpkfVar.b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            if ((dpjnVar.a & 1) == 0) {
                return null;
            }
            dpjn dpjnVar2 = dpkfVar.b;
            if (dpjnVar2 == null) {
                dpjnVar2 = dpjn.m;
            }
            dpjx dpjxVar = dpjnVar2.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            dpjn dpjnVar3 = dpkfVar.b;
            if (dpjnVar3 == null) {
                dpjnVar3 = dpjn.m;
            }
            dpjx dpjxVar2 = dpjnVar3.b;
            if (dpjxVar2 == null) {
                dpjxVar2 = dpjx.n;
            }
            amvg amvgVar = new amvg(amvh.M(dpjxVar2, context));
            if ((dpjxVar.a & 128) == 0) {
                n(context, amvgVar, dpkfVar);
            }
            dpjn dpjnVar4 = dpkfVar.b;
            if (dpjnVar4 == null) {
                dpjnVar4 = dpjn.m;
            }
            if ((dpjnVar4.a & 256) != 0) {
                dpjn dpjnVar5 = dpkfVar.b;
                if (dpjnVar5 == null) {
                    dpjnVar5 = dpjn.m;
                }
                dpjl dpjlVar = dpjnVar5.d;
                if (dpjlVar == null) {
                    dpjlVar = dpjl.i;
                }
                amvgVar.s = dpjlVar;
            }
            dpjn dpjnVar6 = dpkfVar.b;
            if (dpjnVar6 == null) {
                dpjnVar6 = dpjn.m;
            }
            if ((dpjnVar6.a & 2) != 0) {
                dpjn dpjnVar7 = dpkfVar.b;
                if (dpjnVar7 == null) {
                    dpjnVar7 = dpjn.m;
                }
                dosw doswVar = dpjnVar7.c;
                if (doswVar == null) {
                    doswVar = dosw.f;
                }
                amvgVar.t = doswVar;
            }
            dpjn dpjnVar8 = dpkfVar.b;
            if (dpjnVar8 == null) {
                dpjnVar8 = dpjn.m;
            }
            if ((dpjnVar8.a & 1024) != 0) {
                dpjn dpjnVar9 = dpkfVar.b;
                if (dpjnVar9 == null) {
                    dpjnVar9 = dpjn.m;
                }
                dntm b = dntm.b(dpjnVar9.g);
                if (b == null) {
                    b = dntm.UNKNOWN_PARKING_DIFFICULTY;
                }
                amvgVar.l = b;
            }
            if (!dbsj.d(str)) {
                amvgVar.v = str;
            }
            dpjn dpjnVar10 = dpkfVar.b;
            if (dpjnVar10 == null) {
                dpjnVar10 = dpjn.m;
            }
            if ((dpjnVar10.a & 8192) != 0) {
                dpjn dpjnVar11 = dpkfVar.b;
                if (dpjnVar11 == null) {
                    dpjnVar11 = dpjn.m;
                }
                amvgVar.w = dpjnVar11.i;
            }
            if ((dpkfVar.a & 64) != 0) {
                dpke dpkeVar = dpkfVar.f;
                if (dpkeVar == null) {
                    dpkeVar = dpke.f;
                }
                amvgVar.x = dpkeVar;
            }
            if ((dpjxVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                dpbj dpbjVar = dpjxVar.k;
                if (dpbjVar == null) {
                    dpbjVar = dpbj.c;
                }
                amvgVar.n = dpbjVar;
            }
            dpjn dpjnVar12 = dpkfVar.b;
            if (dpjnVar12 == null) {
                dpjnVar12 = dpjn.m;
            }
            if ((dpjnVar12.a & 2048) != 0) {
                dpjn dpjnVar13 = dpkfVar.b;
                if (dpjnVar13 == null) {
                    dpjnVar13 = dpjn.m;
                }
                dpblVar = dpjnVar13.h;
                if (dpblVar == null) {
                    dpblVar = dpbl.d;
                }
            }
            amvgVar.m = dpblVar;
            dpjn dpjnVar14 = dpkfVar.b;
            if (dpjnVar14 == null) {
                dpjnVar14 = dpjn.m;
            }
            amvgVar.z = dpjnVar14.j;
            dpjn dpjnVar15 = dpkfVar.b;
            if (dpjnVar15 == null) {
                dpjnVar15 = dpjn.m;
            }
            if ((dpjnVar15.a & 32768) != 0) {
                dpjn dpjnVar16 = dpkfVar.b;
                if (dpjnVar16 == null) {
                    dpjnVar16 = dpjn.m;
                }
                dnjf dnjfVar = dpjnVar16.k;
                if (dnjfVar == null) {
                    dnjfVar = dnjf.d;
                }
                amvgVar.C = dnjfVar;
            }
            dpjn dpjnVar17 = dpkfVar.b;
            if (dpjnVar17 == null) {
                dpjnVar17 = dpjn.m;
            }
            if ((dpjnVar17.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                dpjn dpjnVar18 = dpkfVar.b;
                if (dpjnVar18 == null) {
                    dpjnVar18 = dpjn.m;
                }
                dnwx dnwxVar = dpjnVar18.l;
                if (dnwxVar == null) {
                    dnwxVar = dnwx.f;
                }
                amvgVar.D = dnwxVar;
            }
            return amvgVar.a();
        }
        return null;
    }

    public static amvh b(String str, Context context, amvh amvhVar, dpkf dpkfVar) {
        dpjl dpjlVar;
        dpke dpkeVar;
        akqi f;
        int a;
        int a2 = dpka.a(dpkfVar.d);
        if (a2 == 0 || a2 == 1 || ((a = dpka.a(dpkfVar.d)) != 0 && a == 2)) {
            if ((dpkfVar.a & 1) == 0) {
                return m(l(amvhVar));
            }
            dpjn dpjnVar = dpkfVar.b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            if ((dpjnVar.a & 1) == 0) {
                return m(l(amvhVar));
            }
            if (amvhVar.k()) {
                if ((dpkfVar.a & 64) == 0) {
                    return m(amvhVar);
                }
                amvg amvgVar = new amvg(amvhVar);
                dpke dpkeVar2 = dpkfVar.f;
                if (dpkeVar2 == null) {
                    dpkeVar2 = dpke.f;
                }
                amvgVar.x = dpkeVar2;
                return amvgVar.a();
            }
            amvg amvgVar2 = new amvg(amvhVar);
            amvgVar2.v = str;
            dpjn dpjnVar2 = dpkfVar.b;
            if (dpjnVar2 == null) {
                dpjnVar2 = dpjn.m;
            }
            amvgVar2.w = dpjnVar2.i;
            dpjn dpjnVar3 = dpkfVar.b;
            if (dpjnVar3 == null) {
                dpjnVar3 = dpjn.m;
            }
            if ((dpjnVar3.a & 1) != 0) {
                dpjn dpjnVar4 = dpkfVar.b;
                if (dpjnVar4 == null) {
                    dpjnVar4 = dpjn.m;
                }
                dpjx dpjxVar = dpjnVar4.b;
                if (dpjxVar == null) {
                    dpjxVar = dpjx.n;
                }
                if ((dpjxVar.a & 2) != 0 && (f = akqi.f(dpjxVar.c)) != null) {
                    amvgVar2.c = f;
                }
                if ((dpjxVar.a & 4) != 0) {
                    dnoh dnohVar = dpjxVar.d;
                    if (dnohVar == null) {
                        dnohVar = dnoh.d;
                    }
                    amvgVar2.d = akqq.e(dnohVar);
                }
            }
            dpjn dpjnVar5 = dpkfVar.b;
            if (dpjnVar5 == null) {
                dpjnVar5 = dpjn.m;
            }
            dpbl dpblVar = null;
            if ((dpjnVar5.a & 256) != 0) {
                dpjn dpjnVar6 = dpkfVar.b;
                if (dpjnVar6 == null) {
                    dpjnVar6 = dpjn.m;
                }
                dpjlVar = dpjnVar6.d;
                if (dpjlVar == null) {
                    dpjlVar = dpjl.i;
                }
            } else {
                dpjlVar = null;
            }
            amvgVar2.s = dpjlVar;
            dpjn dpjnVar7 = dpkfVar.b;
            if (dpjnVar7 == null) {
                dpjnVar7 = dpjn.m;
            }
            if ((dpjnVar7.a & 2) != 0) {
                dpjn dpjnVar8 = dpkfVar.b;
                if (dpjnVar8 == null) {
                    dpjnVar8 = dpjn.m;
                }
                dosw doswVar = dpjnVar8.c;
                if (doswVar == null) {
                    doswVar = dosw.f;
                }
                amvgVar2.t = doswVar;
            }
            if ((dpkfVar.a & 64) != 0) {
                dpkeVar = dpkfVar.f;
                if (dpkeVar == null) {
                    dpkeVar = dpke.f;
                }
            } else {
                dpkeVar = null;
            }
            amvgVar2.x = dpkeVar;
            if (!amvhVar.l) {
                n(context, amvgVar2, dpkfVar);
            }
            dpjn dpjnVar9 = dpkfVar.b;
            if (dpjnVar9 == null) {
                dpjnVar9 = dpjn.m;
            }
            if ((dpjnVar9.a & 1024) != 0) {
                dpjn dpjnVar10 = dpkfVar.b;
                if (dpjnVar10 == null) {
                    dpjnVar10 = dpjn.m;
                }
                dntm b = dntm.b(dpjnVar10.g);
                if (b == null) {
                    b = dntm.UNKNOWN_PARKING_DIFFICULTY;
                }
                amvgVar2.l = b;
            }
            dpjn dpjnVar11 = dpkfVar.b;
            if (dpjnVar11 == null) {
                dpjnVar11 = dpjn.m;
            }
            if ((dpjnVar11.a & 2048) != 0) {
                dpjn dpjnVar12 = dpkfVar.b;
                if (dpjnVar12 == null) {
                    dpjnVar12 = dpjn.m;
                }
                dpblVar = dpjnVar12.h;
                if (dpblVar == null) {
                    dpblVar = dpbl.d;
                }
            }
            amvgVar2.m = dpblVar;
            dpjn dpjnVar13 = dpkfVar.b;
            if (dpjnVar13 == null) {
                dpjnVar13 = dpjn.m;
            }
            amvgVar2.z = dpjnVar13.j;
            dpjn dpjnVar14 = dpkfVar.b;
            if (dpjnVar14 == null) {
                dpjnVar14 = dpjn.m;
            }
            if ((dpjnVar14.a & 32768) != 0) {
                dpjn dpjnVar15 = dpkfVar.b;
                if (dpjnVar15 == null) {
                    dpjnVar15 = dpjn.m;
                }
                dnjf dnjfVar = dpjnVar15.k;
                if (dnjfVar == null) {
                    dnjfVar = dnjf.d;
                }
                amvgVar2.C = dnjfVar;
            }
            dpjn dpjnVar16 = dpkfVar.b;
            if (dpjnVar16 == null) {
                dpjnVar16 = dpjn.m;
            }
            if ((dpjnVar16.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                dpjn dpjnVar17 = dpkfVar.b;
                if (dpjnVar17 == null) {
                    dpjnVar17 = dpjn.m;
                }
                dnwx dnwxVar = dpjnVar17.l;
                if (dnwxVar == null) {
                    dnwxVar = dnwx.f;
                }
                amvgVar2.D = dnwxVar;
            }
            amvh a3 = amvgVar2.a();
            a3.equals(amvhVar);
            return a3;
        }
        return amvhVar;
    }
}
