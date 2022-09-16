package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
/* compiled from: PG */
/* renamed from: acns  reason: default package */
/* loaded from: classes.dex */
public final class acns implements SdpObserver {
    final /* synthetic */ acpg a;

    public acns() {
    }

    public acns(acpg acpgVar) {
        this.a = acpgVar;
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        zep.c("PeerConnectionClient", "Failed to create offer.");
        this.a.z.a();
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        if (this.a.f) {
            String str = sessionDescription.b;
            Matcher matcher = acpl.a.matcher(str);
            if (matcher.find()) {
                Matcher matcher2 = Pattern.compile(String.format("a=fmtp:%s( stereo=1;sprop-stereo=1;)?", matcher.group(1))).matcher(str);
                if (matcher2.find()) {
                    String group = matcher2.group();
                    if (!group.contains(" stereo=1;sprop-stereo=1;")) {
                        str = matcher2.replaceFirst(String.valueOf(group).concat(" stereo=1;sprop-stereo=1;"));
                    }
                }
            }
            sessionDescription = new SessionDescription(sessionDescription.a, str);
        }
        String str2 = sessionDescription.b;
        List list = this.a.e;
        if (list == null) {
            str2 = acpl.a(str2, axgq.H264);
        } else {
            for (axgq axgqVar : amxp.t(list)) {
                str2 = acpl.a(str2, axgqVar);
            }
        }
        SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.a, str2);
        acpg acpgVar = this.a;
        String.valueOf(String.valueOf(sessionDescription2.a)).length();
        String valueOf = String.valueOf(sessionDescription2.b);
        if (valueOf.length() != 0) {
            "setLocalDescription description: ".concat(valueOf);
        }
        PeerConnection peerConnection = acpgVar.x;
        if (peerConnection != null) {
            peerConnection.nativeSetLocalDescription(new acpb(acpgVar, sessionDescription2), sessionDescription2);
        }
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        zep.c("CreateOfferCallback", "onSetFailure() called, this class is only meant for create offer callbacks.");
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetSuccess() {
        zep.c("CreateOfferCallback", "onSetSuccess() called, this class is only meant for create offer callbacks.");
    }
}
