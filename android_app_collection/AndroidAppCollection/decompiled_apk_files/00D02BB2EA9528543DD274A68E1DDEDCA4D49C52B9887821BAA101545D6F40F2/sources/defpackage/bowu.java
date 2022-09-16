package defpackage;
/* compiled from: PG */
/* renamed from: bowu  reason: default package */
/* loaded from: classes3.dex */
public enum bowu {
    EDIT_THE_MAP(true, true),
    ROAD_CLOSURE(true, false),
    WRONG_ROAD_INFO(true, false),
    WRONG_PLACE_INFO(false, true);
    
    public final boolean e;
    public final boolean f;

    bowu(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }
}
