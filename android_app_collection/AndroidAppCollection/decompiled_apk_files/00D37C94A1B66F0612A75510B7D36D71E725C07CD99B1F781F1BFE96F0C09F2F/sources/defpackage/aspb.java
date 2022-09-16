package defpackage;
/* compiled from: PG */
/* renamed from: aspb  reason: default package */
/* loaded from: classes2.dex */
public enum aspb implements aopm {
    LIKE(0),
    DISLIKE(1),
    INDIFFERENT(2);
    
    public static final aopn d = new anfn(2);
    public final int e;

    aspb(int i) {
        this.e = i;
    }

    public static aopo a() {
        return asnz.f;
    }

    public static aspb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DISLIKE;
            }
            if (i == 2) {
                return INDIFFERENT;
            }
            return null;
        }
        return LIKE;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
