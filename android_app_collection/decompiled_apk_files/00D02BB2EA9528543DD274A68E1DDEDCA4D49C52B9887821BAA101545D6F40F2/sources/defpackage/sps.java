package defpackage;
/* compiled from: PG */
/* renamed from: sps  reason: default package */
/* loaded from: classes7.dex */
enum sps {
    TRIP_LOADING(true),
    DIRECTIONS_COMPLETELY_LOADED(false),
    DIRECTIONS_CACHED_LOADED(true),
    DIRECTIONS_ERROR(false),
    DIRECTIONS_LOADING(true),
    DIRECTIONS_LOCATION_DISABLED(false);
    
    public final boolean g;

    sps(boolean z) {
        this.g = z;
    }
}
