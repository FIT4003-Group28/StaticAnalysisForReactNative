package com.google.ar.core;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArCoreNativeInterop {
    private ArCoreNativeInterop() {
    }

    public static Frame frameFromNativeHandle(Session session, long j) {
        return new Frame(session, j);
    }

    public static long getNativeHandle(Frame frame) {
        return frame.nativeHandle;
    }

    public static long getSymbolTable(Session session) {
        return session.nativeSymbolTableHandle;
    }

    public static long releaseOwnershipNativeHandle(Frame frame) {
        long j = frame.nativeHandle;
        frame.nativeHandle = 0L;
        return j;
    }

    public static Session sessionFromNativeHandle(long j, long j2) {
        System.loadLibrary("arcore_sdk_jni");
        Session session = new Session(Session.nativeCreateSessionWrapperFromHandle(j, j2));
        Session.loadDynamicSymbolsAfterSessionCreate();
        return session;
    }

    public static <T extends Trackable> T trackableFromNativeHandle(Class<T> cls, Session session, long j) {
        return cls.cast(session.createTrackable(j));
    }

    public static long getNativeHandle(Session session) {
        return session.nativeGetSessionNativeHandle(session.nativeWrapperHandle);
    }

    public static long releaseOwnershipNativeHandle(Session session) {
        long nativeReleaseSessionOwnership = session.nativeReleaseSessionOwnership(session.nativeWrapperHandle);
        long j = session.nativeWrapperHandle;
        if (j != 0) {
            session.nativeDestroySessionWrapper(j);
            session.nativeWrapperHandle = 0L;
        }
        return nativeReleaseSessionOwnership;
    }

    public static long getNativeHandle(TrackableBase trackableBase) {
        return trackableBase.nativeHandle;
    }

    public static long releaseOwnershipNativeHandle(TrackableBase trackableBase) {
        long j = trackableBase.nativeHandle;
        trackableBase.nativeHandle = 0L;
        return j;
    }
}
