package defpackage;
/* compiled from: PG */
/* renamed from: dpqn  reason: default package */
/* loaded from: classes6.dex */
public enum dpqn implements dsrb {
    UNKNOWN_ENTITY_LIST_PERMISSION(0),
    PRIVATE_ENTITY_LIST(1),
    READABLE_ENTITY_LIST(2),
    WRITABLE_ENTITY_LIST(3);
    
    public final int e;

    dpqn(int i) {
        this.e = i;
    }

    public static dpqn b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRIVATE_ENTITY_LIST;
            }
            if (i == 2) {
                return READABLE_ENTITY_LIST;
            }
            if (i == 3) {
                return WRITABLE_ENTITY_LIST;
            }
            return null;
        }
        return UNKNOWN_ENTITY_LIST_PERMISSION;
    }

    public static dsrd c() {
        return dpqm.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
