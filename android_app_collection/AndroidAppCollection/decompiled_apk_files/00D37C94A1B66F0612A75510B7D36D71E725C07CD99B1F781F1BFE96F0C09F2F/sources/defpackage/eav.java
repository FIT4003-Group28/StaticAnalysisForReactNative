package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
/* compiled from: PG */
/* renamed from: eav  reason: default package */
/* loaded from: classes3.dex */
public final class eav implements hbs, hch, hcm, axom {
    private final dyo a;
    private final eao b;

    public eav() {
    }

    public eav(dyo dyoVar, eao eaoVar) {
        this.a = dyoVar;
        this.b = eaoVar;
    }

    @Override // defpackage.hbs
    public final void a(AudioTrackView audioTrackView) {
        audioTrackView.a = (gzf) this.b.k.get();
        audioTrackView.b = (hkl) this.a.yP.get();
        audioTrackView.c = this.b.h();
    }

    @Override // defpackage.hch
    public final void b(TextTrackView textTrackView) {
        textTrackView.a = (gzf) this.b.k.get();
        textTrackView.b = (hkl) this.a.yP.get();
        textTrackView.c = this.b.h();
        tmn tmnVar = (tmn) this.a.a.P.get();
        tmm tmmVar = (tmm) this.a.a.Q.get();
        this.a.a.p();
    }

    @Override // defpackage.hcm
    public final void c(TimelineSeekBar timelineSeekBar) {
        timelineSeekBar.e = (gzf) this.b.k.get();
        timelineSeekBar.f = (hci) this.b.l.get();
        timelineSeekBar.g = this.b.az();
    }
}
