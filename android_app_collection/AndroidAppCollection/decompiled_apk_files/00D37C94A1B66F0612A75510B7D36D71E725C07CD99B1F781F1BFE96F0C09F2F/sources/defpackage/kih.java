package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
/* compiled from: PG */
/* renamed from: kih  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kih {
    public final /* synthetic */ YouTubeControlsOverlay a;

    public final void a(boolean z) {
        YouTubeControlsOverlay youTubeControlsOverlay = this.a;
        if (youTubeControlsOverlay.E == z) {
            return;
        }
        youTubeControlsOverlay.E = z;
        if (z) {
            youTubeControlsOverlay.Q();
            youTubeControlsOverlay.B();
            return;
        }
        youTubeControlsOverlay.E();
    }
}
