package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
/* compiled from: PG */
/* renamed from: dedd  reason: default package */
/* loaded from: classes.dex */
final class dedd extends dedg<dedj<?>> {
    @Override // defpackage.dedg
    public final /* bridge */ /* synthetic */ dedj<?> a(dedj<?> dedjVar) {
        Type type;
        dedj<?> dedjVar2 = dedjVar;
        Type type2 = dedjVar2.a;
        if (type2 instanceof TypeVariable) {
            type = ((TypeVariable) type2).getBounds()[0];
        } else if (!(type2 instanceof WildcardType)) {
            Type genericSuperclass = dedjVar2.c().getGenericSuperclass();
            if (genericSuperclass != null) {
                return dedjVar2.d(genericSuperclass);
            }
            return null;
        } else {
            type = ((WildcardType) type2).getUpperBounds()[0];
        }
        return dedj.f(type);
    }

    @Override // defpackage.dedg
    public final /* bridge */ /* synthetic */ Iterable<? extends dedj<?>> b(dedj<?> dedjVar) {
        dedj<?> dedjVar2 = dedjVar;
        Type type = dedjVar2.a;
        if (type instanceof TypeVariable) {
            return dedj.g(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return dedj.g(((WildcardType) type).getUpperBounds());
        }
        dccx F = dcdc.F();
        for (Type type2 : dedjVar2.c().getGenericInterfaces()) {
            F.g(dedjVar2.d(type2));
        }
        return F.f();
    }

    @Override // defpackage.dedg
    public final /* bridge */ /* synthetic */ Class c(dedj<?> dedjVar) {
        return dedjVar.c();
    }
}
