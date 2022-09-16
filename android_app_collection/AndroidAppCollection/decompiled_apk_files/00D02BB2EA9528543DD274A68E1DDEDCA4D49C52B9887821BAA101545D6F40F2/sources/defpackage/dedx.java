package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedx  reason: default package */
/* loaded from: classes6.dex */
public final class dedx implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final dcdc<Type> a;
    private final dcdc<Type> b;

    public dedx(Type[] typeArr, Type[] typeArr2) {
        dedy.f(typeArr, "lower bound for wildcard");
        dedy.f(typeArr2, "upper bound for wildcard");
        this.a = deds.e.c(typeArr);
        this.b = deds.e.c(typeArr2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (dchl.m(this.a, Arrays.asList(wildcardType.getLowerBounds())) && dchl.m(this.b, Arrays.asList(wildcardType.getUpperBounds()))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        return dedy.e(this.a);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return dedy.e(this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("?");
        dcdc<Type> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            sb.append(" super ");
            sb.append(deds.e.d(dcdcVar.get(i)));
        }
        for (Type type : dcft.i(this.b, dbst.a(dbst.c(Object.class)))) {
            sb.append(" extends ");
            sb.append(deds.e.d(type));
        }
        return sb.toString();
    }
}
