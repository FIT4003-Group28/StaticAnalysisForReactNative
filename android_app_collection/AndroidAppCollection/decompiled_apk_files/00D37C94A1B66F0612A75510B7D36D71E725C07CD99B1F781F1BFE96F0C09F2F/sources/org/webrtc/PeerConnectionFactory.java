package org.webrtc;

import android.content.Context;
import org.webrtc.PeerConnection;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class PeerConnectionFactory {
    public long a;
    private volatile bapa b;
    private volatile bapa c;
    private volatile bapa d;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Options {
        boolean getDisableEncryption() {
            return false;
        }

        boolean getDisableNetworkMonitor() {
            return false;
        }

        int getNetworkIgnoreMask() {
            return 0;
        }
    }

    PeerConnectionFactory(long j) {
        b();
        if (j != 0) {
            this.a = j;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    public static String a(String str) {
        return banm.a() ? nativeFindFieldTrialsFullName(str) : "";
    }

    public static void b() {
        if (!banm.a() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    public static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    public static native long nativeCreateAudioTrack(long j, String str, long j2);

    public static native long nativeCreateLocalMediaStream(long j, String str);

    public static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8);

    public static native long nativeCreateVideoSource(long j, boolean z, boolean z2);

    public static native long nativeCreateVideoTrack(long j, String str, long j2);

    public static native void nativeDeleteLoggable();

    private static native String nativeFindFieldTrialsFullName(String str);

    private static native void nativeFreeFactory(long j);

    private static native long nativeGetNativePeerConnectionFactory(long j);

    public static native void nativeInitializeAndroidGlobals();

    public static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    private static native void nativePrintStackTrace(int i);

    private static native void nativePrintStackTracesOfRegisteredThreads();

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j, int i, int i2);

    private static native boolean nativeStartInternalTracingCapture(String str);

    private static native void nativeStopAecDump(long j);

    private static native void nativeStopInternalTracingCapture();

    private void onNetworkThreadReady() {
        this.b = bapa.h();
        Logging.a("PeerConnectionFactory", "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.d = bapa.h();
        Logging.a("PeerConnectionFactory", "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.c = bapa.h();
        Logging.a("PeerConnectionFactory", "onWorkerThreadReady");
    }

    public final void c() {
        if (this.a != 0) {
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory has been disposed.");
    }
}
