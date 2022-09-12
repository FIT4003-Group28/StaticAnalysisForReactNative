package defpackage;
/* compiled from: PG */
/* renamed from: cugt  reason: default package */
/* loaded from: classes5.dex */
public enum cugt {
    DEFAULT_RENDERING_TYPE(0),
    TOMBSTONE(1),
    OVERLAY(2),
    INVALID(3);
    
    public static final cugt[] e;
    public static final cugt[] f;
    public static final cugt[] g;
    public final int h;

    static {
        cugt cugtVar = DEFAULT_RENDERING_TYPE;
        cugt cugtVar2 = TOMBSTONE;
        cugt cugtVar3 = OVERLAY;
        e = new cugt[]{cugtVar, cugtVar2, cugtVar3, INVALID};
        f = new cugt[]{cugtVar, cugtVar3};
        g = new cugt[]{cugtVar, cugtVar2};
    }

    cugt(int i2) {
        this.h = i2;
    }
}
