package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class JavaAudioDeviceModule {
    public final Context a;
    public final AudioManager b;
    public final WebRtcAudioRecord c;
    public final WebRtcAudioTrack d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Object h = new Object();
    public long i;

    public JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z) {
        this.a = context;
        this.b = audioManager;
        this.c = webRtcAudioRecord;
        this.d = webRtcAudioTrack;
        this.e = i;
        this.f = i2;
        this.g = z;
    }

    public static bapn a(Context context) {
        return new bapn(context);
    }

    public static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);
}
