package defpackage;

import org.webrtc.SessionDescription;
/* compiled from: PG */
/* renamed from: acpb  reason: default package */
/* loaded from: classes.dex */
final class acpb extends acpm {
    final /* synthetic */ SessionDescription a;
    final /* synthetic */ acpg b;

    public acpb(acpg acpgVar, SessionDescription sessionDescription) {
        this.b = acpgVar;
        this.a = sessionDescription;
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        zep.c("PeerConnectionClient", "Failed to set local description.");
        this.b.z.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0135 A[Catch: JSONException -> 0x0139, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0139, blocks: (B:22:0x0124, B:24:0x0135), top: B:34:0x0124 }] */
    @Override // org.webrtc.SdpObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSetSuccess() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpb.onSetSuccess():void");
    }
}
