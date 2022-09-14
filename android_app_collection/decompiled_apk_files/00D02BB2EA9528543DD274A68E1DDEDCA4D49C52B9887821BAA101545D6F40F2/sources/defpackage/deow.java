package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: deow  reason: default package */
/* loaded from: classes.dex */
public final class deow<T> {
    public final Set<Class<? super T>> a;
    public final Set<depi> b;
    public final int c;
    public final depa<T> d;
    public final Set<Class<?>> e;
    private final int f;

    public deow(Set<Class<? super T>> set, Set<depi> set2, int i, int i2, depa<T> depaVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.f = i2;
        this.d = depaVar;
        this.e = Collections.unmodifiableSet(set3);
    }

    public static <T> deov<T> builder(Class<T> cls) {
        return new deov<>(cls, new Class[0]);
    }

    public static <T> deow<T> intoSet(final T t, Class<T> cls) {
        deov intoSetBuilder = intoSetBuilder(cls);
        intoSetBuilder.c(new depa(t) { // from class: deou
            private final Object a;

            {
                this.a = t;
            }

            @Override // defpackage.depa
            public final Object a(deox deoxVar) {
                return this.a;
            }
        });
        return intoSetBuilder.a();
    }

    public static <T> deov<T> intoSetBuilder(Class<T> cls) {
        deov<T> builder = builder(cls);
        builder.a = 1;
        return builder;
    }

    @Deprecated
    public static <T> deow<T> of(Class<T> cls, final T t) {
        deov builder = builder(cls);
        builder.c(new depa(t) { // from class: deos
            private final Object a;

            {
                this.a = t;
            }

            @Override // defpackage.depa
            public final Object a(deox deoxVar) {
                return this.a;
            }
        });
        return builder.a();
    }

    public final boolean a() {
        return this.f == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }

    @SafeVarargs
    public static <T> deov<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new deov<>(cls, clsArr);
    }

    @SafeVarargs
    public static <T> deow<T> of(final T t, Class<T> cls, Class<? super T>... clsArr) {
        deov builder = builder(cls, clsArr);
        builder.c(new depa(t) { // from class: deot
            private final Object a;

            {
                this.a = t;
            }

            @Override // defpackage.depa
            public final Object a(deox deoxVar) {
                return this.a;
            }
        });
        return builder.a();
    }
}
