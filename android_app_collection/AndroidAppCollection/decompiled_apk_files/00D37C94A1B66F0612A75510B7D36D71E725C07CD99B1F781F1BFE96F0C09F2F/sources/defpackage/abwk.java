package defpackage;

import com.google.protos.youtube.api.innertube.CameraFlashEndpointOuterClass$CameraFlashEndpoint;
import com.google.protos.youtube.api.innertube.ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
import com.google.protos.youtube.api.innertube.SwitchCameraEndpointOuterClass$SwitchCameraEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abwk  reason: default package */
/* loaded from: classes.dex */
public final class abwk implements aafl {
    private final abwi a;

    public abwk(abwi abwiVar) {
        abwiVar.getClass();
        this.a = abwiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.a.l() == null) {
            zep.b("StreamControlState null - livestream not in progress?");
            return;
        }
        abwj l = this.a.l();
        if (apzgVar.qn(SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.switchCameraEndpoint)) {
            acke ackeVar = (acke) l;
            ackeVar.e.Q(((dp) l).O);
            ackeVar.aG = false;
        } else if (apzgVar.qn(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint)) {
            l.c(((ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint) apzgVar.qm(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint)).b);
        } else if (apzgVar.qn(CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint)) {
            boolean z = ((CameraFlashEndpointOuterClass$CameraFlashEndpoint) apzgVar.qm(CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint)).b;
            acke ackeVar2 = (acke) l;
            if (!ackeVar2.e.aG(true != z ? "off" : "torch")) {
                return;
            }
            ackeVar2.aG = z;
        } else if (apzgVar.qn(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint)) {
            final acke ackeVar3 = (acke) l;
            ackeVar3.az.n(((MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint) apzgVar.qm(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint)).b, new abyh() { // from class: acjy
                @Override // defpackage.abyh
                public final void a(final boolean z2) {
                    final acke ackeVar4 = acke.this;
                    ackeVar4.aA = z2;
                    ackeVar4.e.M(z2);
                    ackeVar4.d.post(new Runnable() { // from class: acka
                        @Override // java.lang.Runnable
                        public final void run() {
                            zag.o(acke.this.ax, !z2);
                        }
                    });
                }
            });
        } else if (!apzgVar.qn(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
            String valueOf = String.valueOf(apzgVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unhandled StreamControlState command: ");
            sb.append(valueOf);
            throw new aafy(sb.toString());
        } else {
            LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) apzgVar.qm(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
            if ((liveChatEndpointOuterClass$LiveChatEndpoint.b & 2) == 0) {
                l.b(apzgVar);
                return;
            }
            assp asspVar = liveChatEndpointOuterClass$LiveChatEndpoint.d;
            if (asspVar == null) {
                asspVar = assp.a;
            }
            l.a(asspVar);
        }
    }
}
