package defpackage;
/* compiled from: PG */
/* renamed from: cdpb  reason: default package */
/* loaded from: classes4.dex */
public enum cdpb implements dsrb {
    UNKNOWN_ACTION_ON_THANKS_PAGE(0),
    NEVER_SHOW(1),
    ALWAYS_SHOW(2),
    OBEY_SERVER_RESPONSE(3);
    
    public final int e;

    cdpb(int i) {
        this.e = i;
    }

    public static cdpb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NEVER_SHOW;
            }
            if (i == 2) {
                return ALWAYS_SHOW;
            }
            if (i == 3) {
                return OBEY_SERVER_RESPONSE;
            }
            return null;
        }
        return UNKNOWN_ACTION_ON_THANKS_PAGE;
    }

    public static dsrd c() {
        return cdpa.a;
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
