package defpackage;

import java.lang.reflect.ParameterizedType;
/* compiled from: PG */
/* renamed from: dedo  reason: default package */
/* loaded from: classes6.dex */
enum dedo {
    OWNED_BY_ENCLOSING_CLASS,
    LOCAL_CLASS_HAS_NO_OWNER;
    
    static final dedo c;

    static {
        dedo[] values;
        ParameterizedType parameterizedType = (ParameterizedType) new dedm<String>() { // from class: dedn
        }.getClass().getGenericSuperclass();
        for (dedo dedoVar : values()) {
            if (dedoVar.a(dedm.class) == parameterizedType.getOwnerType()) {
                c = dedoVar;
                return;
            }
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> a(Class<?> cls) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw null;
            }
            if (!cls.isLocalClass()) {
                return cls.getEnclosingClass();
            }
            return null;
        }
        return cls.getEnclosingClass();
    }
}
