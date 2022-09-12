package defpackage;
/* compiled from: PG */
/* renamed from: ardz  reason: default package */
/* loaded from: classes.dex */
public enum ardz {
    MAP,
    DIRECTIONS_TWO_WHEELER,
    DIRECTIONS_DRIVE,
    DIRECTIONS_WALK,
    DIRECTIONS_BICYCLE,
    DIRECTIONS_TAXI,
    NAVIGATION(true),
    NAVIGATION_CUSTOM_3D_CHEVRON(true),
    SAFETY_OFF_ROUTE_DRIVE(true),
    NONE,
    INCOGNITO(true);
    
    public final boolean l;

    ardz() {
        this(false);
    }

    ardz(boolean z) {
        this.l = z;
    }
}
