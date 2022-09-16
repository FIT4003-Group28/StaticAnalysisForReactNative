package defpackage;
/* compiled from: PG */
/* renamed from: dqew  reason: default package */
/* loaded from: classes6.dex */
public enum dqew implements dsrb {
    UNKNOWN_LIST_ITEM_TYPE(0),
    PLACE(1),
    EXPERIENCE(2);
    
    public final int d;

    dqew(int i) {
        this.d = i;
    }

    public static dqew b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PLACE;
            }
            if (i == 2) {
                return EXPERIENCE;
            }
            return null;
        }
        return UNKNOWN_LIST_ITEM_TYPE;
    }

    public static dsrd c() {
        return dqev.a;
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
