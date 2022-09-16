package defpackage;

import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;
/* compiled from: PG */
/* renamed from: ofc  reason: default package */
/* loaded from: classes3.dex */
public final class ofc implements akev {
    final /* synthetic */ SingleLoopPlaybackMonitor a;

    public ofc(SingleLoopPlaybackMonitor singleLoopPlaybackMonitor) {
        this.a = singleLoopPlaybackMonitor;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfi akfiVar = (akfi) obj;
        this.a.a.q(new acte(actj.SINGLE_LOOP_SNACKBAR_TURN_OFF_BUTTON), null);
        this.a.c = false;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfi akfiVar = (akfi) obj;
        this.a.a.n(new acte(actj.SINGLE_LOOP_SNACKBAR_TURN_OFF_BUTTON));
        this.a.c = true;
    }
}
