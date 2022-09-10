package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bonk  reason: default package */
/* loaded from: classes3.dex */
public final class bonk {
    private static final Comparator<bopy> a = new bonj();

    @Deprecated
    public static <T extends bopy> byee a(List<T> list, String str) {
        dgsl b = b(list);
        dvxc dvxcVar = (dvxc) dvxh.B.bZ();
        if (dvxcVar.c) {
            dvxcVar.bF();
            dvxcVar.c = false;
        }
        dvxh dvxhVar = (dvxh) dvxcVar.b;
        b.getClass();
        dvxhVar.k = b;
        dvxhVar.a |= 1024;
        return new byee((dvxh) dvxcVar.bK(), str, false, false);
    }

    @Deprecated
    public static <T extends bopy> dgsl b(List<T> list) {
        int i;
        dgsk bZ = dgsl.b.bZ();
        for (T t : list) {
            boqj i2 = t.i();
            Set<byea> v = i2.v();
            boolean booleanValue = i2.s().booleanValue();
            for (byea byeaVar : v) {
                dgrw bZ2 = dgrz.c.bZ();
                int i3 = byeaVar.k;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (byeaVar.equals(byea.SATURDAY)) {
                    i = 7;
                } else {
                    int i5 = byeaVar.c().k;
                    int i6 = i5 - 1;
                    if (i5 == 0) {
                        throw null;
                    }
                    i = i6;
                }
                dgsg bZ3 = dgsj.f.bZ();
                dgsa bZ4 = dgsf.i.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dgsf dgsfVar = (dgsf) bZ4.b;
                dgsfVar.f = 0;
                int i7 = dgsfVar.a | 16;
                dgsfVar.a = i7;
                dgsfVar.a = i7 | 8;
                dgsfVar.e = i4;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgsj dgsjVar = (dgsj) bZ3.b;
                dgsf bK = bZ4.bK();
                bK.getClass();
                dgsjVar.d = bK;
                dgsjVar.a |= 8;
                dgsa bZ5 = dgsf.i.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dgsf dgsfVar2 = (dgsf) bZ5.b;
                dgsfVar2.f = 0;
                int i8 = dgsfVar2.a | 16;
                dgsfVar2.a = i8;
                dgsfVar2.a = i8 | 8;
                dgsfVar2.e = i;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgsj dgsjVar2 = (dgsj) bZ3.b;
                dgsf bK2 = bZ5.bK();
                bK2.getClass();
                dgsjVar2.e = bK2;
                dgsjVar2.a |= 16;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgsj dgsjVar3 = (dgsj) bZ3.b;
                dgsjVar3.b = 2;
                dgsjVar3.a |= 1;
                bZ2.a(bZ3);
                if (!booleanValue) {
                    dgsg bZ6 = dgsj.f.bZ();
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dgsj dgsjVar4 = (dgsj) bZ6.b;
                    dgsjVar4.b = 2;
                    dgsjVar4.a |= 1;
                    dgsa bZ7 = dgsf.i.bZ();
                    int intValue = i2.G().intValue();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dgsf dgsfVar3 = (dgsf) bZ7.b;
                    dgsfVar3.a |= 4;
                    dgsfVar3.d = intValue;
                    int intValue2 = i2.H().intValue();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dgsf dgsfVar4 = (dgsf) bZ7.b;
                    dgsfVar4.a |= 2;
                    dgsfVar4.c = intValue2;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dgsj dgsjVar5 = (dgsj) bZ6.b;
                    dgsf bK3 = bZ7.bK();
                    bK3.getClass();
                    dgsjVar5.d = bK3;
                    dgsjVar5.a |= 8;
                    dgsa bZ8 = dgsf.i.bZ();
                    int intValue3 = i2.M().intValue();
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dgsf dgsfVar5 = (dgsf) bZ8.b;
                    dgsfVar5.a |= 4;
                    dgsfVar5.d = intValue3;
                    int intValue4 = i2.N().intValue();
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dgsf dgsfVar6 = (dgsf) bZ8.b;
                    dgsfVar6.a = 2 | dgsfVar6.a;
                    dgsfVar6.c = intValue4;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dgsj dgsjVar6 = (dgsj) bZ6.b;
                    dgsf bK4 = bZ8.bK();
                    bK4.getClass();
                    dgsjVar6.e = bK4;
                    dgsjVar6.a |= 16;
                    bZ2.a(bZ6);
                }
                bZ.a(bZ2);
            }
        }
        return bZ.bK();
    }

