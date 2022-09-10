package defpackage;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jrr  reason: default package */
/* loaded from: classes7.dex */
public final class jrr {
    final dhmz a;
    final jry b;
    final Map<String, dhnd> c;

    public jrr(dhmz dhmzVar, Collection<dhnd> collection) {
        jry jryVar;
        this.a = dhmzVar;
        EnumMap enumMap = new EnumMap(jry.class);
        Iterator<dhnd> it = collection.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            dhnd next = it.next();
            dcdc<jry> dcdcVar = jrt.a;
            while (true) {
                if (i < next.g.size()) {
                    jryVar = jry.f(next.g.get(i).a);
                    if (jryVar != jry.a) {
                        break;
                    }
                    i++;
                } else {
                    jryVar = jry.a;
                    break;
                }
            }
            if (!enumMap.containsKey(jryVar)) {
                enumMap.put((EnumMap) jryVar, (jry) new HashMap());
            }
            ((Map) enumMap.get(jryVar)).put(next.c, next);
        }
        dcdc<jry> dcdcVar2 = jrt.a;
        jry jryVar2 = jry.a;
        dcdc<jry> dcdcVar3 = jrt.a;
        int size = dcdcVar3.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            jry jryVar3 = dcdcVar3.get(i2);
            int size2 = enumMap.containsKey(jryVar3) ? ((Map) enumMap.get(jryVar3)).size() : 0;
            int i4 = size2 > i3 ? size2 : i3;
            if (size2 > i3) {
                jryVar2 = jryVar3;
            }
            i2++;
            i3 = i4;
        }
        this.b = jryVar2;
        this.c = enumMap.containsKey(jryVar2) ? dcdn.r((Map) enumMap.get(jryVar2)) : dcmn.a;
    }
}
