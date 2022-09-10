package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.core.SourceIdentity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cytq  reason: default package */
/* loaded from: classes5.dex */
public final class cytq {
    public final String a;
    public final String b;
    public final long c;
    public final SessionContext d;
    public final cyem<cyth> e;
    public final ClientConfigInternal f;
    public final cywa h;
    public final cyxu i;
    public final cyph j;
    public final cyor k;
    public final boolean l;
    public dbtp m;
    public int s;
    public final int t;
    public final List<cyvs> g = dchl.a();
    private final cyvg<cyto> u = new cyvg<>();
    public int n = 0;
    public final HashSet<String> o = new HashSet<>();
    public final cyvc p = new cyvc();
    public int q = 0;
    public int r = 0;

    public cytq(String str, long j, SessionContext sessionContext, cyem<cyth> cyemVar, ClientConfigInternal clientConfigInternal, int i, cyph cyphVar, boolean z, cyor cyorVar) {
        this.a = str;
        String trim = str.trim();
        this.b = trim;
        this.c = j;
        this.d = sessionContext;
        this.e = cyemVar;
        this.f = clientConfigInternal;
        this.j = cyphVar;
        this.l = z;
        cyvz e = cywa.e();
        e.e(sessionContext);
        e.d(trim.isEmpty() ? clientConfigInternal.B : clientConfigInternal.C);
        e.f(clientConfigInternal.y);
        e.c(clientConfigInternal.z);
        this.h = e.g();
        this.i = new cyxu(clientConfigInternal);
        this.t = i;
        cyoq b = cyorVar.b();
        b.a = Long.valueOf(j);
        this.k = b.a();
    }