    @Deprecated
    public static List<bopx> c(List<? extends bopy> list, Context context, boolean z) {
        byea[] values;
        String string;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byea byeaVar : byea.values()) {
            linkedHashMap.put(byeaVar, new bonl(context, byeaVar));
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, a);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            boqj i3 = ((bopy) arrayList.get(i2)).i();
            if (i3.s().booleanValue()) {
                string = context.getString(R.string.BUSINESS_HOURS_OPEN_24_HOURS_SUMMARY_EXPANSION);
            } else {
                string = context.getString(R.string.BUSINESS_HOURS_TIMESPAN_SUMMARY, bvtb.j(context, i3.G().intValue(), i3.H().intValue(), 0), bvtb.j(context, i3.M().intValue(), i3.N().intValue(), 0));
            }
            Iterator<byea> it = i3.v().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    byea next = it.next();
                    if (linkedHashMap.containsKey(next)) {
                        ((bonl) linkedHashMap.get(next)).a(string);
                    }
                }
            }
            i2 = i;
        }
        for (bopx bopxVar : linkedHashMap.values()) {
            bonl bonlVar = (bonl) bopxVar;
            if (bonlVar.c().isEmpty()) {
                bonlVar.a(context.getString(R.string.BUSINESS_HOURS_CLOSED_ALL_DAY_SUMMARY));
            }
        }
        if (!z) {
            return new ArrayList(linkedHashMap.values());
        }
        ArrayList a2 = dchl.a();
        HashMap d = dcjz.d();
        for (bopx bopxVar2 : linkedHashMap.values()) {
            bonl bonlVar2 = (bonl) bopxVar2;
            List<String> c = bonlVar2.c();
            if (d.containsKey(c)) {
                ((bonl) d.get(c)).d(bonlVar2.e().get(0));
            } else {
                a2.add(bopxVar2);
                d.put(c, bopxVar2);
            }
        }
        return a2;
    }

    public static byee d(List<boqh> list, String str) {
        dgsl e = e(list);
        dvxc dvxcVar = (dvxc) dvxh.B.bZ();
        if (dvxcVar.c) {
            dvxcVar.bF();
            dvxcVar.c = false;
        }
        dvxh dvxhVar = (dvxh) dvxcVar.b;
        e.getClass();
        dvxhVar.k = e;
        dvxhVar.a |= 1024;
        return new byee((dvxh) dvxcVar.bK(), str, false, false);
    }

    public static <T extends boqh> dgsl e(List<T> list) {
        int i;
        dgsk bZ = dgsl.b.bZ();
        for (T t : list) {
            boof boofVar = (boof) t;
            byea a2 = boofVar.a();
            boolean c = boofVar.c();
            int i2 = a2.k;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (a2.equals(byea.SATURDAY)) {
                i = 7;
            } else {
                int i4 = a2.c().k;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                i = i5;
            }
            Iterator<? extends boqi> it = t.b().iterator();
            while (it.hasNext()) {
                bonn a3 = ((booq) it.next()).a();
                if (a3 != null) {
                    dgrw bZ2 = dgrz.c.bZ();
                    dgsg bZ3 = dgsj.f.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dgsj dgsjVar = (dgsj) bZ3.b;
                    dgsjVar.b = 2;
                    dgsjVar.a |= 1;
                    dgsa bZ4 = dgsf.i.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dgsf dgsfVar = (dgsf) bZ4.b;
                    dgsfVar.f = 0;
                    int i6 = dgsfVar.a | 16;
                    dgsfVar.a = i6;
                    dgsfVar.a = i6 | 8;
                    dgsfVar.e = i3;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dgsj dgsjVar2 = (dgsj) bZ3.b;
                    dgsf bK = bZ4.bK();
                    bK.getClass();
                    dgsjVar2.d = bK;
                    dgsjVar2.a |= 8;
                    dgsa bZ5 = dgsf.i.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dgsf dgsfVar2 = (dgsf) bZ5.b;
                    dgsfVar2.f = 0;
                    int i7 = dgsfVar2.a | 16;
                    dgsfVar2.a = i7;
                    dgsfVar2.a = i7 | 8;
                    dgsfVar2.e = i;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dgsj dgsjVar3 = (dgsj) bZ3.b;
                    dgsf bK2 = bZ5.bK();
                    bK2.getClass();
                    dgsjVar3.e = bK2;
                    dgsjVar3.a |= 16;
                    bZ2.a(bZ3);
                    if (!c) {
                        dgsg bZ6 = dgsj.f.bZ();
                        if (bZ6.c) {
                            bZ6.bF();
                            bZ6.c = false;
                        }
                        dgsj dgsjVar4 = (dgsj) bZ6.b;
                        dgsjVar4.b = 2;
                        dgsjVar4.a |= 1;
                        dgsa bZ7 = dgsf.i.bZ();
                        int a4 = a3.a();
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        dgsf dgsfVar3 = (dgsf) bZ7.b;
                        dgsfVar3.a |= 4;
                        dgsfVar3.d = a4;
                        int b = a3.b();
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        dgsf dgsfVar4 = (dgsf) bZ7.b;
                        dgsfVar4.a |= 2;
                        dgsfVar4.c = b;
                        if (bZ6.c) {
                            bZ6.bF();
                            bZ6.c = false;
                        }
                        dgsj dgsjVar5 = (dgsj) bZ6.b;
                        dgsf bK3 = bZ7.bK();
                        bK3.getClass();
                        dgsjVar5.d = bK3;
                        dgsjVar5.a |= 8;
                        dgsa bZ8 = dgsf.i.bZ();
                        int c2 = a3.c();
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        dgsf dgsfVar5 = (dgsf) bZ8.b;
                        dgsfVar5.a |= 4;
                        dgsfVar5.d = c2;
                        int d = a3.d();
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        dgsf dgsfVar6 = (dgsf) bZ8.b;
                        dgsfVar6.a = 2 | dgsfVar6.a;
                        dgsfVar6.c = d;
                        if (bZ6.c) {
                            bZ6.bF();
                            bZ6.c = false;
                        }
                        dgsj dgsjVar6 = (dgsj) bZ6.b;
                        dgsf bK4 = bZ8.bK();
                        bK4.getClass();
                        dgsjVar6.e = bK4;
                        dgsjVar6.a |= 16;
                        bZ2.a(bZ6);
                    }
                    bZ.a(bZ2);
                }
            }
        }
        return bZ.bK();
    }

    public static List<bopx> f(List<? extends boqh> list, Set<byea> set, Context context, boolean z) {
        LinkedHashMap h = dcjz.h();
        LinkedHashMap h2 = dcjz.h();
        for (boqh boqhVar : list) {
            byea a2 = ((boof) boqhVar).a();
            bonl bonlVar = new bonl(context, a2);
            bonlVar.h(set.contains(a2));
            for (boqi boqiVar : boqhVar.b()) {
                bonlVar.a(boqiVar.toString());
            }
            if (boqhVar instanceof bopd) {
                h2.put(a2, ((bopd) boqhVar).u());
                LinkedHashMap<byea, String> h3 = dcjz.h();
                h3.put(a2, (String) h2.get(a2));
                bonlVar.f(h3);
            }
            h.put(a2, bonlVar);
        }
        for (bopx bopxVar : h.values()) {
            bonl bonlVar2 = (bonl) bopxVar;
            if (bonlVar2.c().isEmpty()) {
                bonlVar2.a(context.getString(R.string.BUSINESS_HOURS_CLOSED_ALL_DAY_SUMMARY));
            }
        }
        if (!z) {
            return new ArrayList(h.values());
        }
        ArrayList a3 = dchl.a();
        HashMap d = dcjz.d();
        HashMap d2 = dcjz.d();
        for (bopx bopxVar2 : h.values()) {
            bonl bonlVar3 = (bonl) bopxVar2;
            HashMap hashMap = true != bonlVar3.i() ? d : d2;
            List<String> c = bonlVar3.c();
            if (hashMap.containsKey(c)) {
                bonl bonlVar4 = (bonl) hashMap.get(c);
                byea byeaVar = bonlVar3.e().get(0);
                bonlVar4.d(byeaVar);
                LinkedHashMap<byea, String> g = bonlVar4.g();
                String str = (String) h2.get(byeaVar);
                if (g != null && str != null) {
                    g.put(byeaVar, str);
                }
            } else {
                a3.add(bopxVar2);
                hashMap.put(c, bopxVar2);
            }
        }
        return a3;
    }
}
