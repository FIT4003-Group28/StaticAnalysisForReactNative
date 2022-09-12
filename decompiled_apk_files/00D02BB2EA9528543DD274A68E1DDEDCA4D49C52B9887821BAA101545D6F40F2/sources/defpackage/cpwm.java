package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* renamed from: cpwm  reason: default package */
/* loaded from: classes5.dex */
public final class cpwm {
    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> b(int i) {
        return new HashSet<>(cpwj.d(i));
    }

    public static <E> HashSet<E> c(Collection<? extends E> collection) {
        return new HashSet<>(collection);
    }

    public static <E> LinkedHashSet<E> d() {
        return new LinkedHashSet<>();
    }
}
