package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
/* compiled from: PG */
/* renamed from: deda  reason: default package */
/* loaded from: classes6.dex */
public final class deda {
    public final decy a;

    public deda() {
        this.a = new decy();
    }

    public deda(decy decyVar) {
        this.a = decyVar;
    }

    public final Type a(Type type) {
        dbsk.s(type);
        if (type instanceof TypeVariable) {
            decy decyVar = this.a;
            TypeVariable<?> typeVariable = (TypeVariable) type;
            return decyVar.a(typeVariable, new decx(typeVariable, decyVar));
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            return dedy.b(ownerType == null ? null : a(ownerType), (Class) a(parameterizedType.getRawType()), b(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return dedy.a(a(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new dedx(b(wildcardType.getLowerBounds()), b(wildcardType.getUpperBounds()));
        }
    }

    public final Type[] b(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = a(typeArr[i]);
        }
        return typeArr2;
    }
}
