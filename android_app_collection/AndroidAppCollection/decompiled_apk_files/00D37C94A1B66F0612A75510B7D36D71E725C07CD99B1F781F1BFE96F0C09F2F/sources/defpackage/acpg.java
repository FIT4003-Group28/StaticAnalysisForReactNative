package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.opengl.EGLContext;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.AudioTrack;
import org.webrtc.BuiltinAudioDecoderFactoryFactory;
import org.webrtc.BuiltinAudioEncoderFactoryFactory;
import org.webrtc.ContextUtils;
import org.webrtc.DataChannel;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.Metrics;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;
/* compiled from: PG */
/* renamed from: acpg  reason: default package */
/* loaded from: classes.dex */
public final class acpg implements acov {
    private static final SparseArray B;
    public static final long a;
    private final List C;
    private final boolean D;
    private final acqk E;
    public final Context c;
    public final yqw d;
    public final List e;
    public final boolean f;
    public final int g;
    public final bamm h;
    public final acpk i;
    public Handler j;
    public boolean k;
    public String l;
    public String m;
    public int n;
    public int o;
    public acpn p;
    public acob q;
    public acps r;
    public bami s;
    public baph t;
    public AudioTrack u;
    public VideoTrack v;
    public PeerConnectionFactory w;
    public PeerConnection x;
    public acph y;
    public acqj z;
    public final Runnable b = new acpa(this);
    public final acox A = new Object() { // from class: acox
    };

