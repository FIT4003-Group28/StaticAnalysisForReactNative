package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aeai  reason: default package */
/* loaded from: classes.dex */
public final class aeai implements adzz {
    public final amqo a;
    public amqo b;
    public final acrr c;
    final Map d;
    public final HashMap e;
    public final afjz f;
    private final azqb g;
    private final afjl h;
    private final Map i;
    private HashMap j;

    public aeai(amqo amqoVar, azqb azqbVar, afjl afjlVar, adzw adzwVar, aeaf aeafVar, acrr acrrVar, afjz afjzVar) {
        adyd adydVar = adyd.d;
        this.a = amqoVar;
        this.g = azqbVar;
        this.b = adydVar;
        this.h = afjlVar;
        this.c = acrrVar;
        this.f = afjzVar;
        this.d = DesugarCollections.synchronizedMap(new aeag());
        this.i = amup.l(0, adzwVar, 3, aeafVar);
        HashMap hashMap = new HashMap();
        if (afjzVar.B()) {
            for (String str : ((pde) amqoVar.get()).g()) {
                i(hashMap, str);
            }
        }
        this.e = hashMap;
        this.j = s(adydVar, afjzVar);
    }

    public static void i(HashMap hashMap, String str) {
        String e = aear.e(str);
        String d = aear.d(str);
        HashMap hashMap2 = (HashMap) hashMap.get(e);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            hashMap.put(e, hashMap2);
        }
        long b = aear.b(str);
        if (!hashMap2.containsKey(d) || ((aeah) hashMap2.get(d)).a < b) {
            new TreeSet();
            hashMap2.put(d, new aeah(b));
        }
    }

    static final long k(aead aeadVar, long j) {
        int binarySearch = Arrays.binarySearch(aeadVar.e(), j);
        if (binarySearch == -1) {
            return -1L;
        }
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        return aeadVar.f()[binarySearch] + ((aeadVar.d()[binarySearch] * (j - aeadVar.e()[binarySearch])) / aeadVar.c()[binarySearch]);
    }

    public static final String l(Set set, String str, String str2) {
        Iterator it = set.iterator();
        long j = Long.MIN_VALUE;
        String str3 = null;
        while (it.hasNext()) {
            for (String str4 : ((pde) it.next()).g()) {
                if (str4 != null && Objects.equals(str, aear.e(str4)) && str2.equals(aear.d(str4))) {
                    long b = aear.b(str4);
                    if (str3 == null || b > j) {
                        str3 = str4;
                        j = b;
                    }
                }
            }
        }
        return str3;
    }

    public static final boolean m(Set set, String str, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((pde) it.next()).m(str, j, j2)) {
                return true;
            }
        }
        return false;
    }

    static final long n(aead aeadVar, long j) {
        int a = aeadVar.a(j);
        return aeadVar.e()[a] + ((aeadVar.c()[a] * (j - aeadVar.f()[a])) / aeadVar.d()[a]);
    }

    private final Set o() {
        List list = (List) this.b.get();
        pde pdeVar = (pde) this.a.get();
        if (list.isEmpty()) {
            if (pdeVar != null) {
                return Collections.singleton(pdeVar);
            }
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        if (pdeVar != null) {
            hashSet.add(pdeVar);
        }
        return hashSet;
    }

    private final boolean p(String str, String str2, long j, int i, int i2, int i3) {
        Set o;
        String l;
        aead h;
        zgh.m(str);
        zgh.m(str2);
        for (int i4 = i2; i4 <= i3; i4++) {
            if (i4 == 1) {
                if (this.g.get() != null && (l = l((o = o()), str, str2)) != null && (h = h(o, l)) != null) {
                    int a = h.a(j);
                    int min = Math.min(h.e().length - 1, a + i);
                    if (min >= a && min < h.e().length) {
                        long n = n(h, j);
                        if (m(o, l, n, h.e()[min] - n)) {
                            return true;
                        }
                    }
                }
            } else {
                adzw adzwVar = (adzw) this.i.get(Integer.valueOf(i4));
                if (adzwVar != null && adzwVar.a(str, str2, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static adzx q(long j, int i) {
        return new adzx(j, i);
    }

    private static final adzx r(long j) {
        return new adzx(j, -1L, -1L, -1L);
    }

    private static HashMap s(amqo amqoVar, afjz afjzVar) {
        HashMap hashMap = new HashMap();
        if (afjzVar.B()) {
            for (pde pdeVar : amvn.p((Collection) amqoVar.get())) {
                for (String str : pdeVar.g()) {
                    i(hashMap, str);
                }
            }
        }
        return hashMap;
    }

    private static final adzx t(Set set, String str, aead aeadVar, long j, boolean z) {
        long j2 = j;
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            for (pdj pdjVar : ((pde) it.next()).f(str)) {
                adzy adzyVar = new adzy(k(aeadVar, pdjVar.b), k(aeadVar, pdjVar.b + pdjVar.c));
                adzy adzyVar2 = new adzy(adzyVar.a, adzyVar.b);
                long j3 = adzyVar.b;
                adzy adzyVar3 = new adzy(j3, j3);
                boolean z2 = true;
                TreeSet treeSet2 = new TreeSet((SortedSet) treeSet.subSet(adzyVar2, true, adzyVar3, true));
                if (!treeSet2.isEmpty() && ((adzy) treeSet2.last()).b > adzyVar.b) {
                    treeSet2.remove(treeSet2.last());
                }
                treeSet.removeAll(treeSet2);
                adzy adzyVar4 = (adzy) treeSet.floor(adzyVar);
                adzy adzyVar5 = (adzy) treeSet.ceiling(adzyVar);
                if (adzyVar4 == null || !adzyVar4.a(adzyVar)) {
                    z2 = false;
                }
                if (!adzyVar.a(adzyVar5) || adzyVar5 == null) {
                    if (!z2) {
                        treeSet.add(adzyVar);
                    } else {
                        adzyVar4.b = Math.max(adzyVar.b, adzyVar4.b);
                    }
                } else if (!z2) {
                    adzyVar.b = Math.max(adzyVar.b, adzyVar5.b);
                    treeSet.add(adzyVar);
                    if (!adzyVar.equals(adzyVar5)) {
                        treeSet.remove(adzyVar5);
                    }
                } else {
                    adzyVar4.b = Math.max(adzyVar.b, adzyVar5.b);
                    if (!adzyVar4.equals(adzyVar5)) {
                        treeSet.remove(adzyVar5);
                    }
                }
            }
        }
        adzy adzyVar6 = new adzy(j2, 2147483647L);
        adzy adzyVar7 = (adzy) treeSet.floor(adzyVar6);
        if (adzyVar7 == null || j2 >= adzyVar7.b) {
            adzyVar7 = (adzy) treeSet.higher(adzyVar6);
            if (!z || adzyVar7 == null) {
                return new adzx(j, n(aeadVar, j), 0L, -1L);
            }
            j2 = adzyVar7.a;
        }
        long j4 = j2;
        int a = aeadVar.a(adzyVar7.b);
        if (a != aeadVar.a.a - 1 || adzyVar7.b != aeadVar.f()[a] + aeadVar.d()[a]) {
            long n = n(aeadVar, j4);
            long j5 = adzyVar7.b;
            return new adzx(j4, n, j5, n(aeadVar, j5));
        }
        return new adzx(j4, n(aeadVar, j4), Long.MAX_VALUE, n(aeadVar, adzyVar7.b));
    }

    @Override // defpackage.adzz
    public final long a(FormatStreamModel formatStreamModel, long j) {
        adzx adzxVar;
        if (formatStreamModel.N()) {
            String str = formatStreamModel.b;
            if (!TextUtils.isEmpty(str)) {
                adzxVar = c(str, formatStreamModel.e, j, false);
            } else {
                adzxVar = q(j, 2);
            }
        } else {
            adzxVar = null;
        }
        if (adzxVar == null || adzxVar.c == -1) {
            String str2 = formatStreamModel.b;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = formatStreamModel.e;
                long j2 = formatStreamModel.j();
                long micros = TimeUnit.MILLISECONDS.toMicros(formatStreamModel.c);
                zgh.m(str2);
                zgh.m(str3);
                if (this.g.get() == null) {
                    adzxVar = r(j);
                } else {
                    aead a = ((aeae) this.g.get()).a(j2, micros);
                    if (a == null) {
                        adzxVar = r(j);
                    } else {
                        Set o = o();
                        String l = l(o, str2, str3);
                        adzxVar = l == null ? r(j) : t(o, l, a, j, false);
                    }
                }
            } else {
                adzxVar = r(j);
            }
        }
        long j3 = adzxVar.c;
        return j3 == Long.MAX_VALUE ? TimeUnit.MILLISECONDS.toMicros(formatStreamModel.c) : j3;
    }

    @Override // defpackage.adzz
    public final adzx b(FormatStreamModel formatStreamModel, long j) {
        amvn p;
        String l;
        aead h;
        String str = formatStreamModel.b;
        if (!TextUtils.isEmpty(str)) {
            zgh.m(formatStreamModel.e);
            if (this.g.get() != null && (l = l((p = amvn.p((Collection) this.b.get())), str, formatStreamModel.e)) != null && (h = h(p, l)) != null) {
                return t(p, l, h, j, false);
            }
            return r(j);
        }
        return r(j);
    }

    @Override // defpackage.adzz
    public final adzx c(String str, String str2, long j, boolean z) {
        zgh.m(str);
        zgh.m(str2);
        if (this.g.get() == null) {
            return q(j, 3);
        }
        Set o = o();
        String l = l(o, str, str2);
        if (l == null) {
            return q(j, 4);
        }
        aead h = h(o, l);
        return h == null ? q(j, 5) : t(o, l, h, j, z);
    }

    @Override // defpackage.adzz
    public final void d(amqo amqoVar) {
        if (this.f.B()) {
            this.j.clear();
            this.j = s(amqoVar, this.f);
        }
        afms.a(amqoVar);
        this.b = amqoVar;
    }

    @Override // defpackage.adzz
    public final boolean e(String str, String str2, long j, int i, int i2, int i3) {
        return p(str, str2, j, i, i2, i3);
    }

    @Override // defpackage.adzz
    public final boolean f(FormatStreamModel formatStreamModel) {
        aead h;
        amvn p = amvn.p((Collection) this.b.get());
        String l = l(p, formatStreamModel.b, formatStreamModel.e);
        if (l == null || (h = h(p, l)) == null) {
            return false;
        }
        int length = h.e().length - 1;
        return m(p, l, 0L, ((int) h.e()[length]) + h.c()[length]);
    }

    @Override // defpackage.adzz
    public final boolean g(String str, int i, String str2, long j, int i2) {
        return p(str, ovm.b(i, str2), j, 1, i2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aead h(java.util.Set r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeai.h(java.util.Set, java.lang.String):aead");
    }

    public final void j() {
        pde pdeVar = (pde) this.a.get();
        if (pdeVar == null) {
            return;
        }
        for (String str : pdeVar.g()) {
            pdo.b(pdeVar, str);
        }
        if (!this.f.B()) {
            return;
        }
        this.e.clear();
    }
}
