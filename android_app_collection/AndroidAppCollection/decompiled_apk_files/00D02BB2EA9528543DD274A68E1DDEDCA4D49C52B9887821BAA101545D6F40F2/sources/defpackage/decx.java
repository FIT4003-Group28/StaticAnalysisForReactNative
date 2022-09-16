package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: decx  reason: default package */
/* loaded from: classes6.dex */
public final class decx extends decy {
    final /* synthetic */ TypeVariable a;
    final /* synthetic */ decy b;

    public decx(TypeVariable typeVariable, decy decyVar) {
        this.a = typeVariable;
        this.b = decyVar;
    }

    @Override // defpackage.decy
    public final Type a(TypeVariable<?> typeVariable, decy decyVar) {
        return typeVariable.getGenericDeclaration().equals(this.a.getGenericDeclaration()) ? typeVariable : this.b.a(typeVariable, decyVar);
    }
}
