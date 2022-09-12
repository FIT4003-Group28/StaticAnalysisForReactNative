package defpackage;
/* compiled from: PG */
/* renamed from: dbss  reason: default package */
/* loaded from: classes5.dex */
public enum dbss implements dbsl<Object> {
    ALWAYS_TRUE,
    ALWAYS_FALSE,
    IS_NULL,
    NOT_NULL;

    @Override // defpackage.dbsl
    public final /* synthetic */ boolean a(Object obj) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw null;
                    }
                    return obj != null;
                } else if (obj == null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
