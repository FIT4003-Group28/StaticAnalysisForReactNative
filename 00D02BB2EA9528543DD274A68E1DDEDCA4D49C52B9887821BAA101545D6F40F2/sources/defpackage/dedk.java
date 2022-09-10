package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedk  reason: default package */
/* loaded from: classes.dex */
public class dedk {
    private final Set<Type> a = dcnm.c();

    public void a(Class<?> cls) {
    }

    public void b(ParameterizedType parameterizedType) {
    }

    public void c(TypeVariable<?> typeVariable) {
        throw null;
    }

    public void d(WildcardType wildcardType) {
        throw null;
    }

    public void e(GenericArrayType genericArrayType) {
    }

    public final void f(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        c((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        d((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        b((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        e((GenericArrayType) type);
                    } else {
                        String valueOf = String.valueOf(type);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                        sb.append("Unknown type: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.a.remove(type);
                    throw th;
                }
            }
        }
    }
}
