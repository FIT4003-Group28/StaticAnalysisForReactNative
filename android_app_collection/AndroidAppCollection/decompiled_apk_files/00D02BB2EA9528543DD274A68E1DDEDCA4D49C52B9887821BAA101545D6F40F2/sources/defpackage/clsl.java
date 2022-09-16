package defpackage;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsl  reason: default package */
/* loaded from: classes5.dex */
public final class clsl extends AudioTrack.StreamEventCallback {
    final /* synthetic */ clsm a;

    public clsl(clsm clsmVar) {
        this.a = clsmVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        cmmn.c(audioTrack == this.a.c.l);
        clsn clsnVar = this.a.c;
        clsq clsqVar = clsnVar.G;
        if (clsqVar == null || !clsnVar.z) {
            return;
        }
        clsqVar.a();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        cmmn.c(audioTrack == this.a.c.l);
        clsn clsnVar = this.a.c;
        clsq clsqVar = clsnVar.G;
        if (clsqVar == null || !clsnVar.z) {
            return;
        }
        clsqVar.a();
    }
}