    static {
        SparseArray sparseArray = new SparseArray();
        B = sparseArray;
        sparseArray.put(0, axgp.NONE);
        sparseArray.put(1, axgp.FRAMERATE);
        sparseArray.put(2, axgp.DYNAMIC);
        a = TimeUnit.SECONDS.toMillis(1L);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [acox] */
    public acpg(Context context, yqw yqwVar, EGLContext eGLContext, List list, List list2, boolean z, boolean z2, int i, float f, int i2, acqk acqkVar, acph acphVar) {
        boolean z3;
        long j;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
        this.d = yqwVar;
        this.C = list;
        this.e = list2;
        this.f = z;
        this.D = z2;
        this.E = acqkVar;
        this.y = acphVar;
        SparseBooleanArray sparseBooleanArray = abwv.a;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        int i3 = 300000;
        boolean z4 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 1 || (type == 0 && abwv.a.get(subtype, false))) {
                i3 = i2;
            }
        }
        this.g = i3;
        eGLContext.getClass();
        this.i = new acpk(context, yqwVar);
        bamq l = ((bamr) bamk.c(eGLContext, bams.c)).l();
        this.h = l;
        banz banzVar = new banz(applicationContext);
        int i4 = i > 0 ? i : 150;
        double d = f > 0.0f ? f : 0.95d;
        String str = (list2 == null || list2.size() <= 0 || list2.get(0) != axgq.H265X) ? "" : "WebRTC-GenericPictureId/Enabled/";
        String format = String.format("WebRTC-BweWindowSizeInPackets/Enabled-%d/", Integer.valueOf(i4));
        String format2 = String.format("WebRTC-BweBackOffFactor/Enabled-%f/", Double.valueOf(d));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 48 + String.valueOf(format2).length() + str.length());
        sb.append(format);
        sb.append(format2);
        sb.append("WebRTC-Audio-MinimizeResamplingOnMobile/Enabled/");
        sb.append(str);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        if (valueOf.length() != 0) {
            "Field trials: ".concat(valueOf);
        }
        banzVar.b = sb2;
        Context context2 = banzVar.a;
        String str2 = banzVar.b;
        ContextUtils.initialize(context2);
        synchronized (banm.a) {
            if (!banm.b) {
                Logging.a("NativeLibrary", "Loading native library: jingle_peerconnection_so");
                banm.b = banl.a();
            } else {
                Logging.a("NativeLibrary", "Native library has already been loaded.");
            }
        }
        PeerConnectionFactory.nativeInitializeAndroidGlobals();
        PeerConnectionFactory.nativeInitializeFieldTrials(str2);
        Logging.a("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        PeerConnectionFactory.nativeDeleteLoggable();
        Metrics.nativeEnable();
        PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
        axic c = InternalMediaCodecVideoEncoderFactory.c();
        c.a = aqxo.j(l);
        c.e = new acoz(this);
        for (axgq axgqVar : axgq.values()) {
            ((amqy) c.c).f(axgqVar);
        }
        for (int i5 = 0; i5 < this.C.size(); i5++) {
            axgp axgpVar = (axgp) B.get(((acnt) this.C.get(i5)).b);
            if (axgpVar != null) {
                String str3 = ((acnt) this.C.get(i5)).a;
                axgq axgqVar2 = ((acnt) this.C.get(i5)).c;
                c.a(InternalMediaCodecVideoEncoderFactory.b(axgqVar2, str3, axgpVar));
                axgqVar2.ordinal();
            }
        }
        InternalMediaCodecVideoEncoderFactory internalMediaCodecVideoEncoderFactory = new InternalMediaCodecVideoEncoderFactory(c.a, c.b, c.e, amul.b(c.c), c.d);
        bany banyVar = new bany();
        banyVar.a = options;
        banyVar.b = internalMediaCodecVideoEncoderFactory;
        if (this.D) {
            banyVar.c = new axio(this.h);
        }
        bapn a2 = JavaAudioDeviceModule.a(this.c);
        a2.d = this.f;
        a2.a = 1;
        a2.e = new AudioAttributes.Builder().setUsage(1).build();
        if (!bapq.b()) {
            Logging.b("JavaAudioDeviceModule", "HW AEC not supported");
            z3 = false;
        } else {
            z3 = true;
        }
        a2.b = z3;
        if (!bapq.c()) {
            Logging.b("JavaAudioDeviceModule", "HW NS not supported");
        } else {
            z4 = true;
        }
        a2.c = z4;
        a2.g = new acpe(this);
        a2.f = new acpf(this);
        a2.h = this.E;
        banyVar.d = a2.a();
        PeerConnectionFactory.b();
        if (banyVar.d == null) {
            banyVar.d = JavaAudioDeviceModule.a(ContextUtils.getApplicationContext()).a();
        }
        Context applicationContext2 = ContextUtils.getApplicationContext();
        PeerConnectionFactory.Options options2 = banyVar.a;
        JavaAudioDeviceModule javaAudioDeviceModule = banyVar.d;
        synchronized (javaAudioDeviceModule.h) {
            j = javaAudioDeviceModule.i;
            if (j == 0) {
                j = JavaAudioDeviceModule.nativeCreateAudioDeviceModule(javaAudioDeviceModule.a, javaAudioDeviceModule.b, javaAudioDeviceModule.c, javaAudioDeviceModule.d, javaAudioDeviceModule.e, javaAudioDeviceModule.f, javaAudioDeviceModule.g, false);
                javaAudioDeviceModule.i = j;
            }
        }
        this.w = PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext2, options2, j, BuiltinAudioEncoderFactoryFactory.nativeCreateBuiltinAudioEncoderFactory(), BuiltinAudioDecoderFactoryFactory.nativeCreateBuiltinAudioDecoderFactory(), banyVar.b, banyVar.c, 0L, 0L, 0L, 0L, 0L);
    }

    public final void a() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (this.D) {
            mediaConstraints.a.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
            mediaConstraints.a.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
            this.x.nativeCreateDataChannel("data_channel", new DataChannel.Init());
        } else {
            mediaConstraints.a.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
        }
        this.x.nativeCreateOffer(new acns(this), mediaConstraints);
    }

    public final void b() {
        this.j.post(new acpa(this, 1));
        acob acobVar = this.q;
        if (acobVar != null) {
            acobVar.b();
            acobVar.c = null;
            this.q = null;
        }
        acps acpsVar = this.r;
        if (acpsVar != null) {
            acpsVar.a();
            acps acpsVar2 = this.r;
            acpsVar2.i = null;
            acpsVar2.a.quit();
            this.r = null;
        }
        PeerConnection peerConnection = this.x;
        if (peerConnection != null) {
            peerConnection.nativeClose();
            for (MediaStream mediaStream : peerConnection.a) {
                peerConnection.nativeRemoveLocalStream(mediaStream.a());
                mediaStream.dispose();
            }
            peerConnection.a.clear();
            for (RtpSender rtpSender : peerConnection.c) {
                rtpSender.a();
            }
            peerConnection.c.clear();
            for (RtpReceiver rtpReceiver : peerConnection.d) {
                rtpReceiver.dispose();
            }
            for (RtpTransceiver rtpTransceiver : peerConnection.e) {
                rtpTransceiver.dispose();
            }
            peerConnection.e.clear();
            peerConnection.d.clear();
            PeerConnection.nativeFreeOwnedPeerConnection(peerConnection.b);
            this.x = null;
        }
        bami bamiVar = this.s;
        if (bamiVar != null) {
            bamiVar.b();
            this.s = null;
        }
        baph baphVar = this.t;
        if (baphVar != null) {
            baphVar.b();
            this.t = null;
        }
        this.i.b(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        AudioTrack audioTrack = this.u;
        return (audioTrack == null || this.s == null || !audioTrack.d()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(boolean z) {
        AudioTrack audioTrack = this.u;
        return (audioTrack == null || this.s == null || (z != audioTrack.d() && !this.u.e(z))) ? false : true;
    }
}
