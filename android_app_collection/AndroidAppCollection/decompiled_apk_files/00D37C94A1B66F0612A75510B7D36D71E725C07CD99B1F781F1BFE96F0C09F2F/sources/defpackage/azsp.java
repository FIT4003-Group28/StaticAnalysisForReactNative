package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: azsp  reason: default package */
/* loaded from: classes2.dex */
public final class azsp implements azte, azso {
    private static final Map a;
    private static final HashMap b;
    private static final HashMap c;
    private static final HashMap d;
    private final Class e;

    static {
        Map map;
        List f = azqn.f(new Class[]{azrr.class, azsc.class, azsg.class, azsh.class, azsi.class, azsj.class, azsk.class, azsl.class, azsm.class, azsn.class, azrs.class, azrt.class, azru.class, azrv.class, azrw.class, azrx.class, azry.class, azrz.class, azsa.class, azsb.class, azsd.class, azse.class, azsf.class});
        ArrayList<azqf> arrayList = new ArrayList(azqn.d(f));
        int i = 0;
        for (Object obj : f) {
            int i2 = i + 1;
            if (i < 0) {
                azqn.b();
            }
            arrayList.add(azqj.o((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = azqq.a;
        } else if (size == 1) {
            azqf azqfVar = (azqf) arrayList.get(0);
            azqfVar.getClass();
            map = Collections.singletonMap(azqfVar.a, azqfVar.b);
            map.getClass();
        } else {
            map = new LinkedHashMap(aydb.c(arrayList.size()));
            for (azqf azqfVar2 : arrayList) {
                map.put(azqfVar2.a, azqfVar2.b);
            }
        }
        a = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        c = hashMap2;
        HashMap hashMap3 = new HashMap();
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
        values.getClass();
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            str.getClass();
            sb.append(ayme.k(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            azqf o = azqj.o(sb2, str + ".Companion");
            hashMap3.put(o.a, o.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aydb.c(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), ayme.k((String) entry2.getValue()));
        }
    }

    public azsp(Class cls) {
        this.e = cls;
    }

    @Override // defpackage.azso
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azsp) && azst.c(azrp.a(this), azrp.a((azte) obj));
    }

    public final int hashCode() {
        return azrp.a(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