    public final cyem<cyto> a() {
        return this.u.a(new cyem(this) { // from class: cytp
            private final cytq a;

            {
                this.a = this;
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:? -> B:104:0x02dc). Please submit an issue!!! */
            @Override // defpackage.cyem
            public final void a(Object obj) {
                cytq cytqVar;
                cyto cytoVar;
                Integer num;
                dbtp dbtpVar;
                Set set;
                String str;
                Object obj2;
                cytq cytqVar2;
                Object obj3;
                cyto cytoVar2;
                dbtp dbtpVar2;
                dccg dccgVar;
                dccg dccgVar2;
                dccg dccgVar3;
                cyto cytoVar3;
                dbtp dbtpVar3;
                dccg dccgVar4;
                cytq cytqVar3;
                double d;
                cytq cytqVar4 = this.a;
                cyto cytoVar4 = (cyto) obj;
                if (cytqVar4.p.b()) {
                    return;
                }
                List e = dcdc.e();
                List<cyvs> b = cytoVar4.b();
                int c = cytqVar4.f.c() - cytqVar4.g.size();
                if (b.isEmpty() || c <= 0) {
                    cytqVar = cytqVar4;
                    cytoVar = cytoVar4;
                    num = null;
                } else {
                    dbtp b2 = cytqVar4.j.b();
                    List<cyvs> list = cytqVar4.g;
                    int i = 4;
                    if (b.isEmpty()) {
                        cytqVar = cytqVar4;
                        cytoVar = cytoVar4;
                        dbtpVar = b2;
                        num = null;
                    } else {
                        List arrayList = new ArrayList(b.size());
                        HashSet hashSet = new HashSet();
                        dccg O = dccg.O();
                        dccg O2 = dccg.O();
                        cyvw.a(list, O);
                        cyvw.a(b, O2);
                        Iterator<cyvs> it = b.iterator();
                        while (it.hasNext()) {
                            cyvs next = it.next();
                            if (!hashSet.contains(next)) {
                                if (O.D()) {
                                    set = dcmr.a;
                                } else {
                                    Iterator<E> it2 = dcbg.d(next.a(), next.g()).iterator();
                                    set = null;
                                    while (true) {
                                        if (it2.hasNext()) {
                                            cyff cyffVar = (cyff) it2.next();
                                            if (set == null) {
                                                set = new HashSet(O.c(cyffVar.k()));
                                            } else {
                                                set.retainAll(O.c(cyffVar.k()));
                                            }
                                            if (set.isEmpty()) {
                                                break;
                                            }
                                        } else if (set == null) {
                                            set = dcmr.a;
                                        }
                                    }
                                }
                                if (set.isEmpty()) {
                                    Iterator<cyvs> it3 = cyvw.b(next, O2).iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            arrayList.add(next);
                                            cytqVar4 = cytqVar4;
                                            i = 4;
                                            break;
                                        }
                                        cyvs next2 = it3.next();
                                        if (next2 != next) {
                                            int n = next.n(next2);
                                            if (n == 3 || n == i) {
                                                dbsk.l(next.f == next2.f);
                                                String str2 = next.n;
                                                if ((str2 == null || str2.isEmpty()) && (str = next2.n) != null && !str.isEmpty()) {
                                                    next.n = next2.n;
                                                }
                                                next.k = cyvs.m(next.k, next2.k, cyvs.b, cyvs.a);
                                                if (next.g.a() < next2.g.a()) {
                                                    next.g = next2.g;
                                                }
                                                Iterator<cyvs> it4 = it3;
                                                dccg dccgVar5 = O;
                                                dccg dccgVar6 = O2;
                                                next.h = Math.max(next.h, next2.h);
                                                HashMap d2 = dcjz.d();
                                                dcdc<cyvi> a = next2.a();
                                                int size = a.size();
                                                int i2 = 0;
                                                while (i2 < size) {
                                                    Iterator<cyvs> it5 = it4;
                                                    cyvi cyviVar = a.get(i2);
                                                    d2.put(cyviVar.k(), cyviVar);
                                                    i2++;
                                                    it = it;
                                                    it4 = it5;
                                                }
                                                Iterator<cyvs> it6 = it4;
                                                Iterator<cyvs> it7 = it;
                                                Object obj4 = next.e;
                                                synchronized (obj4) {
                                                    try {
                                                        dcdc<SourceIdentity> dcdcVar = next.p;
                                                        dccx F = dcdc.F();
                                                        F.i(dcdcVar);
                                                        F.i(next2.b());
                                                        next.p = F.f();
                                                        next.j = cyvs.m(next.d(), next2.d(), cyvs.d, cyvs.c);
                                                        next.t = null;
                                                        dcdc<InAppNotificationTarget> dcdcVar2 = next.l;
                                                        dcdc<InAppNotificationTarget> g = next2.g();
                                                        if (dcdcVar2.isEmpty()) {
                                                            cytqVar2 = cytqVar4;
                                                            obj3 = obj4;
                                                            cytoVar2 = cytoVar4;
                                                            dbtpVar2 = b2;
                                                            dccgVar = dccgVar5;
                                                            dcdcVar2 = g;
                                                        } else if (!g.isEmpty()) {
                                                            HashMap hashMap = new HashMap();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            Iterator it8 = dcbg.d(dcdcVar2, g).iterator();
                                                            while (it8.hasNext()) {
                                                                cyff cyffVar2 = (cyff) it8.next();
                                                                Iterator it9 = it8;
                                                                String k = cyffVar2.k();
                                                                cyff cyffVar3 = (cyff) hashMap.get(k);
                                                                if (cyffVar3 == null) {
                                                                    hashMap.put(k, cyffVar2);
                                                                    cytqVar3 = cytqVar4;
                                                                    obj2 = obj4;
                                                                    cytoVar3 = cytoVar4;
                                                                    dbtpVar3 = b2;
                                                                    dccgVar3 = dccgVar5;
                                                                    dccgVar4 = dccgVar6;
                                                                } else {
                                                                    cyft cyftVar = (cyft) cyffVar2;
                                                                    dccgVar3 = dccgVar5;
                                                                    cytoVar3 = cytoVar4;
                                                                    dbtpVar3 = b2;
                                                                    cyft cyftVar2 = (cyft) cyffVar3;
                                                                    dccgVar4 = dccgVar6;
                                                                    cytqVar3 = cytqVar4;
                                                                    obj2 = obj4;
                                                                    if (cyftVar.b().i > cyftVar2.b().i) {
                                                                        cyftVar.b().k(cyftVar2.b());
                                                                        hashMap.put(k, cyffVar2);
                                                                    } else {
                                                                        cyftVar2.b().k(cyftVar.b());
                                                                    }
                                                                }
                                                                if (cyffVar3 == null) {
                                                                    try {
                                                                        arrayList2.add(k);
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                }
                                                                it8 = it9;
                                                                dccgVar5 = dccgVar3;
                                                                cytoVar4 = cytoVar3;
                                                                b2 = dbtpVar3;
                                                                dccgVar6 = dccgVar4;
                                                                cytqVar4 = cytqVar3;
                                                                obj4 = obj2;
                                                            }
                                                            cytqVar2 = cytqVar4;
                                                            obj3 = obj4;
                                                            cytoVar2 = cytoVar4;
                                                            dbtpVar2 = b2;
                                                            dccgVar = dccgVar5;
                                                            dccgVar2 = dccgVar6;
                                                            dccx F2 = dcdc.F();
                                                            int size2 = arrayList2.size();
                                                            for (int i3 = 0; i3 < size2; i3++) {
                                                                F2.g((cyff) hashMap.get((String) arrayList2.get(i3)));
                                                            }
                                                            dcdcVar2 = F2.f();
                                                            next.l = dcdcVar2;
                                                            next.o = dcdc.r(dchl.k(next.o, new cyvq(d2)));
                                                            next.s = null;
                                                            next.i.addAll(next2.e());
                                                            next.r = null;
                                                            if (next.f == cyxk.GROUP && next.y.isEmpty()) {
                                                                next.w = next2.w;
                                                                next.x = next2.x;
                                                                next.y = next2.y;
                                                            }
                                                            hashSet.add(next2);
                                                            it = it7;
                                                            it3 = it6;
                                                            O = dccgVar;
                                                            cytoVar4 = cytoVar2;
                                                            b2 = dbtpVar2;
                                                            O2 = dccgVar2;
                                                            cytqVar4 = cytqVar2;
                                                            i = 4;
                                                        } else {
                                                            cytqVar2 = cytqVar4;
                                                            obj3 = obj4;
                                                            cytoVar2 = cytoVar4;
                                                            dbtpVar2 = b2;
                                                            dccgVar = dccgVar5;
                                                        }
                                                        dccgVar2 = dccgVar6;
                                                        next.l = dcdcVar2;
                                                        next.o = dcdc.r(dchl.k(next.o, new cyvq(d2)));
                                                        next.s = null;
                                                        next.i.addAll(next2.e());
                                                        next.r = null;
                                                        if (next.f == cyxk.GROUP) {
                                                            next.w = next2.w;
                                                            next.x = next2.x;
                                                            next.y = next2.y;
                                                        }
                                                        hashSet.add(next2);
                                                        it = it7;
                                                        it3 = it6;
                                                        O = dccgVar;
                                                        cytoVar4 = cytoVar2;
                                                        b2 = dbtpVar2;
                                                        O2 = dccgVar2;
                                                        cytqVar4 = cytqVar2;
                                                        i = 4;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        obj2 = obj4;
                                                        throw th;
                                                    }
                                                }
                                            } else if (n == 2) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cytq cytqVar5 = cytqVar4;
                        cytoVar = cytoVar4;
                        dbtpVar = b2;
                        num = null;
                        b = arrayList;
                        cytqVar = cytqVar5;
                    }
                    cypg.a(cytqVar.j, 5, dbtpVar, cytqVar.k);
                    for (cyvs cyvsVar : b) {
                        cyua.e(cyvsVar);
                    }
                    cyxu cyxuVar = cytqVar.i;
                    dcdc<cyvs> q = dcdc.q(dcft.i(dchl.k(b, new cyxt(cytqVar.b.isEmpty() ? cyxu.b(cyxuVar.b.I.b) : cyxu.b(cyxuVar.b.I.c), cytqVar.d)), cyxu.a));
                    dbtp b3 = cytqVar.j.b();
                    cygp a2 = cytqVar.h.a();
                    List arrayList3 = new ArrayList(q.size());
                    for (cyvs cyvsVar2 : q) {
                        cyvt a3 = cyvt.a();
                        a3.h(cyvsVar2);
                        if (a2 == cygp.FIELD_FLATTENED) {
                            if (cyvsVar2.a().size() == 1) {
                                d = cyvsVar2.a().get(0).b().i;
                            } else if (cyvsVar2.g().size() != 1) {
                                throw new AssertionError("Result was not flattened. Unable to determine correct affinity.");
                            } else {
                                d = cyvsVar2.g().get(0).b().i;
                            }
                        } else if (a2 != cygp.COALESCED) {
                            throw new AssertionError("Unknown result grouping.");
                        } else {
                            d = cyvsVar2.h;
                        }
                        a3.c = d;
                        arrayList3.add(a3.b());
                    }
                    Collections.sort(arrayList3, dyaq.e() ? czdt.b : czdt.a);
                    List<cyvs> subList = c < arrayList3.size() ? arrayList3.subList(0, c) : arrayList3;
                    cypg.a(cytqVar.j, 4, b3, cytqVar.k);
                    int i4 = cytqVar.q;
                    for (cyvs cyvsVar3 : subList) {
                        int i5 = i4 + 1;
                        synchronized (cyvsVar3.e) {
                            cyvsVar3.u = i4;
                        }
                        cytqVar.g.add(cyvsVar3);
                        i4 = i5;
                    }
                    e = subList;
                }
                Integer a4 = cytoVar.a() != null ? cytoVar.a().a() : num;
                cyem<cyth> cyemVar = cytqVar.e;
                cytg m = cyth.m();
                m.h(e);
                cytc cytcVar = (cytc) m;
                cytcVar.b = cytoVar.c();
                m.d(cytoVar.e());
                int i6 = cytqVar.r;
                cytqVar.r = i6 + 1;
                m.b(i6);
                m.f(cytqVar.q);
                m.g(cytqVar);
                cytcVar.c = cytoVar.d();
                m.e(cytoVar.f());
                m.c(cytoVar.g());
                cytcVar.d = a4;
                m.i(cytoVar.h());
                cyemVar.a(m.a());
                cytqVar.q += e.size();
            }
        });
    }

    public final boolean b(cyem<cyto> cyemVar) {
        boolean z;
        cyvg<cyto> cyvgVar = this.u;
        synchronized (cyvgVar.a) {
            z = cyvgVar.c == cyemVar;
        }
        return z;
    }

    public final long c() {
        dbtp dbtpVar = this.m;
        if (dbtpVar != null) {
            return dbtpVar.d(TimeUnit.NANOSECONDS);
        }
        return -1L;
    }
}
