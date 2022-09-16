package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Timer;
import org.webrtc.Logging;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class WebRtcAudioTrack {
    public long a;
    public final Context b;
    public final AudioManager c;
    public ByteBuffer d;
    public AudioTrack e;
    public volatile boolean f;
    public final acpf g;
    private final baoz h;
    private final AudioAttributes i;
    private bapu j;
    private final bapp k;
    private int l;

    WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null);
    }

    private int GetPlayoutUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack = this.e;
            if (audioTrack == null) {
                return -1;
            }
            return audioTrack.getUnderrunCount();
        }
        return -2;
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    public static final void b(int i) {
        StringBuilder sb = new StringBuilder(38);
        sb.append("doAudioTrackStateCallback: ");
        sb.append(i);
        Logging.a("WebRtcAudioTrackExternal", sb.toString());
    }

    private final void c() {
        Logging.a("WebRtcAudioTrackExternal", "releaseAudioResources");
        AudioTrack audioTrack = this.e;
        if (audioTrack != null) {
            audioTrack.release();
            this.e = null;
        }
    }

    private final void d(String str) {
        String valueOf = String.valueOf(str);
        Logging.b("WebRtcAudioTrackExternal", valueOf.length() != 0 ? "Init playout error: ".concat(valueOf) : new String("Init playout error: "));
        bapv.f("WebRtcAudioTrackExternal", this.b, this.c);
        acpf acpfVar = this.g;
        if (acpfVar != null) {
            String valueOf2 = String.valueOf(str);
            zep.c("PeerConnectionClient", valueOf2.length() != 0 ? "onWebRtcAudioTrackInitError: ".concat(valueOf2) : new String("onWebRtcAudioTrackInitError: "));
            acqj acqjVar = acpfVar.a.z;
            if (acqjVar == null) {
                return;
            }
            acqjVar.a();
        }
    }

    private final void e(int i, String str) {
        String g = bapv.g(i);
        StringBuilder sb = new StringBuilder(g.length() + 23 + String.valueOf(str).length());
        sb.append("Start playout error: ");
        sb.append(g);
        sb.append(". ");
        sb.append(str);
        Logging.b("WebRtcAudioTrackExternal", sb.toString());
        bapv.f("WebRtcAudioTrackExternal", this.b, this.c);
        acpf acpfVar = this.g;
        if (acpfVar != null) {
            String g2 = bapv.g(i);
            StringBuilder sb2 = new StringBuilder(g2.length() + 58 + String.valueOf(str).length());
            sb2.append("onWebRtcAudioTrackStartError: errorCode= ");
            sb2.append(g2);
            sb2.append(" , errorMessage= ");
            sb2.append(str);
            zep.c("PeerConnectionClient", sb2.toString());
            acqj acqjVar = acpfVar.a.z;
            if (acqjVar == null) {
                return;
            }
            acqjVar.a();
        }
    }

    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.e.getBufferSizeInFrames();
        }
        return -1;
    }

    private int getInitialBufferSizeInFrames() {
        return this.l;
    }

    private int getStreamMaxVolume() {
        this.h.a();
        Logging.a("WebRtcAudioTrackExternal", "getStreamMaxVolume");
        return this.c.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.h.a();
        Logging.a("WebRtcAudioTrackExternal", "getStreamVolume");
        return this.c.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, double d) {
        this.h.a();
        StringBuilder sb = new StringBuilder(100);
        sb.append("initPlayout(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(", bufferSizeFactor=");
        sb.append(d);
        sb.append(")");
        Logging.a("WebRtcAudioTrackExternal", sb.toString());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 + i2) * (i / 100));
        this.d = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.a("WebRtcAudioTrackExternal", sb2.toString());
        byte[] bArr = new byte[this.d.capacity()];
        nativeCacheDirectBufferAddress(this.a, this.d);
        int i3 = i2 == 1 ? 4 : 12;
        double minBufferSize = AudioTrack.getMinBufferSize(i, i3, 2);
        Double.isNaN(minBufferSize);
        int i4 = (int) (minBufferSize * d);
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("minBufferSizeInBytes: ");
        sb3.append(i4);
        Logging.a("WebRtcAudioTrackExternal", sb3.toString());
        if (i4 < this.d.capacity()) {
            d("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        } else if (this.e == null) {
            try {
                AudioAttributes audioAttributes = this.i;
                Logging.a("WebRtcAudioTrackExternal", "createAudioTrackOnLollipopOrHigher");
                int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
                StringBuilder sb4 = new StringBuilder(35);
                sb4.append("nativeOutputSampleRate: ");
                sb4.append(nativeOutputSampleRate);
                Logging.a("WebRtcAudioTrackExternal", sb4.toString());
                if (i != nativeOutputSampleRate) {
                    Logging.d("WebRtcAudioTrackExternal", "Unable to use fast mode since requested sample rate is not native");
                }
                AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
                if (audioAttributes != null) {
                    if (audioAttributes.getUsage() != 0) {
                        contentType.setUsage(audioAttributes.getUsage());
                    }
                    if (audioAttributes.getContentType() != 0) {
                        contentType.setContentType(audioAttributes.getContentType());
                    }
                    contentType.setFlags(audioAttributes.getFlags());
                    if (Build.VERSION.SDK_INT >= 29) {
                        contentType = contentType.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
                    }
                }
                AudioTrack audioTrack = new AudioTrack(contentType.build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i3).build(), i4, 1, 0);
                this.e = audioTrack;
                if (audioTrack.getState() != 1) {
                    d("Initialization of audio track failed.");
                    c();
                    return -1;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    this.l = this.e.getBufferSizeInFrames();
                } else {
                    this.l = -1;
                }
                int audioSessionId = this.e.getAudioSessionId();
                int channelCount = this.e.getChannelCount();
                int sampleRate = this.e.getSampleRate();
                float maxVolume = AudioTrack.getMaxVolume();
                StringBuilder sb5 = new StringBuilder(111);
                sb5.append("AudioTrack: session ID: ");
                sb5.append(audioSessionId);
                sb5.append(", channels: ");
                sb5.append(channelCount);
                sb5.append(", sample rate: ");
                sb5.append(sampleRate);
                sb5.append(", max gain: ");
                sb5.append(maxVolume);
                Logging.a("WebRtcAudioTrackExternal", sb5.toString());
                if (Build.VERSION.SDK_INT >= 23) {
                    int bufferSizeInFrames = this.e.getBufferSizeInFrames();
                    StringBuilder sb6 = new StringBuilder(46);
                    sb6.append("AudioTrack: buffer size in frames: ");
                    sb6.append(bufferSizeInFrames);
                    Logging.a("WebRtcAudioTrackExternal", sb6.toString());
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    int bufferCapacityInFrames = this.e.getBufferCapacityInFrames();
                    StringBuilder sb7 = new StringBuilder(50);
                    sb7.append("AudioTrack: buffer capacity in frames: ");
                    sb7.append(bufferCapacityInFrames);
                    Logging.a("WebRtcAudioTrackExternal", sb7.toString());
                }
                return i4;
            } catch (IllegalArgumentException e) {
                d(e.getMessage());
                c();
                return -1;
            }
        } else {
            d("Conflict with existing AudioTrack.");
            return -1;
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    public static native void nativeGetPlayoutData(long j, int i);

    private boolean setStreamVolume(int i) {
        this.h.a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("setStreamVolume(");
        sb.append(i);
        sb.append(")");
        Logging.a("WebRtcAudioTrackExternal", sb.toString());
        if (this.c.isVolumeFixed()) {
            Logging.b("WebRtcAudioTrackExternal", "The device implements a fixed volume policy.");
            return false;
        }
        this.c.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.h.a();
        bapp bappVar = this.k;
        String valueOf = String.valueOf(bapv.d());
        Logging.a("VolumeLogger", valueOf.length() != 0 ? "start".concat(valueOf) : new String("start"));
        if (bappVar.b == null) {
            String e = bapv.e(bappVar.a.getMode());
            Logging.a("VolumeLogger", e.length() != 0 ? "audio mode is: ".concat(e) : new String("audio mode is: "));
            bappVar.b = new Timer("WebRtcVolumeLevelLoggerThread");
            bappVar.b.schedule(new bapo(bappVar, bappVar.a.getStreamMaxVolume(2), bappVar.a.getStreamMaxVolume(0)), 0L, 30000L);
        }
        Logging.a("WebRtcAudioTrackExternal", "startPlayout");
        a(this.e != null);
        a(this.j == null);
        try {
            this.e.play();
            if (this.e.getPlayState() != 3) {
                int playState = this.e.getPlayState();
                StringBuilder sb = new StringBuilder(53);
                sb.append("AudioTrack.play failed - incorrect state :");
                sb.append(playState);
                e(2, sb.toString());
                c();
                return false;
            }
            bapu bapuVar = new bapu(this);
            this.j = bapuVar;
            bapuVar.start();
            return true;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            e(1, valueOf2.length() != 0 ? "AudioTrack.play failed: ".concat(valueOf2) : new String("AudioTrack.play failed: "));
            c();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.h.a();
        bapp bappVar = this.k;
        String valueOf = String.valueOf(bapv.d());
        Logging.a("VolumeLogger", valueOf.length() != 0 ? "stop".concat(valueOf) : new String("stop"));
        Timer timer = bappVar.b;
        if (timer != null) {
            timer.cancel();
            bappVar.b = null;
        }
        Logging.a("WebRtcAudioTrackExternal", "stopPlayout");
        a(this.j != null);
        if (Build.VERSION.SDK_INT >= 24) {
            int underrunCount = this.e.getUnderrunCount();
            StringBuilder sb = new StringBuilder(27);
            sb.append("underrun count: ");
            sb.append(underrunCount);
            Logging.a("WebRtcAudioTrackExternal", sb.toString());
        }
        bapu bapuVar = this.j;
        Logging.a("WebRtcAudioTrackExternal", "stopThread");
        bapuVar.a = false;
        Logging.a("WebRtcAudioTrackExternal", "Stopping the AudioTrackThread...");
        this.j.interrupt();
        if (!bapa.f(this.j)) {
            Logging.b("WebRtcAudioTrackExternal", "Join of AudioTrackThread timed out.");
            bapv.f("WebRtcAudioTrackExternal", this.b, this.c);
        }
        Logging.a("WebRtcAudioTrackExternal", "AudioTrackThread has now been stopped.");
        this.j = null;
        if (this.e != null) {
            Logging.a("WebRtcAudioTrackExternal", "Calling AudioTrack.stop...");
            try {
                this.e.stop();
                Logging.a("WebRtcAudioTrackExternal", "AudioTrack.stop is done.");
                b(1);
            } catch (IllegalStateException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Logging.b("WebRtcAudioTrackExternal", valueOf2.length() != 0 ? "AudioTrack.stop failed: ".concat(valueOf2) : new String("AudioTrack.stop failed: "));
            }
        }
        c();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.a = j;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, acpf acpfVar) {
        baoz baozVar = new baoz();
        this.h = baozVar;
        baozVar.b();
        this.b = context;
        this.c = audioManager;
        this.i = audioAttributes;
        this.g = acpfVar;
        this.k = new bapp(audioManager);
        String valueOf = String.valueOf(bapv.d());
        Logging.a("WebRtcAudioTrackExternal", valueOf.length() != 0 ? "ctor".concat(valueOf) : new String("ctor"));
    }
}
