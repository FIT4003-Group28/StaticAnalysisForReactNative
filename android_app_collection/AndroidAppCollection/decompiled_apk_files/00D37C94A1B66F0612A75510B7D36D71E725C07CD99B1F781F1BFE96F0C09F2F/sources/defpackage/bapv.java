package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: bapv  reason: default package */
/* loaded from: classes2.dex */
public final class bapv {
    public bapv() {
    }

    public bapv(azvm azvmVar) {
        azvmVar.getClass();
    }

    public static String a(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return "PCM_16BIT";
                case 3:
                    return "PCM_8BIT";
                case 4:
                    return "PCM_FLOAT";
                case 5:
                case 6:
                    return "AC3";
                case 7:
                    return "DTS";
                case 8:
                    return "DTS_HD";
                case 9:
                    return "MP3";
                default:
                    StringBuilder sb = new StringBuilder(29);
                    sb.append("Invalid encoding: ");
                    sb.append(i);
                    return sb.toString();
            }
        }
        return "INVALID";
    }

    public static String b(int i) {
        return i != 12 ? i != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
    }

    public static String c(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static String d() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
        sb.append("@[name=");
        sb.append(name);
        sb.append(", id=");
        sb.append(id);
        sb.append("]");
        return sb.toString();
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static void f(String str, Context context, AudioManager audioManager) {
        AudioDeviceInfo[] devices;
        int length;
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 108 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length());
        sb.append("Android SDK: ");
        sb.append(i);
        sb.append(", Release: ");
        sb.append(str2);
        sb.append(", Brand: ");
        sb.append(str3);
        sb.append(", Device: ");
        sb.append(str4);
        sb.append(", Id: ");
        sb.append(str5);
        sb.append(", Hardware: ");
        sb.append(str6);
        sb.append(", Manufacturer: ");
        sb.append(str7);
        sb.append(", Model: ");
        sb.append(str8);
        sb.append(", Product: ");
        sb.append(str9);
        Logging.a(str, sb.toString());
        String e = e(audioManager.getMode());
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sb2 = new StringBuilder(e.length() + 116);
        sb2.append("Audio State: audio mode: ");
        sb2.append(e);
        sb2.append(", has mic: ");
        sb2.append(hasSystemFeature);
        sb2.append(", mic muted: ");
        sb2.append(isMicrophoneMute);
        sb2.append(", music active: ");
        sb2.append(isMusicActive);
        sb2.append(", speakerphone: ");
        sb2.append(isSpeakerphoneOn);
        sb2.append(", BT SCO: ");
        sb2.append(isBluetoothScoOn);
        Logging.a(str, sb2.toString());
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.a(str, "Audio State: ");
        boolean isVolumeFixed = audioManager.isVolumeFixed();
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append("  fixed volume=");
        sb3.append(isVolumeFixed);
        Logging.a(str, sb3.toString());
        if (!isVolumeFixed) {
            for (int i2 = 0; i2 < 6; i2++) {
                int i3 = iArr[i2];
                StringBuilder sb4 = new StringBuilder();
                String str10 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
                StringBuilder sb5 = new StringBuilder(str10.length() + 4);
                sb5.append("  ");
                sb5.append(str10);
                sb5.append(": ");
                sb4.append(sb5.toString());
                sb4.append("volume=");
                sb4.append(audioManager.getStreamVolume(i3));
                sb4.append(", max=");
                sb4.append(audioManager.getStreamMaxVolume(i3));
                if (Build.VERSION.SDK_INT >= 23) {
                    sb4.append(", muted=");
                    sb4.append(audioManager.isStreamMute(i3));
                }
                Logging.a(str, sb4.toString());
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (length = (devices = audioManager.getDevices(3)).length) != 0) {
            Logging.a(str, "Audio Devices: ");
            for (int i4 = 0; i4 < length; i4++) {
                AudioDeviceInfo audioDeviceInfo = devices[i4];
                StringBuilder sb6 = new StringBuilder();
                sb6.append("  ");
                sb6.append(c(audioDeviceInfo.getType()));
                sb6.append(true != audioDeviceInfo.isSource() ? "(out): " : "(in): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb6.append("channels=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb6.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb6.append("encodings=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb6.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb6.append("sample rates=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb6.append(", ");
                }
                sb6.append("id=");
                sb6.append(audioDeviceInfo.getId());
                Logging.a(str, sb6.toString());
            }
        }
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? "AUDIO_TRACK_START_STATE_MISMATCH" : "AUDIO_TRACK_START_EXCEPTION";
    }

    public static /* synthetic */ String h(int i) {
        return i != 1 ? "AUDIO_RECORD_START_STATE_MISMATCH" : "AUDIO_RECORD_START_EXCEPTION";
    }

    public static /* synthetic */ azve i(azvo azvoVar, boolean z, azsc azscVar, int i) {
        boolean z2 = true;
        int i2 = (z ? 1 : 0) & ((i & 1) ^ 1);
        boolean z3 = (i & 2) != 0;
        if (1 != i2) {
            z2 = false;
        }
        return azvoVar.j(z2, z3, azscVar);
    }

    public static void j(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final aygs k() {
        return new aygs();
    }
}
