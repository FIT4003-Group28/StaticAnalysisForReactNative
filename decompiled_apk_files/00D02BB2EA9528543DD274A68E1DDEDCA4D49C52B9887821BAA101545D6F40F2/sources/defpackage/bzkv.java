package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzkv  reason: default package */
/* loaded from: classes4.dex */
public final class bzkv {
    static final long a = TimeUnit.MINUTES.toSeconds(60);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(bzia bziaVar, long j) {
        bzjl bzjlVar;
        if (bzhz.a(bziaVar.b) == 3) {
            if (bziaVar.b == 2) {
                bzjlVar = (bzjl) bziaVar.c;
            } else {
                bzjlVar = bzjl.e;
            }
            if (j >= bzjlVar.b) {
                if (j <= (bziaVar.b == 2 ? (bzjl) bziaVar.c : bzjl.e).c) {
                    return true;
                }
            }
        }
        return false;
    }

    static bzlj c(bzia bziaVar) {
        bzkf bzkfVar = new bzkf();
        bzju bzjuVar = bziaVar.d;
        if (bzjuVar == null) {
            bzjuVar = bzju.e;
        }
        dcdc<dpce> r = dcdc.r(bzjuVar.b);
        if (r != null) {
            bzkfVar.a = r;
            if (!bziaVar.e.isEmpty()) {
                bzkfVar.b = dbsg.i(bziaVar.e);
            }
            if (!bziaVar.f.isEmpty()) {
                bzkfVar.c = dbsg.i(bziaVar.f);
            }
            if (!bziaVar.h.isEmpty()) {
                bzkfVar.d = dbsg.i(bziaVar.h);
            }
            bzju bzjuVar2 = bziaVar.d;
            if (bzjuVar2 == null) {
                bzjuVar2 = bzju.e;
            }
            bzjt b2 = bzjt.b(bzjuVar2.d);
            if (b2 == null) {
                b2 = bzjt.UNKNOWN_VEHICLE_TYPE;
            }
            if (b2 != null) {
                bzkfVar.e = b2;
                String str = bzkfVar.a == null ? " transitLineSnippets" : "";
                if (bzkfVar.e == null) {
                    str = str.concat(" vehicle");
                }
                if (str.isEmpty()) {
                    return new bzkg(bzkfVar.a, bzkfVar.b, bzkfVar.c, bzkfVar.d, bzkfVar.e);
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null vehicle");
        }
        throw new NullPointerException("Null transitLineSnippets");
    }

    public static int d(bzjt bzjtVar) {
        dlkp dlkpVar = dlkp.UNKNOWN_VEHICLE_TYPE;
        bzjt bzjtVar2 = bzjt.UNKNOWN_VEHICLE_TYPE;
        int ordinal = bzjtVar.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 2131232620;
            }
            return ordinal != 4 ? 2131232612 : 2131232609;
        }
        return 2131232617;
    }

    public static int e(List<bzjd> list) {
        for (bzjd bzjdVar : list) {
            bzjc b2 = bzjc.b(bzjdVar.f);
            if (b2 == null) {
                b2 = bzjc.UNKNOWN;
            }
            if (b2 == bzjc.ALERT) {
                return 2131231424;
            }
        }
        return 2131231426;
    }

    public static String f(bzjt bzjtVar) {
        dlkp dlkpVar = dlkp.UNKNOWN_VEHICLE_TYPE;
        bzjt bzjtVar2 = bzjt.UNKNOWN_VEHICLE_TYPE;
        int ordinal = bzjtVar.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "https://www.gstatic.com/images/icons/material/system/2x/directions_bus_white_24dp.png" : "https://www.gstatic.com/images/icons/material/system/2x/directions_boat_white_24dp.png" : "https://www.gstatic.com/images/icons/material/system/2x/directions_subway_white_24dp.png" : "https://www.gstatic.com/images/icons/material/system/2x/directions_railway_white_24dp.png";
    }

    public static int g(dlkp dlkpVar) {
        dlkp dlkpVar2 = dlkp.UNKNOWN_VEHICLE_TYPE;
        bzjt bzjtVar = bzjt.UNKNOWN_VEHICLE_TYPE;
        int ordinal = dlkpVar.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 2131232863 : 2131232554;
    }

