package defpackage;
/* compiled from: PG */
/* renamed from: chvd  reason: default package */
/* loaded from: classes4.dex */
public enum chvd implements dsrb {
    UNKNOWN(0),
    DISMISS_PLACE(1),
    CHANGE_PLACE(2),
    REMOVE_FROM_TIMELINE(3),
    LEARN_MORE(4);
    
    public final int f;

    chvd(int i) {
        this.f = i;
    }

    public static chvd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DISMISS_PLACE;
            }
            if (i == 2) {
                return CHANGE_PLACE;
            }
            if (i == 3) {
                return REMOVE_FROM_TIMELINE;
            }
            if (i == 4) {
                return LEARN_MORE;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return chvc.a;
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
