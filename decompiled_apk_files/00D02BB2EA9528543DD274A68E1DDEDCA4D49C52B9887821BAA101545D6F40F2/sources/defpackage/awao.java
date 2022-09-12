package defpackage;
/* compiled from: PG */
/* renamed from: awao  reason: default package */
/* loaded from: classes3.dex */
enum awao {
    DEFAULT(0, 0, 0),
    DO_NOT_SHOW(1, 0, 0),
    DISUSE(2, dpyv.OFFLINE_UNUSED_REGION_EXPIRED.dm, dpyv.OFFLINE_UNUSED_REGION_EXPIRING_SOON.dm),
    TRIP_ENDED(3, dpyv.OFFLINE_TRIP_REGION_EXPIRED.dm, dpyv.OFFLINE_TRIP_REGION_EXPIRING_SOON.dm),
    UNINTENTIONAL(4, dpyv.OFFLINE_MAP_EXPIRED.dm, dpyv.OFFLINE_REGION_EXPIRING_SOON.dm);
    
    public final int f;
    public final int g;
    public final int h;

    awao(int i2, int i3, int i4) {
        this.f = i2;
        this.h = i3;
        this.g = i4;
    }
}
