package defpackage;
/* compiled from: PG */
/* renamed from: aqvk  reason: default package */
/* loaded from: classes2.dex */
public enum aqvk implements aopm {
    ENGAGEMENT_PANEL_SURFACE_UNKNOWN(0),
    ENGAGEMENT_PANEL_SURFACE_WATCH(1),
    ENGAGEMENT_PANEL_SURFACE_BROWSE(2),
    ENGAGEMENT_PANEL_SURFACE_SEARCH(3);
    
    private final int f;

    aqvk(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aqvj.a;
    }

    public static aqvk b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENGAGEMENT_PANEL_SURFACE_WATCH;
            }
            if (i == 2) {
                return ENGAGEMENT_PANEL_SURFACE_BROWSE;
            }
            if (i == 3) {
                return ENGAGEMENT_PANEL_SURFACE_SEARCH;
            }
            return null;
        }
        return ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
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
