package defpackage;
/* compiled from: PG */
/* renamed from: asxh  reason: default package */
/* loaded from: classes2.dex */
public enum asxh implements aopm {
    MAIN_APP_BROWSE_CACHE_EVENT_UNKNOWN(0),
    MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_CONSIDERED(1),
    MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_PERFORMED(2),
    MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_DECLINED(3);
    
    private static final aopn e = new anfn(3);
    private final int g;

    asxh(int i) {
        this.g = i;
    }

    public static aopo a() {
        return asut.l;
    }

    public static asxh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_CONSIDERED;
            }
            if (i == 2) {
                return MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_PERFORMED;
            }
            if (i == 3) {
                return MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_DECLINED;
            }
            return null;
        }
        return MAIN_APP_BROWSE_CACHE_EVENT_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
