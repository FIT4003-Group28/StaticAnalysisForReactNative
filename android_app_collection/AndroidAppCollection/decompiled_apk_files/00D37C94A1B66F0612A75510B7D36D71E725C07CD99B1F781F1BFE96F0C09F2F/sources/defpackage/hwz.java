package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityCaptionsLifecycleObserver;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* compiled from: PG */
/* renamed from: hwz  reason: default package */
/* loaded from: classes3.dex */
public final class hwz implements aibf {
    final /* synthetic */ ReelWatchActivityCaptionsLifecycleObserver a;

    public hwz(ReelWatchActivityCaptionsLifecycleObserver reelWatchActivityCaptionsLifecycleObserver) {
        this.a = reelWatchActivityCaptionsLifecycleObserver;
    }

    @Override // defpackage.aibf
    public final void pA(SubtitleTrack subtitleTrack) {
        ReelWatchActivityCaptionsLifecycleObserver reelWatchActivityCaptionsLifecycleObserver = this.a;
        reelWatchActivityCaptionsLifecycleObserver.a.k(subtitleTrack);
        reelWatchActivityCaptionsLifecycleObserver.b.H(subtitleTrack);
    }
}
