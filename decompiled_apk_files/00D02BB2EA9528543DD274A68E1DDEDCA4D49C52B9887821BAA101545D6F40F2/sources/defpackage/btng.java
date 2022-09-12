package defpackage;
/* compiled from: PG */
/* renamed from: btng  reason: default package */
/* loaded from: classes.dex */
public enum btng {
    ALL_OBJECT_POOL("All Object Pool Caches", 0),
    SHAKE_GESTURE_RECOGNIZER_IMPL("Shake Gesture Recognizer Impl Cache", 1),
    GENERIC_DISK_CACHE_HASH_BITS("Generic Disk Cache Hash Bits Cache", 2),
    RESOURCE_MANAGER_IMPL_BITMAP_POOL("Resource Manager Impl Bitmap Pool Cache", 3),
    RESOURCE_MANAGER_IMPL_BITMAP_OPTIONS_POOL("Resource Manager Impl Bitmap Options Pool Cache", 4),
    CALLOUT_LABELS("Callout Labels Cache", 5),
    LINE_LABELS("Line Labels Cache", 6),
    POINTS_LABELS("Point Labels Cache", 7),
    GENERIC_DISK_CACHE("Generic Disk Cache", 8),
    BYTE_ARRAY_POOL("Byte Array Pool Cache", 9),
    OTHER("Other Caches", 10);
    
    public final String l;
    public final int m;

    btng(String str, int i) {
        this.l = str;
        this.m = i;
    }
}
