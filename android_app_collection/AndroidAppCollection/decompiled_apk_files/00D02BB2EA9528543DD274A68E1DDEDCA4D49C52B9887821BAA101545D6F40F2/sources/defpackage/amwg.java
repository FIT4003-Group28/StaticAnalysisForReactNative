package defpackage;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amwg  reason: default package */
/* loaded from: classes2.dex */
public final class amwg implements Comparable<amwg> {
    protected static final int a = (int) TimeUnit.DAYS.toSeconds(31);
    public final alyh b;
    @dzsi
    public String c;
    private int d;
    private final Map<dwyu, LinkedList<Long>> e;
    private final cqat f;

    public amwg(alyh alyhVar, Map<dwyu, LinkedList<Long>> map, @dzsi String str, int i, cqat cqatVar) {
        this.b = alyhVar;
        this.e = map;
        this.c = str;
        this.f = cqatVar;
        this.d = i;
    }

    public static amwg h(dwyr dwyrVar, cqat cqatVar) {
        dwyp dwypVar = dwyrVar.b;
        if (dwypVar == null) {
            dwypVar = dwyp.e;
        }
        alyh alyhVar = new alyh(dwypVar.d, dwypVar.b, dwypVar.c);
        EnumMap enumMap = new EnumMap(dwyu.class);
        int size = dwyrVar.c.size();
        for (int i = 0; i < size; i++) {
            dwyv dwyvVar = dwyrVar.c.get(i);
            dwyu b = dwyu.b(dwyvVar.b);
            if (b == null) {
                b = dwyu.MY_LOCATION;
            }
            int size2 = dwyvVar.c.size();
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(Long.valueOf(dwyvVar.c.c(i2)));
            }
            enumMap.put((EnumMap) b, (dwyu) linkedList);
        }
        return new amwg(alyhVar, enumMap, dwyrVar.d, dwyrVar.e, cqatVar);
    }

    public final synchronized boolean a() {
        return this.e.isEmpty();
    }

    @dzsi
    final synchronized LinkedList<Long> b(dwyu dwyuVar) {
        return this.e.get(dwyuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(dwyu dwyuVar) {
        LinkedList<Long> b = b(dwyuVar);
        if (b == null) {
            b = new LinkedList<>();
            this.e.put(dwyuVar, b);
        } else if (b.size() >= 100) {
            b.removeLast();
        }
        b.addFirst(Long.valueOf(this.f.b()));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(amwg amwgVar) {
        return Integer.compare(amwgVar.f(), f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        Iterator<Map.Entry<dwyu, LinkedList<Long>>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            LinkedList<Long> value = it.next().getValue();
            Iterator<Long> it2 = value.iterator();
            while (it2.hasNext()) {
                if (this.f.b() - it2.next().longValue() > TimeUnit.SECONDS.toMillis(this.d)) {
                    it2.remove();
                }
            }
            if (value.isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f() {
        long b = this.f.b();
        int i = 0;
        for (Map.Entry<dwyu, LinkedList<Long>> entry : this.e.entrySet()) {
            Iterator<Long> it = entry.getValue().iterator();
            while (it.hasNext()) {
                double days = 31 - ((int) TimeUnit.MILLISECONDS.toDays(b - it.next().longValue()));
                Double.isNaN(days);
                int i2 = (int) ((days / 31.0d) * 10.0d);
                i += (entry.getKey() != amwh.a || i2 < 9) ? i2 * i2 : i2 * 1000;
            }
        }
        return i;
    }

    public final synchronized dwyr g() {
        dwyq bZ;
        bZ = dwyr.f.bZ();
        alyh alyhVar = this.b;
        dwyo bZ2 = dwyp.e.bZ();
        int i = alyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwyp dwypVar = (dwyp) bZ2.b;
        int i2 = dwypVar.a | 1;
        dwypVar.a = i2;
        dwypVar.b = i;
        int i3 = alyhVar.c;
        int i4 = i2 | 2;
        dwypVar.a = i4;
        dwypVar.c = i3;
        int i5 = alyhVar.a;
        dwypVar.a = i4 | 4;
        dwypVar.d = i5;
        dwyp bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyr dwyrVar = (dwyr) bZ.b;
        bK.getClass();
        dwyrVar.b = bK;
        dwyrVar.a |= 1;
        for (Map.Entry<dwyu, LinkedList<Long>> entry : this.e.entrySet()) {
            dwys bZ3 = dwyv.d.bZ();
            dwyu key = entry.getKey();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwyv dwyvVar = (dwyv) bZ3.b;
            dwyvVar.b = key.f;
            dwyvVar.a |= 1;
            ListIterator<Long> listIterator = entry.getValue().listIterator(0);
            while (listIterator.hasNext()) {
                long longValue = listIterator.next().longValue();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dwyv dwyvVar2 = (dwyv) bZ3.b;
                dsri dsriVar = dwyvVar2.c;
                if (!dsriVar.a()) {
                    dwyvVar2.c = dsqw.ci(dsriVar);
                }
                dwyvVar2.c.d(longValue);
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwyr dwyrVar2 = (dwyr) bZ.b;
            dwyv bK2 = bZ3.bK();
            bK2.getClass();
            dsrj<dwyv> dsrjVar = dwyrVar2.c;
            if (!dsrjVar.a()) {
                dwyrVar2.c = dsqw.cl(dsrjVar);
            }
            dwyrVar2.c.add(bK2);
        }
        String str = this.c;
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwyr dwyrVar3 = (dwyr) bZ.b;
            str.getClass();
            dwyrVar3.a |= 2;
            dwyrVar3.d = str;
        }
        int i6 = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyr dwyrVar4 = (dwyr) bZ.b;
        dwyrVar4.a |= 4;
        dwyrVar4.e = i6;
        return bZ.bK();
    }

    public final String toString() {
        long b = this.f.b();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<dwyu, LinkedList<Long>> entry : this.e.entrySet()) {
            sb.append("  usage: ");
            int i = entry.getKey().f;
            StringBuilder sb2 = new StringBuilder(11);
            sb2.append(i);
            sb.append(sb2.toString());
            Iterator<Long> it = entry.getValue().iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                sb.append('\n');
                long minutes = TimeUnit.MILLISECONDS.toMinutes(b - longValue);
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("    minutes ago: ");
                sb3.append(minutes);
                sb.append(sb3.toString());
            }
            sb.append('\n');
        }
        sb.append("description: ");
        sb.append(this.c);
        sb.append(", expireTimeInterval (sec): ");
        sb.append(this.d);
        sb.append('\n');
        return sb.toString();
    }
}
