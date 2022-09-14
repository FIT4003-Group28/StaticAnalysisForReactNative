package c.e.a.b.d.g;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class c3 {
    public static <T> z2<T> a(z2<T> z2Var) {
        return ((z2Var instanceof e3) || (z2Var instanceof b3)) ? z2Var : z2Var instanceof Serializable ? new b3(z2Var) : new e3(z2Var);
    }

    public static <T> z2<T> a(T t) {
        return new d3(t);
    }
}
