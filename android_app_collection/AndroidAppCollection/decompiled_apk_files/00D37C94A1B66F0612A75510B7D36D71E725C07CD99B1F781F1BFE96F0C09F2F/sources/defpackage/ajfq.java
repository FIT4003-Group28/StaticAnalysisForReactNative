package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajfq  reason: default package */
/* loaded from: classes.dex */
public class ajfq {
    public final long a;
    public final List b;
    public final WeakReference c;
    public boolean d;
    public ajfp e;
    public long f;
    public long g;
    public final String h;
    private long i;
    private final Map j;
    private final ampg k;
    private final TreeMap l;
    private ajfp m;
    private ajfp n;

    private ajfq(long j, long j2, ajbs ajbsVar, ampg ampgVar, boolean z, String str, ajfp ajfpVar, ajfp... ajfpVarArr) {
        this.g = 0L;
        this.a = j;
        this.i = j2;
        this.c = new WeakReference(ajbsVar);
        this.k = ampgVar;
        this.j = new HashMap();
        this.b = new ArrayList();
        this.d = z;
        this.e = ajfpVar;
        for (ajfp ajfpVar2 : ajfpVarArr) {
            this.b.add(ajfpVar2);
            this.j.put(ajfpVar2.e, ajfpVar2);
            ajfpVar2.c = this;
            this.j.put(ajfpVar2.e, ajfpVar2);
            if (ajfpVar != null) {
                this.f += ajfpVar2.b;
            }
        }
        this.f -= j2 - j;
        this.m = this.b.isEmpty() ? null : (ajfp) this.b.get(0);
        this.l = new TreeMap();
        this.h = str;
    }

    private static Pair D(ajfq ajfqVar, long j) {
        TreeMap treeMap = ajfqVar.l;
        Long valueOf = Long.valueOf(j);
        Map.Entry floorEntry = treeMap.floorEntry(valueOf);
        if (floorEntry == null) {
            ajfp ajfpVar = ajfqVar.m;
            if (ajfpVar == null) {
                return null;
            }
            return new Pair(valueOf, ajfpVar);
        }
        ajfq ajfqVar2 = (ajfq) floorEntry.getValue();
        long longValue = ((Long) floorEntry.getKey()).longValue();
        long j2 = j - longValue;
        long j3 = ajfqVar2.i;
        if (longValue != ajfqVar2.g + j3 + ajfqVar2.f || ajfqVar2.e == null) {
            for (ajfp ajfpVar2 : ajfqVar2.b) {
                long j4 = ajfpVar2.b;
                if (j4 > j2) {
                    return new Pair(Long.valueOf(j2), ajfpVar2);
                }
                j2 -= j4;
            }
            if (ajfqVar.m != null) {
                return new Pair(Long.valueOf(j), ajfqVar.m);
            }
            return null;
        }
        return new Pair(Long.valueOf(j3 + j2), ajfqVar2.e);
    }

    private static Pair E(ajfq ajfqVar, String str, long j) {
        ajfp d = ajfqVar.d(str);
        return (str == null || d == null) ? D(ajfqVar, j) : new Pair(Long.valueOf(j), d);
    }

