package defpackage;
/* compiled from: PG */
/* renamed from: bnto  reason: default package */
/* loaded from: classes.dex */
public enum bnto implements bnrz {
    AREA_HIGHLIGHT,
    MAJOR_EVENT,
    SEARCH_RESULTS;
    
    public static final int d = bntg.b + bntg.values().length;

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.OVERLAY_TILE_PASS;
    }

    @Override // defpackage.bnrz
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.bnrz
    public final int c() {
        return d + ordinal();
    }
}
