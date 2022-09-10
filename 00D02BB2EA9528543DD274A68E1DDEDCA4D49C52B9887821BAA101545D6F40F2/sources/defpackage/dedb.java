package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedb  reason: default package */
/* loaded from: classes.dex */
public final class dedb extends dedk {
    final /* synthetic */ dcen a;

    public dedb(dcen dcenVar) {
        this.a = dcenVar;
    }

    @Override // defpackage.dedk
    public final void a(Class<?> cls) {
        this.a.b(cls);
    }

    @Override // defpackage.dedk
    public final void b(ParameterizedType parameterizedType) {
        this.a.b((Class) parameterizedType.getRawType());
    }

    @Override // defpackage.dedk
    public final void c(TypeVariable<?> typeVariable) {
        f(typeVariable.getBounds());
    }

    @Override // defpackage.dedk
    public final void d(WildcardType wildcardType) {
        f(wildcardType.getUpperBounds());
    }

    @Override // defpackage.dedk
    public final void e(GenericArrayType genericArrayType) {
        this.a.b(dedy.g(dedj.b(genericArrayType.getGenericComponentType()).c()));
    }
}
