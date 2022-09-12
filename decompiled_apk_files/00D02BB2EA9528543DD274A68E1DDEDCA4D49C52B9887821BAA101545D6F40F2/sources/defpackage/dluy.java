package defpackage;
/* compiled from: PG */
/* renamed from: dluy  reason: default package */
/* loaded from: classes.dex */
public enum dluy implements dsrb {
    UNKNOWN_RESOURCE_TYPE(0),
    PAINT(1),
    ROUTING(2),
    SEARCH(4),
    VOICE_BIASING(5);
    
    public final int f;

    dluy(int i) {
        this.f = i;
    }

    public static dluy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PAINT;
            }
            if (i == 2) {
                return ROUTING;
            }
            if (i == 4) {
                return SEARCH;
            }
            if (i == 5) {
                return VOICE_BIASING;
            }
            return null;
        }
        return UNKNOWN_RESOURCE_TYPE;
    }

    public static dsrd c() {
        return dlux.a;
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
