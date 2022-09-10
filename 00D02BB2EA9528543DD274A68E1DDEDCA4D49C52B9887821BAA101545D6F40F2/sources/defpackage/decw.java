package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: decw  reason: default package */
/* loaded from: classes6.dex */
public final class decw extends dedk {
    public final Map<decz, Type> a = dcjz.d();

    @Override // defpackage.dedk
    public final void a(Class<?> cls) {
        f(cls.getGenericSuperclass());
        f(cls.getGenericInterfaces());
    }

    @Override // defpackage.dedk
    public final void b(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        dbsk.l(typeParameters.length == actualTypeArguments.length);
        for (int i = 0; i < typeParameters.length; i++) {
            decz deczVar = new decz(typeParameters[i]);
            Type type = actualTypeArguments[i];
            if (!this.a.containsKey(deczVar)) {
                Type type2 = type;
                while (true) {
                    if (type2 != null) {
                        if (deczVar.b(type2)) {
                            while (type != null) {
                                type = this.a.remove(decz.a(type));
                            }
                        } else {
                            type2 = this.a.get(decz.a(type2));
                        }
                    } else {
                        this.a.put(deczVar, type);
                        break;
                    }
                }
            }
        }
        f(cls);
        f(parameterizedType.getOwnerType());
    }

    @Override // defpackage.dedk
    public final void c(TypeVariable<?> typeVariable) {
        f(typeVariable.getBounds());
    }

    @Override // defpackage.dedk
    public final void d(WildcardType wildcardType) {
        f(wildcardType.getUpperBounds());
    }
}
