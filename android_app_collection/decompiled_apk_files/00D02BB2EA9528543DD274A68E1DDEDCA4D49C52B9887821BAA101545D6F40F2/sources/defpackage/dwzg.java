package defpackage;
/* compiled from: PG */
/* renamed from: dwzg  reason: default package */
/* loaded from: classes6.dex */
public enum dwzg implements dsrb {
    SUCCESS(0),
    GAIA_ACCOUNT_DISABLE(1),
    GAIA_ACCOUNT_DELETED(2),
    GAIA_INVALID_COOKIE(3),
    GAIA_SESSION_EXPIRE(4),
    IGNORE(5),
    SCOPE_NOT_PERMITTED(6),
    SERVER_ERROR(7),
    DASHER_ADMIN_DISABLED(8);
    
    private final int j;

    dwzg(int i) {
        this.j = i;
    }

    public static dwzg b(int i) {
        switch (i) {
            case 0:
                return SUCCESS;
            case 1:
                return GAIA_ACCOUNT_DISABLE;
            case 2:
                return GAIA_ACCOUNT_DELETED;
            case 3:
                return GAIA_INVALID_COOKIE;
            case 4:
                return GAIA_SESSION_EXPIRE;
            case 5:
                return IGNORE;
            case 6:
                return SCOPE_NOT_PERMITTED;
            case 7:
                return SERVER_ERROR;
            case 8:
                return DASHER_ADMIN_DISABLED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dwzf.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
