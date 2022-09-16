package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hcd  reason: default package */
/* loaded from: classes3.dex */
public final class hcd extends hcf {
    final /* synthetic */ TextTrackView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcd(TextTrackView textTrackView, Context context) {
        super(textTrackView, context, R.string.accessibility_left_trim_handle);
        this.a = textTrackView;
    }

    @Override // defpackage.hcf
    protected final long a() {
        TextTrackView textTrackView = this.a;
        return textTrackView.f(textTrackView.e.getX());
    }

    @Override // defpackage.hcf
    protected final void b(long j) {
        long max = Math.max(0L, j);
        TextTrackView textTrackView = this.a;
        textTrackView.h(textTrackView.c(max));
        this.a.r(max, hcg.BEGIN, false);
    }

    @Override // defpackage.hcf
    protected final void c(long j) {
        long min = Math.min(j, this.a.g() - 100);
        TextTrackView textTrackView = this.a;
        textTrackView.h(textTrackView.c(min));
        this.a.r(min, hcg.BEGIN, false);
        performAccessibilityAction(this.a.e, 64, null);
        this.a.e.sendAccessibilityEvent(4);
    }
}
