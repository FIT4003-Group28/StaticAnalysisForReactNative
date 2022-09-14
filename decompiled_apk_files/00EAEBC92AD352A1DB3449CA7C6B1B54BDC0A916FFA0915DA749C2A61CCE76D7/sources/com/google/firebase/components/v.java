package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v extends com.google.firebase.components.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f8565a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f8566b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f8567c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f8568d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f8569e;

    /* renamed from: f  reason: collision with root package name */
    private final e f8570f;

    /* loaded from: classes.dex */
    private static class a implements c.e.b.l.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f8571a;

        /* renamed from: b  reason: collision with root package name */
        private final c.e.b.l.c f8572b;

        public a(Set<Class<?>> set, c.e.b.l.c cVar) {
            this.f8571a = set;
            this.f8572b = cVar;
        }

        @Override // c.e.b.l.c
        public void a(c.e.b.l.a<?> aVar) {
            if (this.f8571a.contains(aVar.b())) {
                this.f8572b.a(aVar);
                return;
            }
            throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : dVar.a()) {
            if (nVar.b()) {
                boolean d2 = nVar.d();
                Class<?> a2 = nVar.a();
                if (d2) {
                    hashSet3.add(a2);
                } else {
                    hashSet.add(a2);
                }
            } else {
                boolean d3 = nVar.d();
                Class<?> a3 = nVar.a();
                if (d3) {
                    hashSet4.add(a3);
                } else {
                    hashSet2.add(a3);
                }
            }
        }
        if (!dVar.d().isEmpty()) {
            hashSet.add(c.e.b.l.c.class);
        }
        this.f8565a = Collections.unmodifiableSet(hashSet);
        this.f8566b = Collections.unmodifiableSet(hashSet2);
        this.f8567c = Collections.unmodifiableSet(hashSet3);
        this.f8568d = Collections.unmodifiableSet(hashSet4);
        this.f8569e = dVar.d();
        this.f8570f = eVar;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        if (this.f8565a.contains(cls)) {
            T t = (T) this.f8570f.a(cls);
            return !cls.equals(c.e.b.l.c.class) ? t : (T) new a(this.f8569e, (c.e.b.l.c) t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> Set<T> b(Class<T> cls) {
        if (this.f8567c.contains(cls)) {
            return this.f8570f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> c.e.b.n.a<T> c(Class<T> cls) {
        if (this.f8566b.contains(cls)) {
            return this.f8570f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> c.e.b.n.a<Set<T>> d(Class<T> cls) {
        if (this.f8568d.contains(cls)) {
            return this.f8570f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
