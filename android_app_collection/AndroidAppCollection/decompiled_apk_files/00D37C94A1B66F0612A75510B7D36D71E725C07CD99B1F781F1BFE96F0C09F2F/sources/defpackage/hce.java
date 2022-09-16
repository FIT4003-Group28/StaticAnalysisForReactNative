package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hce  reason: default package */
/* loaded from: classes3.dex */
public final class hce extends hcf {
    final /* synthetic */ TextTrackView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hce(TextTrackView textTrackView, Context context) {
        super(textTrackView, context, R.string.accessibility_right_trim_handle);
        this.a = textTrackView;
    }

    @Override // defpackage.hcf
    protected final long a() {
        TextTrackView textTrackView = this.a;
        return textTrackView.f(textTrackView.f.getX() - this.a.h);
    }

    @Override // defpackage.hcf
    protected final void b(long j) {
        long max = Math.max(100L, j);
        TextTrackView textTrackView = this.a;
        textTrackView.i(textTrackView.c(max));
        this.a.r(max, hcg.END, false);
    }

    @Override // defpackage.hcf
    protected final void c(long j) {
        long min = Math.min(j, this.a.g());
        TextTrackView textTrackView = this.a;
        textTrackView.i(textTrackView.c(min));
        this.a.r(min, hcg.END, false);
        performAccessibilityAction(this.a.f, 64, null);
        this.a.f.sendAccessibilityEvent(4);
    }
}
