package defpackage;
/* compiled from: PG */
/* renamed from: dqaz  reason: default package */
/* loaded from: classes6.dex */
public enum dqaz implements dsrb {
    UNKNOWN_LINK_TYPE(0),
    DETAILS(1),
    DIRECTIONS(2),
    RUNNING_LATE(3),
    TRACK_ORDER(4),
    CONTACT_MERCHANT(5),
    DISMISS(6);
    
    private final int h;

    dqaz(int i2) {
        this.h = i2;
    }

    public static dqaz b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_LINK_TYPE;
            case 1:
                return DETAILS;
            case 2:
                return DIRECTIONS;
            case 3:
                return RUNNING_LATE;
            case 4:
                return TRACK_ORDER;
            case 5:
                return CONTACT_MERCHANT;
            case 6:
                return DISMISS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqay.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
