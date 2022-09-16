package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
/* compiled from: PG */
/* renamed from: acpc  reason: default package */
/* loaded from: classes.dex */
final class acpc implements ankb {
    final /* synthetic */ acpg a;

    public acpc(acpg acpgVar) {
        this.a = acpgVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        zep.f("PeerConnectionClient", "Failed to receive remote description.", th);
        this.a.z.a();
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String string = new JSONObject(jSONObject.getJSONObject("answer").getString("desc")).getString("sdp");
            acpg acpgVar = this.a;
            SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.ANSWER, string);
            String.valueOf(String.valueOf(sessionDescription.a)).length();
            String valueOf = String.valueOf(sessionDescription.b);
            if (valueOf.length() != 0) {
                "setRemoteDescription description: ".concat(valueOf);
            }
            PeerConnection peerConnection = acpgVar.x;
            if (peerConnection == null) {
                return;
            }
            peerConnection.nativeSetRemoteDescription(new acpd(acpgVar), sessionDescription);
        } catch (JSONException e) {
            String valueOf2 = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb.append("Could not parse sdp. Response from server=");
            sb.append(valueOf2);
            zep.f("PeerConnectionClient", sb.toString(), e);
            this.a.z.a();
        }
    }
}
