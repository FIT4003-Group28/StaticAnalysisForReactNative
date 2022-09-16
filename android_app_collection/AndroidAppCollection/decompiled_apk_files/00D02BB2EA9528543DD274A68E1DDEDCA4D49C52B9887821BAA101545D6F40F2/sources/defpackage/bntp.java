package defpackage;
/* compiled from: PG */
/* renamed from: bntp  reason: default package */
/* loaded from: classes.dex */
public enum bntp implements bnrz {
    POLYLINE_DEACTIVATED(180001),
    POLYLINE_DEACTIVATED_WITH_STAMPS(180001),
    POLYLINE_DIMMED(180002),
    POLYLINE(180010),
    POLYLINE_OVERLAY,
    POLYLINE_MEASLES,
    STEP_ARROW_OVERLAY(180012),
    DISTANCE_TOOL_POLYLINE,
    DISTANCE_TOOL_MEASLE;
    
    public static final int j = bntj.b + bntj.values().length;
    public final int k;

    bntp() {
        this(180010);
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.POLYLINE_PASS;
    }

    @Override // defpackage.bnrz
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.bnrz
    public final int c() {
        return j + ordinal();
    }

    bntp(int i) {
        this.k = i;
    }
}
