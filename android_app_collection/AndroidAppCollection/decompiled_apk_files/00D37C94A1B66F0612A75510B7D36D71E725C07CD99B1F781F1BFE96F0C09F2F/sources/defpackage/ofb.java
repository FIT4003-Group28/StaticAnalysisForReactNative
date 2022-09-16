package defpackage;

import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: ofb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ofb implements ayqb {
    public final /* synthetic */ SingleLoopPlaybackMonitor a;
    private final /* synthetic */ int b;

    public /* synthetic */ ofb(SingleLoopPlaybackMonitor singleLoopPlaybackMonitor, int i) {
        this.b = i;
        this.a = singleLoopPlaybackMonitor;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlaybackStartDescriptor playbackStartDescriptor2;
        if (this.b == 0) {
            SingleLoopPlaybackMonitor singleLoopPlaybackMonitor = this.a;
            PlaybackStartDescriptor playbackStartDescriptor3 = singleLoopPlaybackMonitor.d;
            singleLoopPlaybackMonitor.d = ((ahic) obj).a().g();
            if (playbackStartDescriptor3 == null || (playbackStartDescriptor = singleLoopPlaybackMonitor.d) == null || singleLoopPlaybackMonitor.e != 2) {
                return;
            }
            if (!amps.e(playbackStartDescriptor3.k()) && playbackStartDescriptor3.k().equals(playbackStartDescriptor.k()) && !akzj.f(playbackStartDescriptor3.l(), playbackStartDescriptor.l())) {
                singleLoopPlaybackMonitor.b.D().h(0);
            }
            PlaybackStartDescriptor playbackStartDescriptor4 = singleLoopPlaybackMonitor.d;
            if (!amps.e(playbackStartDescriptor3.k()) || !amps.e(playbackStartDescriptor4.k()) || !akzj.f(playbackStartDescriptor3.l(), playbackStartDescriptor4.l())) {
                return;
            }
            singleLoopPlaybackMonitor.h();
            return;
        }
        SingleLoopPlaybackMonitor singleLoopPlaybackMonitor2 = this.a;
        ahhw ahhwVar = (ahhw) obj;
        if (singleLoopPlaybackMonitor2.e != 2 || ahhwVar.c() != aika.ENDED || !singleLoopPlaybackMonitor2.b.D().i(aiqk.c) || (playbackStartDescriptor2 = singleLoopPlaybackMonitor2.d) == null || !amps.e(playbackStartDescriptor2.k())) {
            return;
        }
        singleLoopPlaybackMonitor2.h();
    }
}
