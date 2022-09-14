package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l extends a {

    /* renamed from: e  reason: collision with root package name */
    private static final c.e.b.n.a<Set<Object>> f8544e = k.a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<d<?>, s<?>> f8545a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, s<?>> f8546b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, s<Set<?>>> f8547c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final r f8548d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.f8548d = new r(executor);
        ArrayList<d<?>> arrayList = new ArrayList();
        arrayList.add(d.a(this.f8548d, r.class, c.e.b.l.d.class, c.e.b.l.c.class));
        for (h hVar : iterable) {
            arrayList.addAll(hVar.getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d<?> dVar2 : arrayList) {
            this.f8545a.put(dVar2, new s<>(i.a(this, dVar2)));
        }
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void a() {
        for (Map.Entry<d<?>, s<?>> entry : this.f8545a.entrySet()) {
            d<?> key = entry.getKey();
            if (key.g()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.c()) {
                    this.f8546b.put(cls, value);
                }
            }
        }
        c();
    }

    private void b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, s<?>> entry : this.f8545a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.g()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f8547c.put((Class) entry2.getKey(), new s<>(j.a((Set) entry2.getValue())));
        }
    }

    private void c() {
        for (d<?> dVar : this.f8545a.keySet()) {
            for (n nVar : dVar.a()) {
                if (nVar.c() && !this.f8546b.containsKey(nVar.a())) {
                    throw new t(String.format("Unsatisfied dependency for component %s: %s", dVar, nVar.a()));
                }
            }
        }
    }

    public void a(boolean z) {
        for (Map.Entry<d<?>, s<?>> entry : this.f8545a.entrySet()) {
            d<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.e() || (key.f() && z)) {
                value.get();
            }
        }
        this.f8548d.a();
    }

    @Override // com.google.firebase.components.e
    public <T> c.e.b.n.a<T> c(Class<T> cls) {
        u.a(cls, "Null interface requested.");
        return this.f8546b.get(cls);
    }

    @Override // com.google.firebase.components.e
    public <T> c.e.b.n.a<Set<T>> d(Class<T> cls) {
        s<Set<?>> sVar = this.f8547c.get(cls);
        return sVar != null ? sVar : (c.e.b.n.a<Set<T>>) f8544e;
    }
}
