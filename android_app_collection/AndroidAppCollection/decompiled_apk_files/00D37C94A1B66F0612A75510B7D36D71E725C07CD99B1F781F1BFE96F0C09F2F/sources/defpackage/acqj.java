package defpackage;
/* compiled from: PG */
/* renamed from: acqj  reason: default package */
/* loaded from: classes.dex */
public final class acqj {
    public boolean a = false;
    final /* synthetic */ abtv b;
    final /* synthetic */ acqm c;

    public acqj(acqm acqmVar, abtv abtvVar) {
        this.c = acqmVar;
        this.b = abtvVar;
    }

    public final void a() {
        if (this.a) {
            zep.c("WebRtcCapturePipelineMgr", "A peer connection error occurred while streaming");
            this.c.u(7);
            return;
        }
        this.c.t(7, this.b);
    }
}
