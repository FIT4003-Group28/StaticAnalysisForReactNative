package defpackage;
/* compiled from: PG */
/* renamed from: cjpp  reason: default package */
/* loaded from: classes4.dex */
public enum cjpp implements dsrb {
    UNKNOWN_UPDATES_SUB_TAB_TYPE(0),
    FOR_YOU(1),
    MESSAGES(2),
    INBOX(3),
    FOLLOWING(4);
    
    public final int f;

    cjpp(int i) {
        this.f = i;
    }

    public static cjpp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FOR_YOU;
            }
            if (i == 2) {
                return MESSAGES;
            }
            if (i == 3) {
                return INBOX;
            }
            if (i == 4) {
                return FOLLOWING;
            }
            return null;
        }
        return UNKNOWN_UPDATES_SUB_TAB_TYPE;
    }

    public static dsrd c() {
        return cjpo.a;
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
