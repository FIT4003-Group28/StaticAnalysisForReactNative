package defpackage;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
/* compiled from: PG */
/* renamed from: acpm  reason: default package */
/* loaded from: classes.dex */
public abstract class acpm implements SdpObserver {
    @Override // org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        zep.c("SetDescriptionCallback", "onCreateFailure() called, this class is only meant for set description callbacks.");
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        zep.c("SetDescriptionCallback", "onCreateSuccess() called, this class is only meant for set description callbacks.");
    }
}
