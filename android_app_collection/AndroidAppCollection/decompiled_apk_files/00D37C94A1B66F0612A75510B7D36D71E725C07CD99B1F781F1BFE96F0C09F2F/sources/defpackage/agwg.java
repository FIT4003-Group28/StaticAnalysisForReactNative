package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agwg  reason: default package */
/* loaded from: classes.dex */
public final class agwg {
    public final azqb a;
    private final azqb b;

    public agwg(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    private static final agwf d(List list, List list2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            agqo agqoVar = (agqo) it.next();
            if (list.contains(agqoVar.f())) {
                hashSet.add(agqoVar.f());
            } else {
                arrayList2.add(agqoVar);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return new agwf(hashSet, arrayList, arrayList2);
    }

    public final long a(String str, String str2, String str3) {
        agqv p = ((aglj) this.a.get()).p(str);
        if (p != null && !p.e) {
            Set t = ((aglj) this.a.get()).t(str);
            if (!t.isEmpty() && (t.size() != 1 || str2 == null || !t.contains(str2))) {
                return 0L;
            }
            zgh.m(str);
            Set g = ((aglj) this.a.get()).l.g(str);
            if (!g.isEmpty() && (g.size() != 1 || str3 == null || !g.contains(str3))) {
                return 0L;
            }
            return p.e();
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.List r4) {
        /*
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            azqb r2 = r3.a
            java.lang.Object r2 = r2.get()
            aglj r2 = (defpackage.aglj) r2
            agqv r0 = r2.p(r0)
            if (r0 == 0) goto L29
            agqe r0 = r0.l
            boolean r0 = r0.b()
            if (r0 != 0) goto L4
            goto L29
        L28:
            r1 = 1
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agwg.b(java.util.List):boolean");
    }

    public final agwb c(String str, String str2, List list, List list2, atsu atsuVar, byte[] bArr, boolean z, long j, attl attlVar, int i) {
        byte[] bArr2;
        Iterator it;
        int i2;
        PlayerResponseModel l;
        agwf agwfVar;
        aqxo.p((str != null) ^ (str2 != null));
        String str3 = true != amps.e(str) ? str : str2;
        str3.getClass();
        HashSet<String> hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        atsu atsuVar2 = atsu.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        int ordinal = atsuVar.ordinal();
        long j2 = 0;
        if (ordinal == 2 || ordinal == 3) {
            agwf d = d(list, list2);
            ahdl ahdlVar = (ahdl) this.b.get();
            int a = ahdp.a(attlVar, -1);
            if (a != -1) {
                long j3 = j;
                long j4 = 0;
                for (String str4 : d.b) {
                    long a2 = a(str4, str, str2);
                    j3 += a2;
                    j4 -= a2;
                    hashSet.add(str4);
                }
                if (j3 < 0) {
                    HashMap hashMap = new HashMap();
                    for (String str5 : d.a) {
                        hashMap.put(str5, Long.valueOf(a(str5, str, str2)));
                    }
                    ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
                    Collections.sort(arrayList3, utr.o);
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Map.Entry entry = (Map.Entry) arrayList3.get(i3);
                        if (j3 >= 0) {
                            break;
                        }
                        j3 += ((Long) entry.getValue()).longValue();
                        j4 -= ((Long) entry.getValue()).longValue();
                        hashSet.add((String) entry.getKey());
                    }
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = list2.iterator();
                long j5 = j3;
                long j6 = j4;
                while (it2.hasNext()) {
                    agqo agqoVar = (agqo) it2.next();
                    String f = agqoVar.f();
                    if (d.a.contains(f)) {
                        arrayList.add(agqoVar.f());
                    } else if (!hashSet2.contains(f)) {
                        if (true != z) {
                            bArr2 = bArr;
                            it = it2;
                            i2 = 2;
                        } else {
                            bArr2 = bArr;
                            it = it2;
                            i2 = 3;
                        }
                        try {
                            l = ahdlVar.l(f, i2, bArr2);
                        } catch (aart unused) {
                        }
                        if (ahdl.i(l) && ahdl.h(l)) {
                            agwfVar = d;
                            VideoStreamingData videoStreamingData = l.c;
                            boolean e = ahdl.e(a);
                            FormatStreamModel k = ahdlVar.k(a, Integer.MAX_VALUE, i, videoStreamingData, true, l.c());
                            FormatStreamModel k2 = e ? null : ahdlVar.k(a, Integer.MAX_VALUE, i, videoStreamingData, false, l.c());
                            if (k != null && (e || k2 != null)) {
                                long j7 = k.j() + (k2 == null ? 0L : k2.j());
                                if (j5 >= j7) {
                                    j5 -= j7;
                                    j6 += j7;
                                    linkedHashSet.add(agqoVar);
                                    arrayList.add(f);
                                    hashSet2.add(f);
                                }
                            }
                            it2 = it;
                            d = agwfVar;
                        }
                        agwfVar = d;
                        it2 = it;
                        d = agwfVar;
                    } else {
                        arrayList.add(agqoVar.f());
                    }
                    it = it2;
                    agwfVar = d;
                    it2 = it;
                    d = agwfVar;
                }
                for (String str6 : hashSet) {
                    if (arrayList.contains(str6)) {
                        arrayList.removeAll(Collections.singleton(str6));
                    }
                }
                j2 = j6;
            }
        } else {
            agwf d2 = d(list, list2);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((agqo) it3.next()).f());
            }
            hashSet.addAll(d2.b);
            linkedHashSet.addAll(d2.c);
        }
        if (atsuVar == atsu.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE) {
            if (!b(arrayList)) {
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    agqv p = ((aglj) this.a.get()).p((String) it4.next());
                    if (p != null && p.l == agqe.COMPLETE) {
                        it4.remove();
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                String str7 = (String) it5.next();
                if (!hashSet.contains(str7)) {
                    if (linkedHashMap.containsKey(str7)) {
                        linkedHashMap.put(str7, Integer.valueOf(((Integer) linkedHashMap.get(str7)).intValue() + 1));
                    } else {
                        linkedHashMap.put(str7, 1);
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str8 = (String) arrayList.get(i4);
                if (linkedHashMap2.containsKey(str8)) {
                    linkedHashMap2.put(str8, Integer.valueOf(((Integer) linkedHashMap2.get(str8)).intValue() + 1));
                } else {
                    linkedHashMap2.put(str8, 1);
                }
            }
            for (String str9 : linkedHashMap2.keySet()) {
                linkedHashMap.put(str9, Integer.valueOf(Math.max(linkedHashMap.containsKey(str9) ? ((Integer) linkedHashMap.get(str9)).intValue() : 0, ((Integer) linkedHashMap2.get(str9)).intValue())));
            }
            for (String str10 : linkedHashMap.keySet()) {
                for (int i5 = 0; i5 < ((Integer) linkedHashMap.get(str10)).intValue(); i5++) {
                    arrayList2.add(str10);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return new agwb(str3, hashSet, linkedHashSet, arrayList, null, j2);
        }
        return new agwb(str3, hashSet, linkedHashSet, arrayList, arrayList2, j2);
    }
}
