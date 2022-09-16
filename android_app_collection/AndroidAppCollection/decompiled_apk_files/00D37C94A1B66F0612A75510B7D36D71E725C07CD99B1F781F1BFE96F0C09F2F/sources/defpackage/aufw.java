package defpackage;
/* compiled from: PG */
/* renamed from: aufw  reason: default package */
/* loaded from: classes2.dex */
public enum aufw implements aopm {
    POST_IMPRESSION_EVENT_TYPE_UNKNOWN(0),
    POST_IMPRESSION_EVENT_TYPE_ENTER(1),
    POST_IMPRESSION_EVENT_TYPE_LEAVE(2);
    
    public final int d;

    aufw(int i) {
        this.d = i;
    }

    public static aopo a() {
        return auca.h;
    }

    public static aufw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return POST_IMPRESSION_EVENT_TYPE_ENTER;
            }
            if (i == 2) {
                return POST_IMPRESSION_EVENT_TYPE_LEAVE;
            }
            return null;
        }
        return POST_IMPRESSION_EVENT_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
