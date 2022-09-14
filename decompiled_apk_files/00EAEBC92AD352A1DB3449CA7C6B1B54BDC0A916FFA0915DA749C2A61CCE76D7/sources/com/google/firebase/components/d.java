package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<? super T>> f8525a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<n> f8526b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8527c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8528d;

    /* renamed from: e  reason: collision with root package name */
    private final g<T> f8529e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f8530f;

    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<? super T>> f8531a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<n> f8532b;

        /* renamed from: c  reason: collision with root package name */
        private int f8533c;

        /* renamed from: d  reason: collision with root package name */
        private int f8534d;

        /* renamed from: e  reason: collision with root package name */
        private g<T> f8535e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f8536f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f8531a = new HashSet();
            this.f8532b = new HashSet();
            this.f8533c = 0;
            this.f8534d = 0;
            this.f8536f = new HashSet();
            u.a(cls, "Null interface");
            this.f8531a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                u.a(cls2, "Null interface");
            }
            Collections.addAll(this.f8531a, clsArr);
        }

        private b<T> a(int i) {
            u.b(this.f8533c == 0, "Instantiation type has already been set.");
            this.f8533c = i;
            return this;
        }

        private void a(Class<?> cls) {
            u.a(!this.f8531a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> d() {
            this.f8534d = 1;
            return this;
        }

        public b<T> a() {
            a(1);
            return this;
        }

        public b<T> a(g<T> gVar) {
            u.a(gVar, "Null factory");
            this.f8535e = gVar;
            return this;
        }

        public b<T> a(n nVar) {
            u.a(nVar, "Null dependency");
            a(nVar.a());
            this.f8532b.add(nVar);
            return this;
        }

        public d<T> b() {
            u.b(this.f8535e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f8531a), new HashSet(this.f8532b), this.f8533c, this.f8534d, this.f8535e, this.f8536f);
        }

        public b<T> c() {
            a(2);
            return this;
        }
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.f8525a = Collections.unmodifiableSet(set);
        this.f8526b = Collections.unmodifiableSet(set2);
        this.f8527c = i;
        this.f8528d = i2;
        this.f8529e = gVar;
        this.f8530f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> a(T t, Class<T> cls) {
        b b2 = b(cls);
        b2.a(c.a(t));
        return b2.b();
    }

    @SafeVarargs
    public static <T> d<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        b a2 = a(cls, clsArr);
        a2.a(com.google.firebase.components.b.a(t));
        return a2.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Object obj, e eVar) {
        return obj;
    }

    public static <T> b<T> b(Class<T> cls) {
        b<T> a2 = a(cls);
        a2.d();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object b(Object obj, e eVar) {
        return obj;
    }

    public Set<n> a() {
        return this.f8526b;
    }

    public g<T> b() {
        return this.f8529e;
    }

    public Set<Class<? super T>> c() {
        return this.f8525a;
    }

    public Set<Class<?>> d() {
        return this.f8530f;
    }

    public boolean e() {
        return this.f8527c == 1;
    }

    public boolean f() {
        return this.f8527c == 2;
    }

    public boolean g() {
        return this.f8528d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f8525a.toArray()) + ">{" + this.f8527c + ", type=" + this.f8528d + ", deps=" + Arrays.toString(this.f8526b.toArray()) + "}";
    }
}
