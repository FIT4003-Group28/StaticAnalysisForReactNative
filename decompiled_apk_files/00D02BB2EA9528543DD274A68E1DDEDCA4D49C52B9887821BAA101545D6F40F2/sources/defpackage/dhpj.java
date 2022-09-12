package defpackage;
/* compiled from: PG */
/* renamed from: dhpj  reason: default package */
/* loaded from: classes6.dex */
public enum dhpj implements dsrb {
    UNKNOWN_CONTRIBUTION_SOURCE(0),
    TODO_LIST(2),
    THANKS_PAGE(3);
    
    public final int d;

    dhpj(int i) {
        this.d = i;
    }

    public static dhpj b(int i) {
        if (i != 0) {
            if (i == 2) {
                return TODO_LIST;
            }
            if (i == 3) {
                return THANKS_PAGE;
            }
            return null;
        }
        return UNKNOWN_CONTRIBUTION_SOURCE;
    }

    public static dsrd c() {
        return dhpi.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
