package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: adzu  reason: default package */
/* loaded from: classes.dex */
public final class adzu implements adzt {
    private final AudioManager a;
    private final Context b;

    public adzu(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = context;
    }

    @Override // defpackage.adzt
    public final atyc a() {
        if ((this.b.getResources().getConfiguration().uiMode & 15) != 3) {
            if (Build.VERSION.SDK_INT < 23) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN;
            }
            amvn p = amvn.p(araa.q(c(), adrz.c));
            if (p.contains(8)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_A2DP;
            }
            if (p.contains(7)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_HFP;
            }
            if (p.contains(22) || p.contains(4)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES;
            }
            if (p.contains(5) || p.contains(6) || p.contains(13)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_LINE_OUT;
            }
            if (p.contains(3)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES;
            }
            if (p.contains(12) || p.contains(11)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_USB_AUDIO;
            }
            if (p.contains(9)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HDMI;
            }
            if (p.contains(23)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_LE;
            }
            if (p.contains(2)) {
                return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_SPEAKER;
            }
            return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN;
        }
        return atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_ANDROID_AUDIO;
    }

    @Override // defpackage.adzt
    public final void b(AudioDeviceCallback audioDeviceCallback) {
        this.a.registerAudioDeviceCallback(audioDeviceCallback, null);
    }

    public final amuk c() {
        amuf f = amuk.f();
        try {
            for (AudioDeviceInfo audioDeviceInfo : this.a.getDevices(2)) {
                f.h(new adzs(audioDeviceInfo));
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            afus.b(2, 6, "AudioManager#getDevices throws ArrayIndexOutOfBoundsException.");
        }
        return f.g();
    }
}
