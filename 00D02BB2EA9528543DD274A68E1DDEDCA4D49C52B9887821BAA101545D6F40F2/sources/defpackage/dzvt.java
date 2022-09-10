package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dzvt  reason: default package */
/* loaded from: classes6.dex */
public final class dzvt implements dzwn, dzvs {
    private static final Map<Class, Integer> b;
    private static final HashMap<String, String> c;
    private static final HashMap<String, String> d;
    private static final HashMap<String, String> e;
    public final Class<?> a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Map map;
        List a = dztd.a(new Class[]{dzut.class, dzve.class, dzvi.class, dzvj.class, dzvk.class, dzvl.class, dzvm.class, dzvn.class, dzvo.class, dzvp.class, dzuu.class, dzuv.class, dzuw.class, dzux.class, dzuy.class, dzuz.class, dzva.class, dzvb.class, dzvc.class, dzvd.class, dzvf.class, dzvg.class, dzvh.class});
        ArrayList<dzsx> arrayList = new ArrayList(dzti.d(a, 10));
        int i = 0;
        for (Object obj : a) {
            int i2 = i + 1;
            if (i < 0) {
                dzti.c();
            }
            arrayList.add(dzsz.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = dztv.a;
        } else if (size == 1) {
            dzsx dzsxVar = (dzsx) arrayList.get(0);
            dzvx.c(dzsxVar, "pair");
            map = Collections.singletonMap(dzsxVar.a, dzsxVar.b);
            dzvx.b(map, "java.util.Collections.si…(pair.first, pair.second)");
        } else {
            map = new LinkedHashMap(dztz.a(arrayList.size()));
            for (dzsx dzsxVar2 : arrayList) {
                map.put(dzsxVar2.a, dzsxVar2.b);
            }
        }
        b = map;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        dzvx.b(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            dzvx.b(str, "kotlinName");
            sb.append(dzxg.d(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            dzsx a2 = dzsz.a(sb2, str + ".Companion");
            hashMap3.put(a2.a, a2.b);
        }
        for (Map.Entry<Class, Integer> entry : b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(dztz.a(hashMap3.size()));
        Iterator it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), dzxg.d((String) entry2.getValue()));
        }
    }

    public dzvt(Class<?> cls) {
        this.a = cls;
    }

    @Override // defpackage.dzvs
    public final Class<?> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dzvt) && dzvx.d(dzur.a(this), dzur.a((dzwn) obj));
    }

    public final int hashCode() {
        return dzur.a(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
