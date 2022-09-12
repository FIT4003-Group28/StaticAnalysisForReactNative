package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dclm  reason: default package */
/* loaded from: classes5.dex */
public final class dclm<B> extends dcbn<Class<? extends B>, B> implements Serializable, Map {
    public final Map<Class<? extends B>, B> a;

    private dclm(Map<Class<? extends B>, B> map) {
        this.a = map;
    }

    public static <B> dclm<B> a(Map<Class<? extends B>, B> map) {
        return new dclm<>(map);
    }

    public static <B, T extends B> T d(Class<T> cls, B b) {
        return (T) deco.a(cls).cast(b);
    }

    private Object writeReplace() {
        return new dcll(this.a);
    }

    @Override // defpackage.dcbn, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbn, java.util.Map, defpackage.dbyy
    /* renamed from: b */
    public final B put(Class<? extends B> cls, B b) {
        return (B) super.put(cls, d(cls, b));
    }

    @Override // defpackage.dcbn
    protected final Map<Class<? extends B>, B> c() {
        return this.a;
    }

    @Override // defpackage.dcbn, java.util.Map
    public final Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new dclk(this);
    }

    @Override // defpackage.dcbn, java.util.Map
    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            d((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