    public static List s(ajfq ajfqVar, String str, long j, long j2) {
        long longValue;
        ajfo a;
        Map.Entry entry;
        ajfo b;
        ajfp ajfpVar;
        ArrayList arrayList = new ArrayList();
        synchronized (ajfqVar) {
            if (ajfqVar.g() && (str == null || ajfqVar.d(str) != null)) {
                ajfp ajfpVar2 = ajfqVar.m;
                if (ajfpVar2 == null || !ajfpVar2.d()) {
                    Pair E = E(ajfqVar, str, j);
                    longValue = E != null ? ((Long) E.first).longValue() : j;
                    ajfpVar2 = E != null ? (ajfp) E.second : null;
                } else {
                    if (str != null && ajfqVar.d(str) != null) {
                        ajfpVar2 = ajfqVar.d(str);
                    }
                    longValue = j;
                }
                HashSet hashSet = new HashSet();
                long j3 = longValue;
                long j4 = j2;
                while (j4 > 0 && ajfpVar2 != null) {
                    if (ajfpVar2.d() || ajfpVar2.a.isEmpty()) {
                        entry = null;
                    } else {
                        entry = ajfpVar2.a.ceilingEntry(Long.valueOf(j3));
                        if (entry != null && hashSet.contains(entry.getValue())) {
                            entry = ajfpVar2.a.ceilingEntry(Long.valueOf(1 + j3));
                        }
                    }
                    if (entry != null) {
                        b = ((Long) entry.getKey()).longValue() - j3 > 0 ? ajfpVar2.b(j3, ((Long) entry.getKey()).longValue()) : null;
                        ajfpVar = ((ajfq) entry.getValue()).m;
                        j3 = 0;
                    } else {
                        ajfo a2 = ajfpVar2.b - j3 > 0 ? ajfpVar2.a(j3) : null;
                        ajfq ajfqVar2 = ajfpVar2.c;
                        if (ajfqVar2 == null) {
                            j4 = 0;
                        } else {
                            if (ajfqVar2.z(ajfpVar2.e)) {
                                long j5 = j4;
                                if (ajfqVar2.i == ajfqVar2.a) {
                                    hashSet.add(ajfqVar2);
                                }
                                ajfpVar = ajfqVar2.e;
                                if (ajfpVar != null) {
                                    j3 = ajfqVar2.i;
                                    b = a2;
                                    j4 = j5;
                                } else {
                                    ajfpVar = ajfpVar2;
                                    j4 = 0;
                                }
                            } else {
                                j4 = j4;
                                ajfpVar = ajfqVar2.q(ajfpVar2.e);
                                j3 = 0;
                            }
                            b = a2;
                        }
                    }
                    if (b != null) {
                        j4 -= b.b - b.a;
                        arrayList.add(b);
                    }
                    ajfpVar2 = ajfpVar;
                }
                if (arrayList.isEmpty() && ajfpVar2 != null && (a = ajfpVar2.a(ajfpVar2.b)) != null) {
                    arrayList.add(a);
                }
                if (!arrayList.isEmpty()) {
                    ajfqVar.n = ajfqVar.d(((ajfo) arrayList.get(arrayList.size() - 1)).b());
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    public final synchronized boolean A(long j, long j2) {
        List s = s(this, null, j, 1L);
        List s2 = s(this, null, j2, 1L);
        if (!s.isEmpty() && !s2.isEmpty()) {
            if (((ajfo) s.get(0)).equals(s2.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void B(ajfp ajfpVar) {
        if (!this.j.containsKey(ajfpVar.e)) {
            if (ajfpVar.c != this) {
                return;
            }
            if (this.b.isEmpty()) {
                this.m = ajfpVar;
            }
            this.b.add(ajfpVar);
            this.j.put(ajfpVar.e, ajfpVar);
        }
    }

    public final synchronized void C(long j, long j2, String str, ajfp... ajfpVarArr) {
        ajfp ajfpVar = this.m;
        ajbs ajbsVar = (ajbs) this.c.get();
        if (ajfpVar == null || (r2 = ajfpVarArr.length) == 0 || ajbsVar == null) {
            return;
        }
        for (ajfp ajfpVar2 : ajfpVarArr) {
            if (this.j.containsKey(ajfpVar2.e)) {
                return;
            }
        }
        Map.Entry floorEntry = ajfpVar.a.floorEntry(Long.valueOf(j));
        Map.Entry floorEntry2 = ajfpVar.a.floorEntry(Long.valueOf(j2));
        ajfq ajfqVar = null;
        ajfq ajfqVar2 = floorEntry == null ? null : (ajfq) floorEntry.getValue();
        if (floorEntry2 != null) {
            ajfqVar = (ajfq) floorEntry2.getValue();
        }
        if ((ajfqVar2 != null && ajfqVar == ajfqVar2 && ajfqVar2.f(j) && ajfqVar.f(j2)) || ((ajfqVar2 != null && ajfqVar2.f(j)) || ((ajfqVar != null && ajfqVar.f(j2)) || ((ajfqVar2 == null && ajfqVar != null) || (ajfqVar2 != null && ajfqVar2 != ajfqVar))))) {
            return;
        }
        ajfq ajfqVar3 = new ajfq(j, j2, ajbsVar, this.k, this.d, str, ajfpVar, ajfpVarArr);
        ajfqVar3.e = ajfpVar;
        ajfpVar.a.put(Long.valueOf(ajfqVar3.a), ajfqVar3);
        for (ajfp ajfpVar3 : ajfpVarArr) {
            this.j.put(ajfpVar3.e, ajfpVar3);
        }
        if (!this.d) {
            return;
        }
        Map.Entry floorEntry3 = ajfpVar.a.floorEntry(Long.valueOf(j - 1));
        if (floorEntry3 != null) {
            ajfqVar3.g = ((ajfq) floorEntry3.getValue()).g + ((ajfq) floorEntry3.getValue()).f;
        }
        if (ajfqVar3.f != 0) {
            for (ajfq ajfqVar4 : ajfpVar.a.tailMap(Long.valueOf(j)).values()) {
                if (ajfqVar4 != ajfqVar3) {
                    w(ajfqVar4);
                    ajfqVar4.g += ajfqVar3.f;
                    v(ajfqVar4);
                }
            }
        }
        v(ajfqVar3);
    }

    public synchronized long a(String str, long j) {
        ajfp ajfpVar;
        ajfp d = d(str);
        if (d != null) {
            ajfq ajfqVar = d.c;
            if (ajfqVar.d) {
                Map.Entry entry = null;
                if (ajfqVar == null || ajfqVar.e == null) {
                    ajfp ajfpVar2 = this.m;
                    if (ajfpVar2 != null) {
                        long j2 = ajfpVar2.b;
                        if (j2 < j) {
                            j = j2;
                        }
                    }
                    ajfp ajfpVar3 = ajfqVar.m;
                    if (ajfpVar3 != null) {
                        entry = ajfpVar3.a.floorEntry(Long.valueOf(j));
                    }
                    if (entry != null) {
                        if (((ajfq) entry.getValue()).i <= j) {
                            j += ((ajfq) entry.getValue()).f;
                        }
                        j += ((ajfq) entry.getValue()).g;
                    }
                } else {
                    while (ajfqVar != null && ajfqVar.e != null && ajfqVar.d) {
                        Iterator it = ajfqVar.b.iterator();
                        while (it.hasNext() && (ajfpVar = (ajfp) it.next()) != d) {
                            j += ajfpVar.b;
                        }
                        j += ajfqVar.a + ajfqVar.g;
                        ajfp ajfpVar4 = ajfqVar.e;
                        ajfqVar = ajfpVar4 != null ? ajfpVar4.c : null;
                    }
                }
            }
        }
        return j;
    }

    public synchronized long b(long j) {
        Pair D = D(this, j);
        if (D != null) {
            return ((Long) D.first).longValue();
        }
        return j;
    }

    public synchronized ajfp c(final PlayerResponseModel playerResponseModel, final String str, long j, final int i) {
        return new ajfp(this, new zgz() { // from class: ajfn
            @Override // defpackage.zgz
            public final Object a() {
                ajfq ajfqVar = ajfq.this;
                String str2 = str;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                int i2 = i;
                ajbs ajbsVar = (ajbs) ajfqVar.c.get();
                if (ajbsVar != null) {
                    return ajbsVar.i(str2, playerResponseModel2, i2);
                }
                return null;
            }
        }, j, str, playerResponseModel);
    }

    public synchronized ajfp d(String str) {
        if (str != null) {
            return (ajfp) this.j.get(str);
        }
        return null;
    }

    public synchronized List e(String str) {
        ajfq ajfqVar;
        ajfp ajfpVar;
        ajfp ajfpVar2 = (ajfp) this.j.get(str);
        ArrayList arrayList = new ArrayList();
        if (ajfpVar2 == null) {
            return arrayList;
        }
        arrayList.add(str);
        for (ajfq ajfqVar2 : ajfpVar2.a.values()) {
            arrayList.addAll(ajfqVar2.j.keySet());
        }
        for (ajfq ajfqVar3 = ajfpVar2.c; ajfqVar3 != null; ajfqVar3 = ajfqVar3.r()) {
            ajfqVar3.j.keySet().removeAll(arrayList);
        }
        ajfpVar2.c.b.remove(ajfpVar2);
        ajfq ajfqVar4 = ajfpVar2.c;
        if (ajfqVar4.m == ajfpVar2) {
            ajfqVar4.m = (ajfp) arey.r(ajfqVar4.b, null);
        }
        boolean z = false;
        if (ajfpVar2.c.b.isEmpty() && (ajfpVar = (ajfqVar = ajfpVar2.c).e) != null) {
            ajfpVar.a.remove(Long.valueOf(ajfqVar.a));
            z = true;
        }
        ajfp ajfpVar3 = this.m;
        if (this.d && ajfpVar3 != null) {
            ajfq ajfqVar5 = ajfpVar2.c;
            long j = ajfqVar5.f;
            if (z) {
                w(ajfqVar5);
            } else {
                j = ajfpVar2.b;
            }
            if (j != 0) {
                for (ajfq ajfqVar6 : ajfpVar3.a.tailMap(Long.valueOf(this.a)).values()) {
                    w(ajfqVar6);
                    if (ajfqVar6 == ajfpVar2.c) {
                        ajfqVar6.f -= j;
                    } else {
                        ajfqVar6.g -= j;
                    }
                    v(ajfqVar6);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean f(long j) {
        boolean z;
        if (this.a <= j) {
            if (j < this.i) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public synchronized boolean g() {
        return !this.b.isEmpty();
    }

    public synchronized boolean h(String str) {
        boolean z;
        ajfp ajfpVar = this.n;
        if (i() && ajfpVar != null) {
            if (TextUtils.equals(ajfpVar.e, str)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public synchronized boolean i() {
        return this.n != null;
    }

    public synchronized void j() {
        this.d = true;
    }

    public final synchronized long k(long j) {
        ajfp ajfpVar = this.m;
        if (ajfpVar == null || !ajfpVar.d()) {
            return b(j);
        }
        long j2 = this.m.b;
        return j2 < j ? j2 : j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ajbr, java.lang.Object] */
    public final synchronized ajbv l(ajbv ajbvVar, String str) {
        ajfp ajfpVar = this.m;
        if (ajfpVar != null && d(str) != null) {
            ?? a = ajfpVar.d.a();
            if (a == 0) {
                return ajbvVar;
            }
            ajbt ajbtVar = new ajbt(a.c());
            long a2 = a(str, ajbvVar.g());
            ajbtVar.b += a2 - ajbtVar.a;
            ajbtVar.a = a2;
            if (a2 > ajbtVar.d) {
                ajbtVar.d = a2;
            }
            return ajbtVar;
        }
        return ajbvVar;
    }

    public final synchronized ajfp m(PlayerResponseModel playerResponseModel, String str, int i) {
        long j;
        j = Long.MAX_VALUE;
        if (!playerResponseModel.F() && !playerResponseModel.H()) {
            j = TimeUnit.SECONDS.toMillis(playerResponseModel.a());
        }
        return c(playerResponseModel, str, j, i);
    }

    public final ajfp n(long j) {
        ajfq ajfqVar;
        ajfp ajfpVar = this.m;
        if (ajfpVar != null && ajfpVar.d()) {
            Pair D = D(this, j);
            ajfp ajfpVar2 = D != null ? (ajfp) D.second : null;
            if (ajfpVar2 != null && (ajfqVar = ajfpVar2.c) != null && ajfqVar != this && ajfqVar.e != null) {
                return ajfpVar2;
            }
        }
        return null;
    }

    public final synchronized ajfp o() {
        return (ajfp) this.b.get(0);
    }

    public final synchronized ajfp p(String str, long j) {
        Map.Entry ceilingEntry;
        Pair E = E(this, str, j);
        if (E == null || (ceilingEntry = ((ajfp) E.second).a.ceilingEntry(Long.valueOf(j))) == null) {
            return q(str);
        }
        return ((ajfq) ceilingEntry.getValue()).m;
    }

    public final synchronized ajfp q(String str) {
        if (!z(str) && this.j.get(str) != null) {
            List list = this.b;
            return (ajfp) list.get(list.indexOf(this.j.get(str)) + 1);
        }
        return null;
    }

    public final ajfq r() {
        ajfp ajfpVar = this.e;
        if (ajfpVar != null) {
            return ajfpVar.c;
        }
        return null;
    }

    public final synchronized List t(ajfp ajfpVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (ajfp ajfpVar2 : this.b) {
            if (z) {
                arrayList2.add(ajfpVar2.e);
            } else if (ajfpVar2 == ajfpVar) {
                z = true;
            }
        }
        arrayList = new ArrayList();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(e((String) arrayList2.get(i)));
        }
        return arrayList;
    }

    public final synchronized List u() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        this.l.clear();
        for (ajfp ajfpVar : this.b) {
            arrayList.add(ajfpVar.e);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e((String) arrayList.get(i));
        }
        this.m = null;
        this.n = null;
        return arrayList;
    }

    public final void v(ajfq ajfqVar) {
        this.l.put(Long.valueOf(ajfqVar.a + ajfqVar.g), ajfqVar);
        this.l.put(Long.valueOf(ajfqVar.i + ajfqVar.g + ajfqVar.f), ajfqVar);
    }

    public final void w(ajfq ajfqVar) {
        this.l.remove(Long.valueOf(ajfqVar.a + ajfqVar.g));
        this.l.remove(Long.valueOf(ajfqVar.i + ajfqVar.g + ajfqVar.f));
    }

    public final synchronized void x() {
        this.k.apply(null);
    }

    public final synchronized boolean y() {
        boolean z;
        ajfp ajfpVar = this.m;
        if (ajfpVar != null) {
            if (!ajfpVar.a.isEmpty()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean z(String str) {
        boolean z;
        if (g()) {
            if (TextUtils.equals(((ajfp) arey.s(this.b)).e, str)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public ajfq(ajbs ajbsVar, ampg ampgVar) {
        this(0L, 0L, ajbsVar, ampgVar, false, null, null, new ajfp[0]);
    }
}
