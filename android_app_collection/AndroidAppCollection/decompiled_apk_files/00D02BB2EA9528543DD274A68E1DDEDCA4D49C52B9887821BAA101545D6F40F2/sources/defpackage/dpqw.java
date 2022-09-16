package defpackage;
/* compiled from: PG */
/* renamed from: dpqw  reason: default package */
/* loaded from: classes6.dex */
public enum dpqw implements dsrb {
    UNKNOWN_ENTITY_LIST_ROLE(0),
    OWNER_ENTITY_LIST(1),
    COLLABORATOR_ENTITY_LIST(2),
    FOLLOWER_ENTITY_LIST(3),
    READER_ENTITY_LIST(4);
    
    public final int f;

    dpqw(int i) {
        this.f = i;
    }

    public static dpqw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OWNER_ENTITY_LIST;
            }
            if (i == 2) {
                return COLLABORATOR_ENTITY_LIST;
            }
            if (i == 3) {
                return FOLLOWER_ENTITY_LIST;
            }
            if (i == 4) {
                return READER_ENTITY_LIST;
            }
            return null;
        }
        return UNKNOWN_ENTITY_LIST_ROLE;
    }

    public static dsrd c() {
        return dpqv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
