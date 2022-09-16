package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
/* compiled from: PG */
/* renamed from: hcc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hcc implements Runnable {
    public final /* synthetic */ TextTrackView a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ hcc(TextTrackView textTrackView, long j) {
        this.a = textTrackView;
        this.b = j;
    }

    public /* synthetic */ hcc(TextTrackView textTrackView, long j, int i) {
        this.c = i;
        this.a = textTrackView;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            TextTrackView textTrackView = this.a;
            textTrackView.d.b(this.b);
            return;
        }
        TextTrackView textTrackView2 = this.a;
        textTrackView2.d.c(this.b);
    }
}
