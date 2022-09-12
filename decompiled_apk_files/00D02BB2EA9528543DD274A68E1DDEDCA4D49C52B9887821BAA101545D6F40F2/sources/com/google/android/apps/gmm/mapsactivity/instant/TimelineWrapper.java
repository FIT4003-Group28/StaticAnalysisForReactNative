package com.google.android.apps.gmm.mapsactivity.instant;

import java.io.Closeable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TimelineWrapper implements Closeable {
    public long a = nativeCreateTimeline();

    static {
        nativeInitClass();
    }

    private static native long nativeCreateTimeline();

    public static native long nativeDestroyItems(long j);

    private static native void nativeDestroyTimeline(long j);

    public static native long nativeExtractItems(long j);

    public static native long nativeGetItemCheckinTimeMicros(long j, int i);

    public static native long nativeGetItemEndMicros(long j, int i);

    public static native int nativeGetItemId(long j, int i);

    public static native boolean nativeGetItemIsConfirmed(long j, int i);

    public static native boolean nativeGetItemIsOngoing(long j, int i);

    public static native long nativeGetItemStartMicros(long j, int i);

    public static native int nativeGetItemsCount(long j);

    private static native boolean nativeInitClass();

    private static native void nativeInsertActivitySegmentUserEdit(long j, int i, long j2, long j3, long j4, boolean z);

    public static native void nativeInsertInferredActivitySegment(long j, int i, long j2, long j3, boolean z);

    public static native void nativeInsertInferredPlaceVisit(long j, int i, long j2, long j3, long j4, long j5, boolean z, long j6);

    private static native void nativeInsertPlaceVisitUserEdit(long j, int i, long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, long j7);

    public final void a(int i, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, long j6) {
        nativeInsertPlaceVisitUserEdit(this.a, i, j, j2, j3, z, j4, j5, z2, z3, j6);
    }

    public final void b(int i, long j, long j2, long j3, boolean z) {
        nativeInsertActivitySegmentUserEdit(this.a, i, j, j2, j3, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            nativeDestroyTimeline(j);
            this.a = 0L;
        }
    }

    protected final void finalize() {
        super.finalize();
        close();
    }
}
