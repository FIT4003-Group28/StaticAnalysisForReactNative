package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SwipeSwigJNI {
    public static final native byte[] Swipe_dragEnded(long j, Swipe swipe, byte[] bArr, byte[] bArr2);

    public static final native byte[] Swipe_dragMoved(long j, Swipe swipe, double d, double d2, byte[] bArr);

    public static final native void Swipe_dragStarted(long j, Swipe swipe, double d, double d2, boolean z, byte[] bArr, byte[] bArr2);

    public static final native byte[] Swipe_dragThrow(long j, Swipe swipe, double d, byte[] bArr);
}
