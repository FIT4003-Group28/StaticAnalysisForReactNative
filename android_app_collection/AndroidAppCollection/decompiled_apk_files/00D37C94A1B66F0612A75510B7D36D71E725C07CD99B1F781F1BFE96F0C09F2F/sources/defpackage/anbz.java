package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anbz  reason: default package */
/* loaded from: classes.dex */
public final class anbz extends anca {
    private final Map a;

    public anbz(anbj anbjVar, anbj anbjVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, anbjVar);
        d(linkedHashMap, anbjVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((anas) entry.getKey()).b) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, anbj anbjVar) {
        for (int i = 0; i < anbjVar.b(); i++) {
            anas c = anbjVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.d(anbjVar.e(i)));
            } else {
                map.put(c, c.d(anbjVar.e(i)));
            }
        }
    }

    @Override // defpackage.anca
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.anca
    public final Set b() {
        return this.a.keySet();
    }

    @Override // defpackage.anca
    public final void c(anbq anbqVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            anas anasVar = (anas) entry.getKey();
            Object value = entry.getValue();
            if (anasVar.b) {
                anbqVar.b(anasVar, ((List) value).iterator(), obj);
            } else {
                anbqVar.a(anasVar, value, obj);
            }
        }
    }
}
