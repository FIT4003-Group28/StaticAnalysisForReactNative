package defpackage;
/* compiled from: PG */
/* renamed from: amjz  reason: default package */
/* loaded from: classes2.dex */
enum amjz {
    UNPLACED(false, false, false),
    TRUMPED(false, false, true),
    PLACED_IN_IMPRESSED_AREA(true, true, false),
    PLACED_OUTSIDE_IMPRESSED_AREA(true, false, false);
    
    public final boolean e;
    public final boolean f;
    public final boolean g;

    amjz(boolean z, boolean z2, boolean z3) {
        this.e = z;
        this.f = z2;
        this.g = z3;
    }
}
