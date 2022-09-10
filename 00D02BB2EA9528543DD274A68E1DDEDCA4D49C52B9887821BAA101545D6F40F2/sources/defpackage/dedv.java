package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedv  reason: default package */
/* loaded from: classes6.dex */
public final class dedv<D extends GenericDeclaration> {
    private final D a;
    private final String b;
    private final dcdc<Type> c;

    public dedv(D d, String str, Type[] typeArr) {
        dedy.f(typeArr, "bound for type variable");
        dbsk.s(d);
        this.a = d;
        dbsk.s(str);
        this.b = str;
        this.c = dcdc.t(typeArr);
    }

    public final boolean equals(Object obj) {
        if (dedt.a) {
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof dedw)) {
                int i = dedw.b;
                dedv<?> dedvVar = ((dedw) Proxy.getInvocationHandler(obj)).a;
                if (this.b.equals(dedvVar.b) && this.a.equals(dedvVar.a) && dchl.m(this.c, dedvVar.c)) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
