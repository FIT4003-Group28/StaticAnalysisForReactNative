package defpackage;
/* compiled from: PG */
/* renamed from: acpd  reason: default package */
/* loaded from: classes.dex */
final class acpd extends acpm {
    final /* synthetic */ acpg a;

    public acpd(acpg acpgVar) {
        this.a = acpgVar;
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        zep.c("PeerConnectionClient", "Failed to set remote description.");
        this.a.z.a();
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetSuccess() {
        acpg acpgVar = this.a;
        acpgVar.j.post(acpgVar.b);
    }
}
