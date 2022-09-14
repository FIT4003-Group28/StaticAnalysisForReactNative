package defpackage;
/* compiled from: PG */
/* renamed from: bntk  reason: default package */
/* loaded from: classes.dex */
public enum bntk implements bnrz {
    INDOOR_GROUND,
    INDOOR,
    INDOOR_LINES;
    
    public static final int d = bntr.b + bntr.values().length;

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.INDOOR_PASS;
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
