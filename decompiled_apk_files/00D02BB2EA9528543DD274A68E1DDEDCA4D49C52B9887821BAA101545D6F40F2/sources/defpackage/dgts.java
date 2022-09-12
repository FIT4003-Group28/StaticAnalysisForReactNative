package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgts  reason: default package */
/* loaded from: classes6.dex */
public final class dgts implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public dgts(Type type) {
        this.a = dgtv.b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && dgtv.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dgtv.e(this.a) + "[]";
    }
}
