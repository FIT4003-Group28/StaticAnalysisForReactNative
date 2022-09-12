package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dxiu  reason: default package */
/* loaded from: classes.dex */
public final class dxiu<T> implements dxis<T> {
    private final Map<String, dzsj<dxir<?>>> a;

    public dxiu(Map<Class<?>, dzsj<dxir<?>>> map, Map<String, dzsj<dxir<?>>> map2) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(dxjb.b(((dcmn) map).e + map2.size()));
            linkedHashMap.putAll(map2);
            for (Map.Entry entry : ((dcdn) map).entrySet()) {
                linkedHashMap.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(linkedHashMap);
        }
        this.a = map2;
    }

    @Override // defpackage.dxis
    public final void a(T t) {
        dzsj<dxir<?>> dzsjVar = this.a.get(t.getClass().getName());
        if (dzsjVar == null) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (this.a.containsKey(cls.getCanonicalName())) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t.getClass().getCanonicalName(), arrayList));
        }
        dxir<?> a = dzsjVar.a();
        try {
            dxis<?> a2 = a.a(t);
            dxjg.d(a2, "%s.create(I) should not return null.", a.getClass());
            a2.a(t);
        } catch (ClassCastException e) {
            throw new dxit(String.format("%s does not implement AndroidInjector.Factory<%s>", a.getClass().getCanonicalName(), t.getClass().getCanonicalName()), e);
        }
    }
}
