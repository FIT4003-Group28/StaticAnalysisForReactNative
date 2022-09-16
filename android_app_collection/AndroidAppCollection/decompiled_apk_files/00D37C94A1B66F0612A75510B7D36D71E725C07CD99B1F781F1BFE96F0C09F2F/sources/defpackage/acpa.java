package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import org.webrtc.AudioTrack;
import org.webrtc.PeerConnection;
/* compiled from: PG */
/* renamed from: acpa  reason: default package */
/* loaded from: classes.dex */
public final class acpa implements Runnable {
    final /* synthetic */ acpg a;
    private final /* synthetic */ int b;

    public acpa(acpg acpgVar) {
        this.a = acpgVar;
    }

    public /* synthetic */ acpa(acpg acpgVar, int i) {
        this.b = i;
        this.a = acpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acpn acpnVar;
        AudioTrack audioTrack;
        if (this.b == 0) {
            acpg acpgVar = this.a;
            PeerConnection peerConnection = acpgVar.x;
            if (peerConnection != null && (acpnVar = acpgVar.p) != null && (audioTrack = acpgVar.u) != null && acpgVar.v != null) {
                peerConnection.a(acpnVar, audioTrack);
                acpg acpgVar2 = this.a;
                acpgVar2.x.a(acpgVar2.p, acpgVar2.v);
                acpn acpnVar2 = this.a.p;
                long j = acpnVar2.e;
                if (j > 0 && acpnVar2.d - j > TimeUnit.MILLISECONDS.toNanos(5000L)) {
                    zep.c("PeerConnectionClient", "Bitrate stalled, report connection error");
                    acqj acqjVar = this.a.z;
                    if (acqjVar != null) {
                        acqjVar.a();
                    }
                }
            }
            acpg acpgVar3 = this.a;
            Handler handler = acpgVar3.j;
            if (handler == null) {
                return;
            }
            handler.postDelayed(acpgVar3.b, acpg.a);
            return;
        }
        acpg acpgVar4 = this.a;
        acpgVar4.j.removeCallbacks(acpgVar4.b);
    }
}