    public static dbsg<bzlh> h(long j, bzjj bzjjVar) {
        bzjh bzjhVar;
        bzjh bzjhVar2;
        bzjh bzjhVar3;
        int a2;
        dccx F = dcdc.F();
        Iterator<bzia> it = bzjjVar.d.iterator();
        while (it.hasNext()) {
            bzia next = it.next();
            if (next.b != 1 || (a2 = bzjg.a(((bzjh) next.c).c)) == 0 || a2 != 4) {
                if (a(next, j)) {
                    bzlj c = c(next);
                    bzlg e = bzlh.e();
                    e.c(c);
                    bzkd bzkdVar = (bzkd) e;
                    bzkdVar.b = m(next);
                    bzkdVar.a = dbpy.a;
                    if (next.b == 1) {
                        bzjhVar = (bzjh) next.c;
                    } else {
                        bzjhVar = bzjh.j;
                    }
                    F.g(bzjhVar);
                    if (it.hasNext()) {
                        bzia next2 = it.next();
                        if (c.equals(c(next2)) && a(next2, j)) {
                            if (next2.b == 1) {
                                bzjhVar2 = (bzjh) next2.c;
                            } else {
                                bzjhVar2 = bzjh.j;
                            }
                            int a3 = bzjg.a(bzjhVar2.c);
                            if (a3 == 0 || a3 != 4) {
                                if (next2.b == 1) {
                                    bzjhVar3 = (bzjh) next2.c;
                                } else {
                                    bzjhVar3 = bzjh.j;
                                }
                                F.g(bzjhVar3);
                            }
                        }
                    }
                    e.b(F.f());
                    return dbsg.i(e.a());
                }
            }
        }
        return dbpy.a;
    }

    public static List<bzjd> i(bzjj bzjjVar, long j) {
        HashSet hashSet = new HashSet();
        l(hashSet, bzjjVar.e, j);
        for (bzia bziaVar : bzjjVar.d) {
            l(hashSet, m(bziaVar), j);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, bzku.a);
        return arrayList;
    }

    public static long j(bzjj bzjjVar, long j) {
        bzjh bzjhVar;
        bzjl bzjlVar;
        for (bzia bziaVar : bzjjVar.d) {
            if (bzhz.a(bziaVar.b) == 2) {
                if (bziaVar.b == 1) {
                    bzjhVar = (bzjh) bziaVar.c;
                } else {
                    bzjhVar = bzjh.j;
                }
                long j2 = bzjhVar.b;
                if (j2 >= j && j2 < Long.MAX_VALUE) {
                    return j2;
                }
            } else if (bzhz.a(bziaVar.b) != 3) {
                continue;
            } else {
                if (bziaVar.b == 2) {
                    bzjlVar = (bzjl) bziaVar.c;
                } else {
                    bzjlVar = bzjl.e;
                }
                long j3 = bzjlVar.b;
                if (j3 >= j && j3 < Long.MAX_VALUE) {
                    return j3;
                }
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c7, code lost:
        if (r4 == 1) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dcdc<defpackage.bzlh> k(long r17, defpackage.bzjj r19) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzkv.k(long, bzjj):dcdc");
    }

    private static void l(Set<bzjd> set, List<bzjd> list, long j) {
        for (bzjd bzjdVar : list) {
            int i = bzjdVar.a;
            int i2 = i & 1;
            if (i2 != 0 || (i & 2) != 0) {
                if (i2 == 0 || (i & 2) != 0) {
                    if (i2 == 0 && (i & 2) != 0) {
                        if (j <= bzjdVar.c) {
                        }
                    } else if (j >= bzjdVar.b && j <= bzjdVar.c) {
                    }
                } else if (j >= bzjdVar.b) {
                }
            }
            set.add(bzjdVar);
        }
    }

    private static List<bzjd> m(bzia bziaVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bziaVar.g);
        bzju bzjuVar = bziaVar.d;
        if (bzjuVar == null) {
            bzjuVar = bzju.e;
        }
        arrayList.addAll(bzjuVar.c);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(bzia bziaVar, long j) {
        bzjl bzjlVar;
        bzjh bzjhVar;
        if (bzhz.a(bziaVar.b) == 2) {
            if (bziaVar.b == 1) {
                bzjhVar = (bzjh) bziaVar.c;
            } else {
                bzjhVar = bzjh.j;
            }
            long j2 = bzjhVar.b;
            return j2 >= j && j2 <= j + a;
        }
        if (bzhz.a(bziaVar.b) == 3) {
            if (bziaVar.b == 2) {
                bzjlVar = (bzjl) bziaVar.c;
            } else {
                bzjlVar = bzjl.e;
            }
            long j3 = bzjlVar.b;
            if (j3 >= j && j3 <= j + a) {
                return true;
            }
        }
        return false;
    }
}
