package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: decy  reason: default package */
/* loaded from: classes6.dex */
public class decy {
    public final dcdn<decz, Type> c;

    public decy() {
        this.c = dcmn.a;
    }

    public decy(dcdn<decz, Type> dcdnVar) {
        this.c = dcdnVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
    public Type a(TypeVariable<?> typeVariable, decy decyVar) {
        Type type = this.c.get(new decz(typeVariable));
        if (type == null) {
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] b = new deda(decyVar).b(bounds);
            return (!dedt.a || !Arrays.equals(bounds, b)) ? dedy.c(typeVariable.getGenericDeclaration(), typeVariable.getName(), b) : typeVariable;
        }
        return new deda(decyVar).a(type);
    }
}
