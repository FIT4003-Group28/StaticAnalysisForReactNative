package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
/* compiled from: PG */
/* renamed from: dedh  reason: default package */
/* loaded from: classes6.dex */
enum dedh implements dbsl<dedj<?>> {
    IGNORE_TYPE_VARIABLE_OR_WILDCARD,
    INTERFACE_ONLY;

    @Override // defpackage.dbsl
    public final /* synthetic */ boolean a(dedj<?> dedjVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            Type type = dedjVar.a;
            return !(type instanceof TypeVariable) && !(type instanceof WildcardType);
        } else if (ordinal != 1) {
            throw null;
        } else {
            return dedjVar.c().isInterface();
        }
    }
}
