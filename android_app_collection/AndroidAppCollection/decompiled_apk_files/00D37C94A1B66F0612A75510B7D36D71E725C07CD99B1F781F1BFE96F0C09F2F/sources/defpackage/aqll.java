package defpackage;
/* compiled from: PG */
/* renamed from: aqll  reason: default package */
/* loaded from: classes2.dex */
public enum aqll implements aopm {
    DELAYED_EVENT_TIER_UNSPECIFIED(0),
    DELAYED_EVENT_TIER_DEFAULT(100),
    DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY(200),
    DELAYED_EVENT_TIER_FAST(300),
    DELAYED_EVENT_TIER_IMMEDIATE(400);
    
    public final int f;

    aqll(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aqfh.l;
    }

    public static aqll b(int i) {
        if (i != 0) {
            if (i == 100) {
                return DELAYED_EVENT_TIER_DEFAULT;
            }
            if (i == 200) {
                return DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY;
            }
            if (i == 300) {
                return DELAYED_EVENT_TIER_FAST;
            }
            if (i == 400) {
                return DELAYED_EVENT_TIER_IMMEDIATE;
            }
            return null;
        }
        return DELAYED_EVENT_TIER_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
