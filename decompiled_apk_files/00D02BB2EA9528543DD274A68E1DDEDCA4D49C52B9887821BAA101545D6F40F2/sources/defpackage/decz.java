package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: decz  reason: default package */
/* loaded from: classes6.dex */
final class decz {
    private final TypeVariable<?> a;

    public decz(TypeVariable<?> typeVariable) {
        dbsk.s(typeVariable);
        this.a = typeVariable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static decz a(Type type) {
        if (type instanceof TypeVariable) {
            return new decz((TypeVariable) type);
        }
        return null;
    }

    private final boolean c(TypeVariable<?> typeVariable) {
        return this.a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.a.getName().equals(typeVariable.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Type type) {
        if (type instanceof TypeVariable) {
            return c((TypeVariable) type);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof decz) {
            return c(((decz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getGenericDeclaration(), this.a.getName()});
    }

    public final String toString() {
        return this.a.toString();
    }
}
