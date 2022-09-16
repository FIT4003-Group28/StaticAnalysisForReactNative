package defpackage;

import android.os.CountDownTimer;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;
/* compiled from: PG */
/* renamed from: acpi  reason: default package */
/* loaded from: classes.dex */
final class acpi implements PeerConnection.Observer {
    private final acob a;
    private final acph b;

    public acpi(acob acobVar, acph acphVar) {
        this.a = acobVar;
        this.b = acphVar;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddStream(MediaStream mediaStream) {
        abry a;
        String.valueOf(String.valueOf(mediaStream)).length();
        acph acphVar = this.b;
        if (acphVar != null) {
            final acow acowVar = (acow) acphVar;
            if (!acowVar.d.contains(mediaStream.b())) {
                String valueOf = String.valueOf(mediaStream.b());
                if (valueOf.length() == 0) {
                    return;
                }
                "Media from remote peer not in participant list. Id: ".concat(valueOf);
            } else if (mediaStream.b.isEmpty()) {
            } else {
                if (acowVar.g == null && (a = acowVar.c.a()) != null && a.b != null) {
                    acowVar.g = new baoo(acowVar.a);
                    final bamq l = ((bamr) bamk.c(a.b, bams.c)).l();
                    acowVar.b.post(new Runnable() { // from class: acot
                        @Override // java.lang.Runnable
                        public final void run() {
                            acow acowVar2 = acow.this;
                            bamm bammVar = l;
                            baoo baooVar = acowVar2.g;
                            int[] iArr = bams.c;
                            bane baneVar = new bane();
                            bapa.d();
                            baooVar.b = 0;
                            baooVar.c = 0;
                            baooVar.a.d(bammVar, baooVar, iArr, baneVar);
                        }
                    });
                }
                acowVar.h = (VideoTrack) mediaStream.b.get(0);
                acowVar.h.e(true);
                VideoTrack videoTrack = acowVar.h;
                baoo baooVar = acowVar.g;
                if (baooVar == null) {
                    throw new IllegalArgumentException("The VideoSink is not allowed to be null");
                }
                if (!videoTrack.a.containsKey(baooVar)) {
                    long nativeWrapSink = VideoTrack.nativeWrapSink(baooVar);
                    videoTrack.a.put(baooVar, Long.valueOf(nativeWrapSink));
                    VideoTrack.nativeAddSink(videoTrack.a(), nativeWrapSink);
                }
                if (acowVar.f == null) {
                    return;
                }
                acowVar.b.post(new acou(acowVar, mediaStream, 1));
            }
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        for (MediaStream mediaStream : mediaStreamArr) {
            String.valueOf(String.valueOf(mediaStream)).length();
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onDataChannel(DataChannel dataChannel) {
        acph acphVar = this.b;
        if (acphVar != null) {
            if (dataChannel.a == 0) {
                throw new IllegalStateException("DataChannel has been disposed.");
            }
            long j = dataChannel.b;
            if (j != 0) {
                dataChannel.nativeUnregisterObserver(j);
            }
            dataChannel.b = dataChannel.nativeRegisterObserver(acphVar);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(IceCandidate iceCandidate) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        for (IceCandidate iceCandidate : iceCandidateArr) {
            String.valueOf(String.valueOf(iceCandidate)).length();
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.NEW;
        int ordinal = iceConnectionState.ordinal();
        if (ordinal != 2) {
            if (ordinal == 4) {
                this.a.a();
                return;
            } else if (ordinal != 5) {
                return;
            } else {
                acob acobVar = this.a;
                CountDownTimer countDownTimer = acobVar.c;
                if (countDownTimer != null) {
                    countDownTimer.start();
                }
                acobVar.a.a();
                return;
            }
        }
        acob acobVar2 = this.a;
        abxa.b().m(12);
        acobVar2.b();
        acps acpsVar = acobVar2.a;
        acpsVar.b.post(new acpp(acpsVar, 1));
        if (!acobVar2.d) {
            acobVar2.d = true;
            acqj acqjVar = acobVar2.e;
            acqjVar.a = true;
            acqjVar.c.t(0, acqjVar.b);
            return;
        }
        acobVar2.b.c();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(MediaStream mediaStream) {
        String.valueOf(String.valueOf(mediaStream)).length();
        acph acphVar = this.b;
        if (acphVar != null) {
            acow acowVar = (acow) acphVar;
            VideoTrack videoTrack = acowVar.h;
            if (videoTrack != null) {
                Long l = (Long) videoTrack.a.remove(acowVar.g);
                if (l != null) {
                    VideoTrack.nativeRemoveSink(videoTrack.a(), l.longValue());
                    VideoTrack.nativeFreeSink(l.longValue());
                }
            }
            acowVar.h = null;
            if (acowVar.f == null) {
                return;
            }
            acowVar.b.post(new acou(acowVar, mediaStream));
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onRemoveTrack(RtpReceiver rtpReceiver) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onTrack(RtpTransceiver rtpTransceiver) {
    }
}
