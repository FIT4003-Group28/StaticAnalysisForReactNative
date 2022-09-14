package defpackage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: daty  reason: default package */
/* loaded from: classes5.dex */
public final class daty {
    private static final ConcurrentMap<Class<?>, daty> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, daty> f = new ConcurrentHashMap();
    public final Class<?> a;
    public final boolean b;
    public final IdentityHashMap<String, dauh> c = new IdentityHashMap<>();
    final List<String> d;

    private daty(Class<?> cls, boolean z) {
        Field[] declaredFields;
        List<String> unmodifiableList;
        this.a = cls;
        this.b = z;
        boolean z2 = !z || !cls.isEnum();
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        dbsk.b(z2, sb.toString());
        TreeSet treeSet = new TreeSet(new datx());
        for (Field field : cls.getDeclaredFields()) {
            dauh b = dauh.b(field);
            if (b != null) {
                String str = b.c;
                str = z ? str.toLowerCase(Locale.US).intern() : str;
                dauh dauhVar = this.c.get(str);
                boolean z3 = dauhVar == null;
                Object[] objArr = new Object[4];
                objArr[0] = true != z ? "" : "case-insensitive ";
                objArr[1] = str;
                objArr[2] = field;
                objArr[3] = dauhVar == null ? null : dauhVar.b;
                dbsk.c(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.c.put(str, b);
                treeSet.add(str);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            daty b2 = b(superclass, z);
            treeSet.addAll(b2.d);
            for (Map.Entry<String, dauh> entry : b2.c.entrySet()) {
                String key = entry.getKey();
                if (!this.c.containsKey(key)) {
                    this.c.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.d = unmodifiableList;
    }

    public static daty a(Class<?> cls) {
        return b(cls, false);
    }

    public final dauh c(String str) {
        if (str != null) {
            if (this.b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.c.get(str);
    }

    public static daty b(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, daty> concurrentMap = z ? f : e;
        daty datyVar = concurrentMap.get(cls);
        if (datyVar != null) {
            return datyVar;
        }
        daty datyVar2 = new daty(cls, z);
        daty putIfAbsent = concurrentMap.putIfAbsent(cls, datyVar2);
        return putIfAbsent == null ? datyVar2 : putIfAbsent;
    }
}
