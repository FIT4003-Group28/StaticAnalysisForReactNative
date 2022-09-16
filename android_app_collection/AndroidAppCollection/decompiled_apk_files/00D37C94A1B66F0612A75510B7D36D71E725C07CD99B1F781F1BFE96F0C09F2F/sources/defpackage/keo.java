package defpackage;

import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
/* compiled from: PG */
/* renamed from: keo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class keo implements Runnable {
    public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ keo(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay, int i) {
        this.b = i;
        this.a = interactiveInlineMutedControlsOverlay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
            interactiveInlineMutedControlsOverlay.k.start();
            interactiveInlineMutedControlsOverlay.r.postDelayed(interactiveInlineMutedControlsOverlay.j, 2140L);
        } else if (i == 1) {
            this.a.l.startTransition(500);
        } else {
            this.a.z();
        }
    }
}
