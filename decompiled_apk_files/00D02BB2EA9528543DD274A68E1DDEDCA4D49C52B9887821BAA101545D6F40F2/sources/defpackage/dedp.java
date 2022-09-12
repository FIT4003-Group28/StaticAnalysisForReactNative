package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedp  reason: default package */
/* loaded from: classes6.dex */
public final class dedp implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public dedp(Type type) {
        this.a = deds.e.b(type);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return dbsd.a(this.a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(dedy.d(this.a)).concat("[]");
    }
}
