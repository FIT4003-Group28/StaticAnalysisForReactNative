package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.g1;
import c.e.a.b.d.g.h1;
import c.e.a.b.d.g.o1;
import c.e.a.b.d.g.p1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ia {

    /* renamed from: a  reason: collision with root package name */
    private String f7372a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7373b;

    /* renamed from: c  reason: collision with root package name */
    private c.e.a.b.d.g.o1 f7374c;

    /* renamed from: d  reason: collision with root package name */
    private BitSet f7375d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f7376e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f7377f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f7378g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ga f7379h;

    private ia(ga gaVar, String str) {
        this.f7379h = gaVar;
        this.f7372a = str;
        this.f7373b = true;
        this.f7375d = new BitSet();
        this.f7376e = new BitSet();
        this.f7377f = new a.e.a();
        this.f7378g = new a.e.a();
    }

    private ia(ga gaVar, String str, c.e.a.b.d.g.o1 o1Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f7379h = gaVar;
        this.f7372a = str;
        this.f7375d = bitSet;
        this.f7376e = bitSet2;
        this.f7377f = map;
        this.f7378g = new a.e.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f7378g.put(num, arrayList);
            }
        }
        this.f7373b = false;
        this.f7374c = o1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ia(ga gaVar, String str, c.e.a.b.d.g.o1 o1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ja jaVar) {
        this(gaVar, str, o1Var, bitSet, bitSet2, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ia(ga gaVar, String str, ja jaVar) {
        this(gaVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ BitSet a(ia iaVar) {
        return iaVar.f7375d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.e.a.b.d.g.g1 a(int i) {
        ArrayList arrayList;
        List list;
        g1.a u = c.e.a.b.d.g.g1.u();
        u.a(i);
        u.a(this.f7373b);
        c.e.a.b.d.g.o1 o1Var = this.f7374c;
        if (o1Var != null) {
            u.a(o1Var);
        }
        o1.a v = c.e.a.b.d.g.o1.v();
        v.b(v9.a(this.f7375d));
        v.a(v9.a(this.f7376e));
        Map<Integer, Long> map = this.f7377f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f7377f.keySet()) {
                int intValue = num.intValue();
                h1.a r = c.e.a.b.d.g.h1.r();
                r.a(intValue);
                r.a(this.f7377f.get(Integer.valueOf(intValue)).longValue());
                arrayList2.add((c.e.a.b.d.g.h1) r.i());
            }
            arrayList = arrayList2;
        }
        v.c(arrayList);
        Map<Integer, List<Long>> map2 = this.f7378g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f7378g.keySet()) {
                p1.a r2 = c.e.a.b.d.g.p1.r();
                r2.a(num2.intValue());
                List<Long> list2 = this.f7378g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    r2.a(list2);
                }
                arrayList3.add((c.e.a.b.d.g.p1) r2.i());
            }
            list = arrayList3;
        }
        v.d(list);
        u.a(v);
        return (c.e.a.b.d.g.g1) u.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(na naVar) {
        int a2 = naVar.a();
        Boolean bool = naVar.f7536c;
        if (bool != null) {
            this.f7376e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = naVar.f7537d;
        if (bool2 != null) {
            this.f7375d.set(a2, bool2.booleanValue());
        }
        if (naVar.f7538e != null) {
            Long l = this.f7377f.get(Integer.valueOf(a2));
            long longValue = naVar.f7538e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f7377f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (naVar.f7539f != null) {
            List<Long> list = this.f7378g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList<>();
                this.f7378g.put(Integer.valueOf(a2), list);
            }
            if (naVar.b()) {
                list.clear();
            }
            if (c.e.a.b.d.g.x9.a() && this.f7379h.l().d(this.f7372a, r.g0) && naVar.c()) {
                list.clear();
            }
            if (!c.e.a.b.d.g.x9.a() || !this.f7379h.l().d(this.f7372a, r.g0)) {
                list.add(Long.valueOf(naVar.f7539f.longValue() / 1000));
                return;
            }
            long longValue2 = naVar.f7539f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }
}
