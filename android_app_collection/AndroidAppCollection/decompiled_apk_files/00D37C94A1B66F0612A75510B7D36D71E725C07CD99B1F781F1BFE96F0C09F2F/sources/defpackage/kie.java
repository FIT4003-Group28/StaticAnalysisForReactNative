package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
/* compiled from: PG */
/* renamed from: kie  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kie implements Runnable {
    public final /* synthetic */ YouTubeControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kie(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.a = youTubeControlsOverlay;
    }

    public /* synthetic */ kie(YouTubeControlsOverlay youTubeControlsOverlay, int i) {
        this.b = i;
        this.a = youTubeControlsOverlay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.n.a.sendAccessibilityEvent(4);
        } else {
            this.a.pI();
        }
    }
}
