package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
class m {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f8549a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f8550b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f8551c = new HashSet();

        b(d<?> dVar) {
            this.f8549a = dVar;
        }

        d<?> a() {
            return this.f8549a;
        }

        void a(b bVar) {
            this.f8550b.add(bVar);
        }

        Set<b> b() {
            return this.f8550b;
        }

        void b(b bVar) {
            this.f8551c.add(bVar);
        }

        void c(b bVar) {
            this.f8551c.remove(bVar);
        }

        boolean c() {
            return this.f8550b.isEmpty();
        }

        boolean d() {
            return this.f8551c.isEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f8552a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8553b;

        private c(Class<?> cls, boolean z) {
            this.f8552a = cls;
            this.f8553b = z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f8552a.equals(this.f8552a) && cVar.f8553b == this.f8553b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f8552a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8553b).hashCode();
        }
    }

    private static Set<b> a(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<d<?>> list) {
        Set<b> b2 = b(list);
        Set<b> a2 = a(b2);
        int i = 0;
        while (!a2.isEmpty()) {
            b next = a2.iterator().next();
            a2.remove(next);
            i++;
            for (b bVar : next.b()) {
                bVar.c(next);
                if (bVar.d()) {
                    a2.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : b2) {
            if (!bVar2.d() && !bVar2.c()) {
                arrayList.add(bVar2.a());
            }
        }
        throw new o(arrayList);
    }

    private static Set<b> b(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d<?> dVar : list) {
            b bVar = new b(dVar);
            for (Class<? super Object> cls : dVar.c()) {
                c cVar = new c(cls, !dVar.g());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f8553b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (n nVar : bVar2.a().a()) {
                    if (nVar.b() && (set = (Set) hashMap.get(new c(nVar.a(), nVar.d()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
